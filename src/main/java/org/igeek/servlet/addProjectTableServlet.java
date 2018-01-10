package org.igeek.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igeek.pojo.ProjectApproval;
import org.igeek.service.Impl.ProjectAprovalServiceImpl;

@WebServlet("/addProjectTable.html")
public class addProjectTableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String project_id = request.getParameter("project_id");
		String project_name = request.getParameter("project_name");
		String company = request.getParameter("company");
		String vacation = request.getParameter("vacation");
		String solution = request.getParameter("solution");
		Integer business_id = (Integer) request.getSession().getAttribute("user_Id");
		String business = request.getParameter("business");		
		String presettime =request.getParameter("presettime");
		String starting_Time =request.getParameter("starting_Time");
		String online_Time =request.getParameter("online_Time");
		String initial_Test_Time =request.getParameter("initial_Test_Time");
		String final_Test_Time =request.getParameter("final_Test_Time");

		Integer pm_Id = (Integer) request.getSession().getAttribute("employee_id");
		String pm = request.getParameter("pm");
		String department = request.getParameter("department");
		String workingload_Computing = request.getParameter("workingload_Computing");
		String implement_Site = request.getParameter("implement_Site");
		Double assess_Workload = Double.parseDouble(request.getParameter("assess_Workload"));
		Double report_Workload = Double.parseDouble(request.getParameter("report_Workload"));
		String workload_Assessor = request.getParameter("workload_Assessor");
		String workload_Verifier = request.getParameter("workload_Verifier");
		BigDecimal income = BigDecimal.valueOf(Double.parseDouble(request.getParameter("income")));
		String income_Remark = request.getParameter("income_Remark");
		BigDecimal expend = BigDecimal.valueOf(Double.parseDouble(request.getParameter("expend")));
		String expend_Remark = request.getParameter("expend_Remark");
		BigDecimal sales_Amount = BigDecimal.valueOf(Double.parseDouble(request.getParameter("sales_Amount")));

		String sales_Amount_Remark = request.getParameter("sales_Amount_Remark");
		BigDecimal margin = BigDecimal.valueOf(Double.parseDouble(request.getParameter("margin")));
		Boolean isloss = Boolean.getBoolean(request.getParameter("isloss"));
		String commitment = request.getParameter("commitment");
		String remark = request.getParameter("remark");
		String status = request.getParameter("status");
		BigDecimal project_Budget = BigDecimal.valueOf(Double.parseDouble(request.getParameter("project_Budget")));

		ProjectApproval approval = new ProjectApproval();
		approval.setproject_Id(project_id);
		approval.setproject_Name(project_name);
		approval.setCompany(company);
		approval.setVacation(vacation);
		approval.setSolution(solution);
		approval.setBusiness_Id(business_id);
		approval.setbusiness(business);
		approval.setPresettime(presettime);
		approval.setstarting_Time(starting_Time);
		approval.setonline_Time(online_Time);
		approval.setinitial_Test_Time(initial_Test_Time);
		approval.setfinal_Test_Time(final_Test_Time);
		approval.setPm_Id(pm_Id);
		approval.setPm(pm);
		approval.setDepartment(department);
		approval.setworkingload_Computing(workingload_Computing);
		approval.setimplement_Site(implement_Site);
		approval.setassess_Workload(assess_Workload);
		approval.setreport_Workload(report_Workload);
		approval.setworkload_Assessor(workload_Assessor);
		approval.setworkload_Verifier(workload_Verifier);
		approval.setIncome(income);
		approval.setincome_Remark(income_Remark);
		approval.setExpend(expend);
		approval.setexpend_Remark(expend_Remark);
		approval.setsales_Amount(sales_Amount);
		approval.setsales_Amount_Remark(sales_Amount_Remark);
		approval.setMargin(margin);
		approval.setIsloss(isloss);
		approval.setCommitment(commitment);
		approval.setRemark(remark);
		approval.setStatus(status);
		approval.setproject_Budget(project_Budget);
		System.out.println(approval);

		int res = new ProjectAprovalServiceImpl().updateProjectAprovalAll(approval);
		System.out.println(res);
		if (res > 0) {
			request.getRequestDispatcher("project_table.html").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
