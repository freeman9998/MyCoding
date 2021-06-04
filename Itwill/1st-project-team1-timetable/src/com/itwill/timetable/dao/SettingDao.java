package com.itwill.timetable.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SettingDao {

	public int create(String string) throws Exception {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(SettingSQL.SETTING_INSERT);
		pstmt.setString(1, string);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}

	public int update(String string) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(SettingSQL.SETTING_UPDATE);
		pstmt.setString(1, string);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}

	public String getTime24() throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(SettingSQL.SETTING_SELECT);
		ResultSet rs = pstmt.executeQuery();
		String str = rs.getString("Time24");
		return str;

	}

}
