package org.igeek.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.service.Impl.AccountServiceImpl;
import org.igeek.service.Impl.UserServiceImpl;

@WebServlet("/checkAccount.html")
public class CheckAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String method = request.getParameter("method");
		String clientid = request.getParameter("client_id");
		Integer client_id = Integer.parseInt(clientid);
		Integer user_id = Integer.parseInt(request.getParameter("user_id"));
		String client_email = new AccountServiceImpl().findAllByClientId(client_id).getClient_Email();

		if (method.equals("back")) {
			boolean result = back(-1, user_id);
			if (result) {
				request.getRequestDispatcher("showAccountApproval.html").forward(request, response);
			}
		} else if (method.equals("pass")) {
			boolean result = pass(1, client_email, user_id);
			if (result) {
				request.getRequestDispatcher("showAccountApproval.html").forward(request, response);
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public static boolean back(Integer status, Integer user_id) {
		int res1 = new AccountServiceImpl().updataAccountStatus(status, user_id);
		int res2 = new UserServiceImpl().updataUser(null, null, user_id);
		if (res1 > 0 && res2 > 0) {
			return true;
		}
		return false;
	}

	public static boolean pass(Integer status, String client_email, Integer user_id) {
		int res1 = new AccountServiceImpl().updataAccountStatus(status, user_id);
		int res2 = new UserServiceImpl().updataUser(client_email, "111", user_id);
		if (res1 > 0 && res2 > 0) {
			return true;
		}
		return false;
	}

}
