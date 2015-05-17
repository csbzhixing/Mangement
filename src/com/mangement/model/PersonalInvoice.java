package com.mangement.model;

import java.util.Date;

public class PersonalInvoice {

	private Integer pInvoiceID;
	private Integer payment;
	private Date 	date;
	
	
	
	public PersonalInvoice(Integer pInvoiceID, Integer payment, Date date) {
		super();
		this.pInvoiceID = pInvoiceID;
		this.payment = payment;
		this.date = date;
	}
	public Integer getpInvoiceID() {
		return pInvoiceID;
	}
	public void setpInvoiceID(Integer pInvoiceID) {
		this.pInvoiceID = pInvoiceID;
	}
	public Integer getPayment() {
		return payment;
	}
	public void setPayment(Integer payment) {
		this.payment = payment;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
