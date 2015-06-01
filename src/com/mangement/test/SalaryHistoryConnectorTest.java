package com.mangement.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.mangement.mybatis.connections.Connect2SalaryHistory;
import com.mangement.mybatis.model.SalaryHistory;

public class SalaryHistoryConnectorTest {
	Connect2SalaryHistory connect2SalaryHistory = new Connect2SalaryHistory();
	Integer start = 0;
	Integer size = 10;

	@Test
	public void insert() {
		List<SalaryHistory> SalaryHistorys = new ArrayList<SalaryHistory>();
		SalaryHistory a1 = new SalaryHistory(new java.sql.Date(
				new java.util.Date().getTime()), "11");
		SalaryHistorys.add(a1);
		connect2SalaryHistory.insert(SalaryHistorys);
	}

	@Test
	public void delete() {
		connect2SalaryHistory.delete(
				new SalaryHistory(new java.sql.Date(
						new java.util.Date().getTime()), "11", null, null, null,
						null, null, null, null));
	}

	@Test
	public void find() {
		List<SalaryHistory> list = connect2SalaryHistory.find(
				new SalaryHistory(null, null, null, null, null,
						null, null, null, null), start, size);
		for (SalaryHistory contract : list) {
			System.out.println(contract);
		}
	}

	@Test
	public void update() {
		connect2SalaryHistory.update(new SalaryHistory(new java.sql.Date(
				new java.util.Date().getTime()), "11", null, null,
				new BigInteger("74"), null, null, null, null));
	}
}
