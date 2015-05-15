package com.mangement.mybatis.model;

import java.sql.Date;

public class Notice {
	private Integer notic_ID;
	private Integer ID;
	private String content;
	private Date date;	
	
	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Notice(Integer notic_ID, Integer iD) {
		super();
		this.notic_ID = notic_ID;
		ID = iD;
	}

	@Override
	public String toString() {
		return "Notice [notic_ID=" + notic_ID + ", ID=" + ID + ", content="
				+ content + ", date=" + date + "]";
	}
	public Integer getNotic_ID() {
		return notic_ID;
	}
	public void setNotic_ID(Integer notic_ID) {
		this.notic_ID = notic_ID;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
