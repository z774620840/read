package org.igeek.service.Impl;

import java.util.List;

import javax.servlet.http.HttpServlet;

import org.igeek.dao.CommonDAO;

import org.igeek.pojo.WebUser;
import org.igeek.service.LoginService;

public class LoginServiceImpl implements LoginService {
	private CommonDAO commonDAO = new CommonDAO();

	@Override
	public WebUser getUserByUserName(String username, String password) {
		List<Object> users = commonDAO.findByCondition(WebUser.class,
				"Select * from user where username = ? and password = ? ", username, password);
		if (users.size() > 0) {
			WebUser user = (WebUser) (users.get(0));
			return user;
		}
		return null;
	}

	public String getNameByUserId(Integer userId) {
		List<Object> userList = commonDAO.findByCondition(WebUser.class, "select username from user where user_id=?",
				userId);
		String userName = String.valueOf(userList.get(0));
		return userName;
	}

	@Override
	public String getName(WebUser webuser) {
		String sql = null;
		sql = "Select username from user where user_id =?";
		return (String) commonDAO.findByBase(sql, webuser.getUsername()).get(0);
	}

	
}
