package com.xxx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xxx.dao.UserDao;
import com.xxx.pojo.User;
import com.xxx.util.mysqlUtil;

public class UserDaoImpl implements UserDao{

	@Override
	public int Insert(User user) {
		String sql ="insert into web_user(username,password,sex,age,tel) value(?,?,?,?,?)";
		int num=0;
		try {
			Connection connection = mysqlUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setInt(3, user.getSex());
			preparedStatement.setInt(4, user.getAge());
			preparedStatement.setString(5, user.getTel());
			num = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int delete(Integer id) {
		int num = 0;
		String sql = "delete from web_user where id=?";
		try {
			Connection connection = mysqlUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			num = preparedStatement.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return num;
	}

	@Override
	public int update(User user) {
		int num = 0;
		String sql = "update web_user set username=?,password=?,sex=?,age=?,tel=? where id=?";
		try {
			Connection connection = mysqlUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setInt(3, user.getSex());
			preparedStatement.setInt(4, user.getAge());
			preparedStatement.setString(5, user.getTel());
			preparedStatement.setInt(6, user.getId());
			num = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public List<User> AllUser() {
		String sql = "select * from web_user order by id asc";
		try {
			Connection connection = mysqlUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			List<User> userList = new ArrayList<User>();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("id");
				String username = resultSet.getString("username");
				String password = resultSet.getString("password");
				Integer sex = resultSet.getInt("sex");
				Integer age = resultSet.getInt("age");
				String tel = resultSet.getString("tel");
				Integer state = resultSet.getInt("state");
				String createTime = resultSet.getString("create_time");
				String updateTime = resultSet.getString("update_time");
				User user = new User(id, username, password, sex, age, tel, state, createTime,updateTime);
				userList.add(user);
			}
			return userList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User findById(Integer id) {
		String sql = "select * from web_user where id=?";
		try {
			Connection connection = mysqlUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String username = resultSet.getString("username");
				String password = resultSet.getString("password");
				Integer sex = resultSet.getInt("sex");
				Integer age = resultSet.getInt("age");
				String tel = resultSet.getString("tel");
				Integer state = resultSet.getInt("state");
				String createTime = resultSet.getString("create_time");
				String updateTime = resultSet.getString("update_time");
				User user = new User(id, username, password, sex, age, tel, state, createTime,updateTime);
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> findByName(String name) {
		String sql = "select * from web_user where username like '%"+name+"%'";
		try {
			Connection connection = mysqlUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			List<User> userList = new ArrayList<User>();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("id");
				String username = resultSet.getString("username");
				String password = resultSet.getString("password");
				Integer sex = resultSet.getInt("sex");
				Integer age = resultSet.getInt("age");
				String tel = resultSet.getString("tel");
				Integer state = resultSet.getInt("state");
				String createTime = resultSet.getString("create_time");
				String updateTime = resultSet.getString("update_time");
				User user = new User(id, username, password, sex, age, tel, state, createTime,updateTime);
				userList.add(user);				
			}
			return userList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
