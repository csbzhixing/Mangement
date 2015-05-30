package com.mangement.mybatis.model;

import java.math.BigInteger;
import java.sql.Date;



public class Reim {

	private String ID;
	private String pInvoiceID;
	private Integer isread;
	private Date date;
	private String goods;
	private BigInteger number;
	private BigInteger unitPrice;
	private String remark;
	private User user;
	private PersonalInvoice personalInvoice;

	public Reim() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Reim(String iD, String pInvoiceID) {
		super();
		ID = iD;
		this.pInvoiceID = pInvoiceID;
	}


	public Reim(String iD, String pInvoiceID, Integer isread, Date date,
			String goods, BigInteger number, BigInteger unitPrice, String remark) {
		super();
		ID = iD;
		this.pInvoiceID = pInvoiceID;
		this.isread = isread;
		this.date = date;
		this.goods = goods;
		this.number = number;
		this.unitPrice = unitPrice;
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Reim [ID=" + ID + ", pInvoiceID=" + pInvoiceID + ", isread="
				+ isread + ", date=" + date + ", goods=" + goods + ", number="
				+ number + ", unitPrice=" + unitPrice + ", remark=" + remark
				+ ", personalInvoice=" + personalInvoice
				+ "]";
	}

	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}

	public String getpInvoiceID() {
		return pInvoiceID;
	}


	public void setpInvoiceID(String pInvoiceID) {
		this.pInvoiceID = pInvoiceID;
	}


	public Integer getIsread() {
		return isread;
	}


	public void setIsread(Integer isread) {
		this.isread = isread;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getGoods() {
		return goods;
	}


	public void setGoods(String goods) {
		this.goods = goods;
	}


	public BigInteger getNumber() {
		return number;
	}


	public void setNumber(BigInteger number) {
		this.number = number;
	}


	public BigInteger getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(BigInteger unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public PersonalInvoice getPersonalInvoice() {
		return personalInvoice;
	}


	public void setPersonalInvoice(PersonalInvoice personalInvoice) {
		this.personalInvoice = personalInvoice;
	}


}
