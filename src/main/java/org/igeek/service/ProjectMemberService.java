package org.igeek.service;

import java.util.List;

import org.igeek.pojo.ViewClientUsers;
import org.igeek.pojo.ViewProjectClient;
import org.igeek.pojo.ViewProjectMember;

public interface ProjectMemberService {
	/**
	 * 干系人信息的查询语句
	 */
	public List<Object> getAllProjectMember(String projectid);

	/**
	 * 查询干系人线管的user信息
	 * 
	 * @return
	 */
	public List<Object> getAllClient(String projectid);

	public ViewProjectMember getMemberByUserId(int user_id);

	/**
	 * 插入干系人信息
	 * 
	 * @return
	 */
	public int insertMember(Integer usertype, Object... params);

	public int insertProjectMember(Object... params);

	public boolean isContain(Integer user_id,String projectid);

	public ViewProjectClient getClientByUserId(int user_id);

	public int deleteClientOrMember(int user_id);

	public int findUserIdByemployee_phone(String employee_phone);

	public int findUserIdByClient_phone(String Client_phone);
	public ViewClientUsers findViewClient(Integer userId);
}
