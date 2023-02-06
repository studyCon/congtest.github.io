package com.xxx.dao;

import java.util.List;

import com.xxx.pojo.Slideshow;

public interface SlideshowDao {
	int insert(Slideshow slideshow);
	int update(Slideshow slideshow);
	int delete(Integer id);
	List<Slideshow> findAll();
	List<Slideshow> findByName(String name);//模糊查询
}
