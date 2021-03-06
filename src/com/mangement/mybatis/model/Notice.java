package com.mangement.mybatis.model;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class Notice {
	private String noticeID;
	private String ID;
	private String content;
	private Date date;
	private Integer isread;
	private User user;

	public Notice() {
		super();
	}

	public Notice(String noticeID, String iD) {
		super();
		this.noticeID = noticeID;
		ID = iD;
	}

	public Notice(String noticeID, String iD, String content, Date date,
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

	public String getNoticeID() {
		return noticeID;
	}

	public void setNoticeID(String noticeID) {
		this.noticeID = noticeID;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Map<String,Object> getMap() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("noticeID", noticeID);
		map.put("ID", ID);
		map.put("content", content);
		map.put("date", date);
		map.put("isread", isread);
		return map;
	}
}
