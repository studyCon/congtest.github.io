package com.xxx.dao;

import java.util.List;

import com.xxx.pojo.News;

public interface NewsDao {
	int insert(News news);
	int update(News news);
	int delete(Integer id);
	News find(Integer id);
	List<News> findAll();
	
	List<News> findByCate(Integer seCateId);//查询二级分类下的news
	List<News> findAllByStatus();//推荐列表
}
