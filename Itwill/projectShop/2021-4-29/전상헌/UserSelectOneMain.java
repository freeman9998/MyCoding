package com.itwill.shop.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserSelectOneMain {
	
	public static void main(String[] args) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		
		PreparedStatement pstmt=con.prepareStatement("select p_no,p_name,p_price,p_image,p_desc,p_click_count from product where p_no=?");
		pstmt.setString(1, "1");
		ResultSet rs=pstmt.executeQuery();
		
		if(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getString(4)+"\t");
			System.out.print(rs.getString(5)+"\t");
			System.out.print(rs.getInt(6)+"\t");
			System.out.println("");
			System.out.println("---------------");
		}
		
		
		
	}
}
