package org.igeek.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.pojo.ViewProjectClient;
import org.igeek.pojo.ViewProjectMember;
import org.igeek.service.Impl.ProjectMemberListImpl;

import com.google.gson.Gson;

@WebServlet("/findUerById.html")
public class FindUerById extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json;charset=utf-8");
		Integer user_id = Integer.parseInt(request.getParameter("user_id"));
		Integer userType = Integer.parseInt(request.getParameter("user_type"));
		System.out.println(user_id+" "+userType);
		if (userType == 0) {
			ViewProjectMember member = new ProjectMemberListImpl().getMemberByUserId(user_id);
			request.setAttribute("member", member);
			Gson g = new Gson();
			String mem = g.toJson(member);
			response.getWriter().print(mem);
		} else if (userType == 1) {
			ViewProjectClient client = new ProjectMemberListImpl().getClientByUserId(user_id);
			System.out.println(client.getClient_Company());
			request.setAttribute("client", client);
			Gson g = new Gson();
			String cli = g.toJson(client);
			System.out.println(cli);
			response.getWriter().print(cli);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
