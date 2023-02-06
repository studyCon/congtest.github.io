package com.xxx.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class mysqlUtil {
	private static final String DRIVER;
	private static final String URL;
	private static final String USERNAME;
	private static final String PASSWORD;
	
	
	static {
		Properties p = new Properties();
		InputStream in = mysqlUtil.class.getResourceAsStream("/mysqlConnect.properties");
						//获取类路径下某个资源的流信息 路径必须以/开头
		try {
			p.load(in);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		DRIVER = p.getProperty("driverClassName");
		URL = p.getProperty("url");
		USERNAME = p.getProperty("username");
		PASSWORD = p.getProperty("password");
				
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//获取连接
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		return conn;
	}
	
	//关闭连接
	public static void close(ResultSet rs,Statement sta,Connection conn) throws SQLException {	
		if(rs!=null) {
			rs.close();
		}
		if(sta!=null) {
			sta.close();
		}
		if(conn!=null) {
			conn.close();
		}
	}
}
