package com.itwill.shop.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductDao {
	public void FindOneProduct() throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		
		String selectProOneSql="select p_no, p_name, p_price, p_image, p_desc, p_click_count from product where p_no = 3";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectProOneSql);
		while(rs.next()) {
			int p_no = rs.getInt("p_no");
			String p_name = rs.getString("p_name");
			int p_price = rs.getInt("p_price");
			String p_img = rs.getString("p_image");
			String p_desc = rs.getString("p_desc");
			int p_count = rs.getInt("p_click_count");
			
			System.out.println(p_no + "\t" + p_name + "\t" + p_price + "\t" + p_img + "\t" + p_desc + "\t" + p_count);
		}
		rs.close();
		stmt.close();
		con.close();

	}
	
	public void FindAllProduct() throws Exception{
		
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		
		String selectProAllSql = "select p_no, p_name, p_price, p_image, p_desc, p_click_count from product";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectProAllSql);
		while(rs.next()) {
			int p_no = rs.getInt("p_no");
			String p_name = rs.getString("p_name");
			int p_price = rs.getInt("p_price");
			String p_img = rs.getString("p_image");
			String p_desc = rs.getString("p_desc");
			int p_count = rs.getInt("p_click_count");
			
			System.out.println(p_no + "\t" + p_name + "\t" + p_price + "\t" + p_img + "\t" + p_desc + "\t" + p_count);
		}
		rs.close();
		stmt.close();
		con.close();
		
	}
}
