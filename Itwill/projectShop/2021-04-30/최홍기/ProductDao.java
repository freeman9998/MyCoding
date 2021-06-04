package com.itwill.shop.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductDao {
	
	public void selectProductByNo() throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javabackend92";
		String password = "javabackend92";
		
		String selectSql = "select * from product where p_no = 1";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);
		
		while(rs.next()) {
			int p_no = rs.getInt("p_no");
			String p_name = rs.getString("p_name");
			int p_price = rs.getInt("p_price");
			String p_image = rs.getString("p_image");
			String p_desc = rs.getString("p_desc");
			String p_click_count = rs.getString("p_click_count");
			System.out.println(p_no + "\t" + p_name + "\t" + p_price + "\t" + p_image + "\t" + p_desc + "\t" + p_click_count);
		}
		
		rs.close();
		stmt.close();
		con.close();
	}
	
	public void selectProductAll() throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javabackend92";
		String password = "javabackend92";
		
		String selectSql = "select * from product";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);
		
		while(rs.next()) {
			int p_no = rs.getInt("p_no");
			String p_name = rs.getString("p_name");
			int p_price = rs.getInt("p_price");
			String p_image = rs.getString("p_image");
			String p_desc = rs.getString("p_desc");
			String p_click_count = rs.getString("p_click_count");
			System.out.println(p_no + "\t" + p_name + "\t" + p_price + "\t" + p_image + "\t" + p_desc + "\t" + p_click_count);
		}
		
		rs.close();
		stmt.close();
		con.close();
	}
	
}
