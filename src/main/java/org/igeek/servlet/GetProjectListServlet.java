package org.igeek.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.igeek.pojo.Page;
import org.igeek.pojo.Role;
import org.igeek.service.Impl.ProjectServiceImpl;

import com.google.gson.Gson;



/**
 * Servlet implementation class ProjectListServlet
 */
@WebServlet("/getProjectList.html")
public class GetProjectListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=UTF-8");
		Integer pageSize = 1;
		Integer currentPage = 1;
		String pageStr = request.getParameter("page");
		if(pageStr!=null && pageStr.matches("^[0-9]*[1-9][0-9]*$")){
			currentPage = Integer.parseInt(pageStr);
		}
		HttpSession session = request.getSession();
		Integer user_Id = (Integer) session.getAttribute("user_Id");
		Role role = (Role) session.getAttribute("role");
		
		Page<Object> page = new ProjectServiceImpl().getProjectByUser(user_Id,role.getRole_Id(), currentPage, pageSize);
		Gson gson = new Gson();
		String jsonString  = gson.toJson(page);
		response.getWriter().print(jsonString);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
