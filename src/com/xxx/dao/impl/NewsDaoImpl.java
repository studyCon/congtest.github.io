package com.xxx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xxx.dao.NewsDao;
import com.xxx.pojo.News;
import com.xxx.util.mysqlUtil;

public class NewsDaoImpl implements NewsDao{

	@Override
	public int insert(News news) {
		//sql语句
		int num = 0;
		String sql = "insert into web_news(cateId,seCateId,title,author,shortContent,content,state,status,pic) values(?,?,?,?,?,?,?,?,?)";
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, news.getCateId());
			preparedStatement.setInt(2, news.getSeCateId());
			preparedStatement.setString(3, news.getTitle());
			preparedStatement.setString(4, news.getAuthor());
			preparedStatement.setString(5, news.getShortContent());
			preparedStatement.setString(6, news.getContent());
			preparedStatement.setInt(7, news.getState());
			preparedStatement.setInt(8, news.getStatus());
			preparedStatement.setString(9, news.getPic());
			num = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public int update(News news) {
		//sql语句
		int num=0;
		String sql = "update web_news set cateId=?,seCateId=?,title=?,author=?,shortContent=?,content=?,state=?,status=?,pic=? where id=?";
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, news.getCateId());
			preparedStatement.setInt(2, news.getSeCateId());
			preparedStatement.setString(3, news.getTitle());
			preparedStatement.setString(4, news.getAuthor());
			preparedStatement.setString(5, news.getShortContent());
			preparedStatement.setString(6, news.getContent());
			preparedStatement.setInt(7, news.getState());
			preparedStatement.setInt(8, news.getStatus());
			preparedStatement.setString(9, news.getPic());
			preparedStatement.setInt(10, news.getId());
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
		String sql = "delete from web_news where id=?";
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
	public News find(Integer id) {
		//sql语句
		String sql = "select * from web_news where id=? ";
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet= preparedStatement.executeQuery();
			while (resultSet.next()) {
				Integer cid = resultSet.getInt("id");
				Integer cateId = resultSet.getInt("cateId");
				Integer seCateId = resultSet.getInt("seCateId");
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				String shortContent = resultSet.getString("shortContent");
				String content = resultSet.getString("content");
				Integer state = resultSet.getInt("state");
				Integer status = resultSet.getInt("status");
				String createTime = resultSet.getString("create_time");
				String updateTime = resultSet.getString("update_time");
				String pic = resultSet.getString("pic");
				News news = new News(cid, cateId, seCateId, title, author, shortContent, content, state, status, createTime, updateTime, pic);
				return news;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<News> findAll() {
		//sql语句
		String sql = "select * from web_news order by id asc";
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			List<News> newsList = new ArrayList<News>();
			while (resultSet.next()) {
				Integer cid = resultSet.getInt("id");
				Integer cateId = resultSet.getInt("cateId");
				Integer seCateId = resultSet.getInt("seCateId");
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				String shortContent = resultSet.getString("shortContent");
				String content = resultSet.getString("content");
				Integer state = resultSet.getInt("state");
				Integer status = resultSet.getInt("status");
				String createTime = resultSet.getString("create_time");
				String updateTime = resultSet.getString("update_time");
				String pic = resultSet.getString("pic");
				News news = new News(cid, cateId, seCateId, title, author, shortContent, content, state, status, createTime, updateTime, pic);
				newsList.add(news);
			}
			return newsList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<News> findAllByStatus() {
		//sql语句
		String sql = "select * from web_news where status=0";		
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			List<News> newsList = new ArrayList<News>();
			while (resultSet.next()) {
				Integer cid = resultSet.getInt("id");
				Integer cateId = resultSet.getInt("cateId");
				Integer seCateId = resultSet.getInt("seCateId");
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				String shortContent = resultSet.getString("shortContent");
				String content = resultSet.getString("content");
				Integer state = resultSet.getInt("state");
				Integer status = resultSet.getInt("status");
				String createTime = resultSet.getString("create_time");
				String updateTime = resultSet.getString("update_time");
				String pic = resultSet.getString("pic");
				News news = new News(cid, cateId, seCateId, title, author, shortContent, content, state, status, createTime, updateTime, pic);
				newsList.add(news);
			}
			return newsList;		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<News> findByCate(Integer seCateId) {
		//sql语句
		String sql = "select * from web_news where seCateId=? ";
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, seCateId);
			ResultSet resultSet= preparedStatement.executeQuery();
			List<News> newsList = new ArrayList<News>();
			while (resultSet.next()) {
				Integer cid = resultSet.getInt("id");
				Integer cateId = resultSet.getInt("cateId");
				Integer seCateIdInteger = resultSet.getInt("seCateId");
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				String shortContent = resultSet.getString("shortContent");
				String content = resultSet.getString("content");
				Integer state = resultSet.getInt("state");
				Integer status = resultSet.getInt("status");
				String createTime = resultSet.getString("create_time");
				String updateTime = resultSet.getString("update_time");
				String pic = resultSet.getString("pic");
				News news = new News(cid, cateId, seCateIdInteger, title, author, shortContent, content, state, status, createTime, updateTime, pic);
				newsList.add(news);
			}
			return newsList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
