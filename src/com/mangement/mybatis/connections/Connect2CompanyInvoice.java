package com.mangement.mybatis.connections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mangement.mybatis.mappers.CompanyInvoiceMapper;
import com.mangement.mybatis.model.CompanyInvoice;

public class Connect2CompanyInvoice extends SessionOpener {

	private CompanyInvoiceMapper companyInvoiceMapper = null;

	public Connect2CompanyInvoice() {
		super();
	}

	public boolean insert(CompanyInvoice companyInvoice){
		try {
			companyInvoiceMapper = (CompanyInvoiceMapper) setUp(CompanyInvoiceMapper.class);
			companyInvoiceMapper.insert(companyInvoice);
			tearDown();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean add(List<CompanyInvoice> list){
		try {
			companyInvoiceMapper = (CompanyInvoiceMapper) setUp(CompanyInvoiceMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("CompanyInvoices", list);
			companyInvoiceMapper.add(map);
			tearDown();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(CompanyInvoice model){
		try {
			companyInvoiceMapper = (CompanyInvoiceMapper) setUp(CompanyInvoiceMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			for(Map.Entry<String,Object> column : model.getMap().entrySet()){
				if(column.getValue()!=null){
					map.put(column.getKey(), column.getValue());
				}
			}
			companyInvoiceMapper.delete(map);
			tearDown();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<CompanyInvoice> find(CompanyInvoice model,Integer start,Integer size){
		List<CompanyInvoice> list = null;
		try {
			companyInvoiceMapper = (CompanyInvoiceMapper) setUp(CompanyInvoiceMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			for(Map.Entry<String,Object> column : model.getMap().entrySet()){
				if(column.getValue()!=null){
					map.put(column.getKey(), column.getValue());
				}
			}
			if(start!=null && size!=null){
				map.put("start", start);
				map.put("size", size);
			}
			list = companyInvoiceMapper.find(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public boolean update(CompanyInvoice model){
		try {
			companyInvoiceMapper = (CompanyInvoiceMapper) setUp(CompanyInvoiceMapper.class);
			companyInvoiceMapper.update(model);
			tearDown();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
