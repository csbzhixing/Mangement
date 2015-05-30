package com.mangement.mybatis.connections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mangement.mybatis.mappers.ContractMapper;
import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class Connect2Contract implements ModelInterface{

	private ContractMapper contractMapper = null;
	private SqlSession sqlSession = null;
	private String keys[] = {"contractID","name","startTime","finishTime","totalPayment","unpayment","contractType","start","size"};
	
	public Connect2Contract() {
		super();
	}

	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		contractMapper = sqlSession.getMapper(ContractMapper.class);		
	}

	public void tearDown() throws Exception {
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Override
	public void insert(List<Object> list) {
		try {
			setUp();
		} catch (Exception e) {
			return;
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("Contracts", list);
		contractMapper.insert(map);
		try {
			tearDown();
		} catch (Exception e) {
			return;
		}
	}

	@Override
	public void delete(List<Object> list){
		try {
			setUp();
		} catch (Exception e) {
			return;
		}
		
		Map<String,Object> map = new HashMap<String,Object>();
		int i=0;
		for(Object object : list){
			if(object!=null){
				map.put(keys[i], object);
			}
			i++;
		}
		contractMapper.delete(map);
		
		try {
			tearDown();
		} catch (Exception e) {
			return;
		}
	}

	@Override
	public List<Object> find(List<Object> list) {
		try {
			setUp();
		} catch (Exception e) {
			return null;
		}
		Map<String,Object> map = new HashMap<String,Object>();
		int i=0;
		for(Object object : list){
			if(object!=null){
				map.put(keys[i], object);
			}
			i++;
		}
		List<Object> contract = contractMapper.find(map);
		try {
			tearDown();
		} catch (Exception e) {
			return null;
		}
		return contract;
	}

	@Override
	public void update(Object object) {
		try {
			setUp();
		} catch (Exception e) {
			return;
		}
		
		contractMapper.update(object);
		
		try {
			tearDown();
		} catch (Exception e) {
			return;
		}
	}


}
