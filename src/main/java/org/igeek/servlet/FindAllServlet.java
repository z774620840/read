package org.igeek.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.pojo.User;
import org.igeek.pojo.ViewMemberUsers;
import org.igeek.service.Impl.RbacServiceImpl;
import org.igeek.service.Impl.UserServiceImpl;

/**
 * Servlet implementation class FindAllUserServlet
 */
@WebServlet("/findAll.html")
public class FindAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		List<Object> userListMember = new UserServiceImpl().getUserIdAndName(0);
		List<Object> userListClient = new UserServiceImpl().getUserIdAndName(1);
		List<Object> roleList = new RbacServiceImpl().getAllRole();
		Integer user_type = Integer.parseInt(request.getParameter("user_type"));
		request.getSession().setAttribute("user_type", user_type);
		request.setAttribute("userListClient", userListClient);
		request.setAttribute("roleList", roleList);
		request.setAttribute("userListMember", userListMember);
		request.getRequestDispatcher("add_stakeholder.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
