package com.mangement.mybatis.connections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mangement.mybatis.mappers.ReimMapper;
import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class Connect2Reim implements ModelInterface{

	private ReimMapper reimMapper = null;
	private SqlSession sqlSession = null;
	private String keys[] = {"ID","pInvoiceID","isread","date","goods","number","unitPrice","remark","start","size"};
	
	public Connect2Reim() {
		super();
	}

	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		reimMapper = sqlSession.getMapper(ReimMapper.class);		
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
		map.put("Reims", list);
		reimMapper.insert(map);
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
		reimMapper.delete(map);
		
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
		List<Object> contract = reimMapper.find(map);
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
		
		reimMapper.update(object);
		
		try {
			tearDown();
		} catch (Exception e) {
			return;
		}
	}


}
