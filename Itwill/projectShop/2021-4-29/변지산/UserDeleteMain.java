package com.itwill.shop.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserDeleteMain {

	public static void main(String[] args) throws Exception {

		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		
		String userDeleteSql = "delete from userinfo where userid='kim01'";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(userDeleteSql);
		
		System.out.println(">> " + rowCount + " delete");
		stmt.close();
		con.close();
	}

}
