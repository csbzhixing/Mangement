package com.mangement.mybatis.mappers;


import java.util.List;
import java.util.Map;

import com.mangement.mybatis.model.SalaryCurrent;

public interface SalaryCurrentMapper {
	public void insert(Map<String,Object> map);
	public void delete(Map<String,Object> map);
	public List<SalaryCurrent> find(Map<String,Object> map);
	public void update(SalaryCurrent companyInvoice);
}
