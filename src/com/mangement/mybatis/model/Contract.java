package com.mangement.mybatis.model;

import java.math.BigInteger;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contract {
	private String contractID;
	private String name;
	private Date startTime;
	private Date finishTime;
	private BigInteger totalPayment;
	private BigInteger unpayment;
	private Integer contractType;
	private List<CompanyInvoice> companyInvoice;
	private Map<String,Object> map = new HashMap<String,Object>();

	public Contract() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contract(String contractID) {
		super();
		this.contractID = contractID;
	}

	public Contract(String contractID, String name, Date startTime,
			Date finishTime, BigInteger totalPayment, BigInteger unpayment,
			Integer contractType) {
		super();
		this.contractID = contractID;
		this.name = name;
		this.startTime = startTime;
		this.finishTime = finishTime;
		this.totalPayment = totalPayment;
		this.unpayment = unpayment;
		this.contractType = contractType;
	}

	@Override
	public String toString() {
		return "Contract [contractID=" + contractID + ", name=" + name
				+ ", startTime=" + startTime + ", finishTime=" + finishTime
				+ ", totalPayment=" + totalPayment + ", unpayment=" + unpayment
				+ ", contractType=" + contractType + "]";
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

	public BigInteger getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(BigInteger totalPayment) {
		this.totalPayment = totalPayment;
	}

	public BigInteger getUnpayment() {
		return unpayment;
	}

	public void setUnpayment(BigInteger unpayment) {
		this.unpayment = unpayment;
	}

	public Integer getContractType() {
		return contractType;
	}

	public void setContractType(Integer contractType) {
		this.contractType = contractType;
	}

	public List<CompanyInvoice> getCompanyInvoice() {
		return companyInvoice;
	}

	public void setCompanyInvoice(List<CompanyInvoice> companyInvoice) {
		this.companyInvoice = companyInvoice;
	}

	public Map<String,Object> getMap() {
		map.clear();
		map.put("contractID", contractID);
		map.put("name", name);
		map.put("startTime", startTime);
		map.put("finishTime", finishTime);
		map.put("totalPayment", totalPayment);
		map.put("unpayment", unpayment);
		map.put("contractType", contractType);
		return map;
	}

}