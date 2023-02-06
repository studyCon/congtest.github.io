package com.xxx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xxx.dao.CategoryDao;
import com.xxx.pojo.Category;
import com.xxx.util.mysqlUtil;

public class CategoryDaoImpl implements CategoryDao{

	//新增
	@Override
	public int insert(Category category) {
		//sql语句
		int num = 0;
		String sql = "insert into web_category(name,pid) values(?,?)";
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, category.getName());
			preparedStatement.setInt(2, category.getPid());
			num = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}
	
	//修改
	@Override
	public int update(Category category) {
		//sql语句
		int num=0;
		String sql = "update web_category set cate_name=?,pid=?,state=?,status=? where id=?";
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, category.getName());
			preparedStatement.setInt(2, category.getPid());
			preparedStatement.setInt(3, category.getState());
			preparedStatement.setInt(4, category.getStatus());
			preparedStatement.setInt(5, category.getId());
			num = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

	//删除
	@Override
	public int delete(Integer id) {
		//sql语句
		int num=0;
		String sql = "delete from web_category where id=?";
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

	//查找
	@Override
	public Category find(Integer id) {
		//sql语句
		int num=0;
		String sql = "select * from web_category where id=? ";
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet= preparedStatement.executeQuery();
			while (resultSet.next()) {
				Integer cid = resultSet.getInt("id");
				String name = resultSet.getString("name");
				Integer pid = resultSet.getInt("pid");
				Integer state = resultSet.getInt("state");
				Integer status = resultSet.getInt("status");
				String createTime = resultSet.getString("create_time");
				Category category = new Category(cid, name, pid, state, status,createTime);
				return category;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	//全部
	@Override
	public List<Category> findAll(Integer pid) {
		//sql语句
		String sql = "select * from web_category where pid=? order by id asc";
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, pid);
			ResultSet resultSet = preparedStatement.executeQuery();
			List<Category> categoryList = new ArrayList<Category>();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				Integer state = resultSet.getInt("state");
				Integer status = resultSet.getInt("status");
				String createTime = resultSet.getString("create_time");
				Category category = new Category(id, name, pid, state, status,createTime);
				categoryList.add(category);
			}
			return categoryList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Category> findAllByState() {
		//sql语句
		String sql = "select * from web_category where pid>0 and state=0 and status=0";		
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			List<Category> categoryList = new ArrayList<Category>();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				Integer pid = resultSet.getInt("pid");
				Integer state = resultSet.getInt("state");
				Integer status = resultSet.getInt("status");
				Category category = new Category(id, name, pid, state, status);
				categoryList.add(category);
			}
			return categoryList;			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Category> findAllByStatus(Integer pid) {
		//sql语句
		String sql = "select * from web_category where pid=? and status=0 order by id asc";
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, pid);
			ResultSet resultSet = preparedStatement.executeQuery();
			List<Category> categoryList = new ArrayList<Category>();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				Integer state = resultSet.getInt("state");
				Integer status = resultSet.getInt("status");
				Category category = new Category(id, name, pid, state, status);
				categoryList.add(category);
			}
			return categoryList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
