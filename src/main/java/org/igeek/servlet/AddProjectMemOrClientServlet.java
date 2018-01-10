package org.igeek.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.service.Impl.ProjectMemberListImpl;

import com.google.gson.Gson;

@WebServlet("/addProjectMemOrClient.html")
public class AddProjectMemOrClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		// 直接从前台获取
		String projectid = "ABCDE20171011";
		request.setAttribute("String projectid", projectid);
		String usertype = request.getParameter("user_type");
		Integer userType = Integer.parseInt(usertype);

		String userid = request.getParameter("user_id");
		Integer user_id = 0;
		if (userid != null) {
			user_id = Integer.valueOf(userid);
		}

		String duty = request.getParameter("duty");
		String msg = "";
		System.out.println("userType=" + userType);
		System.out.println("userid=" + userid);
		System.out.println("user_id=" + user_id);
		System.out.println("duty=" + duty);
		if (usertype.equals("0")) {
			if (new ProjectMemberListImpl().isContain(user_id, projectid) == false) {
				Object[] params = { user_id, projectid, duty };
				int r = new ProjectMemberListImpl().insertProjectMember(params);
				if (r > 0) {
					msg = "项目组干系人添加成功！";
					writer.print(msg);
				}

			} else {
				msg = "项目组干系人已经存在！无法继续添加！";

				writer.print(msg);
			}
		} else if (usertype.equals("1")) {
			if (new ProjectMemberListImpl().isContain(user_id, projectid) == false) {
				Object[] params = { user_id, projectid, duty };
				int r = new ProjectMemberListImpl().insertProjectMember(params);
				if (r > 0) {
					msg = "客户添加成功！";
					writer.print(msg);
				} else {
					msg = "客户添加失败！";
					writer.print(msg);
				}
			} else {
				msg = "该客户已经存在！无法继续添加！";
				writer.print(msg);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
