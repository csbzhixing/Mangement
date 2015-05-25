package com.mangement.mybatis.model;

import java.math.BigInteger;

public class SalaryCurrent {

	private String ID;
	private BigInteger basicSalary;
	private BigInteger livingAllowance;
	private BigInteger workDay;
	private BigInteger attendanceAward;
	private BigInteger socialSecurity;
	private BigInteger tax;
	
	public SalaryCurrent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaryCurrent(String iD) {
		super();
		ID = iD;
	}

	public SalaryCurrent(String iD, BigInteger basicSalary,
			BigInteger livingAllowance, BigInteger workDay,
			BigInteger attendanceAward, BigInteger socialSecurity,
			BigInteger tax) {
		super();
		ID = iD;
		this.basicSalary = basicSalary;
		this.livingAllowance = livingAllowance;
		this.workDay = workDay;
		this.attendanceAward = attendanceAward;
		this.socialSecurity = socialSecurity;
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "SalaryCurrent [ID=" + ID + ", basicSalary=" + basicSalary
				+ ", livingAllowance=" + livingAllowance + ", workDay="
				+ workDay + ", attendanceAward=" + attendanceAward
				+ ", socialSecurity=" + socialSecurity + ", tax=" + tax + "]";
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public BigInteger getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(BigInteger basicSalary) {
		this.basicSalary = basicSalary;
	}

	public BigInteger getLivingAllowance() {
		return livingAllowance;
	}

	public void setLivingAllowance(BigInteger livingAllowance) {
		this.livingAllowance = livingAllowance;
	}

	public BigInteger getWorkDay() {
		return workDay;
	}

	public void setWorkDay(BigInteger workDay) {
		this.workDay = workDay;
	}

	public BigInteger getAttendanceAward() {
		return attendanceAward;
	}

	public void setAttendanceAward(BigInteger attendanceAward) {
		this.attendanceAward = attendanceAward;
	}

	public BigInteger getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(BigInteger socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public BigInteger getTax() {
		return tax;
	}

	public void setTax(BigInteger tax) {
		this.tax = tax;
	}
	
	
}
