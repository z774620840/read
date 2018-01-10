package org.igeek.servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.igeek.pojo.Milestone;
import org.igeek.pojo.ProjectWorkload;
import org.igeek.pojo.Role;
import org.igeek.pojo.ViewProjectCollect;
import org.igeek.pojo.WeeklyReport;
import org.igeek.service.MileStoneService;
import org.igeek.service.ProjectService;
import org.igeek.service.WeeklyReportService;
import org.igeek.service.Impl.MileStoneServiceImpl;
import org.igeek.service.Impl.ProjectServiceImpl;
import org.igeek.service.Impl.WeeklyReportListImpl;

/**
 * Servlet implementation class MileStoneListServlet
 */
@WebServlet("/project_unified_view.html")
public class ProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MileStoneService mileStoneService = new MileStoneServiceImpl();
	private ProjectService projectService = new ProjectServiceImpl();
	private WeeklyReportService weeklyReportService = new WeeklyReportListImpl();
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String project_Id = request.getParameter("pid");
		//String project_Id ="ABCDE20171011";
		if(project_Id==null){
			request.setAttribute("errorMsg", "参数错误");
			request.getRequestDispatcher("404.html").forward(request, response);
			return;
		}
		HttpSession session = request.getSession();
		Integer user_Id = (Integer) session.getAttribute("user_Id");
		Role role = (Role) session.getAttribute("role");
		List<Object> projectIdList = projectService.getProjectIdListByUser(user_Id, role.getRole_Id());
		Boolean flag = false;//判断是否有权限查看此项目
		if(projectIdList.size()==0){
			request.setAttribute("errorMsg", "您无项目可查看");
			request.getRequestDispatcher("404.html").forward(request, response);
			return;
		}else{
			Iterator<Object> it = projectIdList.iterator();
			while(it.hasNext()){
				String pid = (String) it.next();
				if(project_Id.equals(pid)){
					flag = true;
				}
			}
		}
		if(!flag){
			request.setAttribute("errorMsg", "没有权限查看");
			request.getRequestDispatcher("404.html").forward(request, response);
			return;
		}
		ViewProjectCollect project = projectService.getViewProjectById(project_Id);
		request.setAttribute("project",project);
		ProjectWorkload workload = projectService.getProjectWorkloadById(project_Id);
		request.setAttribute("workload",workload);
		WeeklyReport weeklyReport = weeklyReportService.getWeeklyReportById(project.getweekly_Report_Id());
		request.setAttribute("weeklyReport",weeklyReport);
		Milestone mileStone = mileStoneService.getMileStoneById(weeklyReport.getmilestone_Id());
		request.setAttribute("mileStone",mileStone);
		List<Object> mileStoneList = mileStoneService.getMileStones(project_Id);
		request.setAttribute("mileStoneList", mileStoneList);
		request.getRequestDispatcher("WEB-INF/jsp/project_unified_view.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
