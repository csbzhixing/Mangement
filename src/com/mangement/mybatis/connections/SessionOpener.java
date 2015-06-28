package com.mangement.mybatis.connections;

import org.apache.ibatis.session.SqlSession;

import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class SessionOpener {

	private SqlSession sqlSession = null;
	
	
	public SessionOpener() {
		super();
	}


	public Object setUp(Class<?> myClass) throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		return sqlSession.getMapper(myClass);		
	}
	
	
	public void tearDown() throws Exception {
		sqlSession.commit();
		sqlSession.close();
	}
}
