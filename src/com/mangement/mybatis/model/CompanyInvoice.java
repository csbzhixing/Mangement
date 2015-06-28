package com.mangement.mybatis.model;

import java.math.BigInteger;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class CompanyInvoice {

	private String cInvoiceID;
	private String contractID;
	private BigInteger payment;
	private Date date;
	private Integer type;
	private Contract contract;

	public CompanyInvoice() {
		super();
	}

	public CompanyInvoice(String cInvoiceID) {
		super();
		this.cInvoiceID = cInvoiceID;
	}

	public CompanyInvoice(String cInvoiceID, String contractID,
			BigInteger payment, Date date, Integer type) {
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

	public String getcInvoiceID() {
		return cInvoiceID;
	}

	public void setcInvoiceID(String cInvoiceID) {
		this.cInvoiceID = cInvoiceID;
	}

	public String getContractID() {
		return contractID;
	}

	public void setContractID(String contractID) {
		this.contractID = contractID;
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public Map<String,Object> getMap() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("cInvoiceID", cInvoiceID);
		map.put("contractID", contractID);
		map.put("payment", payment);
		map.put("date", date);
		map.put("type", type);
		return map;
	}

}
