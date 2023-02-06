package com.xxx.dao;

import java.util.List;

import com.xxx.pojo.Category;

public interface CategoryDao {
	int insert(Category category);
	int update(Category category);
	int delete(Integer id);
	Category find(Integer id);
	List<Category> findAll(Integer pid);
	//前端获取二级分类
	List<Category> findAllByState();
	//前端获取一级分类
	List<Category> findAllByStatus(Integer pid);
}
