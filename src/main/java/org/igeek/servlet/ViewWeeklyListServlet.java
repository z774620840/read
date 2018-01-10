package org.igeek.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.pojo.Milestone;
import org.igeek.pojo.WeeklyReport;
import org.igeek.service.MileStoneService;
import org.igeek.service.WeeklyReportService;
import org.igeek.service.Impl.MileStoneServiceImpl;
import org.igeek.service.Impl.WeeklyReportListImpl;

@WebServlet("/view_project_weekly.html")
public class ViewWeeklyListServlet  extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private WeeklyReportService weeklyReportService = new WeeklyReportListImpl();
	private MileStoneService mileStoneService = new MileStoneServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer weekly_report_id;
		String widStr= request.getParameter("wid");
		if(widStr!=null && widStr.matches("^[0-9]*[1-9][0-9]*$")){
			weekly_report_id = Integer.parseInt(widStr);
			WeeklyReport weeklyReport= weeklyReportService.getWeeklyReportById(weekly_report_id);
			if(weeklyReport!=null){
				Milestone mileStone = mileStoneService.getMileStoneById(weeklyReport.getmilestone_Id());
				request.setAttribute("mileStone",mileStone);
				request.setAttribute("report",weeklyReport);
			}else{
				request.setAttribute("isError",true);
			}
		}else{
			request.setAttribute("isError",true);
		}
		request.getRequestDispatcher("WEB-INF/jsp/view_project_weekly.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}
