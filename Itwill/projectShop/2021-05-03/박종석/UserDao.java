package com.itwill.shop.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDao {

	public void selectOneMain(String no)throws Exception{
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String selectOneSql="select userid,password,name,email from userinfo where userid='"+no+"'";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery(selectOneSql);
		while(rs.next()) {
			String userid = rs.getString("userid");
			String ps=rs.getString("password");
			String name=rs.getString("name");
			String email=rs.getString("email");
			System.out.println(userid+"\t"+ps+"\t"+name+"\t"+email);
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
	public void deleteMain(String no)throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String deleteSql="delete from userinfo where userid='"+no+"'";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(deleteSql);
		
		System.out.println(rowCount+"delete");
		stmt.close();
		con.close();
	}
	public void insertMain(String id,String pw,String name,String e_mail)throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String insertSql="insert into userinfo values('"+id+"','"+pw+"','"+name+"','"+e_mail+"')";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(insertSql);
		
		System.out.println(rowCount+"insert");
		stmt.close();
		con.close();
	}
	public void updateMain(String id,String pw,String name,String e_mail)throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String updateSql="update userinfo set userid='"+id+"', password='"+pw+"',name='"+name+"',email='"+e_mail+"' where userid='"+id+"'";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int rowCount = stmt.executeUpdate(updateSql);
		
		System.out.println(">> " + rowCount + " update");
		stmt.close();
		con.close();
}
}