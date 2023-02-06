package com.xxx.service;

import java.util.List;

import com.xxx.pojo.User;

public interface UserService {
	boolean insert(User user);
	boolean update(User user);
	boolean delete(Integer id);
	List<User> findAll();
	
	//单条查询
	User findById(Integer id);
	//用户名模糊查询
	List<User> findByName(String name);

}
