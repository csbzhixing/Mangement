package com.mangement.mybatis.connections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mangement.mybatis.mappers.SalaryCurrentMapper;
import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class Connect2SalaryCurrent implements ModelInterface {

	private SalaryCurrentMapper salaryCurrentMapper = null;
	private SqlSession sqlSession = null;
	private String keys[] = { "ID", "basicSalary", "livingAllowance",
			"workDay", "attendanceAward", "socialSecurity", "tax", "start",
			"size" };

	public Connect2SalaryCurrent() {
		super();
	}

	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		salaryCurrentMapper = sqlSession.getMapper(SalaryCurrentMapper.class);
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
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("SalaryCurrents", list);
		salaryCurrentMapper.insert(map);
		try {
			tearDown();
		} catch (Exception e) {
			return;
		}
	}

	@Override
	public void delete(List<Object> list) {
		try {
			setUp();
		} catch (Exception e) {
			return;
		}

		Map<String, Object> map = new HashMap<String, Object>();
		int i = 0;
		for (Object object : list) {
			if (object != null) {
				map.put(keys[i], object);
			}
			i++;
		}
		salaryCurrentMapper.delete(map);

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
		Map<String, Object> map = new HashMap<String, Object>();
		int i = 0;
		for (Object object : list) {
			if (object != null) {
				map.put(keys[i], object);
			}
			i++;
		}
		List<Object> contract = salaryCurrentMapper.find(map);
		try {
			tearDown();
		} catch (Exception e) {
			return null;
		}
		return contract;
	}

	@Override
	public void update(Object object) {
		try {
			setUp();
		} catch (Exception e) {
			return;
		}

		salaryCurrentMapper.update(object);

		try {
			tearDown();
		} catch (Exception e) {
			return;
		}
	}

}
