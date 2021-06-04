package com.itwill.shop.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
	
	public int insert(String id ,String pw ,String name,String email) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		
		PreparedStatement pstmt=con.prepareStatement("insert into userinfo values(?,?,?,?)");
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		pstmt.setString(3, name);
		pstmt.setString(4, email);
		
		int insertRow=pstmt.executeUpdate();
		System.out.println(insertRow);
		
		return insertRow;
		
	}
	public int delete(String userid) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		
		PreparedStatement pstmt=con.prepareStatement("delete from userinfo  where userid=?");
		pstmt.setString(1, userid);
		int deleteRow=pstmt.executeUpdate();
		
		System.out.println(deleteRow);
		
		return deleteRow;
	}
	
	public void selectAll() throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		
		PreparedStatement pstmt=con.prepareStatement("select userid,password,name,email from userinfo");
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getString(4)+"\t");
			System.out.println("");
			System.out.println("---------------");
		}
		
		
	}
	public void selectOne(String userid) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		
		PreparedStatement pstmt=con.prepareStatement("select userid,password,name,email from userinfo where userid=?");
		pstmt.setString(1, userid);
		ResultSet rs=pstmt.executeQuery();
		
		if(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getString(4)+"\t");
			System.out.print(rs.getString(5)+"\t");
			System.out.print(rs.getInt(6)+"\t");
			System.out.println("");
			System.out.println("---------------");
		}
		
		
		
	}
	public void update(String setid ,String pw ,String name,String email,String userid) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		
		PreparedStatement pstmt=con.prepareStatement("update userinfo set userid=?,password=?,name=?,email=? where userid=?");
		pstmt.setString(1, setid);
		pstmt.setString(2, pw);
		pstmt.setString(3, name);
		pstmt.setString(4, email);
		pstmt.setString(5, userid);
		
		int insertRow=pstmt.executeUpdate();
		System.out.println(insertRow);
		
		
		
	}
		


}
