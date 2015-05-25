package com.mangement.mybatis.model;

import java.sql.Date;



public class CompanyInvoice {

	private Integer cInvoiceID;
	private String contractID;
	private Integer payment;
	private Date date;
	private Integer type;
	

	public CompanyInvoice() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CompanyInvoice(Integer cInvoiceID) {
		super();
		this.cInvoiceID = cInvoiceID;
	}


	public CompanyInvoice(Integer cInvoiceID, String contractID,
			Integer payment, Date date, Integer type) {
		super();
		this.cInvoiceID = cInvoiceID;
		this.contractID = contractID;
		this.payment = payment;
		this.date = date;
		this.type = type;
	}


	@Override
	public String toString() {
		return "CompanyInvoice [cInvoiceID=" + cInvoiceID + ", contractID="
				+ contractID + ", payment=" + payment + ", date=" + date
				+ ", type=" + type + "]";
	}


	public Integer getcInvoiceID() {
		return cInvoiceID;
	}


	public void setcInvoiceID(Integer cInvoiceID) {
		this.cInvoiceID = cInvoiceID;
	}


	public String getContractID() {
		return contractID;
	}


	public void setContractID(String contractID) {
		this.contractID = contractID;
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


	public Integer getType() {
		return type;
	}


	public void setType(Integer type) {
		this.type = type;
	}
	

	
}
