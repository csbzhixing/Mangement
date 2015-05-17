package com.mangment.test.csb;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mangement.mappers.UserMapper;
import com.mangement.model.User;
import com.mangement.utils.SqlSessionFactoryUtil;

public class TestUser {

	private static Logger logger=Logger.getLogger(TestUser.class);
	private SqlSession sqlSession=null;
	private UserMapper userMapper=null;
	
	/**
	 * 测试方法前调用
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		sqlSession=SqlSessionFactoryUtil.openSession();
		userMapper=sqlSession.getMapper(UserMapper.class);
	}

	/**
	 * 测试方法后调用
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		sqlSession.close();
	}
	
	@Test
	public void testAdd() {
		logger.info("添加用户");
		User user=new User(111,"dashabi",1,"shenmegui","man","999-999-999","地球",1111111,"扫地的","9999999");
		userMapper.add(user);
		sqlSession.commit();
	}
	
	@Test
	public void testFind(){
		logger.info("查找所有用户");
		List<User> userList=userMapper.find();
		for(User s:userList){
			System.out.println(s);
		}
	}
}
