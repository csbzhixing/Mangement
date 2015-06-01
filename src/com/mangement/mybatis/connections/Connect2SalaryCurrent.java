package com.mangement.mybatis.connections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mangement.mybatis.mappers.SalaryCurrentMapper;
import com.mangement.mybatis.model.SalaryCurrent;

public class Connect2SalaryCurrent extends SessionOpener {

	private SalaryCurrentMapper salaryCurrentMapper = null;

	public Connect2SalaryCurrent() {
		super();
	}

	public void insert(List<SalaryCurrent> list){
		try {
			salaryCurrentMapper = (SalaryCurrentMapper) setUp(SalaryCurrentMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("SalaryCurrents", list);
			salaryCurrentMapper.insert(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(SalaryCurrent model){
		try {
			salaryCurrentMapper = (SalaryCurrentMapper) setUp(SalaryCurrentMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			for(Map.Entry<String,Object> column : model.getMap().entrySet()){
				if(column.getValue()!=null){
					map.put(column.getKey(), column.getValue());
				}
			}
			salaryCurrentMapper.delete(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<SalaryCurrent> find(SalaryCurrent model,Integer start,Integer size){
		List<SalaryCurrent> list = null;
		try {
			salaryCurrentMapper = (SalaryCurrentMapper) setUp(SalaryCurrentMapper.class);
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
			list = salaryCurrentMapper.find(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void update(SalaryCurrent model){
		try {
			salaryCurrentMapper = (SalaryCurrentMapper) setUp(SalaryCurrentMapper.class);
			salaryCurrentMapper.update(model);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
