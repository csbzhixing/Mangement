package com.mangement.mybatis.mappers;


import java.util.List;
import java.util.Map;

import com.mangement.mybatis.model.PersonalInvoice;


public interface PersonalInvoiceMapper {
	public void insert(Map<String,Object> map);
	public void delete(Map<String,Object> map);
	public List<PersonalInvoice> find(Map<String,Object> map);
	public List<PersonalInvoice> findByPInvoiceID(String pInvoiceID);
	public void update(Object object);
}
