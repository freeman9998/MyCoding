package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressUpdateByNoMain {

	public static void main(String[] args) throws Exception {
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend99";
		String password="javabackend99";
		/***************************************/
		String updateSql="update address set id='yyyy',name='김경숙',phone='899-9999',address='LA' where no = 1";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		//con.setAutoCommit(true);
		Statement stmt=con.createStatement();
		int updateRowCount = stmt.executeUpdate(updateSql);//자동 commit
		System.out.println(">> "+updateRowCount+" 행 update");
		stmt.close();
		con.close();
	}

}
