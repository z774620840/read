package org.igeek.service;

import org.igeek.pojo.WebUser;

public interface LoginService {
	public String getName(WebUser webuser);
	public WebUser getUserByUserName(String username, String password);
	public String getNameByUserId(Integer userId);
}
