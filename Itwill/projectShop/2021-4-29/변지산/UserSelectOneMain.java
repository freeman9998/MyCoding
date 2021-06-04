package com.itwill.shop.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserSelectOneMain {

	public static void main(String[] args) throws Exception {
		
		
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		
		String selectUserinfoSql = "select userid, password, name, email from userinfo where userid = 'kim01'";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs= stmt.executeQuery(selectUserinfoSql);
		while(rs.next()) {
			String userid = rs.getString("userid");
			String pw = rs.getString("password");
			String name = rs.getString("name");
			String email = rs.getString("email");
			System.out.println(userid +"\t"+ pw + "\t" + name + "\t" + email);
			
			
			
		}
		rs.close();
		stmt.close();
		con.close();
		
	}

}
