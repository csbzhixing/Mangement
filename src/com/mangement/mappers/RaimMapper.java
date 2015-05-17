package com.mangement.mappers;

import java.util.List;

import com.mangement.model.Reim;


public interface RaimMapper {
	public int add (Reim user);
	public int delete(Integer id);
	public int update (Reim user);
	public List<Reim> find();
}
