package com.mangement.mybatis.model;

import java.sql.Date;

public class Contract {
	private String contract_ID;
	private String name;
	private Date start_time;
	private Date finish_time;
	private Integer total_payment;
	private Integer unpayment;
	private Byte contract_type;
	
	
	
	public Contract() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Contract(String contract_ID) {
		super();
		this.contract_ID = contract_ID;
	}


	@Override
	public String toString() {
		return "Contract [contract_ID=" + contract_ID + ", name=" + name
				+ ", start_time=" + start_time + ", finish_time=" + finish_time
				+ ", total_payment=" + total_payment + ", unpayment="
				+ unpayment + ", contract_type=" + contract_type + "]";
	}
	public String getContract_ID() {
		return contract_ID;
	}
	public void setContract_ID(String contract_ID) {
		this.contract_ID = contract_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getFinish_time() {
		return finish_time;
	}
	public void setFinish_time(Date finish_time) {
		this.finish_time = finish_time;
	}
	public Integer getTotal_payment() {
		return total_payment;
	}
	public void setTotal_payment(Integer total_payment) {
		this.total_payment = total_payment;
	}
	public Integer getUnpayment() {
		return unpayment;
	}
	public void setUnpayment(Integer unpayment) {
		this.unpayment = unpayment;
	}
	public Byte getContract_type() {
		return contract_type;
	}
	public void setContract_type(Byte contract_type) {
		this.contract_type = contract_type;
	}
	
	
}
