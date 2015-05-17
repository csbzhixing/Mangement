package com.mangement.mybatis.model;

public class SalaryCurrent {

	private Integer ID;
	private Integer basicSalary;
	private Integer livingAllowance;
	private Integer workDay;
	private Integer attendanceAward;
	private Integer socialSecurity;
	private Integer tax;
	
	public SalaryCurrent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaryCurrent(Integer iD) {
		super();
		ID = iD;
	}

	public SalaryCurrent(Integer iD, Integer basicSalary,
			Integer livingAllowance, Integer workDay, Integer attendanceAward,
			Integer socialSecurity, Integer tax) {
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

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
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
	
	
	
}
