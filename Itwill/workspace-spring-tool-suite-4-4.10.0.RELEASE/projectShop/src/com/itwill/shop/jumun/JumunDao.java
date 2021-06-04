package com.itwill.shop.jumun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.product.Product;

public class JumunDao {
	/*
	 * 주문전체리스트(특정사용자)
	 */
	public List<Jumun> list(String sUserId)throws Exception{
		/**************** DB접속정보 *************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javabackend99";
		String password = "javabackend99";
		/***************************************/
		List<Jumun> jumunList=new ArrayList<Jumun>();
		
		String selectManySql = "select * from jumun where userid='"+sUserId+"'";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectManySql);
		while (rs.next()) {
			jumunList.add(new Jumun(rs.getInt("j_no"), rs.getString("j_desc"), rs.getDate("j_date"), rs.getInt("j_price"),null,null));
		}
		con.close();
		return jumunList;
		
	}
	
	
}
