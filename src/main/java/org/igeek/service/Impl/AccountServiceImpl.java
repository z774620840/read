package org.igeek.service.Impl;

import java.util.List;

import org.igeek.dao.CommonDAO;
import org.igeek.pojo.AccountApplication;
import org.igeek.pojo.ViewAccountApply;
import org.igeek.pojo.ViewClientUsers;
import org.igeek.service.AccountService;

public class AccountServiceImpl implements AccountService {

	@Override
	public List<Object> findClient() {
		String sql = "select * from view_client_users where username is null;";
		List<Object> list = new CommonDAO().findByCondition(ViewClientUsers.class, sql, new Object[] {});
		return list;
	}

	@Override
	public int insertAccountApplication(Object[] params) {
		String sql = "insert into account_application(client_id,proposer_id,reason,pass_status,application_time)values(?,?,?,?,?);";
		int result = new CommonDAO().updateDataBase(sql, params);
		return result;
	}

	@Override
	public int findByClientId(Integer client_id) {
		List<Object> list = new CommonDAO().findByCondition(AccountApplication.class,
				"select * from account_application where client_id=?", client_id);
		return list.size();
	}

	@Override
	public List<Object> findViewAccountList() {
		String sql = "select * from view_account_applylist";
		List<Object> list = new CommonDAO().findByCondition(ViewAccountApply.class, sql, new Object[] {});
		return list;
	}

	@Override
	public ViewAccountApply findAllByClientId(Integer client_id) {
		List<Object> list = new CommonDAO().findByCondition(ViewAccountApply.class, "select * from view_account_applylist where client_id = ?", client_id);
		ViewAccountApply v = (ViewAccountApply) list.get(0);
		return v;
	}

	@Override
	public int updataAccountStatus(Integer status, Integer user_id) {
		int result = new CommonDAO().updateDataBase("UPDATE account_application set pass_status = ? where proposer_id = ?", status,user_id);
		return result;
	}

	@Override
	public List<Object> findViewAccountPass() {
		String sql = "select * from view_account_applylist where pass_status = 1";
		List<Object> list = new CommonDAO().findByCondition(ViewAccountApply.class, sql, new Object[] {});
		return list;
	}

}
