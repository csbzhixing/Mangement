package com.mangement.mybatis.connections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mangement.mybatis.mappers.NoticeMapper;
import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class Connect2Notice implements ModelInterface{

	private NoticeMapper noticeMapper = null;
	private SqlSession sqlSession = null;
	private String keys[] = {"noticeID","ID","content","date","isread","start","size"};
	
	public Connect2Notice() {
		super();
	}

	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		noticeMapper = sqlSession.getMapper(NoticeMapper.class);		
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
		map.put("Notices", list);
		noticeMapper.insert(map);
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
		noticeMapper.delete(map);
		
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
		List<Object> contract = noticeMapper.find(map);
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
		
		noticeMapper.update(object);
		
		try {
			tearDown();
		} catch (Exception e) {
			return;
		}
	}


}
