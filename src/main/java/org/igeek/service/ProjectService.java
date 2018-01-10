package org.igeek.service;

import java.util.List;

import org.igeek.pojo.Page;
import org.igeek.pojo.ProjectWorkload;
import org.igeek.pojo.ViewProjectCollect;

/**
 * 
 *项目
 */
public interface ProjectService {
	public ViewProjectCollect getViewProjectById(String project_Id);
	public Page<Object> getProjectByUser(Integer user_Id, int role, Integer currentPage, Integer pageSize);
	public List<Object> getProjectIdListByUser(Integer user_Id,int role);
	public int updateProject(Object[] pro);
	public ProjectWorkload getProjectWorkloadById(String project_Id);
	public int updateWorkload(Object[] wl);
}
