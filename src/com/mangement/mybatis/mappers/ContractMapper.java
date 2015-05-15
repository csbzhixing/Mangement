package com.mangement.mybatis.mappers;

import java.util.List;

import com.mangement.mybatis.model.Contract;

public interface ContractMapper {
	public void insert(Contract contract);
	public void deleteById(String contract_ID);
	void deleteAll();
	public Contract findById(String contract_ID);
	public List<Contract> find();
	public void updateById(Contract contract);
}
