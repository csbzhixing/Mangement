package com.mangement.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.mangement.mybatis.connections.Connect2PersonalInvoice;
import com.mangement.mybatis.model.PersonalInvoice;

public class PersonalInvoiceConnectorTest {
	Connect2PersonalInvoice connect2PersonalInvoice = new Connect2PersonalInvoice();
	Integer start = 0;
	Integer size = 10;

	@Test
	public void insert() {
		List<PersonalInvoice> PersonalInvoices = new ArrayList<PersonalInvoice>();
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
		connect2PersonalInvoice.delete(new PersonalInvoice(null,
				null, new java.sql.Date(new java.util.Date()
				.getTime())));
	}

	@Test
	public void find() {
		List<PersonalInvoice> list = connect2PersonalInvoice.find(new PersonalInvoice(null,
				null, null),
				start, size);
		for (PersonalInvoice contract : list) {
			System.out.println(contract);
		}
	}

	@Test
	public void update() {
		connect2PersonalInvoice.update(new PersonalInvoice("10000001",
				new BigInteger("100"),new java.sql.Date(new java.util.Date().getTime())));
	}
}
