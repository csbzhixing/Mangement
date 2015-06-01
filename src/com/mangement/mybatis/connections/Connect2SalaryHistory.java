package com.mangement.mybatis.connections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mangement.mybatis.mappers.SalaryHistoryMapper;
import com.mangement.mybatis.model.SalaryHistory;

public class Connect2SalaryHistory extends SessionOpener {

	private SalaryHistoryMapper salaryHistoryMapper = null;

	public Connect2SalaryHistory() {
		super();
	}

	public void insert(List<SalaryHistory> list){
		try {
			salaryHistoryMapper = (SalaryHistoryMapper) setUp(SalaryHistoryMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("SalaryHistorys", list);
			salaryHistoryMapper.insert(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(SalaryHistory model){
		try {
			salaryHistoryMapper = (SalaryHistoryMapper) setUp(SalaryHistoryMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			for(Map.Entry<String,Object> column : model.getMap().entrySet()){
				if(column.getValue()!=null){
					map.put(column.getKey(), column.getValue());
				}
			}
			salaryHistoryMapper.delete(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<SalaryHistory> find(SalaryHistory model,Integer start,Integer size){
		List<SalaryHistory> list = null;
		try {
			salaryHistoryMapper = (SalaryHistoryMapper) setUp(SalaryHistoryMapper.class);
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
			list = salaryHistoryMapper.find(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void update(SalaryHistory model){
		try {
			salaryHistoryMapper = (SalaryHistoryMapper) setUp(SalaryHistoryMapper.class);
			salaryHistoryMapper.update(model);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
