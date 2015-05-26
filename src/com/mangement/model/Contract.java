package com.mangement.model;

import java.util.Date;

public class Contract {

	private String contractID;
	private String name;
	private Date startTime;
	private Date finishTime;
	private Integer totalPayment;
	private Integer unPayment;
	private Integer contractType;
	
	
	
	public Contract(String contractID, String name, Date startTime,
			Date finishTime, Integer totalPayment, Integer unPayment,
			Integer contractType) {
		super();
		this.contractID = contractID;
		this.name = name;
		this.startTime = startTime;
		this.finishTime = finishTime;
		this.totalPayment = totalPayment;
		this.unPayment = unPayment;
		this.contractType = contractType;
	}
	
	public String getContractID() {
		return contractID;
	}
	public void setContractID(String contractID) {
		this.contractID = contractID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	public Integer getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(Integer totalPayment) {
		this.totalPayment = totalPayment;
	}
	public Integer getUnPayment() {
		return unPayment;
	}
	public void setUnPayment(Integer unPayment) {
		this.unPayment = unPayment;
	}
	public Integer getContractType() {
		return contractType;
	}
	public void setContractType(Integer contractType) {
		this.contractType = contractType;
	}
	
	
}
