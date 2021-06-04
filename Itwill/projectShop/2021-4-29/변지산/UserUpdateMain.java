package com.itwill.shop.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserUpdateMain {

	public static void main(String[] args) throws Exception {

		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		
		String UserUpdateSql = "update userinfo set userid='four29', password='0529',name='김사월',email='kim0429@gmail.com' where userid='four29'";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(UserUpdateSql);
		
		System.out.println(">> " + rowCount + " update");
		stmt.close();
		con.close();
		
	}

}
