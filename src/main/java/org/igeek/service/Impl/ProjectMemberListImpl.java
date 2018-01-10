package org.igeek.service.Impl;

import java.util.List;

import org.igeek.dao.CommonDAO;
import org.igeek.pojo.ViewClientUsers;
import org.igeek.pojo.ViewProjectClient;
import org.igeek.pojo.ViewProjectMember;
import org.igeek.service.ProjectMemberService;

public class ProjectMemberListImpl implements ProjectMemberService {
	private CommonDAO dao = new CommonDAO();

	@Override
	public List<Object> getAllProjectMember(String projectid) {
		List<Object> stakeholderList = dao.findByCondition(ViewProjectMember.class,
				"select * from view_project_member where project_id = ?", projectid);
		return stakeholderList;
	}

	@Override
	public List<Object> getAllClient(String projectid) {
		List<Object> clientList = dao.findByCondition(ViewProjectClient.class,
				"select * from view_project_client where project_id = ?", projectid);
		return clientList;
	}

	@Override
	public int insertMember(Integer usertype, Object... params) {
		int result = 0;
		String sql = "";
		if (usertype == 0) {
			sql = "	INSERT into employee(employee_name,employee_gender,employee_phone,employee_telephone,employee_qq,employee_email,department_id) values(?,?,?,?,?,?,?);";
		} else if (usertype == 1) {
			sql = "INSERT into client(client_name,client_gender,client_phone,client_telephone,client_qq,client_company,client_email)  values(?,?,?,?,?,?,?);";
		}
		result = dao.updateDataBase(sql, params);
		return result;
	}

	@Override
	public int insertProjectMember(Object... params) {
		int result = 0;
		String sql = "";
		sql = "INSERT into project_member(user_id,project_id,duty) VALUES(?,?,?);";
		result = dao.updateDataBase(sql, params);
		return result;
	}

	@Override
	public ViewProjectMember getMemberByUserId(int user_id) {
		List<Object> members = dao.findByCondition(ViewProjectMember.class,
				"select employee_name,employee_gender,employee_phone,employee_telephone,employee_qq,employee_email,department_name,role_Name \r\n"
						+ "FROM employee,department,user,user_role,role\r\n"
						+ "where department.department_id = employee.department_id and employee.employee_id = `user`.userinfo_id and \r\n"
						+ "user_role.user_Id = `user`.user_id and user_role.role_Id = role.role_Id and\r\n"
						+ "`user`.user_id = ?;",
				user_id);
		ViewProjectMember v = (ViewProjectMember) members.get(0);
		return v;
	}

	@Override
	public ViewProjectClient getClientByUserId(int user_id) {
		List<Object> members = dao.findByCondition(ViewProjectClient.class,
				" select client_name,client_gender,client_phone,client_telephone,client_qq,client_company,client_email\r\n"
						+ "FROM client,user\r\n" + "where  client.client_id = `user`.userinfo_id and \r\n"
						+ "`user`.user_id = ? and `user`.user_type = 1;",
				user_id);
		ViewProjectClient v = (ViewProjectClient) members.get(0);
		return v;
	}

	@Override
	public boolean isContain(Integer user_id, String projectid) {
		boolean res = false;
		String sql = "SELECT * from project_member where user_id = ? and project_id = ?";
		List<Object> list = new CommonDAO().findByBase(sql, user_id, projectid);
		if (list.size() > 0) {
			res = true;
		}
		return res;
	}

	@Override
	public int deleteClientOrMember(int user_id) {
		int result = 0;
		result = new CommonDAO().updateDataBase("DELETE FROM project_member WHERE user_id = ?", user_id);
		return result;
	}

	@Override
	public int findUserIdByemployee_phone(String employee_phone) {
		String sql = "select user_id from `user`,employee where `user`.userinfo_id = employee.employee_id and employee.employee_id = (select employee_id from employee where employee_phone=?) and `user`.user_type=0;";
		List<Object> list = new CommonDAO().findByBase(sql, employee_phone);
		Integer res = (Integer) list.get(0);
		return res;
	}

	@Override
	public int findUserIdByClient_phone(String Client_phone) {
		String sql = "select user_id from `user`,client where `user`.userinfo_id = client.client_id and client.client_id = (select client_id from client  where client_phone=?) and `user`.user_type=1;";
		List<Object> list = new CommonDAO().findByBase(sql, Client_phone);
		Integer res = (Integer) list.get(0);
		return res;
	}

	@Override
	public ViewClientUsers findViewClient(Integer userId) {
		String sql = "select * from view_client_users where user_id = ?";
		ViewClientUsers v = (ViewClientUsers) new CommonDAO().findByCondition(ViewClientUsers.class, sql, userId)
				.get(0);
		return v;
	}

}
