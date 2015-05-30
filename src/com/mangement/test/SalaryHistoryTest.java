package com.mangement.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mangement.mybatis.mappers.SalaryHistoryMapper;
import com.mangement.mybatis.model.SalaryHistory;
import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class SalaryHistoryTest {
	SalaryHistoryMapper salaryHistoryMapper = null;
	private SqlSession sqlSession = null;
	Map<String, Object> map = new HashMap<String, Object>();
	List<SalaryHistory> SalaryHistorys = new ArrayList<SalaryHistory>();

	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		salaryHistoryMapper = sqlSession.getMapper(SalaryHistoryMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.commit();
		sqlSession.close();
	}

	@Test
	public void insert() {
		SalaryHistory a1 = new SalaryHistory(new java.sql.Date(new java.util.Date().getTime()),"123");
		SalaryHistorys.add(a1);
		map.put("SalaryHistorys", SalaryHistorys);
		salaryHistoryMapper.insert(map);
	}

	@Test
	public void delete() {
		map.put("id", "123");
		salaryHistoryMapper.delete(map);
	}

	@Test
	public void find() {
		map.put("tax", 0);
		List<SalaryHistory> list = salaryHistoryMapper.find(map);
		for (SalaryHistory s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update() {
		salaryHistoryMapper.update(new SalaryHistory(new java.sql.Date(new java.util.Date().getTime()),"123",null,null,new BigInteger("74"),null,null,null,null));
	}
}
