package com.xxx.dao;

import java.util.List;

import com.xxx.pojo.User;

public interface UserDao {
	//增删改查
	int Insert(User user);
	int delete(Integer id);
	int update(User user);
	List<User> AllUser();
	
	//单条查询
	User findById(Integer id);
	//用户名模糊查询
	List<User> findByName(String name);
}
