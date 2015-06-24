package com.mangement.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.mangement.mybatis.connections.Connect2Reim;
import com.mangement.mybatis.model.Reim;

public class ReimConnectorTest {
	Connect2Reim connect2Reim = new Connect2Reim();
	Integer start = 0;
	Integer size = 10;

	@Test
	public void insert() {
		Reim a = new Reim("20150001", "10000093");
		connect2Reim.insert(a);
	}
	
	@Test
	public void add() {
		List<Reim> Reims = new ArrayList<Reim>();
		Reim a1 = new Reim("20150002", "10000092");
		Reims.add(a1);
		connect2Reim.add(Reims);
	}

	@Test
	public void delete() {
		connect2Reim.delete(new Reim(null, null, null, new java.sql.Date(
				new java.util.Date().getTime()), null, null, null, null));
	}

	@Test
	public void find() {
		List<Reim> list = connect2Reim.find(new Reim(null, null, 1, null, null,
				null, null, null), start, size);
		for (Reim contract : list) {
			System.out.println(contract);
		}
	}

	@Test
	public void update() {
		connect2Reim.update(new Reim("15", "10000092", 1, new java.sql.Date(
				new java.util.Date().getTime()), "shi", new BigInteger("1"),
				new BigInteger("654"), "fd"));
	}
}
