package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressInsertMain {

	public static void main(String[] args)throws Exception {
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend99";
		String password="javabackend99";
		/***************************************/
		String insertSql=
				"insert into address values(address_no_seq.nextval,'guard','김경호','123-4568','경기도 성남시')";
		/*
		 1.Driver Class loading
		 2.Connection객체생성(DBServer에연결)[Socket생성]
		 3.Statement객체생성(SQL 전송객체)[Stream객체]
		 */
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement  stmt=con.createStatement();
		/*
		 * 4.Statement객체를 사용해 SQL문전송(DML)
		 */
		/*
		 <<java.sql.Statement>>
		  int executeUpdate(String sql) throws SQLException;
		  	Executes the given SQL statement, 
		  	which may be an INSERT, UPDATE, or DELETE statement or 
		  	an SQL statement that returns nothing, such as an SQL DDL statement.
		  	

			Parameters:
					sql - an SQL Data Manipulation Language (DML) statement, such as INSERT, UPDATE or DELETE; 
					  		or an SQL statement that returns nothing, such as a DDL statement.
			Returns:
					either (1) the row count for SQL Data Manipulation Language (DML) statements 
					or (2) 0 for SQL statements that return nothing
		 */
		int rowCount=stmt.executeUpdate(insertSql);
		System.out.println(">> "+rowCount+" 행 insert");
		stmt.close();
		con.close();
		
	}

}
















