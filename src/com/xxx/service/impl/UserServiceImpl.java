package com.xxx.service.impl;

import java.util.List;

import com.xxx.dao.UserDao;
import com.xxx.dao.impl.UserDaoImpl;
import com.xxx.pojo.User;
import com.xxx.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public boolean insert(User user) {
		UserDao userDao = new UserDaoImpl();
		if (userDao.Insert(user)>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(User user) {
		UserDao userDao = new UserDaoImpl();
		if (userDao.update(user)>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		UserDao userDao = new UserDaoImpl();
		if (userDao.delete(id)>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<User> findAll() {
		UserDao userDao = new UserDaoImpl();
		return userDao.AllUser();
	}

	@Override
	public User findById(Integer id) {
		UserDao userDao = new UserDaoImpl();
		return userDao.findById(id);
	}

	@Override
	public List<User> findByName(String name) {
		UserDao userDao = new UserDaoImpl();
		return userDao.findByName(name);
	}

}
