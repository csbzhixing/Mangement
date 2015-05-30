package com.mangement.mybatis.mappers;


import java.util.List;
import java.util.Map;

import com.mangement.mybatis.model.User;


public interface UserMapper {
	public void insert(Map<String,Object> map);
	public void delete(Map<String,Object> map);
	public List<User> find(Map<String,Object> map);
	public List<User> findByID(String ID);
	public void update(User user);
}
