package com.mangement.mybatis.service;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mangement.mybatis.mappers.CompanyInvoiceMapper;
import com.mangement.mybatis.mappers.ContractMapper;
import com.mangement.mybatis.model.CompanyInvoice;
import com.mangement.mybatis.model.Contract;
import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class Test2 {
	ContractMapper contractMapper = null;
	private SqlSession sqlSession = null;
	Contract contract = null;
	
	@Before
	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		contractMapper = sqlSession.getMapper(ContractMapper.class);
		contract = findById("123");
	}

	@After
	public void tearDown() throws Exception {
		sqlSession.commit();
		sqlSession.close();
	}

	public void insert() {
		contractMapper.insert(contract);
		System.out.println(contract);
	}

	public void deleteById() {
		contractMapper.deleteById("999");
	}


	public Contract findById(String id) {
		return contractMapper.findById(id);
	}

	public void find() {
		List<Contract> list = contractMapper.find();
		for (Contract s : list) {
			System.out.println(s);
		}
	}

	public void updateById(){
		contract.setName("abc");
		contract.setStart_time(new Date(0));
		contract.setFinish_time(new Date(0));
		contract.setTotal_payment(10000);
		contract.setUnpayment(100);
		contract.setContract_type((byte)0);
		contractMapper.updateById(contract);
	}
}
