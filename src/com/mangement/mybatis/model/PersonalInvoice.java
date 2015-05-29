package com.mangement.mybatis.model;

import java.math.BigInteger;
import java.sql.Date;
import java.util.List;



public class PersonalInvoice {

	private String pInvoiceID;
	private BigInteger payment;
	private Date date;
	private List<Reim> reim;

	public PersonalInvoice() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PersonalInvoice(String pInvoiceID) {
		super();
		this.pInvoiceID = pInvoiceID;
	}


	public PersonalInvoice(String pInvoiceID, BigInteger payment, Date date) {
		super();
		this.pInvoiceID = pInvoiceID;
		this.payment = payment;
		this.date = date;
	}


	@Override
	public String toString() {
		return "PersonalInvoice [pInvoiceID=" + pInvoiceID + ", payment="
				+ payment + ", date=" + date + "]";
	}


	public String getpInvoiceID() {
		return pInvoiceID;
	}


	public void setpInvoiceID(String pInvoiceID) {
		this.pInvoiceID = pInvoiceID;
	}


	public BigInteger getPayment() {
		return payment;
	}


	public void setPayment(BigInteger payment) {
		this.payment = payment;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public List<Reim> getReim() {
		return reim;
	}


	public void setReim(List<Reim> reim) {
		this.reim = reim;
	}



	
}
