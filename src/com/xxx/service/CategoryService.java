package com.xxx.service;

import java.util.List;

import com.xxx.pojo.Category;

public interface CategoryService {
	boolean insert(Category category);
	boolean update(Category category);
	boolean delete(Integer id);
	Category find(Integer id);
	List<Category> findAll(Integer pid);
	List<Category> findAll();
	
	//前端获取二级分类
	List<Category> findAllByState();
	//前端获取一级分类
	List<Category> findAllByStatus(Integer pid);
}
