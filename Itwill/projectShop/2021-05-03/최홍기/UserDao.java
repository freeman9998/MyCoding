package com.itwill.shop.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {
	
	public void selectUserById(String userId) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javabackend92";
		String password = "javabackend92";
		
		String selectSql = "select * from userinfo where userid = '"+userId+"'";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);
		
		while(rs.next()) {
			String userid = rs.getString("userid");
			String pass = rs.getString("password");
			String name = rs.getString("name");
			String email = rs.getString("email");
			System.out.println(userid + "\t" + pass + "\t" + name + "\t" + email);
		}
		
		rs.close();
		stmt.close();
		con.close();
	}
	
	public void insertUser(String userId, String userPassword, String userName, String userEmail) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javabackend92";
		String password = "javabackend92";
		
		String insertSql =
				"insert into userinfo values('"+userId+"','"+userPassword+"','"+userName+"','"+userEmail+"')";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		
		int rowCount = st.executeUpdate(insertSql);
		System.out.println(rowCount + "행 insert");
		
		st.close();
		con.close();
	}
	
	public void updateUser(String userId, String userPassword, String userName, String userEmail) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javabackend92";
		String password = "javabackend92";
		
		String updateSql =
				"update userinfo set password = '"+userPassword+"', name = '"+userName+"', email = '"+userEmail+"' where userid = '"+userId+"'";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();

		int updateRowCount = st.executeUpdate(updateSql);
		System.out.println(updateRowCount + "행 update");
		
		st.close();
		con.close();
	}
	
	public void deleteUser(String id) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javabackend92";
		String password = "javabackend92";
		
		String deleteSql =
				"delete userinfo where userid = '"+id+"'";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		
		int deleteRowCount = st.executeUpdate(deleteSql);
		System.out.println(deleteRowCount + "행 delete");
		
		st.close();
		con.close();
	}
}
