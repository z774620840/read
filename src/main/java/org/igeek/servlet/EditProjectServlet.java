package org.igeek.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.service.Impl.ProjectServiceImpl;
@WebServlet("/editProject.html")
public class EditProjectServlet extends HttpServlet{

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
		String value = request.getParameter("value");
		String technology = request.getParameter("technology");
		String mode = request.getParameter("mode");
		String learning_Opportunity = request.getParameter("learning_Opportunity");
		String difficulty = request.getParameter("difficulty");
		String difficulty_remark = request.getParameter("difficulty_remark");
		String config_server_type = request.getParameter("config_server_type");
		String config_server_path = request.getParameter("config_server_path");
		Object[] object={value,technology,mode,learning_Opportunity,difficulty,difficulty_remark,config_server_type,config_server_path,project_id};
		int row = new ProjectServiceImpl().updateProject(object);
		if(row>0){
        	response.sendRedirect("project_unified_view.html?pid="+project_id);
        }
	}
}
