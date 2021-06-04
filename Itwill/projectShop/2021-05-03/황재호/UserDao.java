package com.itwill.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.tomcat.dbcp.dbcp2.ConnectionFactory;

public class UserDao {
	
	

	public void insert(String id ,int pw ,String name,String email) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend27";
		String password="javabackend27";
		
		String insertSql="insert into userinfo(userid,password,name,email) values('jenyo','7673','황재호','Hjenyo7673@gmail.com')";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int insertid= stmt.executeUpdate(insertSql);
		
		System.out.println("-" + insertid + " = insert" + "-");

	}
	public void delete(String userid) throws Exception {
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
	
	public void selectAll() throws Exception{
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
	public void selectOne(String userid) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend27";
		String password="javabackend27";
		
		String selectUserinfoSql ="select userid,password,name,email from userinfo where userid='jenyo'";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs= stmt.executeQuery(selectUserinfoSql);
		while(rs.next()) {
			String userid1 = rs.getString("userid");
			String pw = rs.getString("password");
			String name = rs.getString("name");
			String email = rs.getString("email");
		}
		rs.close();
		stmt.close();
		con.close();
	}
	public void update(String setid ,int i ,String name,String email,String userid) throws Exception{
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
