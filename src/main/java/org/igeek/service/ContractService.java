package org.igeek.service;

import org.igeek.pojo.Page;

public interface ContractService {
	public Page<Object> getContractByUser(Integer user_Id, int role, Integer currentPage, Integer pageSize,String cname);
}
