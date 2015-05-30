package com.mangement.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.mangement.mybatis.mappers.NoticeMapper;
import com.mangement.mybatis.model.Notice;
import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class NoticeTest {
	NoticeMapper noticeMapper = null;
	private SqlSession sqlSession = null;
	Map<String, Object> map = new HashMap<String, Object>();
	List<Notice> Notices = new ArrayList<Notice>();

	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		noticeMapper = sqlSession.getMapper(NoticeMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.commit();
		sqlSession.close();
	}

	@Test
	public void insert() {
		Notice a1 = new Notice("3","20150003");
		Notices.add(a1);
		map.put("Notices", Notices);
		noticeMapper.insert(map);
	}

	@Test
	public void delete() {
		map.put("noticeID", "3");
		noticeMapper.delete(map);
	}

	@Test
	public void find() {
		map.put("noticeID", "1");
		List<Notice> list = noticeMapper.find(map);
		for (Notice s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update() {
		noticeMapper.update(new Notice("3","20150003","bye",new java.sql.Date(new java.util.Date().getTime()),0));
	}
}
