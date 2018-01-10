package org.igeek.service;

import java.util.List;
import java.util.Set;

import org.igeek.pojo.Role;
import org.igeek.pojo.Rule;

/**
 * 
 * @author J&Y
 *跟权限有关的逻辑编写
 */
public interface RbacService {
	
	/**
	 * 
	 * @param path
	 * @return
	 * 查询当前执行所需要的权限id
	 */
	public Integer getRule_Id(String path);
	/**
	 * 
	 * @param username
	 * @return
	 * 根据用户名获取当前用户拥有的所有按钮权限列表  不同的
	 */
	public Set<Rule> getUserRuleList(String username,String Category);
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Role getUserRoleList(Integer userid);
	public List<Object> getAllRole();
	public int updateRole(int role_id,int user_id);
}
