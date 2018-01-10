package org.igeek.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.service.Impl.AccountServiceImpl;
import org.igeek.service.Impl.UserServiceImpl;

@WebServlet("/updateAccount.html")
public class UpdateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer user_id = Integer.parseInt(request.getParameter("user_id"));
		String method = request.getParameter("method");
		if (method.equals("updataUserForbiddenByUserId")) {
			Integer Forbidden = Integer.parseInt(request.getParameter("isforbidden"));
			if (Forbidden == 1) {
				int res = new UserServiceImpl().updataUserForbiddenByUserId(1, user_id);
				if (res > 0) {
					response.sendRedirect("showPassAccount.html");
				}
			} else if (Forbidden == 0) {
				int res = new UserServiceImpl().updataUserForbiddenByUserId(0, user_id);
				if (res > 0) {
					response.sendRedirect("showPassAccount.html");
				}
			}
		} else if (method.equals("udataUserNameByUserId")) {
			// 让删除的用户的用户名和密码变为空
			int res1 = new UserServiceImpl().udataUserNameByUserId(user_id);
			// 让删除的用户变成退回状态
			int res2 = new AccountServiceImpl().updataAccountStatus(-1, user_id);
			System.out.println(res1 + "" + res2);
			if (res1 > 0 && res2 > 0) {
				response.sendRedirect("showPassAccount.html");
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
