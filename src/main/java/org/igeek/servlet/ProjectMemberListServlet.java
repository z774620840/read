package org.igeek.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.service.Impl.ProjectMemberListImpl;
import org.igeek.service.Impl.UserServiceImpl;

//显示干系人信息的servlet
@WebServlet("/projectMemberList.html")
public class ProjectMemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String projectid = "ABCDE20171011";
		System.out.println(projectid);
		List<Object> memberList = new ProjectMemberListImpl().getAllProjectMember(projectid);
		System.out.println(memberList.size());
		List<Object> clientList = new ProjectMemberListImpl().getAllClient(projectid);
		List<Object> userList = new UserServiceImpl().findAllUsers();
		request.setAttribute("userList", userList);
		request.setAttribute("memberList", memberList);
		request.setAttribute("clientList", clientList);
		System.out.println(clientList);
		request.getRequestDispatcher("stakeholder_message.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
