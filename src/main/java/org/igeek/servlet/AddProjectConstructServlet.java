package org.igeek.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.dao.CommonDAO;
import org.igeek.pojo.ProjectApproval;
import org.igeek.service.Impl.ProjectAprovalServiceImpl;

@WebServlet("/addProjectConstruct.html")
public class AddProjectConstructServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String str = "";
		for (int i = 0; i < 5; i++) {
			str += (char) (Math.random() * 26 + 'A');
		}
		SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
		String date = format1.format(new Date());
		String project_id = str + date;
		String projet_name = request.getParameter("project_name");
		String company = request.getParameter("company");
		String vacation = request.getParameter("vacation");
		String solution = request.getParameter("solution");
		Integer business_id = (Integer) request.getSession().getAttribute("user_Id");
		String business = request.getParameter("business");
		String presettime = request.getParameter("presettime");
		ProjectApproval approval = new ProjectApproval();
		approval.setproject_Id(project_id);
		approval.setproject_Name(projet_name);
		approval.setCompany(company);
		approval.setVacation(vacation);
		approval.setSolution(solution);
		approval.setBusiness_Id(business_id);
		approval.setbusiness(business);
		approval.setPresettime(presettime);
		int res = new ProjectAprovalServiceImpl().insertProjectAproval(approval);
		if (res > 0) {
			request.getRequestDispatcher("project_list.html").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
