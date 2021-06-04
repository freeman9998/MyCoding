package com.itwill.shop.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDao {
	
	
	public Product productSelectOne(int p_no) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javabackend17";
		String password = "javabackend17";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);

		PreparedStatement pstmt = con
				.prepareStatement("select p_no,p_name,p_price,p_image,p_desc,p_click_count from product where p_no=?");

		pstmt.setInt(1, p_no);
		System.out.println("---");
		Product selectProduct=null;
		
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			selectProduct=new Product(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6));
		}
		rs.close();
		pstmt.close();
		con.close();
		return selectProduct;
	}
	
	
	public ArrayList<Product> productSelectMany() throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,user,password);
		
		PreparedStatement pstmt=con.prepareStatement("select p_no,p_name,p_price,p_image,p_desc,p_click_count from product");
		
		ResultSet rs=pstmt.executeQuery();
		
		ArrayList<Product> productList=new ArrayList<Product>();
		
		while(rs.next()) {
			productList.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6)));
		}

		rs.close();
		pstmt.close();
		con.close();
		
		return productList;
		
	}

}
