package com.mangement.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mangement.mybatis.mappers.UserMapper;
import com.mangement.mybatis.model.User;
import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class UserTest {
	UserMapper userMapper = null;
	private SqlSession sqlSession = null;
	Map<String,Object> map = new HashMap<String,Object>();
	List<User> Users = new ArrayList<User>();
	
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		userMapper = sqlSession.getMapper(UserMapper.class);
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.commit();
		sqlSession.close();
	}

	@Test
	public void insert() {
		User a1=new User("11","123",3,"wing","nan","1999-9-9","diqiu","123321","hentai","111");
		User a2=new User("15","1231",3,"wing","nan","1999-9-9","diqiu","123321","hentai","111");
		User a3=new User("13","1213",3,"wing","nan","1999-9-9","diqiu","123321","hentai","111");
		Users.add(a1);
		Users.add(a2);
		Users.add(a3);
		map.put("Users", Users);
		userMapper.insert(map);
	}

	@Test
	public void delete() {
		map.put("birthday", "1999-9-9");
		userMapper.delete(map);
	}


	@Test
	public void find() {
		map.put("birthday", "1999-9-9");
		List<User> list = userMapper.find(map);
		for (User s : list) {
			System.out.println(s);
		}
	}

	@Test
	public void update(){
		userMapper.update(new User("123","321",4,"grc","nv","2000-9-9","gre","7","shenshi",null));
	}
}
