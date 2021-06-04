package com.itwill.shop.jumun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JumunDao {
	public int add(String j_dsec,int j_price,String userid) throws Exception {
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		/***************************************/ 
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt=con.prepareStatement("insert into jumun VALUES (jumun_j_no_SEQ.nextval,?,SYSDATE,?,?)");
		pstmt.setString(1, j_dsec);
		pstmt.setInt(2, j_price);
		pstmt.setString(3, userid);
		
		int insertRowCount=pstmt.executeUpdate();

		pstmt.close();
		con.close();
		
		
		return insertRowCount;
		
		
	}
	public int delete(int j_no) throws Exception {
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		/***************************************/ 
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt=con.prepareStatement("delete from jumun where j_no=?");
		pstmt.setInt(1, j_no);
		
		
		int deleteRowCount=pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return deleteRowCount;
		
		
	}
	public int allDelete(String  userid) throws Exception {
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		/***************************************/ 
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt=con.prepareStatement("delete from jumun where userid=?");
		pstmt.setString(1, userid);
		
		
		int deleteRowCount=pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return deleteRowCount;
		
		
	}
	public List<Jumun> selectById(String  userid) throws Exception {
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		/***************************************/ 
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt=con.prepareStatement("select * from jumun where userid=?");
		pstmt.setString(1, userid);
		
		
		ResultSet rs=pstmt.executeQuery();
		List<Jumun> jumunList=new ArrayList<Jumun>();
		while(rs.next()) {
			jumunList.add(new Jumun(rs.getInt(1), rs.getString(2),rs.getDate(3), rs.getInt(4), rs.getString(5)));

		}
		pstmt.close();
		con.close();
		return jumunList;
		
		
	}
	public Jumun selectByNo(int  j_no) throws Exception {
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		/***************************************/ 
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt=con.prepareStatement("select * from jumun where j_no=?");
		pstmt.setInt(1, j_no);
		
		
		ResultSet rs=pstmt.executeQuery();
		Jumun jumun = null;
		if(rs.next()) {
			jumun=new Jumun(rs.getInt(1), rs.getString(2),rs.getDate(3), rs.getInt(4), rs.getString(5));

		}
		pstmt.close();
		con.close();
		return jumun;
		
		
	}
	

}
