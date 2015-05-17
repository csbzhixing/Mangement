package com.mangement.mappers;

import java.util.List;

import com.mangement.model.User;



public interface UserMapper {

	public int add (User user);
	public int delete(Integer id);
	public int update (User user);
	public List<User> find();;
}
