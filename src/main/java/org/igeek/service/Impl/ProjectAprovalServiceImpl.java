package org.igeek.service.Impl;

import java.util.List;

import org.igeek.dao.CommonDAO;
import org.igeek.pojo.ProjectApproval;
import org.igeek.service.ProjectAprovalService;

public class ProjectAprovalServiceImpl implements ProjectAprovalService {
	private CommonDAO dao = new CommonDAO();

	@Override
	public int insertProjectAproval(String project_id, String project_name, String company, String vacation,
			String solution, String servicer, String presettime) {
		int result = 0;
		Object[] params = { project_id, project_name, company, vacation, solution, servicer, presettime };
		result = dao.updateDataBase(
				"insert into project_approval(project_id,project_name,company,vacation,solution,business_id,business,presettime) values(?,?,?,?,?,?,?,?)",
				params);
		return result;
	}

	@Override
	public int insertProjectAproval(ProjectApproval pa) {
		int result = 0;
		Object[] params = { pa.getproject_Id(), pa.getproject_Name(), pa.getCompany(), pa.getVacation(),
				pa.getSolution(), pa.getBusiness_Id(), pa.getBusiness_Id(), pa.getPresettime() };
		result = dao.updateDataBase(
				"insert into project_approval(project_id,project_name,company,vacation,solution,business_id,business,presettime) values(?,?,?,?,?,?,?,?)",
				params);
		return result;
	}

	@Override
	public int updateProjectAprovalAll(ProjectApproval pa) {
		int result = 0;
		// String sql = "UPDATE project_approval set starting_time =
		// ?,online_time =?,initial_test_time =?,final_test_time =?,pm_id = ?,
		// PM=?,department=?,workingload_computing
		// =?,implement_site=?,assess_workload=?,report_workload=?,workload_assessor=?,workload_verifier=?,income
		// = ?,income_remark = ?,expend = ?,expend_remark=?,"
		// + "sales_amount=?,sales_amount_remark=?,margin = ?,isloss =
		// ?,commitment=?,remark=?,`status`=?,project_budget=? "
		// + "where project_id=?;";
		String sql = "UPDATE project_approval set starting_time = ?,online_time = ?,initial_test_time = ?,final_test_time = ?,pm_id = ?, PM=?,department=?,workingload_computing =?,implement_site=?,assess_workload=?,report_workload=?,workload_assessor=?,workload_verifier=?,income = ?,income_remark = ?,expend = ?,expend_remark=?,sales_amount=?,sales_amount_remark=?,margin = ?,isloss = ?,commitment=?,remark=?,`status`=?,project_budget=? where project_id=?;";
		Object[] params = { pa.getstarting_Time(), pa.getonline_Time(), pa.getinitial_Test_Time(),
				pa.getfinal_Test_Time(), pa.getPm_Id(), pa.getPm(), pa.getDepartment(), pa.getworkingload_Computing(),
				pa.getimplement_Site(), pa.getassess_Workload(), pa.getreport_Workload(), pa.getworkload_Assessor(),
				pa.getworkload_Verifier(), pa.getIncome(), pa.getincome_Remark(), pa.getExpend(), pa.getexpend_Remark(),
				pa.getsales_Amount(), pa.getsales_Amount_Remark(), pa.getMargin(), pa.getIsloss(), pa.getCommitment(),
				pa.getRemark(), pa.getStatus(), pa.getproject_Budget(), pa.getproject_Id() };
		result = dao.updateDataBase(sql, params);
		return result;
	}

	@Override
	public ProjectApproval findAllProjectApproval(String projectid) {
		List<Object> ProjectApprovalList = dao.findByCondition(ProjectApproval.class,
				"select*from project_approval where project_id=?", projectid);

		if (ProjectApprovalList.size() > 0) {
			ProjectApproval pa = (ProjectApproval) ProjectApprovalList.get(0);
			return pa;
		}
		return null;
	}

}
