package com.mangement.model;

import java.util.Date;

public class SalaryHistory {

	private Integer id;
	private Date payOffDate; 
	private Integer basicSalary;
	private Integer livingAllowance;
	private Integer workDay;
	private Integer attendanceAward;
	private Integer socialSecurity;
	private Integer tax;
	private Integer totalSalary;
	
	
	
	public SalaryHistory(Integer id, Date payOffDate, Integer basicSalary,
			Integer livingAllowance, Integer workDay, Integer attendanceAward,
			Integer socialSecurity, Integer tax, Integer totalSalary) {
		super();
		this.id = id;
		this.payOffDate = payOffDate;
		this.basicSalary = basicSalary;
		this.livingAllowance = livingAllowance;
		this.workDay = workDay;
		this.attendanceAward = attendanceAward;
		this.socialSecurity = socialSecurity;
		this.tax = tax;
		this.totalSalary = totalSalary;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getPayOffDate() {
		return payOffDate;
	}
	public void setPayOffDate(Date payOffDate) {
		this.payOffDate = payOffDate;
	}
	public Integer getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(Integer basicSalary) {
		this.basicSalary = basicSalary;
	}
	public Integer getLivingAllowance() {
		return livingAllowance;
	}
	public void setLivingAllowance(Integer livingAllowance) {
		this.livingAllowance = livingAllowance;
	}
	public Integer getWorkDay() {
		return workDay;
	}
	public void setWorkDay(Integer workDay) {
		this.workDay = workDay;
	}
	public Integer getAttendanceAward() {
		return attendanceAward;
	}
	public void setAttendanceAward(Integer attendanceAward) {
		this.attendanceAward = attendanceAward;
	}
	public Integer getSocialSecurity() {
		return socialSecurity;
	}
	public void setSocialSecurity(Integer socialSecurity) {
		this.socialSecurity = socialSecurity;
	}
	public Integer getTax() {
		return tax;
	}
	public void setTax(Integer tax) {
		this.tax = tax;
	}
	public Integer getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(Integer totalSalary) {
		this.totalSalary = totalSalary;
	}
	
	
}
