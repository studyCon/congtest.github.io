package com.xxx.service;

import java.util.List;

import com.xxx.pojo.Slideshow;

public interface SlideshowService {
	boolean insert(Slideshow slideshow);
	boolean update(Slideshow slideshow);
	boolean delete(Integer id);
	List<Slideshow> findAll();
	List<Slideshow> findByName(String name);//模糊查询
}
