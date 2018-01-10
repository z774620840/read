package org.igeek.service.Impl;

import java.util.List;

import org.igeek.dao.CommonDAO;
import org.igeek.service.DerpartmentService;

public class DepartmentServiceImpl implements DerpartmentService {

	@Override
	public Integer findDeIdByName(String deName) {
		List<Object> li = new CommonDAO().findByBase("select department_id from department where department_name =?",
				deName);
		Integer departmentId = (Integer) li.get(0);
		return departmentId;
	}

}
