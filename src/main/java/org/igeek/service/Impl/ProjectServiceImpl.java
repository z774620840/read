package org.igeek.service.Impl;

import java.util.List;

import org.igeek.Rbac.Roles;
import org.igeek.dao.CommonDAO;
import org.igeek.pojo.Page;
import org.igeek.pojo.ProjectWorkload;
import org.igeek.pojo.ViewProjectCollect;
import org.igeek.service.ProjectService;


public class ProjectServiceImpl implements ProjectService{
	private CommonDAO dao = new CommonDAO();

	@Override
	public ViewProjectCollect getViewProjectById(String project_Id) {
		String sql = "select * from view_project_collect where project_id =?";
		ViewProjectCollect projectCollect = null;
		List<Object> list = dao.findByCondition(ViewProjectCollect.class,sql, project_Id);
		if(list.size()>0){
			projectCollect = (ViewProjectCollect) list.get(0);
		}
		return projectCollect;
	}

	
	@Override
	public Page<Object> getProjectByUser(Integer user_Id, int role,Integer currentPage,Integer pageSize) {
		Page<Object> page = new Page<Object>();
		List<Object> projectList = null;
		Integer start  = 0;
		long totalCount = 0;
		String totalSql = null;
		String sql=null;
		Boolean flag=true;//是否有参数
		switch (role) {
		case Roles.CLIENT:
			sql="select * from view_project_collect where project_id=(select project_id from view_project_client where user_id = ? ) limit ?,?";
			totalSql="select count(*) from view_project_collect where project_id=(select project_id from view_project_client where user_id = ?)";
			break;
		case Roles.CLIENT_MANAGERS:
			sql="select * from view_project_collect where company=(select client_company from view_project_client where user_id = ?)  limit ?,?";
			totalSql="select count(*) from view_project_collect where company=(select client_company from view_project_client where user_id = ?)";
			break;
		case Roles.MANAGEMENT:
		case Roles.LEADER:
		case Roles.ACCOUNYANT:
			sql="select * from view_project_collect limit ?,?";
			totalSql="select count(*) from view_project_collect";
			flag = false;
			break;
		case Roles.BUSINESS:
		case Roles.PROJECT_MANAGER:
		case Roles.PROJECT_MEMBER:
			sql="select view_project_collect.* from view_project_collect,project_member where view_project_collect.project_id=project_member.project_id and user_id =? limit ?,?";
			totalSql="select count(*) from view_project_collect,project_member where view_project_collect.project_id=project_member.project_id and user_id =?";
			break;
			
		case Roles.DEPARTMENT_MANAGER:
			sql="select * from view_project_collect where department=(select department_name from view_project_member where user_id = ?) limit ?,?";
			totalSql="select count(*) from view_project_collect where department=(select department_name from view_project_member where user_id = ?)";
		default:
			break;
		}
		Object[] params = null;
		if(sql!=null){
			start  = (currentPage-1)*pageSize;
			if(flag){
				totalCount = dao.findTotal(totalSql, user_Id);
				params = new Object[]{user_Id,start,pageSize};
			}else{
				totalCount = dao.findTotal(totalSql);
				params = new Object[]{start,pageSize};
			}
			if(currentPage>((totalCount+pageSize-1)/pageSize)){
				currentPage=(int) ((totalCount+pageSize-1)/pageSize);
			}else if(currentPage<1){
				currentPage=1;
			}
			projectList=dao.findByCondition(ViewProjectCollect.class,sql,params);
		}
		page.setCurrentPage(currentPage);
		page.setObj(projectList);
		page.setPageSize(pageSize);
		page.setTotalCount(totalCount);
		page.setTotalPage((totalCount+pageSize-1)/pageSize);
		return page;
	}


	@Override
	public List<Object> getProjectIdListByUser(Integer user_Id,int role) {
		List<Object> projectIdList = null;
		String sql=null;
		Boolean flag=true;//是否有参数
		switch (role) {
		case Roles.CLIENT:
			sql="select project_id from view_project_client where user_id = ?";
			break;
		case Roles.CLIENT_MANAGERS:
			sql="select project_id from view_project_collect where company=(select client_company from view_project_client where user_id = ?)";
			break;
		case Roles.MANAGEMENT:
		case Roles.LEADER:
		case Roles.ACCOUNYANT:
			sql="select project_id from view_project_collect";
			flag = false;
			break;
		case Roles.BUSINESS:
		case Roles.PROJECT_MANAGER:
		case Roles.PROJECT_MEMBER:
			sql="select view_project_collect.project_id from view_project_collect,project_member where view_project_collect.project_id=project_member.project_id and user_id =?";
			break;
		case Roles.DEPARTMENT_MANAGER:
			sql="select project_id from view_project_collect where department=(select department_name from view_project_member where user_id = ?)";
		default:
			break;
		}
		if(flag){
			projectIdList = dao.findByBase(sql,user_Id);
		}else{
			projectIdList = dao.findByBase(sql);
		}
		return projectIdList;
	}


	@Override
	public int updateProject(Object[] pro) {
		int result = 0;
		result = dao.updateDataBase(
				"update project set value = ? ,technology = ? ,mode = ? ,learning_Opportunity = ? ,difficulty = ? ,difficulty_remark = ? ,config_server_type = ? ,config_server_path = ? where project_id =?",
				pro);
		return result;
	}


	@Override
	public ProjectWorkload getProjectWorkloadById(String project_Id) {
		String sql = "select * from project_workload where project_id =?";
		ProjectWorkload workload = null;
		List<Object> list = dao.findByCondition(ProjectWorkload.class,sql, project_Id);
		if(list.size()>0){
			workload = (ProjectWorkload) list.get(0);
		}
		return workload;
	}


	@Override
	public int updateWorkload(Object[] wl) {
		int result = 0;
		result = dao.updateDataBase(
				"update project_workload set assess_workload = ? ,actual_workload = ? ,workload_proportion = ? ,days = ? ,weekly_workload = ? where project_id =?",
				wl);
		return result;
	}
}
