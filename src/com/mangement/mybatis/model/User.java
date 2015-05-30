package com.mangement.mybatis.model;

import java.util.List;


public class User {

	private String ID;
	private String password;
	private Integer authority;
	private String name;
	private String sex;
	private String birthday;
	private String address;
	private String phone;
	private String position;
	private String IDcard;
	private List<Notice> notice;
	private List<Reim> reim;
	private List<SalaryHistory> salaryHistory;
	private SalaryCurrent salaryCurrent;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String iD) {
		super();
		ID = iD;
	}


	public User(String iD, String password, Integer authority, String name,
			String sex, String birthday, String address, String phone,
			String position, String iDcard) {
		super();
		ID = iD;
		this.password = password;
		this.authority = authority;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		this.phone = phone;
		this.position = position;
		IDcard = iDcard;
	}



	@Override
	public String toString() {
		return "User [ID=" + ID + ", password=" + password + ", authority="
				+ authority + ", name=" + name + ", sex=" + sex + ", birthday="
				+ birthday + ", address=" + address + ", phone=" + phone
				+ ", position=" + position + ", IDcard=" + IDcard + ", notice="
				+ notice + ", reim=" + reim + ", salaryHistory="
				+ salaryHistory + ", salaryCurrent=" + salaryCurrent + "]";
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getAuthority() {
		return authority;
	}


	public void setAuthority(Integer authority) {
		this.authority = authority;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public String getIDcard() {
		return IDcard;
	}


	public void setIDcard(String iDcard) {
		IDcard = iDcard;
	}


	public List<Notice> getNotice() {
		return notice;
	}


	public void setNotice(List<Notice> notice) {
		this.notice = notice;
	}


	public List<Reim> getReim() {
		return reim;
	}


	public void setReim(List<Reim> reim) {
		this.reim = reim;
	}


	public List<SalaryHistory> getSalaryHistory() {
		return salaryHistory;
	}


	public void setSalaryHistory(List<SalaryHistory> salaryHistory) {
		this.salaryHistory = salaryHistory;
	}


	public SalaryCurrent getSalaryCurrent() {
		return salaryCurrent;
	}


	public void setSalaryCurrent(SalaryCurrent salaryCurrent) {
		this.salaryCurrent = salaryCurrent;
	}

	
}
