package com.mangement.mybatis.connections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mangement.mybatis.mappers.PersonalInvoiceMapper;
import com.mangement.mybatis.model.PersonalInvoice;

public class Connect2PersonalInvoice extends SessionOpener {

	private PersonalInvoiceMapper personalInvoiceMapper = null;

	public Connect2PersonalInvoice() {
		super();
	}

	public void insert(List<PersonalInvoice> list){
		try {
			personalInvoiceMapper = (PersonalInvoiceMapper) setUp(PersonalInvoiceMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("PersonalInvoices", list);
			personalInvoiceMapper.insert(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(PersonalInvoice model){
		try {
			personalInvoiceMapper = (PersonalInvoiceMapper) setUp(PersonalInvoiceMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			for(Map.Entry<String,Object> column : model.getMap().entrySet()){
				if(column.getValue()!=null){
					map.put(column.getKey(), column.getValue());
				}
			}
			personalInvoiceMapper.delete(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<PersonalInvoice> find(PersonalInvoice model,Integer start,Integer size){
		List<PersonalInvoice> list = null;
		try {
			personalInvoiceMapper = (PersonalInvoiceMapper) setUp(PersonalInvoiceMapper.class);
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
			list = personalInvoiceMapper.find(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void update(PersonalInvoice model){
		try {
			personalInvoiceMapper = (PersonalInvoiceMapper) setUp(PersonalInvoiceMapper.class);
			personalInvoiceMapper.update(model);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
