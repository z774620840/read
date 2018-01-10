package org.igeek.service;

import java.util.Date;
import java.util.List;

import org.igeek.pojo.Milestone;

/**
 * 
 *里程碑
 */


public interface MileStoneService {
	public List<Object> getMileStones(String project_Id);

	public Milestone getMileStoneById(Integer mid);
	
	public int insertMileStones(String milestone_Name, Date plan_Delivery_Time,Date actual_Delivery_Time,
			Integer milestone_Status,String project_Id);
	public int insertMileStones(Object[] ms);
	
	public int updateMileStones(Object[] ms);

}


