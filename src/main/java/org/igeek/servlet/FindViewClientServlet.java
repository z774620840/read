package org.igeek.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.pojo.ViewClientUsers;
import org.igeek.service.Impl.ProjectAprovalServiceImpl;
import org.igeek.service.Impl.ProjectMemberListImpl;

import com.google.gson.Gson;

@WebServlet("/findViewClient.html")
public class FindViewClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json;charset=utf-8");
		Integer user_id = Integer.parseInt(request.getParameter("user_id"));
		Integer userType = Integer.parseInt(request.getParameter("user_type"));
		if(userType==1) {
			ViewClientUsers v = new ProjectMemberListImpl().findViewClient(user_id);
			Gson g = new Gson();
			String data = g.toJson(v);
			response.getWriter().print(data);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
