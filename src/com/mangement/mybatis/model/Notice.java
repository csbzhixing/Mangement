package com.mangement.mybatis.model;

import java.util.Date;


public class Notice {
	private Integer noticeID;
	private Integer ID;
	private String content;
	private Date date;	
	private Integer isread;
	
	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notice(Integer noticeID, Integer iD) {
		super();
		this.noticeID = noticeID;
		ID = iD;
	}

	public Notice(Integer noticeID, Integer iD, String content, Date date,
			Integer isread) {
		super();
		this.noticeID = noticeID;
		ID = iD;
		this.content = content;
		this.date = date;
		this.isread = isread;
	}

	@Override
	public String toString() {
		return "Notice [noticeID=" + noticeID + ", ID=" + ID + ", content="
				+ content + ", date=" + date + ", isread=" + isread + "]";
	}

	public Integer getNoticeID() {
		return noticeID;
	}

	public void setNoticeID(Integer noticeID) {
		this.noticeID = noticeID;
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

	public Integer getIsread() {
		return isread;
	}

	public void setIsread(Integer isread) {
		this.isread = isread;
	}
	
	
}
