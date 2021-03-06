package com.mangement.mybatis.mappers;


import java.util.List;
import java.util.Map;

import com.mangement.mybatis.model.SalaryHistory;


public interface SalaryHistoryMapper {
	public void insert(SalaryHistory salaryHistory);
	public void add(Map<String,Object> map);
	public void delete(Map<String,Object> map);
	public List<SalaryHistory> find(Map<String,Object> map);
	public List<SalaryHistory> findByID(String ID);
	public void update(Object object);
}
