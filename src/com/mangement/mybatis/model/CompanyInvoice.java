package com.mangement.mybatis.model;

import java.sql.Date;

public class CompanyInvoice {

	private Integer C_invoice_ID;
	private String contract_ID;
	private Integer payment;
	private Date date;
	private Byte type;
	

	public CompanyInvoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public CompanyInvoice(Integer c_invoice_ID) {
		super();
		C_invoice_ID = c_invoice_ID;
	}


	@Override
	public String toString() {
		return "CompanyInvoice [C_invoice_ID=" + C_invoice_ID
				+ ", contract_ID=" + contract_ID + ", payment=" + payment
				+ ", date=" + date + ", type=" + type + "]";
	}


	public Integer getC_invoice_ID() {
		return C_invoice_ID;
	}
	public void setC_invoice_ID(Integer c_invoice_ID) {
		C_invoice_ID = c_invoice_ID;
	}
	public String getContract_ID() {
		return contract_ID;
	}
	public void setContract_ID(String contract_ID) {
		this.contract_ID = contract_ID;
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
	public Byte getType() {
		return type;
	}
	public void setType(Byte type) {
		this.type = type;
	}
	
	
	
}
