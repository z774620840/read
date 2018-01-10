package org.igeek.service;

import java.util.List;
import org.igeek.pojo.PersonalMatter;

public interface PersonalMatterService {
	public List<Object> getPersonalMatter(Integer employee_id);
	public PersonalMatter getPersonalMatterById(Integer personal_matter_id);
	public int insertPersonalMatter(Object[] pm);
	public int updatePersonalMatter(Object[] pm);
}
