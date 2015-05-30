package com.mangement.mybatis.mappers;


import java.util.List;
import java.util.Map;

import com.mangement.mybatis.model.Contract;

public interface ContractMapper {
	public void insert(Map<String,Object> map);
	public void delete(Map<String,Object> map);
	public List<Contract> find(Map<String,Object> map);
	public List<Contract> findByID(String contractID);
	public void update(Contract contract);
}
