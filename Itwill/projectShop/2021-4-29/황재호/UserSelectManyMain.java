package com.itwill.user.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class UserSelectManyMain {

	public static void main(String[] args) throws Exception{
		
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend27";
		String password="javabackend27";
		
		String selectOneSql="select userid,password,name,email from userinfo where userid='jenyo'";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery(selectOneSql);
		while(rs.next()) {
			String userid = rs.getString("userid");
			String pass=rs.getString("password");
			String name=rs.getString("name");
			String email=rs.getString("email");
			System.out.println(userid+"\t"+pass+"\t"+name+"\t"+email);
		}
		con.close();

	}

}
