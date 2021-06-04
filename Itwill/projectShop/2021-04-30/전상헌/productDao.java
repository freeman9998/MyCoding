package com.itwill.shop.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class productDao {
	
	
	public void productSelectOne(String userid) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javabackend17";
		String password = "javabackend17";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);

		PreparedStatement pstmt = con
				.prepareStatement("select userid,password,name,email from userinfo where userid=?");

		pstmt.setString(1, userid);
		System.out.println("---");
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			System.out.print(rs.getString(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getString(4));
		}
	}
	
	
	public void productSelectMany() throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		
		PreparedStatement pstmt=con.prepareStatement("select userid,password,name,email from userinfo");
		
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getString(4));
			System.out.println("");
			System.out.println("---------------");
		}
		
	}

}
