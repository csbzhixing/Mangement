package com.mangement.mybatis.connections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mangement.mybatis.mappers.NoticeMapper;
import com.mangement.mybatis.model.Notice;

public class Connect2Notice extends SessionOpener {

	private NoticeMapper noticeMapper = null;

	public Connect2Notice() {
		super();
	}

	public void insert(Notice notice){
		try {
			noticeMapper = (NoticeMapper) setUp(NoticeMapper.class);
			noticeMapper.insert(notice);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void add(List<Notice> list){
		try {
			noticeMapper = (NoticeMapper) setUp(NoticeMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("Notices", list);
			noticeMapper.add(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(Notice model){
		try {
			noticeMapper = (NoticeMapper) setUp(NoticeMapper.class);
			Map<String,Object> map = new HashMap<String,Object>();
			for(Map.Entry<String,Object> column : model.getMap().entrySet()){
				if(column.getValue()!=null){
					map.put(column.getKey(), column.getValue());
				}
			}
			noticeMapper.delete(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Notice> find(Notice model,Integer start,Integer size){
		List<Notice> list = null;
		try {
			noticeMapper = (NoticeMapper) setUp(NoticeMapper.class);
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
			list = noticeMapper.find(map);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void update(Notice model){
		try {
			noticeMapper = (NoticeMapper) setUp(NoticeMapper.class);
			noticeMapper.update(model);
			tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
