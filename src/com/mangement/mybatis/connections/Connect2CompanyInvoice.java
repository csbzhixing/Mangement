package com.mangement.mybatis.connections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mangement.mybatis.mappers.CompanyInvoiceMapper;
import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class Connect2CompanyInvoice implements ModelInterface{

	private CompanyInvoiceMapper companyInvoiceMapper = null;
	private SqlSession sqlSession = null;
	private String keys[] = {"cInvoiceID","contractID","payment","date","type","start","size"};
	
	public Connect2CompanyInvoice() {
		super();
	}

	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		companyInvoiceMapper = sqlSession.getMapper(CompanyInvoiceMapper.class);		
	}

	public void tearDown() throws Exception {
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Override
	public void insert(List<Object> list) {
		try {
			setUp();
		} catch (Exception e) {
			return;
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("CompanyInvoices", list);
		companyInvoiceMapper.insert(map);
		try {
			tearDown();
		} catch (Exception e) {
			return;
		}
	}

	@Override
	public void delete(List<Object> list){
		try {
			setUp();
		} catch (Exception e) {
			return;
		}
		
		Map<String,Object> map = new HashMap<String,Object>();
		int i=0;
		for(Object object : list){
			if(object!=null){
				map.put(keys[i], object);
			}
			i++;
		}
		companyInvoiceMapper.delete(map);
		
		try {
			tearDown();
		} catch (Exception e) {
			return;
		}
	}

	@Override
	public List<Object> find(List<Object> list) {
		try {
			setUp();
		} catch (Exception e) {
			return null;
		}
		Map<String,Object> map = new HashMap<String,Object>();
		int i=0;
		for(Object object : list){
			if(object!=null){
				map.put(keys[i], object);
			}
			i++;
		}
		List<Object> companyInvoice = companyInvoiceMapper.find(map);
		try {
			tearDown();
		} catch (Exception e) {
			return null;
		}
		return companyInvoice;
	}

	@Override
	public void update(Object object) {
		try {
			setUp();
		} catch (Exception e) {
			return;
		}
		
		companyInvoiceMapper.update(object);
		
		try {
			tearDown();
		} catch (Exception e) {
			return;
		}
	}


}
