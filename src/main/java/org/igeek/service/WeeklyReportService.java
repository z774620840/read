package org.igeek.service;

import org.igeek.pojo.Page;
import org.igeek.pojo.WeeklyReport;


public interface WeeklyReportService {
	/**
	 * 项目周报列表
	 */
	public Page<Object> getAllWeeklyReport(String project_Id ,Integer currentPage,Integer pageSize);
	
	public WeeklyReport getWeeklyReportById(Integer weeklyReport_Id);
	
	public Integer insertWeeklyReport(WeeklyReport weeklyReport);
	
	

}

