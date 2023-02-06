package com.xxx.service.impl;

import java.util.List;

import com.xxx.dao.NewsDao;
import com.xxx.dao.impl.NewsDaoImpl;
import com.xxx.pojo.News;
import com.xxx.service.NewsService;

public class NewsServiceImpl implements NewsService{

	@Override
	public boolean insert(News news) {
		NewsDao newsDao = new NewsDaoImpl();
		int num = newsDao.insert(news);
		if (num>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(News news) {
		NewsDao newsDao = new NewsDaoImpl();
		int num = newsDao.update(news);
		if (num>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		NewsDao newsDao = new NewsDaoImpl();
		int num = newsDao.delete(id);
		if (num>0) {
			return true;
		}
		return false;
	}

	@Override
	public News find(Integer id) {
		NewsDao newsDao = new NewsDaoImpl();
		return newsDao.find(id);
	}

	@Override
	public List<News> findAll() {
		NewsDao newsDao = new NewsDaoImpl();
		return newsDao.findAll();
	}

	@Override
	public List<News> findAllByStatus() {
		NewsDao newsDao = new NewsDaoImpl();
		return newsDao.findAllByStatus();
	}

	@Override
	public List<News> findByCate(Integer ppid) {
		NewsDao newsDao = new NewsDaoImpl();
		return newsDao.findByCate(ppid);
	}

}
