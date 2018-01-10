package org.igeek.service.Impl;

import java.util.Date;
import java.util.List;

import org.igeek.dao.CommonDAO;
import org.igeek.pojo.Milestone;
import org.igeek.service.MileStoneService;

public class MileStoneServiceImpl implements MileStoneService {
	private CommonDAO dao = new CommonDAO();
	@Override
	public List<Object> getMileStones(String project_Id) {
		List<Object> milestones = dao.findByCondition(Milestone.class,"select * from milestone where project_id = ?",project_Id);
		return milestones;
	}
	@Override
	public Milestone getMileStoneById(Integer mid) {
		List<Object> list = dao.findByCondition(Milestone.class,"select * from milestone where milestone_id = ?", mid);
		return (Milestone) list.get(0);
	}
	@Override
	public int insertMileStones(String milestone_Name, Date plan_Delivery_Time, Date actual_Delivery_Time,
			Integer milestone_Status, String project_Id) {
		int result = 0;
		Object[] params = { milestone_Name, plan_Delivery_Time, actual_Delivery_Time, milestone_Status, project_Id};
		result = dao.updateDataBase(
				"insert into milestone(milestone_Name, plan_Delivery_Time, actual_Delivery_Time, milestone_Status, project_Id) values(?,?,?,?,?)",
				params);
		return result;
	}
	@Override
	public int insertMileStones(Object[] ms) {
		int result = 0;
//		Object[] params = { ms.getmilestone_Name(), ms.getplan_Delivery_Time(), ms.getactual_Delivery_Time(), ms.getmilestone_Status(), ms.getproject_Id()};
		result = dao.updateDataBase(
				"insert into milestone(milestone_Name, plan_Delivery_Time, actual_Delivery_Time, milestone_Status, project_Id) values(?,?,?,?,?)",
				ms);
		return result;
	}
	@Override
	public int updateMileStones(Object[] ms) {
		int result = 0;
		result = dao.updateDataBase("update milestone set actual_Delivery_Time = ? , milestone_Status = ? ,project_Id= ? where milestone_id =?",ms);
		return result;
	}


}
