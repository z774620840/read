package org.igeek.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.service.Impl.ProjectServiceImpl;
@WebServlet("/editWorkload.html")
public class EditWorkloadServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String project_id = request.getParameter("project_id");
		String assess_workload = request.getParameter("assess_workload");
		String actual_workload = request.getParameter("actual_workload");
		String workload_proportion = request.getParameter("workload_proportion");
		String days = request.getParameter("days");
		String weekly_workload = request.getParameter("weekly_workload");
		Object[] object={assess_workload,actual_workload,workload_proportion,days,weekly_workload,project_id};
		int row = new ProjectServiceImpl().updateWorkload(object);
		if(row>0){
        	response.sendRedirect("project_unified_view.html?pid="+project_id);
        }
	}
}

