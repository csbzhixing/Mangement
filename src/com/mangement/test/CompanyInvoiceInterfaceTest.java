package com.mangement.test;


import java.util.ArrayList;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.mangement.mybatis.connections.Connect2CompanyInvoice;
import com.mangement.mybatis.model.CompanyInvoice;

public class CompanyInvoiceInterfaceTest {
	Map<String,Object> map = new HashMap<String,Object>();
	

	@Test
	public void insert() {
		List<Object> CompanyInvoices = new ArrayList<Object>();
		Connect2CompanyInvoice connect2CompanyInvoice = new Connect2CompanyInvoice();
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
		connect2CompanyInvoice.insert(CompanyInvoices);
	}

	@Test
	public void delete() {
		Connect2CompanyInvoice connect2CompanyInvoice = new Connect2CompanyInvoice();
		List<Object> value = new ArrayList<Object>();
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(new java.sql.Date(new java.util.Date().getTime()));
		value.add(null);
		connect2CompanyInvoice.delete(value);
	}


	@Test
	public void find() {
		Connect2CompanyInvoice connect2CompanyInvoice = new Connect2CompanyInvoice();
		List<Object> value = new ArrayList<Object>();
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(0);
		value.add(10);
		List<Object> list = connect2CompanyInvoice.find(value);
		for (Object s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update(){
		Connect2CompanyInvoice connect2CompanyInvoice = new Connect2CompanyInvoice();
		connect2CompanyInvoice.update(new CompanyInvoice("20000001","11000002",new BigInteger("100"),null,1));
	}
}
