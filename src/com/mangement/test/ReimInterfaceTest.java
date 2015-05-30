package com.mangement.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.mangement.mybatis.connections.Connect2Reim;
import com.mangement.mybatis.model.Reim;

public class ReimInterfaceTest {
	Map<String, Object> map = new HashMap<String, Object>();

	@Test
	public void insert() {
		List<Object> Reims = new ArrayList<Object>();
		Connect2Reim connect2Reim = new Connect2Reim();
		Reim a1 = new Reim("123", "10000002");
		Reims.add(a1);
		connect2Reim.insert(Reims);
	}

	@Test
	public void delete() {
		Connect2Reim connect2Reim = new Connect2Reim();
		List<Object> value = new ArrayList<Object>();
		value.add("123");
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		connect2Reim.delete(value);
	}

	@Test
	public void find() {
		Connect2Reim connect2Reim = new Connect2Reim();
		List<Object> value = new ArrayList<Object>();
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(0);
		value.add(10);
		List<Object> list = connect2Reim.find(value);
		for (Object s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update() {
		Connect2Reim connect2Reim = new Connect2Reim();
		connect2Reim.update(new Reim("123", "10000002", 1, new java.sql.Date(
				new java.util.Date().getTime()), "shi", new BigInteger("1"),
				new BigInteger("654"), "fd"));
	}
}
