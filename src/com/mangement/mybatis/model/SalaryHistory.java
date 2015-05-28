package com.mangement.mybatis.model;

import java.math.BigInteger;
import java.sql.Date;

public class SalaryHistory {

	private Date payoffDate;
	private String ID;
	private BigInteger basicSalary;
	private BigInteger livingAllowance;
	private BigInteger workDay;
	private BigInteger attendanceAward;
	private BigInteger socialSecurity;
	private BigInteger tax;
	private BigInteger totalSalary;
	
	public SalaryHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaryHistory(Date payoffDate, String iD) {
		super();
		this.payoffDate = payoffDate;
		ID = iD;
	}

	public SalaryHistory(Date payoffDate, String iD, BigInteger basicSalary,
			BigInteger livingAllowance, BigInteger workDay,
			BigInteger attendanceAward, BigInteger socialSecurity,
			BigInteger tax, BigInteger totalSalary) {
		super();
		this.payoffDate = payoffDate;
		ID = iD;
		this.basicSalary = basicSalary;
		this.livingAllowance = livingAllowance;
		this.workDay = workDay;
		this.attendanceAward = attendanceAward;
		this.socialSecurity = socialSecurity;
		this.tax = tax;
		this.totalSalary = totalSalary;
	}

	@Override
	public String toString() {
		return "SalaryHistory [payoffDate=" + payoffDate + ", ID=" + ID
				+ ", basicSalary=" + basicSalary + ", livingAllowance="
				+ livingAllowance + ", workDay=" + workDay
				+ ", attendanceAward=" + attendanceAward + ", socialSecurity="
				+ socialSecurity + ", tax=" + tax + ", totalSalary="
				+ totalSalary + "]";
	}

	public Date getPayoffDate() {
		return payoffDate;
	}

	public void setPayoffDate(Date payoffDate) {
		this.payoffDate = payoffDate;
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

	public BigInteger getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(BigInteger totalSalary) {
		this.totalSalary = totalSalary;
	}

}
