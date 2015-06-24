package com.mangement.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.mangement.mybatis.connections.Connect2User;
import com.mangement.mybatis.model.User;

public class UserConnectorTest {
	Connect2User connect2User = new Connect2User();
	Integer start = 0;
	Integer size = 10;

	@Test
	public void insert(){
		User a = new User("14", "123", 3, "wing", "nan", "1999-9-9", "diqiu",
				"123321", "hentai", "111");
		connect2User.insert(a);
	}
	@Test
	public void add() {
		List<User> Users = new ArrayList<User>();
		User a1 = new User("11", "123", 3, "wing", "nan", "1999-9-9", "diqiu",
				"123321", "hentai", "111");
		User a2 = new User("15", "1231", 3, "wing", "nan", "1999-9-9", "diqiu",
				"123321", "hentai", "111");
		User a3 = new User("13", "1213", 3, "wing", "nan", "1999-9-9", "diqiu",
				"123321", "hentai", "111");
		Users.add(a1);
		Users.add(a2);
		Users.add(a3);
		connect2User.add(Users);
	}

	@Test
	public void delete() {
		connect2User.delete(new User(null, null, null, null, null, "1999-9-9",
				null, null, null, null));
	}

	@Test
	public void find() {
		List<User> list = connect2User.find(new User(null, null, 2, null, null,
				null, null, null, null, null), start, size);
		for (User contract : list) {
			System.out.println(contract);
		}
	}

	@Test
	public void update() {
		connect2User.update(new User("13", "321", 4, "grc", "nv", "2000-9-9",
				"gre", "7", "shenshi", null));
	}
}
