package com.itwill.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.tomcat.dbcp.dbcp2.ConnectionFactory;

public class UserDao {
	
	

	public int insertId(String id ,int pw ,String name,String email) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend27";
		String password="javabackend27";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement pstmt = con.prepareStatement("insert into userinfo values(?,?,?,?)");
		pstmt.setString(1, id);
		pstmt.setInt(2, pw);
		pstmt.setString(3, name);
		pstmt.setString(4, email);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public void selectId(String select_id) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend27";
		String password="javabackend27";
		
		UserDao userDao = null;
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement pstmt = con.prepareStatement("select userid,password,name,email from userinfo");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String userid = rs.getString("userid");
			String pass = rs.getString("password");
			String name = rs.getString("name");
			String email = rs.getString("email");
			
			}
		rs.close();
		pstmt.close();
		con.close();
		}
	
	public int updatId(String setid ,int pw ,String name,String email,String id) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend27";
		String password="javabackend27";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement pstmt = con.prepareStatement("update userinfo set id=?,password=?,name=?,email=? where id=?");
		pstmt.setString(1,setid);
		pstmt.setInt(2,pw);
		pstmt.setString(3,name);
		pstmt.setString(4,email);
		pstmt.setString(5,id);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int deleteId(String user_id) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend27";
		String password="javabackend27";
	
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement pstmt = con.prepareStatement("delete from userinfo  where user_id=?");
		pstmt.setString(1, user_id);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
}
