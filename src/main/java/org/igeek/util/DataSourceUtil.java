package org.igeek.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DataSourceUtil {
	private static DataSourceUtil instance;

	private DataSourceUtil() {

	}

	public static DataSourceUtil getInstance() {
		if (instance == null) {
			instance = new DataSourceUtil();
		}
		return instance;
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			//这里使用jndi来连接数据库，这里使用druid的连接池或�?�使用tomcat自带的dbcp连接  但是tomcat是多个项目共享一个连接池
			//druid是目前最稳定快的连接
			DataSource ds = (DataSource) new InitialContext().lookup("java:comp/env/jdbc/druid");
			conn = ds.getConnection();
		} catch (NamingException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		closeRes(rs);
		closeRes(stmt);
		closeRes(conn);
	}

	private static void closeRes(AutoCloseable ac) {
		if (ac != null) {
			try {
				ac.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			ac = null;
		}
	}
}
