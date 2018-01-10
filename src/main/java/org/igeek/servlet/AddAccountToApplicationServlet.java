package org.igeek.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.service.Impl.AccountServiceImpl;
import org.igeek.service.Impl.ProjectMemberListImpl;

@WebServlet("/addAccountToApplication.html")
public class AddAccountToApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		String clientname = request.getParameter("clientname");
		Integer user_id = Integer.parseInt(clientname);
		Integer client_id = new ProjectMemberListImpl().findViewClient(user_id).getClient_Id();
		String company = request.getParameter("company");
		String email = request.getParameter("email");
		String reason = request.getParameter("reason");

		String application_time = sdf.format(new Date());
		Integer pass_status = 0;
		Object[] params = { client_id, user_id, reason, pass_status, application_time };
		// 用来判断申请的账号是否已经存在审核列表中
		int aa = new AccountServiceImpl().findByClientId(client_id);
		if (aa == 0) {
			int res = new AccountServiceImpl().insertAccountApplication(params);
			if (res > 0) {
				response.getWriter().print("提交审核中，请耐性等候！");
			}
		} else {
			response.getWriter().print("账号已提交申请！请勿重复提交！");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
