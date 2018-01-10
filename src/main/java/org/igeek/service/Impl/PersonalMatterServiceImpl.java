package org.igeek.service.Impl;

import java.util.List;

import org.igeek.dao.CommonDAO;
import org.igeek.pojo.PersonalMatter;
import org.igeek.service.PersonalMatterService;

public class PersonalMatterServiceImpl implements PersonalMatterService {
	private CommonDAO dao = new CommonDAO();

	@Override
	public List<Object> getPersonalMatter(Integer employee_id) {
		List<Object> personalmatter = dao.findByCondition(PersonalMatter.class,"select * from personal_matter where employee_id = ?",employee_id);
		return personalmatter;
	}

	@Override
	public PersonalMatter getPersonalMatterById(Integer personal_matter_id) {
		List<Object> list = dao.findByCondition(PersonalMatter.class,"select * from personal_matter where personal_matter_id = ?", personal_matter_id);
		return (PersonalMatter) list.get(0);
	}

	@Override
	public int insertPersonalMatter(Object[] pm) {
		int result = 0;
		result = dao.updateDataBase(
				"insert into personal_matter(matter_title, current, sender, type, receipt_time,matter_content,employee_id,isdone,isread) values(?,?,?,?,?,?,?,?,?)",
				pm);
		return result;
	}

	@Override
	public int updatePersonalMatter(Object[] pm) {
		int result = 0;
		result = dao.updateDataBase("update personal_matter set isdone = ? , isread = ? where personal_matter_id =?",pm);
		return result;
	}

}
