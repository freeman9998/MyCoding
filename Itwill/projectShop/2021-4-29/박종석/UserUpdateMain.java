package com.itwill.shop.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserUpdateMain {

	public static void main(String[] args)  throws Exception{
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String updateSql="update userinfo set userid='jong77', password='7777',name='김종석7',email='jong7@gmail.com' where userid='jong3'";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int rowCount = stmt.executeUpdate(updateSql);
		
		System.out.println(">> " + rowCount + " update");
		stmt.close();
		con.close();
		
	}

}