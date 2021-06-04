package com.itwill.shop.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

	public List<Product> selectManyMain() throws Exception {
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/
		List<Product> productList=new ArrayList<Product>();
		String selectManySql = "select p_no,p_name,p_price,p_image,p_desc,p_click_count from product";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery(selectManySql);
		while(rs.next()) {
			String p_no = rs.getString("p_no");
			String p_name=rs.getString("p_name");
			String p_price=rs.getString("p_price");
			String p_image=rs.getString("p_image");
			String p_desc=rs.getString("p_desc");
			String p_click_count=rs.getString("p_click_count");
			System.out.println(p_no+"\t"+p_name+"\t"+p_price+"\t"+p_image+"\t"+p_desc+"\t"+p_click_count);
		}
		rs.close();
		stmt.close();
		con.close();
		return productList;
	}
	
	public Product selectOneMain(int p_No) throws Exception{
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend8";
		String password="javabackend8";
		/***************************************/
		String selectOneSql = "select p_no,p_name,p_price,p_image,p_desc,p_click_count from product where p_no='"+p_No+"'";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		ResultSet rs = stmt.executeQuery(selectOneSql);
		Product product=null;
			while(rs.next()) {				
			String p_no = rs.getString("p_no");
			String p_name=rs.getString("p_name");
			String p_price=rs.getString("p_price");
			String p_image=rs.getString("p_image");
			String p_desc=rs.getString("p_desc");
			String p_click_count=rs.getString("p_click_count");
			
			/*System.out.println(p_no+"\t"+p_name+"\t"+p_price+"\t"+p_image+"\t"+p_desc+"\t"+p_click_count);*/
			product=new Product(p_No, p_name, p_No, p_image, p_desc, p_No);
		
		}
		con.close();
		stmt.close();
		rs.close();
		return product;
		
	}

	}
		


