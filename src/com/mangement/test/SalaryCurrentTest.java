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

import com.mangement.mybatis.mappers.SalaryCurrentMapper;
import com.mangement.mybatis.model.SalaryCurrent;
import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class SalaryCurrentTest {
	SalaryCurrentMapper salaryCurrentMapper = null;
	private SqlSession sqlSession = null;
	Map<String, Object> map = new HashMap<String, Object>();
	List<SalaryCurrent> SalaryCurrents = new ArrayList<SalaryCurrent>();

	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		salaryCurrentMapper = sqlSession.getMapper(SalaryCurrentMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.commit();
		sqlSession.close();
	}

	@Test
	public void insert() {
		SalaryCurrent a1 = new SalaryCurrent("123");
		SalaryCurrents.add(a1);
		map.put("SalaryCurrents", SalaryCurrents);
		salaryCurrentMapper.insert(map);
	}

	@Test
	public void delete() {
		map.put("id", "123");
		salaryCurrentMapper.delete(map);
	}

	@Test
	public void find() {
		map.put("tax", 0);
		map.put("start", 0);
		map.put("size", 10);
		List<SalaryCurrent> list = salaryCurrentMapper.find(map);
		for (SalaryCurrent s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update() {
		salaryCurrentMapper.update(new SalaryCurrent("20150001",null,null,new BigInteger("33"),null,null,null));
	}
}
