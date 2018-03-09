package org.igeek.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.igeek.pojo.WebUser;
import org.igeek.service.LoginService;

import org.igeek.service.Impl.LoginServiceImpl;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

//这个写的就是拦截的地址 @ross
@WebServlet("/userlog.html")
public class UserLogServlet extends HttpServlet {
	private static final long serialVersionUID = 3611304112660653478L;
	private LoginService loginService = new LoginServiceImpl();
	
	//这个是人直接家访问/userlog.html时先到的方法↓
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/jsp/userlog.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		WebUser user = loginService.getUserByUserName(username, password);
		if (user == null) {
			request.setAttribute("message", "请先登录");
			request.getRequestDispatcher("loginfail.html").forward(request, response);
			return;
		}
		session.setAttribute("name", username);
		//↑这个就是在session中记住用户名（或者昵称）
		//session.setAttribute("user_Id", user.getuser_id());
		response.sendRedirect("loginsuccess.html");
		
	}

}
