package com.mangement.test;

import java.util.ArrayList;
import java.math.BigInteger;
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
		Contract a1 = new Contract("10", "aa", new java.sql.Date(
				new java.util.Date().getTime()), new java.sql.Date(
				new java.util.Date().getTime()), new BigInteger("10000"),
				new BigInteger("1000"), 6);
		Contract a2 = new Contract("12", "bb", new java.sql.Date(
				new java.util.Date().getTime()), new java.sql.Date(
				new java.util.Date().getTime()), new BigInteger("20000"),
				new BigInteger("2000"), 3);
		Contract a3 = new Contract("13", "cc", new java.sql.Date(
				new java.util.Date().getTime()), new java.sql.Date(
				new java.util.Date().getTime()), new BigInteger("30000"),
				new BigInteger("3000"), 5);
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
		map.put("contractType", "0");
		map.put("start", 0);
		map.put("size", 10);
		List<Contract> list = contractMapper.find(map);
		for (Contract s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update() {
		contractMapper.update(new Contract("13", "fdsa", new java.sql.Date(
				new java.util.Date().getTime()), new java.sql.Date(
				new java.util.Date().getTime()), null, null, null));
	}
}
