package com.mangement.mybatis.connections;


import java.util.List;

public interface ModelInterface {
	public void insert(List<Object> list);
	public void delete(List<Object> list);
	public List<Object> find(List<Object> list);
	public void update(Object object);
}
