package org.igeek.servlet;

import java.io.IOException;
import java.math.BigDecimal;
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

@WebServlet("/findProjectTable.html")
public class FindProjectTableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		// String str = "";
		// for (int i = 0; i < 5; i++) {
		// str += (char) (Math.random() * 26 + 'A');
		// }
		// SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd");
		// SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
		// String date = format1.format(new Date());
		// String project_id = str + date;
		// String project_name = request.getParameter("project_name");
		// String company = request.getParameter("company");
		// String vacation = request.getParameter("vacation");
		// String solution = request.getParameter("solution");
		// Integer business_id = (Integer)
		// request.getSession().getAttribute("user_Id");
		// String business = request.getParameter("business");
		// String presettimeStr = format2.format(new Date());
		// java.sql.Date presettime = java.sql.Date.valueOf(presettimeStr);
		// String starting_TimeStr = format2.format(new Date());
		// java.sql.Date starting_Time =
		// java.sql.Date.valueOf(starting_TimeStr);
		// String online_TimeStr = format2.format(new Date());
		// java.sql.Date online_Time = java.sql.Date.valueOf(online_TimeStr);
		// String initial_Test_TimeStr = format2.format(new Date());
		// java.sql.Date initial_Test_Time =
		// java.sql.Date.valueOf(initial_Test_TimeStr);
		// String final_Test_TimeStr = format2.format(new Date());
		// java.sql.Date final_Test_Time =
		// java.sql.Date.valueOf(final_Test_TimeStr);
		// Integer pm_Id = (Integer)
		// request.getSession().getAttribute("user_Id");
		// String pm = request.getParameter("pm");
		// String department = request.getParameter("department");
		// String workingload_Computing =
		// request.getParameter("workingload_Computing");
		// String implement_Site = request.getParameter("implement_Site");
		// Double assess_Workload =
		// Double.parseDouble(request.getParameter("assess_Workload"));
		// Double report_Workload =
		// Double.parseDouble(request.getParameter("report_Workload"));
		// String workload_Assessor = request.getParameter("workload_Assessor");
		// String workload_Verifier = request.getParameter("workload_Verifier");
		// BigDecimal income =
		// BigDecimal.valueOf(Double.parseDouble(request.getParameter("income")));
		// String income_Remark = request.getParameter("income_Remark");
		// BigDecimal expend =
		// BigDecimal.valueOf(Double.parseDouble(request.getParameter("expend")));
		// String expend_Remark = request.getParameter("expend_Remark");
		// BigDecimal sales_Amount =
		// BigDecimal.valueOf(Double.parseDouble(request.getParameter("sales_Amount")));
		// String sales_Amount_Remark =
		// request.getParameter("sales_Amount_Remark");
		// BigDecimal margin =
		// BigDecimal.valueOf(Double.parseDouble(request.getParameter("margin")));
		// Boolean isloss = Boolean.getBoolean(request.getParameter("isloss"));
		// String commitment = request.getParameter("commitment");
		// String remark = request.getParameter("remark");
		// String status = request.getParameter("status");
		// BigDecimal project_Budget =
		// BigDecimal.valueOf(Double.parseDouble(request.getParameter("project_Budget")));
		//
		// ProjectApproval approval = new ProjectApproval();
		// approval.setproject_Id(project_id);
		// approval.setproject_Name(project_name);
		// approval.setCompany(company);
		// approval.setVacation(vacation);
		// approval.setSolution(solution);
		// approval.setBusiness_Id(business_id);
		// approval.setbusiness(business);
		// approval.setPresettime(presettime);
		// approval.setstarting_Time(starting_Time);
		// approval.setonline_Time(online_Time);
		// approval.setinitial_Test_Time(initial_Test_Time);
		// approval.setfinal_Test_Time(final_Test_Time);
		// approval.setPm_Id(pm_Id);
		// approval.setPm(pm);
		// approval.setDepartment(department);
		// approval.setworkingload_Computing(workingload_Computing);
		// approval.setimplement_Site(implement_Site);
		// approval.setassess_Workload(assess_Workload);
		// approval.setreport_Workload(report_Workload);
		// approval.setworkload_Assessor(workload_Assessor);
		// approval.setworkload_Verifier(workload_Verifier);
		// approval.setIncome(income);
		// approval.setincome_Remark(income_Remark);
		// approval.setExpend(expend);
		// approval.setexpend_Remark(expend_Remark);
		// approval.setsales_Amount(sales_Amount);
		// approval.setsales_Amount_Remark(sales_Amount_Remark);
		// approval.setMargin(margin);
		// approval.setIsloss(isloss);
		// approval.setCommitment(commitment);
		// approval.setRemark(remark);
		// approval.setStatus(status);
		// approval.setproject_Budget(project_Budget);

		String st = "VSYTK20171017";
		ProjectApproval as = new ProjectAprovalServiceImpl().findAllProjectApproval(st);
		if (as != null) {
			request.setAttribute("as", as);
			request.getRequestDispatcher("project_table.html").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
