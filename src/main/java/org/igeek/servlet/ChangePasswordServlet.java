package org.igeek.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.service.Impl.UserServiceImpl;

@WebServlet("/changePassword.html")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String type = request.getParameter("type");
		if (type.equals("2")) {
			Integer userid = Integer.parseInt(request.getParameter("user_id"));
			String newpwd = request.getParameter("newpwd");
			int result = new UserServiceImpl().updataUserPwd(newpwd, userid);
			if (result > 0) {
				response.getWriter().print("密码更新成功！");
			}
		} else {
			Integer user_id = (Integer) request.getSession().getAttribute("user_Id");

			String oldpwd = request.getParameter("oldpwd");
			String newpwd = request.getParameter("newpwd");
			String confirmpwd = request.getParameter("confirmpwd");
			if (!newpwd.equals(confirmpwd)) {
				response.getWriter().print("密码输入不一致！");
			} else {
				if (new UserServiceImpl().isNullByOldPwd(user_id).getPassword().equals(oldpwd)) {
					int result = new UserServiceImpl().updataUserPwd(newpwd, user_id);
					if (result > 0) {
						response.getWriter().print("密码更新成功！");
					}
				} else {
					response.getWriter().print("密码不正确！");
				}
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
