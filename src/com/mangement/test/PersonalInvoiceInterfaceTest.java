package com.mangement.test;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.mangement.mybatis.connections.Connect2PersonalInvoice;
import com.mangement.mybatis.model.PersonalInvoice;

public class PersonalInvoiceInterfaceTest {
	Map<String,Object> map = new HashMap<String,Object>();
	

	@Test
	public void insert() {
		List<Object> PersonalInvoices = new ArrayList<Object>();
		Connect2PersonalInvoice connect2PersonalInvoice = new Connect2PersonalInvoice();
		PersonalInvoice a1=new PersonalInvoice("11",new BigInteger("100"),new java.sql.Date(new java.util.Date().getTime()));
		PersonalInvoice a2=new PersonalInvoice("16",new BigInteger("12"),new java.sql.Date(new java.util.Date().getTime()));
		PersonalInvoice a3=new PersonalInvoice("17",new BigInteger("47"),new java.sql.Date(new java.util.Date().getTime()));
		PersonalInvoices.add(a1);
		PersonalInvoices.add(a2);
		PersonalInvoices.add(a3);
		connect2PersonalInvoice.insert(PersonalInvoices);
	}

	@Test
	public void delete() {
		Connect2PersonalInvoice connect2PersonalInvoice = new Connect2PersonalInvoice();
		List<Object> value = new ArrayList<Object>();
		value.add("11");
		value.add(null);
		value.add(null);
		connect2PersonalInvoice.delete(value);
	}


	@Test
	public void find() {
		Connect2PersonalInvoice connect2PersonalInvoice = new Connect2PersonalInvoice();
		List<Object> value = new ArrayList<Object>();
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(0);
		value.add(10);
		List<Object> list = connect2PersonalInvoice.find(value);
		for (Object s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update(){
		Connect2PersonalInvoice connect2PersonalInvoice = new Connect2PersonalInvoice();
		connect2PersonalInvoice.update(new PersonalInvoice("10000001",new BigInteger("100"),new java.sql.Date(new java.util.Date().getTime())));
	}
}
