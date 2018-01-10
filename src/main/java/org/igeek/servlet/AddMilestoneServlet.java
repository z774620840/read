package org.igeek.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.igeek.service.Impl.MileStoneServiceImpl;
@WebServlet("/addMilestone.html")
public class AddMilestoneServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String project_Id =request.getParameter("pid");
		if(project_Id==null){
			request.setAttribute("errorMsg", "参数错误");
			request.getRequestDispatcher("404.html").forward(request, response);
			return;
		}
		request.setAttribute("project_Id",project_Id);
		request.getRequestDispatcher("WEB-INF/jsp/add_milestone.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
        String milestone_Name = request.getParameter("milestone_name");
        String date1 =request.getParameter("plan_time");
        String date2 =request.getParameter("actual_time");
        String milestone_Status = request.getParameter("milestone_status");
        String project_Id =request.getParameter("project_id");
        
        //Milestone milestone=new Milestone();
//        milestone.setmilestone_Name(milestone_Name);
//        milestone.setplan_Delivery_Time(plan_Delivery_Time);
//        milestone.setactual_Delivery_Time(actual_Delivery_Time);
//        milestone.setmilestone_Status(milestone_Status); 
//        milestone.setproject_Id(project_Id); 
        Object[] object={milestone_Name,date1,date2.equals("")?null:date2,milestone_Status,project_Id};
        int row=new MileStoneServiceImpl().insertMileStones(object);
        if(row>0){
        	response.sendRedirect("project_unified_view.html?pid="+project_Id);
        }
        
	}
}
