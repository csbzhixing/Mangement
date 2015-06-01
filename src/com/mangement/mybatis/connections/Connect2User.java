package com.mangement.mybatis.connections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mangement.mybatis.mappers.UserMapper;
import com.mangement.mybatis.model.User;

public class Connect2User extends SessionOpener {

	private UserMapper userMapper = null;

	public Connect2User() {
		super();
	}

	public void insert(List<User> list){
		try {
			userMapper = (UserMapper) setUp(UserMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("Users", list);
			userMapper.insert(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(User model){
		try {
			userMapper = (UserMapper) setUp(UserMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			for(Map.Entry<String,Object> column : model.getMap().entrySet()){
				if(column.getValue()!=null){
					map.put(column.getKey(), column.getValue());
				}
			}
			userMapper.delete(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<User> find(User model,Integer start,Integer size){
		List<User> list = null;
		try {
			userMapper = (UserMapper) setUp(UserMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			for(Map.Entry<String,Object> column : model.getMap().entrySet()){
				if(column.getValue()!=null){
					map.put(column.getKey(), column.getValue());
				}
			}
			if(start!=null && size!=null){
				map.put("start", start);
				map.put("size", size);
			}
			list = userMapper.find(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void update(User model){
		try {
			userMapper = (UserMapper) setUp(UserMapper.class);
			userMapper.update(model);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
