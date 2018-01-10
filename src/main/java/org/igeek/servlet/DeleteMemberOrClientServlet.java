package org.igeek.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.service.Impl.ProjectMemberListImpl;

@WebServlet("/deleteMemberOrClient.html")
public class DeleteMemberOrClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String phone = request.getParameter("phone");
		String usertype = request.getParameter("userType");
		Integer userType = Integer.parseInt(usertype);
		Integer userid = 0;
		if (userType == 0) {
			userid = new ProjectMemberListImpl().findUserIdByemployee_phone(phone);
			int result = new ProjectMemberListImpl().deleteClientOrMember(userid);
			if (result > 0) {
				response.sendRedirect("projectMemberList.html");
			}
		} else if (userType == 1) {
			userid = new ProjectMemberListImpl().findUserIdByClient_phone(phone);
			int result = new ProjectMemberListImpl().deleteClientOrMember(userid);
			if (result > 0) {
				response.sendRedirect("projectMemberList.html");
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
