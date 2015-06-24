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

import com.mangement.mybatis.mappers.PersonalInvoiceMapper;
import com.mangement.mybatis.model.PersonalInvoice;
import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class PersonalInvoiceTest {
	PersonalInvoiceMapper personalInvoiceMapper = null;
	private SqlSession sqlSession = null;
	Map<String,Object> map = new HashMap<String,Object>();
	List<PersonalInvoice> PersonalInvoices = new ArrayList<PersonalInvoice>();
	
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		personalInvoiceMapper = sqlSession.getMapper(PersonalInvoiceMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.commit();
		sqlSession.close();
	}

	@Test
	public void add() {
		PersonalInvoice a1=new PersonalInvoice("11",new BigInteger("100"),new java.sql.Date(new java.util.Date().getTime()));
		PersonalInvoice a2=new PersonalInvoice("16",new BigInteger("12"),new java.sql.Date(new java.util.Date().getTime()));
		PersonalInvoice a3=new PersonalInvoice("17",new BigInteger("47"),new java.sql.Date(new java.util.Date().getTime()));
		PersonalInvoices.add(a1);
		PersonalInvoices.add(a2);
		PersonalInvoices.add(a3);
		map.put("PersonalInvoices", PersonalInvoices);
		personalInvoiceMapper.add(map);
	}

	@Test
	public void delete() {
		map.put("date", new java.sql.Date(new java.util.Date().getTime()));
		personalInvoiceMapper.delete(map);
	}


	@Test
	public void find() {
		map.put("start", 0);
		map.put("size", 10);
		List<PersonalInvoice> list = personalInvoiceMapper.find(map);
		for (PersonalInvoice s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update(){
		personalInvoiceMapper.update(new PersonalInvoice("10000001",new BigInteger("100"),new java.sql.Date(new java.util.Date().getTime())));
	}
}
