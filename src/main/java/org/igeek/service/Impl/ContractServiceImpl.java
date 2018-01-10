package org.igeek.service.Impl;

import java.util.List;

import org.igeek.Rbac.Roles;
import org.igeek.dao.CommonDAO;
import org.igeek.pojo.Contract;
import org.igeek.pojo.Page;
import org.igeek.service.ContractService;

public class ContractServiceImpl implements ContractService {
	private CommonDAO dao = new CommonDAO();
	@Override
	public Page<Object> getContractByUser(Integer user_Id, int role, Integer currentPage, Integer pageSize,String cname) {
		Page<Object> page = new Page<Object>();
		List<Object> contractList = null;
		Integer start  = 0;
		long totalCount = 0;
		String totalSql = null;
		String sql=null;
		Boolean flag=true;//是否有参数
		switch (role) {
		case Roles.MANAGEMENT:
		case Roles.LEADER:
		case Roles.ACCOUNYANT:
			if(cname==""){
				sql="select * from contract limit ?,?";
				totalSql="select count(*) from contract";
			}else{
				sql="select * from contract where contract_name = ? limit ?,?";
				totalSql="select count(*) from contract where contract_name = ?";
			}
			flag = false;
			break;
		case Roles.BUSINESS:
		case Roles.PROJECT_MANAGER:
			if(cname==""){
				sql="select contract.* from contract,project_member where contract.project_id=project_member.project_id and user_id =? limit ?,?";
				totalSql="select count(*) from contract,project_member where contract.project_id=project_member.project_id and user_id =?";
			}else{
				sql="select contract.* from contract,project_member where contract.project_id=project_member.project_id and user_id =? and contract_name = ? limit ?,?";
				totalSql="select count(*) from contract,project_member where contract.project_id=project_member.project_id and user_id =? and contract_name = ?";
			}
			break;
		case Roles.DEPARTMENT_MANAGER:
			if(cname==""){
				sql="select * from contract where project_id = (select view_project_collect.project_id from view_project_collect where department=(select department_name from view_project_member where user_id = ?)) limit ?,?";
				totalSql="select count(*) from contract where project_id = (select view_project_collect.project_id from view_project_collect where department=(select department_name from view_project_member where user_id = ?))";
			}else{
				sql="select * from contract where project_id = (select view_project_collect.project_id from view_project_collect where department=(select department_name from view_project_member where user_id = ?)) and contract_name = ? limit ?,?";
				totalSql="select count(*) from contract where project_id = (select view_project_collect.project_id from view_project_collect where department=(select department_name from view_project_member where user_id = ?)) and contract_name = ?";
			}
		default:
			break;
		}
		Object[] params = null;
		if(sql!=null){
			start  = (currentPage-1)*pageSize;
			if(flag){
				if(cname==""){
					totalCount = dao.findTotal(totalSql, user_Id);
					params = new Object[]{user_Id,start,pageSize};
				}else{
					totalCount = dao.findTotal(totalSql, user_Id,cname);
					params = new Object[]{user_Id,cname,start,pageSize};
				}
			}else{
				if(cname==""){
					totalCount = dao.findTotal(totalSql);
					params = new Object[]{start,pageSize};
				}else{
					totalCount = dao.findTotal(totalSql,cname);
					params = new Object[]{start,pageSize,cname};
				}
			}
			if(currentPage>((totalCount+pageSize-1)/pageSize)){
				currentPage=(int) ((totalCount+pageSize-1)/pageSize);
			}else if(currentPage<1){
				currentPage=1;
			}
			contractList=dao.findByCondition(Contract.class,sql,params);
		}
		page.setCurrentPage(currentPage);
		page.setObj(contractList);
		page.setPageSize(pageSize);
		page.setTotalCount(totalCount);
		page.setTotalPage((totalCount+pageSize-1)/pageSize);
		return page;
	}

}
