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

import com.mangement.mybatis.mappers.CompanyInvoiceMapper;
import com.mangement.mybatis.model.CompanyInvoice;
import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class CompanyInvoiceTest {
	CompanyInvoiceMapper companyInvoiceMapper = null;
	private SqlSession sqlSession = null;
	Map<String,Object> map = new HashMap<String,Object>();
	List<CompanyInvoice> CompanyInvoices = new ArrayList<CompanyInvoice>();
	
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
		CompanyInvoice a1=new CompanyInvoice(15);
		CompanyInvoice a2=new CompanyInvoice(16);
		CompanyInvoice a3=new CompanyInvoice(17);
		a1.setContractID("11000001");
		a2.setContractID("11000002");
		a3.setContractID("11000003");
		a1.setDate(new Date(new java.util.Date().getTime()));
		a2.setDate(new Date(new java.util.Date().getTime()));
		a3.setDate(new Date(new java.util.Date().getTime()));
		a1.setPayment(100);
		a2.setPayment(200);
		a3.setPayment(300);
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
		map.put("date", "2015-05-17");
		companyInvoiceMapper.delete(map);
	}


	@Test
	public void find() {
		List<CompanyInvoice> list = companyInvoiceMapper.find(map);
		for (CompanyInvoice s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update(){
		companyInvoiceMapper.update(new CompanyInvoice(15,"11000002",null,null,0));
	}
}