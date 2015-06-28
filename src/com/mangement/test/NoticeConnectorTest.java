package com.mangement.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.mangement.mybatis.connections.Connect2Notice;
import com.mangement.mybatis.model.Notice;

public class NoticeConnectorTest {
	Connect2Notice connect2Notice = new Connect2Notice();
	Integer start = 0;
	Integer size = 10;

	@Test
	public void insert(){
		Notice a = new Notice("4", "20150002");
		connect2Notice.insert(a);
	}
	@Test
	public void add() {
		List<Notice> Notices = new ArrayList<Notice>();
		Notice a1 = new Notice("3", "20150003");
		Notices.add(a1);
		connect2Notice.add(Notices);
	}

	@Test
	public void delete() {
		connect2Notice.delete(new Notice(null, null, null,
				new java.sql.Date(new java.util.Date().getTime()), null));
	}

	@Test
	public void find() {
		List<Notice> list = connect2Notice.find(new Notice(null, null,
				null, null, 0),
				start, size);
		for (Notice contract : list) {
			System.out.println(contract);
		}
	}

	@Test
	public void update() {
		connect2Notice.update(new Notice("3", "20150003", "bye",
				new java.sql.Date(new java.util.Date().getTime()), 0));
	}
}
