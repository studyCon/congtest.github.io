package com.xxx.service.impl;

import java.util.List;

import com.xxx.dao.SlideshowDao;
import com.xxx.dao.impl.SlideshowDaoImpl;
import com.xxx.pojo.Slideshow;
import com.xxx.service.SlideshowService;

public class SlideshowServiceImpl implements SlideshowService{

	@Override
	public boolean insert(Slideshow slideshow) {
		SlideshowDao slideshowDao = new SlideshowDaoImpl();
		int num = slideshowDao.insert(slideshow);
		if (num>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(Slideshow slideshow) {
		SlideshowDao slideshowDao = new SlideshowDaoImpl();
		int num = slideshowDao.update(slideshow);
		if (num>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		SlideshowDao slideshowDao = new SlideshowDaoImpl();
		int num = slideshowDao.delete(id);
		if (num>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<Slideshow> findAll() {
		SlideshowDao slideshowDao = new SlideshowDaoImpl();
		return slideshowDao.findAll();
	}

	@Override
	public List<Slideshow> findByName(String name) {
		SlideshowDao slideshowDao = new SlideshowDaoImpl();
		return slideshowDao.findByName(name);
	}

}
