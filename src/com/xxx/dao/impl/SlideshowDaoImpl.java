package com.xxx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xxx.dao.SlideshowDao;
import com.xxx.pojo.News;
import com.xxx.pojo.Slideshow;
import com.xxx.util.mysqlUtil;

public class SlideshowDaoImpl implements SlideshowDao{

	@Override
	public int insert(Slideshow slideshow) {
		//sql语句
		int num = 0;
		String sql = "insert into web_pic(name,local,state) values(?,?,?)";
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, slideshow.getName());
			preparedStatement.setString(2, slideshow.getLocal());
			preparedStatement.setInt(3, slideshow.getState());
			num = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int update(Slideshow slideshow) {
		//sql语句
		int num=0;
		String sql = "update web_pic set name=?,local=?,state=? where id=?";
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, slideshow.getName());
			preparedStatement.setString(2, slideshow.getLocal());
			preparedStatement.setInt(3, slideshow.getState());
			preparedStatement.setInt(4, slideshow.getId());
			num = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int delete(Integer id) {
		//sql语句
		int num=0;
		String sql = "delete from web_pic where id=?";
		//连接数据库
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
	public List<Slideshow> findAll() {
		//sql语句
		String sql = "select * from web_pic order by id asc";
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			List<Slideshow> SlideshowList = new ArrayList<Slideshow>();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String local = resultSet.getString("title");
				Integer state = resultSet.getInt("state");
				String createTime = resultSet.getString("create_time");
				String updateTime = resultSet.getString("update_time");
				Slideshow slideshow = new Slideshow(id, name, local, state, createTime, updateTime);
				SlideshowList.add(slideshow);
			}
			return SlideshowList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Slideshow>  findByName(String name) {
		//sql语句
		String sql = "select * from web_pic order by id asc";
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			List<Slideshow> SlideshowList = new ArrayList<Slideshow>();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("id");
				String Sname = resultSet.getString("name");
				String local = resultSet.getString("title");
				Integer state = resultSet.getInt("state");
				String createTime = resultSet.getString("create_time");
				String updateTime = resultSet.getString("update_time");
				Slideshow slideshow = new Slideshow(id, Sname, local, state, createTime, updateTime);
				SlideshowList.add(slideshow);
			}
			return SlideshowList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
