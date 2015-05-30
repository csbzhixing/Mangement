package com.mangement.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.mangement.mybatis.connections.Connect2SalaryHistory;
import com.mangement.mybatis.model.SalaryHistory;

public class SalaryHistoryInterfaceTest {
	Map<String, Object> map = new HashMap<String, Object>();

	@Test
	public void insert() {
		List<Object> SalaryHistorys = new ArrayList<Object>();
		Connect2SalaryHistory connect2SalaryHistory = new Connect2SalaryHistory();
		SalaryHistory a1 = new SalaryHistory(new java.sql.Date(new java.util.Date().getTime()),"123");
		SalaryHistorys.add(a1);
		connect2SalaryHistory.insert(SalaryHistorys);
	}

	@Test
	public void delete() {
		Connect2SalaryHistory connect2SalaryHistory = new Connect2SalaryHistory();
		List<Object> value = new ArrayList<Object>();
		value.add(new java.sql.Date(
				new java.util.Date().getTime()));
		value.add("123");
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		connect2SalaryHistory.delete(value);
	}

	@Test
	public void find() {
		Connect2SalaryHistory connect2SalaryHistory = new Connect2SalaryHistory();
		List<Object> value = new ArrayList<Object>();
		value.add(null);
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
		List<Object> list = connect2SalaryHistory.find(value);
		for (Object s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update() {
		Connect2SalaryHistory connect2SalaryHistory = new Connect2SalaryHistory();
		connect2SalaryHistory.update(new SalaryHistory(new java.sql.Date(
				new java.util.Date().getTime()), "123", null, null,
				new BigInteger("74"), null, null, null, null));
	}
}
