package com.itwill.shop.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

	public User selectOneUser(String no)throws Exception{
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
		User user1=null;
		while(rs.next()) {
			String userid = rs.getString("userid");
			String ps=rs.getString("password");
			String name=rs.getString("name");
			String email=rs.getString("email");
			//System.out.println(userid+"\t"+ps+"\t"+name+"\t"+email);
			user1=new User(userid, password, name, email);
		}
		rs.close();
		stmt.close();
		con.close();
		return user1;
		
				
	}
	public List<User> selectManyUser()throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		List<User> userList=new ArrayList<User>();
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
		return userList;
				
	}
	public int deleteMainUser(User id)throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String deleteSql="delete from userinfo where userid='"+id+"'";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(deleteSql);
		
		//System.out.println(rowCount+"delete");
		stmt.close();
		con.close();
		return rowCount;
	}
	public int insertMainUser(User insert)throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String insertSql="insert into userinfo values('"+insert.getUserid()+"','"+insert.getPassword()+"','"+insert.getName()+"','"+insert.getEmail()+"')";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int insertrowCount=stmt.executeUpdate(insertSql);
		
		//System.out.println(insertrowCount+"insert");
		stmt.close();
		con.close();
		return insertrowCount;
	}
	public int updateMainUser(User updateUser)throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/ 
		String updateSql="update userinfo set userid='"+updateUser.getUserid()+"', password='"+updateUser.getPassword()+"',name='"+updateUser.getName()+"',email='"+updateUser.getEmail()+"' where userid='"+updateUser.getUserid()+"'";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int updaterowCount = stmt.executeUpdate(updateSql);
		
		System.out.println(">> " + updaterowCount + " update");
		stmt.close();
		con.close();
		return updaterowCount;
}

}