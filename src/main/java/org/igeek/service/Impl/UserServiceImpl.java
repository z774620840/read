package org.igeek.service.Impl;

import java.util.List;

import org.igeek.dao.CommonDAO;
import org.igeek.pojo.User;
import org.igeek.pojo.ViewClientUsers;
import org.igeek.pojo.ViewMemberUsers;
import org.igeek.service.UserService;

public class UserServiceImpl implements UserService {
	private CommonDAO commonDAO = new CommonDAO();

	public User getUserByUserName(String username, String password) {
		List<Object> users = commonDAO.findByCondition(User.class,
				"Select * from user where username = ? and password = ? ", username, password);
		if (users.size() > 0) {
			User user = (User) (users.get(0));
			return user;
		}
		return null;

	}

	@Override
	public String getName(User user) {
		String sql = null;
		if (user.getuser_Type() == false) {
			sql = "Select employee_name from employee where employee_id =?";
		} else {
			sql = "Select client_name from employee where client_id =?";
		}
		return (String) commonDAO.findByBase(sql, user.getuserinfo_Id()).get(0);
	}

	@Override
	public List<Object> findAllUsers() {
		List<Object> userList = commonDAO.findByCondition(User.class, "select * from user", new Object[] {});
		return userList;
	}

	@Override
	public String getNameByUserId(Integer userId) {
		List<Object> userList = commonDAO.findByCondition(User.class, "select username from user where user_id=?",
				userId);
		String userName = String.valueOf(userList.get(0));
		return userName;
	}

	@Override
	public Integer getUserInfoId(Integer userId) {
		List<Object> userList = commonDAO.findByBase("select userinfo_id from user where user_id=?", userId);
		Integer UserInfoId = (Integer) userList.get(0);

		return UserInfoId;
	}

	@Override
	public List<Object> findAllMemberOrClient(int usertype) {
		List<Object> userList = commonDAO.findByCondition(User.class, "select * from user where user_type = ?",
				usertype);
		return userList;
	}

	@Override
	public List<Object> getUserIdAndName(Integer usertype) {
		String sql = "";
		List<Object> list = null;
		if (usertype == 0) {
			sql = "select * from view_member_users;";
			list = commonDAO.findByCondition(ViewMemberUsers.class, sql, new Object[] {});
		} else if (usertype == 1) {
			sql = "select * from view_client_users;";
			list = commonDAO.findByCondition(ViewClientUsers.class, sql, new Object[] {});
		}
		return list;
	}

	@Override
	public int updataUser(String username, String password, Integer user_id) {
		int result = new CommonDAO().updateDataBase("UPDATE `user` SET username = ?,`password`= ? WHERE user_id= ?",
				username, password, user_id);
		return result;
	}

	@Override
	public int updataUserForbiddenByUserId(Integer isforbidden, Integer user_id) {
		int result = new CommonDAO().updateDataBase("UPDATE `user` SET isforbidden =? where user_id=?", isforbidden,
				user_id);
		return result;
	}

	@Override
	public int udataUserNameByUserId(Integer user_id) {
		String sql = "UPDATE `user` SET username = null ,`password` = null WHERE user_id= ?";
		int result = new CommonDAO().updateDataBase(sql, user_id);
		return result;
	}

	@Override
	public User isNullByOldPwd(Integer user_id) {
		String sql = "select * from user where user_id = ?";
		List<Object> list = new CommonDAO().findByCondition(User.class, sql, user_id);
		User u = (User) list.get(0);
		return u;
	}

	@Override
	public int updataUserPwd(String newpwd,Integer user_id) {
		String sql = "UPDATE `user` SET `password` = ? WHERE user_id= ?";
		int result = new CommonDAO().updateDataBase(sql, newpwd,user_id);
		return result;
	}

}
