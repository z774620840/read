package org.igeek.service.Impl;

import java.util.List;
import org.igeek.dao.CommonDAO;
import org.igeek.pojo.Page;
import org.igeek.pojo.WeeklyReport;
import org.igeek.service.WeeklyReportService;

public class WeeklyReportListImpl implements WeeklyReportService{
	private CommonDAO dao = new CommonDAO();
	public Page<Object> getAllWeeklyReport(String project_Id ,Integer currentPage,Integer pageSize) {
		Page<Object> page = new Page<Object>();
		List<Object> weeklyReportList = null;
		Integer start  = 0;
		long totalCount = 0;
		String totalSql ="select count(*) from weekly_report where project_id = ?";
		String sql="select * from weekly_report where project_id = ? limit ?,?";
		start  = (currentPage-1)*pageSize;
		totalCount = dao.findTotal(totalSql,project_Id);
		if(currentPage>((totalCount+pageSize-1)/pageSize)){
			currentPage=(int) ((totalCount+pageSize-1)/pageSize);
		}else if(currentPage<1){
			currentPage=1;
		}
		weeklyReportList = dao.findByCondition(WeeklyReport.class, sql,project_Id,start,pageSize);
		page.setCurrentPage(currentPage);
		page.setObj(weeklyReportList);
		page.setPageSize(pageSize);
		page.setTotalCount(totalCount);
		page.setTotalPage((totalCount+pageSize-1)/pageSize);
		return page;
	
	}

	@Override
	public WeeklyReport getWeeklyReportById(Integer weeklyReport_Id) {
		String sql = "select * from weekly_report where weekly_report_id = ?";
		WeeklyReport weeklyReport =null;
		List<Object> list = dao.findByCondition(WeeklyReport.class, sql,weeklyReport_Id);
		if(list.size()>0){
			weeklyReport = (WeeklyReport) list.get(0);
		}
		return weeklyReport;
	}

	

	@Override
	public Integer insertWeeklyReport(WeeklyReport weeklyReport) {
		String sql="INSERT INTO weekly_report(weekly_report_name,week,progress,progress_status,"
				+ "progress_remark,milestone_id,issend_email,weekly_report_accessory,project_id,plan_time,actual_time)"
				+ " VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		Integer num=dao.updateDataBase(sql, weeklyReport.getweekly_Report_Name(),weeklyReport.getWeek()
				,weeklyReport.getProgress(),weeklyReport.getprogress_Status(),weeklyReport.getprogress_Remark()
				,weeklyReport.getmilestone_Id(),weeklyReport.getissend_Email(),weeklyReport.getweekly_Report_Accessory()
				,weeklyReport.getproject_Id(),weeklyReport.getplan_Time(),weeklyReport.getactual_Time());
		return num;
	}
	


}