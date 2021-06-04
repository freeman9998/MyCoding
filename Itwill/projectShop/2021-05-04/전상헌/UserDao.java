package com.itwill.shop.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDao {
	
	public int insert(User insertUser) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		
		PreparedStatement pstmt=con.prepareStatement("insert into userinfo values(?,?,?,?)");
		pstmt.setString(1, insertUser.getUserid());
		pstmt.setString(2, insertUser.getPassword());
		pstmt.setString(3, insertUser.getName());
		pstmt.setString(4, insertUser.getEmail());
		
		int insertRow=pstmt.executeUpdate();
	

		pstmt.close();
		con.close();
		
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
		

	
		pstmt.close();
		con.close();
		
		return deleteRow;
	}
	
	public ArrayList<User> selectAll() throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		ArrayList<User> userList=new ArrayList<User>();
		
		PreparedStatement pstmt=con.prepareStatement("select userid,password,name,email from userinfo");
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			userList.add(new User(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4)));
		}

		rs.close();
		pstmt.close();
		con.close();
		
		return userList;
		
	}
	public User selectOne(String userid) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		
		PreparedStatement pstmt=con.prepareStatement("select userid,password,name,email from userinfo where userid=?");
		pstmt.setString(1, userid);
		ResultSet rs=pstmt.executeQuery();
		User seletUser=null;
		
		if(rs.next()) {
		  seletUser=new User(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4));
		}

		rs.close();
		pstmt.close();
		con.close();
		
		return seletUser;
	}
	public int update(User updateUser,String userid) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		
		PreparedStatement pstmt=con.prepareStatement("update userinfo set userid=?,password=?,name=?,email=? where userid=?");
		pstmt.setString(1, updateUser.getUserid());
		pstmt.setString(2, updateUser.getPassword());
		pstmt.setString(3, updateUser.getName());
		pstmt.setString(4, updateUser.getEmail());
		pstmt.setString(5, userid);
		
		int insertRow=pstmt.executeUpdate();

		pstmt.close();
		con.close();
		
		return insertRow;
		
		
	}
		


}
