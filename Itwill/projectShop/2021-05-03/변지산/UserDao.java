package com.itwill.shop.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {
	public void insertUser(String id , String pw, String name, String email) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		
		String UserInsertSql="insert into userinfo(userid, password, name, email) values('"+id+"','"+pw+"','"+name+"','"+email+"')";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(UserInsertSql);
		
		
		System.out.println(">>" + rowCount + " insert");
		
		stmt.close();
		con.close();
	}
	
	public void updateUser(String id, String pw, String name, String email) throws Exception{
		
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		
		String UserUpdateSql = "update userinfo set userid='"+id+"', password='"+pw+"',name='"+name+"',email='"+email+"' where userid='"+id+"'";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(UserUpdateSql);
		
		System.out.println(">> " + rowCount + " update");
		stmt.close();
		con.close();
		
	}
	
	public void deleteUser(String id) throws Exception{
		
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		
		String userDeleteSql = "delete from userinfo where userid='"+id+"'";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(userDeleteSql);
		
		System.out.println(">> " + rowCount + " delete");
		stmt.close();
		con.close();
		
	}
	
	public void findOneUser(String id) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		
		String selectUserinfoSql = "select userid, password, name, email from userinfo where userid = '"+id+"'";
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
	
	public void findAllUser() throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		
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
}
