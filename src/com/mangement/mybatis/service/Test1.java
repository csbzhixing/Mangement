package com.mangement.mybatis.service;


import org.apache.ibatis.session.SqlSession;

import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class Test1 {
	public static void main(String[] args) {
		SqlSession sqlSession = SqlSessionFactoryUtil.openSession();

		
		
		sqlSession.close();
	}
}
