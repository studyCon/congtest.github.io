package com.xxx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xxx.dao.ComInfoDao;
import com.xxx.pojo.ComInfo;
import com.xxx.pojo.News;
import com.xxx.util.mysqlUtil;

public class ComInfoDaoImpl implements ComInfoDao{

	@Override
	public ComInfo findComInfo() {
		//sql语句
		String sql = "select * from web_info ";
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);		
			while (resultSet.next()) {
				String address = resultSet.getString("address");
				String tel = resultSet.getString("tel");
				String manager = resultSet.getString("manager");
				String email = resultSet.getString("email");
				String createTime = resultSet.getString("create_time");
				ComInfo comInfo = new ComInfo(address, tel, manager, email, createTime);
				return comInfo;
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(ComInfo comInfo) {
		//sql语句
		int num=0;
		String sql = "update web_info set address=?,tel=?,manager=?,email=? where id=1";
		//连接数据库
		try {
			Connection connection = mysqlUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, comInfo.getAddress());
			preparedStatement.setString(2, comInfo.getTel());
			preparedStatement.setString(3, comInfo.getManager());
			preparedStatement.setString(4, comInfo.getEmail());
			num = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

}
