package com.mangement.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.mangement.mybatis.connections.Connect2SalaryCurrent;
import com.mangement.mybatis.model.SalaryCurrent;

public class SalaryCurrentConnectorTest {
	Connect2SalaryCurrent connect2SalaryCurrent = new Connect2SalaryCurrent();
	Integer start = 0;
	Integer size = 10;

	@Test
	public void insert() {
		SalaryCurrent a = new SalaryCurrent("123");
		connect2SalaryCurrent.insert(a);
	}
	
	@Test
	public void add() {
		List<SalaryCurrent> SalaryCurrents = new ArrayList<SalaryCurrent>();
		SalaryCurrent a1 = new SalaryCurrent("123");
		SalaryCurrents.add(a1);
		connect2SalaryCurrent.add(SalaryCurrents);
	}

	@Test
	public void delete() {
		connect2SalaryCurrent.delete(new SalaryCurrent("15", null, null, new BigInteger("33"), null, null,
				null));
	}

	@Test
	public void find() {
		List<SalaryCurrent> list = connect2SalaryCurrent.find(
				new SalaryCurrent(null, null, null, null, null, null,
						new BigInteger("0")), start, size);
		for (SalaryCurrent contract : list) {
			System.out.println(contract);
		}
	}

	@Test
	public void update() {
		connect2SalaryCurrent.update(new SalaryCurrent("15", null, null,
				new BigInteger("33"), null, null, null));
	}
}
