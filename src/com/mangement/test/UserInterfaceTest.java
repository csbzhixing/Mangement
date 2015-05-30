package com.mangement.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.mangement.mybatis.connections.Connect2User;
import com.mangement.mybatis.model.User;

public class UserInterfaceTest {
	Map<String, Object> map = new HashMap<String, Object>();

	@Test
	public void insert() {
		List<Object> Users = new ArrayList<Object>();
		Connect2User connect2User = new Connect2User();
		User a1=new User("11","123",3,"wing","nan","1999-9-9","diqiu","123321","hentai","111");
		User a2=new User("15","1231",3,"wing","nan","1999-9-9","diqiu","123321","hentai","111");
		User a3=new User("13","1213",3,"wing","nan","1999-9-9","diqiu","123321","hentai","111");
		Users.add(a1);
		Users.add(a2);
		Users.add(a3);
		connect2User.insert(Users);
	}

	@Test
	public void delete() {
		Connect2User connect2User = new Connect2User();
		List<Object> value = new ArrayList<Object>();
		value.add("123");
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		connect2User.delete(value);
	}

	@Test
	public void find() {
		Connect2User connect2User = new Connect2User();
		List<Object> value = new ArrayList<Object>();
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(null);
		value.add(0);
		value.add(10);
		List<Object> list = connect2User.find(value);
		for (Object s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update() {
		Connect2User connect2User = new Connect2User();
		connect2User.update(new User("123","321",4,"grc","nv","2000-9-9","gre","7","shenshi",null));
	}
}
