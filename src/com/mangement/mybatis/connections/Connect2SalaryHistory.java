package com.mangement.mybatis.connections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mangement.mybatis.mappers.SalaryHistoryMapper;
import com.mangement.mybatis.util.SqlSessionFactoryUtil;

public class Connect2SalaryHistory implements ModelInterface {

	private SalaryHistoryMapper salaryHistoryMapper = null;
	private SqlSession sqlSession = null;
	private String keys[] = { "payoffDate", "ID", "basicSalary",
			"livingAllowance", "workDay", "attendanceAward", "socialSecurity","tax","totalSalary","start",
			"size" };

	public Connect2SalaryHistory() {
		super();
	}

	public void setUp() throws Exception {
		sqlSession = SqlSessionFactoryUtil.openSession();
		salaryHistoryMapper = sqlSession.getMapper(SalaryHistoryMapper.class);
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
		map.put("SalaryHistorys", list);
		salaryHistoryMapper.insert(map);
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
		salaryHistoryMapper.delete(map);

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
		List<Object> contract = salaryHistoryMapper.find(map);
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

		salaryHistoryMapper.update(object);

		try {
			tearDown();
		} catch (Exception e) {
			return;
		}
	}

}
