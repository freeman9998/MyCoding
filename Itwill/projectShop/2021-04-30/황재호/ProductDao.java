package com.itwill.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductDao {
	public void selectProductOne(int i) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend27";
		String password="javabackend27";
		
		UserDao userDao = null;
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement pstmt = con.prepareStatement("select p_no, p_name, p_price, p_image, p_desc, p_click_count from product where p_no=1");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int p_no = rs.getInt("p_no");
			String p_name = rs.getString("p_name");
			int p_price = rs.getInt("p_price");
			String p_image = rs.getString("p_image");
			String p_desc = rs.getString("p_desc");
			String p_click_count = rs.getString("p_click_count");
			}
		rs.close();
		pstmt.close();
		con.close();
		}
	
	public void selectProductMany() throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend27";
		String password="javabackend27";
		
		UserDao userDao = null;
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement pstmt = con.prepareStatement("select p_no, p_name, p_price, p_image, p_desc, p_click_count from product");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int p_no = rs.getInt("p_no");
			String p_name = rs.getString("p_name");
			int p_price = rs.getInt("p_price");
			String p_image = rs.getString("p_image");
			String p_desc = rs.getString("p_desc");
			String p_click_count = rs.getString("p_click_count");
			}
		rs.close();
		pstmt.close();
		con.close();
		}

}
