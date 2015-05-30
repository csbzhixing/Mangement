package com.mangement.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.mangement.mybatis.connections.Connect2SalaryCurrent;
import com.mangement.mybatis.model.SalaryCurrent;

public class SalaryCurrentInterfaceTest {
	Map<String, Object> map = new HashMap<String, Object>();

	@Test
	public void insert() {
		List<Object> SalaryCurrents = new ArrayList<Object>();
		Connect2SalaryCurrent connect2SalaryCurrent = new Connect2SalaryCurrent();
		SalaryCurrent a1 = new SalaryCurrent("123");
		SalaryCurrents.add(a1);
		connect2SalaryCurrent.insert(SalaryCurrents);
	}

	@Test
	public void delete() {
		Connect2SalaryCurrent connect2SalaryCurrent = new Connect2SalaryCurrent();
		List<Object> value = new ArrayList<Object>();
		value.add("123");
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		connect2SalaryCurrent.delete(value);
	}

	@Test
	public void find() {
		Connect2SalaryCurrent connect2SalaryCurrent = new Connect2SalaryCurrent();
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
		List<Object> list = connect2SalaryCurrent.find(value);
		for (Object s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update() {
		Connect2SalaryCurrent connect2SalaryCurrent = new Connect2SalaryCurrent();
		connect2SalaryCurrent.update(new SalaryCurrent("123",null,null,new BigInteger("33"),null,null,null));
	}
}
