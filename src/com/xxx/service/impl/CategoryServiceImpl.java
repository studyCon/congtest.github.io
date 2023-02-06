package com.xxx.service.impl;

import java.util.List;

import com.xxx.dao.CategoryDao;
import com.xxx.dao.impl.CategoryDaoImpl;
import com.xxx.pojo.Category;
import com.xxx.service.CategoryService;

public class CategoryServiceImpl implements CategoryService{
	@Override
	public boolean insert(Category category) {
		CategoryDao categoryDao = new CategoryDaoImpl();
		int num = categoryDao.insert(category);
		if (num>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(Category category) {
		CategoryDao categoryDao = new CategoryDaoImpl();
		int num = categoryDao.update(category);
		if (num>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		CategoryDao categoryDao = new CategoryDaoImpl();
		int num = categoryDao.delete(id);
		if (num>0) {
			return true;
		}
		return false;
	}

	@Override
	public Category find(Integer id) {
		CategoryDao categoryDao = new CategoryDaoImpl();
		return categoryDao.find(id);
	}

	@Override
	public List<Category> findAll(Integer pid) {
		CategoryDao categoryDao = new CategoryDaoImpl();
		return categoryDao.findAll(pid);
	}

	@Override
	public List<Category> findAll() {
		CategoryDao categoryDao = new CategoryDaoImpl();
		return categoryDao.findAllByState();
	}



	@Override
	public List<Category> findAllByState() {
		CategoryDao categoryDao = new CategoryDaoImpl();
		return categoryDao.findAllByState();
	}

	@Override
	public List<Category> findAllByStatus(Integer pid) {
		CategoryDao categoryDao = new CategoryDaoImpl();
		return categoryDao.findAllByStatus(pid);
	}
}
