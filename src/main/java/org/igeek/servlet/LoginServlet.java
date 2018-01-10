package org.igeek.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.igeek.pojo.Role;
import org.igeek.pojo.Rule;
import org.igeek.pojo.User;
import org.igeek.service.RbacService;
import org.igeek.service.UserService;
import org.igeek.service.Impl.RbacServiceImpl;
import org.igeek.service.Impl.UserServiceImpl;

@WebServlet("/login.html")
public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3611304112660653478L;
	private UserService userService = new UserServiceImpl();
	private RbacService rbacService = new RbacServiceImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		User user = userService.getUserByUserName(username, password);
		if (user == null) {
			request.setAttribute("loginmessage", "请先登录");
			request.getRequestDispatcher("index.html").forward(request, response);
			return;
		} else if (user.getuser_Type() && user.getIsforbidden()) {
			request.setAttribute("loginmessage", "您的账号已被禁用");
			request.getRequestDispatcher("index.html").forward(request, response);
			return;
		}
		session.setAttribute("name", userService.getName(user));
		session.setAttribute("user_Id", user.getuser_Id());
		Role role = rbacService.getUserRoleList(user.getuser_Id());
		session.setAttribute("role", role);
		Set<Rule> ruleset = rbacService.getUserRuleList(username, "menu");
		List<Rule> rulelist = new ArrayList<Rule>();
		Iterator<Rule> it = ruleset.iterator();
		while (it.hasNext()) {
			rulelist.add(it.next());
		}
		session.setAttribute("menurules", rulelist);
		response.sendRedirect("home.html");
		// request.getRequestDispatcher("home.html").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
