package org.igeek.service.Impl;

import java.util.List;

import org.igeek.dao.CommonDAO;
import org.igeek.pojo.WebUser;
import org.igeek.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {
	private CommonDAO dao = new CommonDAO();


	@Override
	public WebUser getWebUserById(Integer user_id) {
		List<Object> list = dao.findByCondition(WebUser.class,"select * from user where user_id = ?", user_id);
		return (WebUser) list.get(0);
	}

	@Override
	public int insertWebUser(Object[] pm) {
		int result = 0;
		result = dao.updateDataBase(
				"insert into user(username, password, create_time) values(?,?,now())",
				pm);
		return result;
	}

}
