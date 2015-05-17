package com.mangement.model;

import java.util.Date;

public class Reim {

	private Integer id;
	private Integer pInvoiceID;
	private Integer  isRead;
	private Date date;
	private String goods;
	private Integer number;
	private Integer unitPayment;
	private String remark;
	
	
	
	public Reim(Integer id, Integer pInvoiceID, Integer isRead, Date date,
			String goods, Integer number, Integer unitPayment, String remark) {
		super();
		this.id = id;
		this.pInvoiceID = pInvoiceID;
		this.isRead = isRead;
		this.date = date;
		this.goods = goods;
		this.number = number;
		this.unitPayment = unitPayment;
		this.remark = remark;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getpInvoiceID() {
		return pInvoiceID;
	}
	public void setpInvoiceID(Integer pInvoiceID) {
		this.pInvoiceID = pInvoiceID;
	}
	public Integer getIsRead() {
		return isRead;
	}
	public void setIsRead(Integer isRead) {
		this.isRead = isRead;
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
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getUnitPayment() {
		return unitPayment;
	}
	public void setUnitPayment(Integer unitPayment) {
		this.unitPayment = unitPayment;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
