package com.mangement.mybatis.mappers;


import java.util.List;
import java.util.Map;

import com.mangement.mybatis.model.CompanyInvoice;

public interface CompanyInvoiceMapper {
	public void insert(Map<String,Object> map);
	public void delete(Map<String,Object> map);
	public List<CompanyInvoice> find(Map<String,Object> map);
	public List<CompanyInvoice> findByContractID(String contractID);
	public void update(Object object);
}
