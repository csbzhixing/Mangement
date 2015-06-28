package com.mangement.test;

import java.util.ArrayList;
import java.math.BigInteger;
import java.util.List;

import org.junit.Test;

import com.mangement.mybatis.connections.Connect2CompanyInvoice;
import com.mangement.mybatis.model.CompanyInvoice;

public class CompanyInvoiceConnectorTest {
	Connect2CompanyInvoice connect2CompanyInvoice = new Connect2CompanyInvoice();
	Integer start = 0;
	Integer size = 10;

	@Test
	public void insert(){
		CompanyInvoice a = new CompanyInvoice("123");
		connect2CompanyInvoice.insert(a);
	}
	
	@Test
	public void add() {
		List<CompanyInvoice> CompanyInvoices = new ArrayList<CompanyInvoice>();
		CompanyInvoice a1 = new CompanyInvoice("11");
		CompanyInvoice a2 = new CompanyInvoice("16");
		CompanyInvoice a3 = new CompanyInvoice("17");
		a1.setContractID("11000001");
		a2.setContractID("11000002");
		a3.setContractID("11000003");
		a1.setDate(new java.sql.Date(new java.util.Date().getTime()));
		a2.setDate(new java.sql.Date(new java.util.Date().getTime()));
		a3.setDate(new java.sql.Date(new java.util.Date().getTime()));
		a1.setPayment(new BigInteger("100"));
		a2.setPayment(new BigInteger("200"));
		a3.setPayment(new BigInteger("300"));
		a1.setType(2);
		a2.setType(3);
		a3.setType(4);
		CompanyInvoices.add(a1);
		CompanyInvoices.add(a2);
		CompanyInvoices.add(a3);
		connect2CompanyInvoice.add(CompanyInvoices);
	}

	@Test
	public void delete() {
		connect2CompanyInvoice.delete(new CompanyInvoice(null,
				null, null, new java.sql.Date(new java.util.Date().getTime()), null));
	}

	@Test
	public void find() {
		List<CompanyInvoice> list = connect2CompanyInvoice.find(new CompanyInvoice(null, null, null, null,
				1), start, size);
		for(CompanyInvoice companyInvoice : list){
			System.out.println(companyInvoice);
		}
	}

	@Test
	public void update() {
		connect2CompanyInvoice.update(new CompanyInvoice("20000001",
				"11000002", new BigInteger("1000"), null, 1));
	}
}
