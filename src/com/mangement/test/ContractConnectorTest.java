package com.mangement.test;

import java.util.ArrayList;
import java.math.BigInteger;
import java.util.List;

import org.junit.Test;

import com.mangement.mybatis.connections.Connect2Contract;
import com.mangement.mybatis.model.Contract;

public class ContractConnectorTest {
	Connect2Contract connect2Contract = new Connect2Contract();
	Integer start = 0;
	Integer size = 10;

	@Test
	public void insert() {
		Contract a = new Contract("14");
		connect2Contract.insert(a);
	}

	@Test
	public void add() {
		List<Contract> Contracts = new ArrayList<Contract>();
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
		connect2Contract.add(Contracts);
	}

	@Test
	public void delete() {
		connect2Contract.delete(new Contract(null, null, new java.sql.Date(
				new java.util.Date().getTime()), null, null, null, null));
	}

	@Test
	public void find() {
		List<Contract> list = connect2Contract.find(new Contract(null, null,
				null, null, null, null, 1), start, size);
		for (Contract contract : list) {
			System.out.println(contract);
		}
	}

	@Test
	public void findG_L() {
		List<Contract> list = connect2Contract.findG_L(new Contract(null, null,
				java.sql.Date.valueOf("2015-02-03"),
				java.sql.Date.valueOf("2015-04-11"), null, null,
				1), start, size);
		for (Contract contract : list) {
			System.out.println(contract);
		}
	}
	
	@Test
	public void findGe_L() {
		List<Contract> list = connect2Contract.findGe_L(new Contract(null, null,
				java.sql.Date.valueOf("2015-02-03"),
				java.sql.Date.valueOf("2015-04-11"),  null, null,
				1), start, size);
		for (Contract contract : list) {
			System.out.println(contract);
		}
	}

	@Test
	public void findG_Le() {
		List<Contract> list = connect2Contract.findG_Le(new Contract(null, null,
				java.sql.Date.valueOf("2015-02-03"),
				java.sql.Date.valueOf("2015-04-11"), null, null,
				1), start, size);
		for (Contract contract : list) {
			System.out.println(contract);
		}
	}
	
	@Test
	public void findGe_Le() {
		List<Contract> list = connect2Contract.findGe_Le(new Contract(null, null,
				java.sql.Date.valueOf("2015-02-03"),
				java.sql.Date.valueOf("2015-04-11"), null, null,
				1), start, size);
		for (Contract contract : list) {
			System.out.println(contract);
		}
	}

	@Test
	public void update() {
		connect2Contract.update(new Contract("11000001", "fdsa",
				new java.sql.Date(new java.util.Date().getTime()),
				new java.sql.Date(new java.util.Date().getTime()), null, null,
				1));
	}
}
