package com.mangement.test;

import java.util.ArrayList;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mangement.mybatis.mappers.ContractMapper;
import com.mangement.mybatis.model.Contract;
import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class ContractTest {
	ContractMapper contractMapper = null;
	private SqlSession sqlSession = null;
	Map<String, Object> map = new HashMap<String, Object>();
	List<Contract> Contracts = new ArrayList<Contract>();

	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		contractMapper = sqlSession.getMapper(ContractMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.commit();
		sqlSession.close();
	}

	@Test
	public void insert() {
		Contract a1 = new Contract("10", "aa", new Date(
				new java.util.Date().getTime()), new Date(
				new java.util.Date().getTime()), 10000, 1000, 6);
		Contract a2 = new Contract("12", "bb", new Date(
				new java.util.Date().getTime()), new Date(
				new java.util.Date().getTime()), 20000, 1000, 3);
		Contract a3 = new Contract("13", "cc", new Date(
				new java.util.Date().getTime()), new Date(
				new java.util.Date().getTime()), 30000, 1000, 5);
		Contracts.add(a1);
		Contracts.add(a2);
		Contracts.add(a3);
		map.put("Contracts", Contracts);
		contractMapper.insert(map);
	}

	@Test
	public void delete() {
		map.put("startTime", "2015-05-17");
		contractMapper.delete(map);
	}

	@Test
	public void find() {
		map.put("startTime", "2015-05-17");
		List<Contract> list = contractMapper.find(map);
		for (Contract s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update() {
		contractMapper.update(new Contract("13", "fdsa", new Date(
				new java.util.Date().getTime()), new Date(
				new java.util.Date().getTime()), null, null, null));
	}
}