package com.mangement.mybatis.mappers;


import java.util.List;
import java.util.Map;

import com.mangement.mybatis.model.Reim;

public interface ReimMapper {
	public void insert(Map<String,Object> map);
	public void delete(Map<String,Object> map);
	public List<Reim> find(Map<String,Object> map);
	public void update(Reim reim);
}
