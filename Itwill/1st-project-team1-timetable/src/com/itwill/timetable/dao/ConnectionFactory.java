package com.itwill.timetable.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static String driverClass = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
	private static String user = "javabackend24";
	private static String password = "javabackend24";

	private ConnectionFactory() {

	}

	public static Connection getConnection() throws Exception {
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}

	public static Connection getConnection(String driverClass, String url, String user, String password)
			throws Exception {
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}

	public static void releaseConnection(Connection con) throws Exception {
		con.close();
	}

}