package com.xxx.service;

import java.util.List;

import com.xxx.pojo.News;

public interface NewsService {
	boolean insert(News news);
	boolean update(News news);
	boolean delete(Integer id);
	News find(Integer id);
	List<News> findAll();
	List<News> findByCate(Integer ppid);
	List<News> findAllByStatus();
}
