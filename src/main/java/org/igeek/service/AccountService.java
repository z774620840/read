package org.igeek.service;

import java.util.List;

import org.igeek.pojo.AccountApplication;
import org.igeek.pojo.ViewAccountApply;

public interface AccountService {
	public List<Object> findClient();
	public int insertAccountApplication(Object[] params);
	public int findByClientId(Integer user_id);
	public List<Object> findViewAccountList();
	public ViewAccountApply findAllByClientId(Integer client_id);
	public int updataAccountStatus(Integer status,Integer user_id);
	public List<Object> findViewAccountPass();
}
