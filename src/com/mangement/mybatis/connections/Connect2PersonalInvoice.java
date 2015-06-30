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

	public boolean insert(PersonalInvoice personlInvoice){
		try {
			personalInvoiceMapper = (PersonalInvoiceMapper) setUp(PersonalInvoiceMapper.class);
			personalInvoiceMapper.insert(personlInvoice);
			tearDown();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean add(List<PersonalInvoice> list){
		try {
			personalInvoiceMapper = (PersonalInvoiceMapper) setUp(PersonalInvoiceMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("PersonalInvoices", list);
			personalInvoiceMapper.add(map);
			tearDown();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(PersonalInvoice model){
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
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
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

	public boolean update(PersonalInvoice model){
		try {
			personalInvoiceMapper = (PersonalInvoiceMapper) setUp(PersonalInvoiceMapper.class);
			personalInvoiceMapper.update(model);
			tearDown();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
