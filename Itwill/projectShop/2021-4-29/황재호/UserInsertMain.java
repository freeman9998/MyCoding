package com.itwill.user.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class UserInsertMain {

	public static void main(String[] args) throws Exception{
		
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend27";
		String password="javabackend27";
		
		String insertSql="insert into userinfo(userid,password,name,email) values('jenyo','7673','황재호','jenyo7673@gmail.com')";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int insertid= stmt.executeUpdate(insertSql);
		
		System.out.println("-" + insertid + " = insert" + "-");

	}

}
