package org.igeek.service;

import org.igeek.pojo.ProjectApproval;

public interface ProjectAprovalService {
	/**
	 * 插入立项申请
	 * 
	 * @return
	 */
	public int insertProjectAproval(String project_id, String project_name, String company, String vacation, String solution,
			String servicer, String presettime);
	public int insertProjectAproval(ProjectApproval pa);	
	public ProjectApproval findAllProjectApproval(String projectname);
	public int updateProjectAprovalAll(ProjectApproval pa);
}
