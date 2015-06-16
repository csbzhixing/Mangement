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

import com.mangement.mybatis.mappers.CompanyInvoiceMapper;
import com.mangement.mybatis.model.CompanyInvoice;
import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class CompanyInvoiceTest {
	CompanyInvoiceMapper companyInvoiceMapper = null;
	private SqlSession sqlSession = null;
	Map<String,Object> map = new HashMap<String,Object>();
	List<Object> CompanyInvoices = new ArrayList<Object>();
	
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		companyInvoiceMapper = sqlSession.getMapper(CompanyInvoiceMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.commit();
		sqlSession.close();
	}

	@Test
	public void insert() {
		CompanyInvoice a1=new CompanyInvoice("11");
		CompanyInvoice a2=new CompanyInvoice("16");
		CompanyInvoice a3=new CompanyInvoice("17");
		a1.setContractID("11000001");
		a2.setContractID("11000002");
		a3.setContractID("11000003");
		a1.setDate(new java.sql.Date(new java.util.Date().getTime()));
		a2.setDate(new java.sql.Date(new java.util.Date().getTime()));
		a3.setDate(new java.sql.Date(new java.util.Date().getTime()));
		a1.setPayment(new BigInteger("100"));
		a2.setPayment(new BigInteger("200"));
		a3.setPayment(new BigInteger("300"));
		a1.setType(2);
		a2.setType(3);
		a3.setType(4);
		CompanyInvoices.add(a1);
		CompanyInvoices.add(a2);
		CompanyInvoices.add(a3);
		map.put("CompanyInvoices", CompanyInvoices);
		companyInvoiceMapper.insert(map);
	}

	@Test
	public void delete() {
		map.put("date", new java.sql.Date(new java.util.Date().getTime()));
		companyInvoiceMapper.delete(map);
	}


	@Test
	public void find() {
		map.put("type", "0");
		map.put("start", 0);
		map.put("size", 10);
		List<CompanyInvoice> list = companyInvoiceMapper.find(map);
		for (CompanyInvoice s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update(){
		companyInvoiceMapper.update(new CompanyInvoice("20000001","11000002",new BigInteger("100"),null,0));
	}
}
