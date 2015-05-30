package com.mangement.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.mangement.mybatis.connections.Connect2Notice;
import com.mangement.mybatis.model.Notice;

public class NoticeInterfaceTest {
	Map<String,Object> map = new HashMap<String,Object>();
	

	@Test
	public void insert() {
		List<Object> Notices = new ArrayList<Object>();
		Connect2Notice connect2Notice = new Connect2Notice();
		Notice a1 = new Notice("3","20150003");
		Notices.add(a1);
		connect2Notice.insert(Notices);
	}

	@Test
	public void delete() {
		Connect2Notice connect2Notice = new Connect2Notice();
		List<Object> value = new ArrayList<Object>();
		value.add("3");
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		connect2Notice.delete(value);
	}


	@Test
	public void find() {
		Connect2Notice connect2Notice = new Connect2Notice();
		List<Object> value = new ArrayList<Object>();
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(0);
		value.add(10);
		List<Object> list = connect2Notice.find(value);
		for (Object s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update(){
		Connect2Notice connect2Notice = new Connect2Notice();
		connect2Notice.update(new Notice("3","20150003","bye",new java.sql.Date(new java.util.Date().getTime()),0));
	}
}
