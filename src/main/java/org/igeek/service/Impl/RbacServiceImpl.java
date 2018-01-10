package org.igeek.service.Impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.igeek.dao.CommonDAO;
import org.igeek.service.RbacService;
import org.igeek.util.StringUtil;
import org.igeek.pojo.Role;
import org.igeek.pojo.Rule;

public class RbacServiceImpl implements RbacService {
	private CommonDAO commonDAO = new CommonDAO();

	/**
	 * 
	 * @param path
	 * @return 根据地址求出 所要访问权限的id
	 */
	public Integer getRule_Id(String path) {
		if (commonDAO.findByBase("SELECT rule_Id FROM rule where url=?", path).size() > 0) {
			Integer rule_Id = (Integer) (commonDAO.findByBase("SELECT rule_Id FROM rule where url=?", path).get(0));
			return rule_Id;
		}
		return 0;// 一般不会遇到
	}

	/**
	 * 
	 * @param username
	 * @return 根据用户名获取当前用户拥有的所有按钮权限列表 不同的
	 */
	public Set<Rule> getUserRuleList(String username, String Category) {
		// 当前用户拥有的角色列表
		List<Object> rolelist = commonDAO.findByBase(
				"SELECT role_Id from user_role where user_Id=(SELECT user_Id from user WHERE userName=?)", username);
		// 这个是当前用户所拥有的权限列表
		Set<Rule> ruleset = new HashSet<Rule>();
		for (Object roleid : rolelist) {
			String string = commonDAO.findByBase("SELECT rule_Ids FROM role where role_Id=?", roleid).get(0) + "";
			List<Integer> numlist = StringUtil.ParseToInteger(string);
			for (Integer i : numlist) {
				if (commonDAO
						.findByCondition(Rule.class, "SELECT * from rule WHERE category=? and rule_Id=?", Category, i)
						.size() > 0) {
					Rule rule = (Rule) (commonDAO.findByCondition(Rule.class,
							"SELECT *from rule WHERE category=? and rule_Id=?", Category, i).get(0));
					ruleset.add(rule);
				}
			}
		}
		return ruleset;
	}

	@Override
	public Role getUserRoleList(Integer userid) {
		// 当前用户拥有的角色
		List<Object> rolelist = commonDAO.findByCondition(Role.class,
				"SELECT role.role_Id , role.role_Name , role.rule_Ids FROM role INNER JOIN user_role ON user_role.role_Id = role.role_Id where user_role.user_Id = ?",
				userid);
		return (Role) rolelist.get(0);
	}

	@Override
	public List<Object> getAllRole() {
		List<Object> rolelist = commonDAO.findByCondition(Role.class, "SELECT * FROM role ", new Object[] {});
		return rolelist;
	}

	@Override
	public int updateRole(int role_id, int user_id) {
		int result = 0;
		result = commonDAO.updateDataBase("update user_role set role_Id = ? where user_Id = ?", role_id, user_id);
		return result;
	}
}
