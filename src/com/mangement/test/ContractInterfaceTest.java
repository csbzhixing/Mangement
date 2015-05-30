package com.mangement.test;


import java.util.ArrayList;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.mangement.mybatis.connections.Connect2Contract;
import com.mangement.mybatis.model.Contract;

public class ContractInterfaceTest {
	Map<String,Object> map = new HashMap<String,Object>();
	

	@Test
	public void insert() {
		List<Object> Contracts = new ArrayList<Object>();
		Connect2Contract connect2Contract = new Connect2Contract();
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
		connect2Contract.insert(Contracts);
	}

	@Test
	public void delete() {
		Connect2Contract connect2Contract = new Connect2Contract();
		List<Object> value = new ArrayList<Object>();
		value.add("10");
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		connect2Contract.delete(value);
	}


	@Test
	public void find() {
		Connect2Contract connect2Contract = new Connect2Contract();
		List<Object> value = new ArrayList<Object>();
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(0);
		value.add(10);
		List<Object> list = connect2Contract.find(value);
		for (Object s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update(){
		Connect2Contract connect2Contract = new Connect2Contract();
		connect2Contract.update(new Contract("11000001", "asd", new java.sql.Date(
				new java.util.Date().getTime()), new java.sql.Date(
				new java.util.Date().getTime()), null, null, 1));
	}
}
