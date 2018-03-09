package org.igeek.service;

import org.igeek.pojo.WebUser;

public interface RegisterService {
	public WebUser getWebUserById(Integer user_id);
	public int insertWebUser(Object[] pm);

}
