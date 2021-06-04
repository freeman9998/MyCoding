package com.itwill.user.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ProductSelectManyMain {

	public static void main(String[] args) throws Exception{

		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend27";
		String password="javabackend27";

		String selectManySql = "select p_no,p_name,p_price,p_image,p_desc,p_click_count from product where p_no=1";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();

	}

}
