package com.mangement.mybatis.mappers;


import java.util.List;
import java.util.Map;

import com.mangement.mybatis.model.Contract;

public interface ContractMapper {
	public void insert(Contract contract);
	public void add(Map<String,Object> map);
	public void delete(Map<String,Object> map);
	public List<Contract> find(Map<String,Object> map);
	public List<Contract> findByID(String contractID);
	public List<Contract> findG_L(Map<String,Object> map);
	public List<Contract> findGe_L(Map<String,Object> map);
	public List<Contract> findG_Le(Map<String,Object> map);
	public List<Contract> findGe_Le(Map<String,Object> map);
	public void update(Object object);
}
