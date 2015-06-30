package com.mangement.mybatis.connections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mangement.mybatis.mappers.ReimMapper;
import com.mangement.mybatis.model.Reim;

public class Connect2Reim extends SessionOpener {

	private ReimMapper reimMapper = null;

	public Connect2Reim() {
		super();
	}

	public boolean insert(Reim reim){
		try {
			reimMapper = (ReimMapper) setUp(ReimMapper.class);
			reimMapper.insert(reim);
			tearDown();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean add(List<Reim> list){
		try {
			reimMapper = (ReimMapper) setUp(ReimMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("Reims", list);
			reimMapper.add(map);
			tearDown();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Reim model){
		try {
			reimMapper = (ReimMapper) setUp(ReimMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			for(Map.Entry<String,Object> column : model.getMap().entrySet()){
				if(column.getValue()!=null){
					map.put(column.getKey(), column.getValue());
				}
			}
			reimMapper.delete(map);
			tearDown();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Reim> find(Reim model,Integer start,Integer size){
		List<Reim> list = null;
		try {
			reimMapper = (ReimMapper) setUp(ReimMapper.class);
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
			list = reimMapper.find(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public boolean update(Reim model){
		try {
			reimMapper = (ReimMapper) setUp(ReimMapper.class);
			reimMapper.update(model);
			tearDown();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
