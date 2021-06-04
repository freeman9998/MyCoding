package com.itwill.user.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserUpdateMain {

	public static void main(String[] args) throws Exception{

		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend27";
		String password="javabackend27";

		String updateSql="";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int updateid= stmt.executeUpdate(updateSql);
		
		System.out.println("-" + updateid + " = update" + "-");

	}

}
