package com.mangement.mybatis.mappers;


import java.util.List;
import java.util.Map;

import com.mangement.mybatis.model.Notice;

public interface NoticeMapper {
	public void insert(Map<String,Object> map);
	public void delete(Map<String,Object> map);
	public List<Notice> find(Map<String,Object> map);
	public List<Notice> findByID(String ID);
	public void update(Object object);
}
