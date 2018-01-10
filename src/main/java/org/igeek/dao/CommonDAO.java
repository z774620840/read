package org.igeek.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.igeek.util.DataSourceUtil;

public class CommonDAO  {
	public List<Object> findByCondition(Class<?> clazz, String sql, Object...params) {
		// DataSource dataSource = DataSourceUtil.getDataSource();
		Connection conn = DataSourceUtil.getInstance().getConnection();
		List<Object> objList = new ArrayList<>();
		// QueryRunner run = new QueryRunner(dataSource);
		QueryRunner run = new QueryRunner();
		ResultSetHandler<List<Object>> handler = new BeanListHandler<>(clazz);
		try {
			if (params != null && params.length > 0) {
				objList = run.query(conn, sql, handler, params);
			} else {
				objList = run.query(conn, sql, handler);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return objList;
	}
	/**
	 * 
	 * @param sql
	 * @param params
	 * @return
	 * 查询基本类型 和字符串类型  
	 */
	public List<Object> findByBase(String sql, Object...params) {
		// DataSource dataSource = DataSourceUtil.getDataSource();
		Connection conn = DataSourceUtil.getInstance().getConnection();
		List<Object> objList = new ArrayList<Object>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			if (params != null) {
				for (int i = 1; i <= params.length; i++) {
					ps.setObject(i, params[i - 1]);
				}
			}
			rs = ps.executeQuery();
			while (rs.next()) {
				Object object=rs.getObject(1);
				objList.add(object);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DataSourceUtil.close(rs, ps, conn);
		}
		return objList;
	}

	public int findTotal(String sql, Object...params) {
		Connection conn = DataSourceUtil.getInstance().getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		int total = 0;
		try {
			ps = conn.prepareStatement(sql);
			if (params != null) {
				for (int i = 1; i <= params.length; i++) {
					ps.setObject(i, params[i - 1]);
				}
			}
			rs = ps.executeQuery();
			while (rs.next()) {
				total = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DataSourceUtil.close(rs, ps, conn);
		}
		return total;
	}
	public int updateDataBase(String sql, Object... params) {
		Connection conn = DataSourceUtil.getInstance().getConnection();
		QueryRunner run = new QueryRunner();
		int row = 0;
		try {
			row = run.update(conn, sql, params);
			DbUtils.commitAndCloseQuietly(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}
}
