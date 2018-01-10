package org.igeek.service;

import java.util.List;

import org.igeek.pojo.User;

/**
 * 
 * 用户逻辑编写
 */
public interface UserService {
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public User getUserByUserName(String username, String password);

	/**
	 * 
	 * @param username
	 * @return
	 */
	public String getName(User user);
	public List<Object> findAllUsers();
	public List<Object> findAllMemberOrClient(int usertype);
	public String getNameByUserId(Integer userId);
	public Integer getUserInfoId(Integer userId);
	public List<Object> getUserIdAndName(Integer usertype);
	public int updataUser(String username,String password,Integer user_id);
	public int updataUserForbiddenByUserId(Integer isforbidden,Integer user_id);
	public int udataUserNameByUserId(Integer user_id);
	public User isNullByOldPwd(Integer user_id);
	public int updataUserPwd(String newpwd,Integer user_id);
}
