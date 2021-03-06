package com.mangement.mybatis.connections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mangement.mybatis.mappers.ContractMapper;
import com.mangement.mybatis.model.Contract;

public class Connect2Contract extends SessionOpener {

	private ContractMapper contractMapper = null;

	public Connect2Contract() {
		super();
	}

	public void insert(Contract contract){
		try {
			contractMapper = (ContractMapper) setUp(ContractMapper.class);
			contractMapper.insert(contract);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void add(List<Contract> list){
		try {
			contractMapper = (ContractMapper) setUp(ContractMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("Contracts", list);
			contractMapper.add(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(Contract model){
		try {
			contractMapper = (ContractMapper) setUp(ContractMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			for(Map.Entry<String,Object> column : model.getMap().entrySet()){
				if(column.getValue()!=null){
					map.put(column.getKey(), column.getValue());
				}
			}
			contractMapper.delete(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Contract> findG_L(Contract model,Integer start,Integer size){
		List<Contract> list = null;
		try {
			contractMapper = (ContractMapper) setUp(ContractMapper.class);
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
			list = contractMapper.findG_L(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Contract> findGe_L(Contract model,Integer start,Integer size){
		List<Contract> list = null;
		try {
			contractMapper = (ContractMapper) setUp(ContractMapper.class);
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
			list = contractMapper.findGe_L(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Contract> findG_Le(Contract model,Integer start,Integer size){
		List<Contract> list = null;
		try {
			contractMapper = (ContractMapper) setUp(ContractMapper.class);
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
			list = contractMapper.findG_Le(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	

	public List<Contract> findGe_Le(Contract model,Integer start,Integer size){
		List<Contract> list = null;
		try {
			contractMapper = (ContractMapper) setUp(ContractMapper.class);
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
			list = contractMapper.findGe_Le(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Contract> find(Contract model,Integer start,Integer size){
		List<Contract> list = null;
		try {
			contractMapper = (ContractMapper) setUp(ContractMapper.class);
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
			list = contractMapper.find(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void update(Contract model){
		try {
			contractMapper = (ContractMapper) setUp(ContractMapper.class);
			contractMapper.update(model);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
