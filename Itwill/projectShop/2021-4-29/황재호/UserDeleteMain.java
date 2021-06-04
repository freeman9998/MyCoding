package com.itwill.user.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class UserDeleteMain {

	public static void main(String[] args) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend27";
		String password="javabackend27";
		
		String deleteSql="delete userid =" + user;
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int deleteid= stmt.executeUpdate(deleteSql);
		
		System.out.println("-" + deleteid + " = delete" + "-");

	}

}
