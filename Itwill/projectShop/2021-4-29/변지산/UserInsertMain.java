package com.itwill.shop.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserInsertMain {

	public static void main(String[] args) throws Exception {

		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		
		String UserInsertSql="insert into userinfo(userid, password, name, email) values('four29','0429','김사월','kim0429@gmail.com')";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(UserInsertSql);
		
		
		System.out.println(">>" + rowCount + " insert");
		
		stmt.close();
		con.close();
	}

}
