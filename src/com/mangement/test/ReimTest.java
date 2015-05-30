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

import com.mangement.mybatis.mappers.ReimMapper;
import com.mangement.mybatis.model.Reim;
import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class ReimTest {
	ReimMapper reimMapper = null;
	private SqlSession sqlSession = null;
	Map<String, Object> map = new HashMap<String, Object>();
	List<Reim> Reims = new ArrayList<Reim>();

	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		reimMapper = sqlSession.getMapper(ReimMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.commit();
		sqlSession.close();
	}

	@Test
	public void insert() {
		Reim a1 = new Reim("123", "10000002");
		Reims.add(a1);
		map.put("Reims", Reims);
		reimMapper.insert(map);
	}

	@Test
	public void delete() {
		map.put("ID", "123");
		reimMapper.delete(map);
	}

	@Test
	public void find() {
		map.put("isread", "1");
		map.put("start", 0);
		map.put("size", 10);
		List<Object> list = reimMapper.find(map);
		for (Object s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update() {
		reimMapper.update(new Reim("123", "10000002", 1, new java.sql.Date(
				new java.util.Date().getTime()), "shi", new BigInteger("1"),
				new BigInteger("654"), "fd"));
	}
}
