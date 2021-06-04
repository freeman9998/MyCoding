package com.itwill.shop.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDao {
	public User insertUser(User insertUser) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		
		String UserInsertSql="insert into userinfo(userid, password, name, email)"
				+ " values('"+insertUser.getUserid()+"','"+insertUser.getPassword()+"','"+insertUser.getName()+"','"+insertUser.getEmail()+"')";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(UserInsertSql);
		
		
		System.out.println(">>" + rowCount + " insert");
		
		stmt.close();
		con.close();
		return insertUser;
	}
	
	public User updateUser(User updateUser) throws Exception{
		
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		
		String UserUpdateSql = "update userinfo set "
						     + "userid='"+updateUser.getUserid()+"', password='"+updateUser.getPassword()+"',name='"+updateUser.getName()+"',"
							 + "email='"+updateUser.getEmail()+"' where userid='"+updateUser.getUserid()+"'";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(UserUpdateSql);
		
		System.out.println(">> " + rowCount + " update");
		stmt.close();
		con.close();
		return updateUser;
	}
	
	public String deleteUser(String id) throws Exception{
		
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
		return id;
	}
	
	public User selectUser(String id) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		
		User selectUser = null;
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
			//System.out.println(userid +"\t"+ pw + "\t" + name + "\t" + email);
			
			selectUser = new User(userid, pw, name, email);
			
		}
		rs.close();
		stmt.close();
		con.close();
		return selectUser;
	}
	
	public ArrayList<User> selectAllUser() throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		ArrayList<User> userList = new ArrayList<User>();
		String selectAllSql = "select userid, password, name, email from userinfo";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectAllSql);
		while(rs.next()) {
			String userid = rs.getString("userid");
			String pw = rs.getString("password");
			String name = rs.getString("name");
			String email = rs.getString("email");
			
			//System.out.println(userid + "\t" + ps + "\t" + name + "\t" + email);
			
			userList.add(new User(userid, pw, name, email));
			
		}
		rs.close();
		stmt.close();
		con.close();
		return userList;
	}
}
