package com.itwill.shop.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserUpdateMain {
	public static void main(String[] args) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		
		PreparedStatement pstmt=con.prepareStatement("update userinfo set userid=?,password=?,name=?,email=? where userid=?");
		pstmt.setString(1, "ee변경");
		pstmt.setString(2, "12345변경");
		pstmt.setString(3, "톤가좌변경");
		pstmt.setString(4, "ton2mangazua@naver.com변경");
		pstmt.setString(5, "dd");
		
		int insertRow=pstmt.executeUpdate();
		System.out.println(insertRow);
		
		
		
	}
}
