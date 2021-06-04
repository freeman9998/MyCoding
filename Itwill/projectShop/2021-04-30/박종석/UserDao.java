package com.itwill.shop.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {

	public void SelectOneMain()throws Exception{
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String selectOneSql="select userid,password,name,email from userinfo where userid='jong1'";
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
		rs.close();
		stmt.close();
		con.close();
				
	}
	public void selectManyMain()throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		
		String selectAllSql = "select userid, password, name, email from userinfo";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectAllSql);
		while(rs.next()) {
			String userid = rs.getString("userid");
			String ps = rs.getString("password");
			String name = rs.getString("name");
			String email = rs.getString("email");
			System.out.println(userid + "\t" + ps + "\t" + name + "\t" + email);
			
		}
		rs.close();
		stmt.close();
		con.close();
				
	}
	public void DeleteMain()throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String deleteSql="delete from userinfo where userid='jong4'";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(deleteSql);
		
		System.out.println(rowCount+"delete");
		stmt.close();
		con.close();
	}
	public void InsertMain()throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String insertSql="insert into userinfo values('jong4','4444','박종석4','jong4@korea.com')";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(insertSql);
		
		System.out.println(rowCount+"insert");
		stmt.close();
		con.close();
	}
	public void UpdateMain()throws Exception{
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