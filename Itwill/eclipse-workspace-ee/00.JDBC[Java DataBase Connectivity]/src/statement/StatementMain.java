package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
이름       널?       유형           
-------- -------- ------------ 
EMPNO    NOT NULL NUMBER(4)    
ENAME             VARCHAR2(10) 
JOB               VARCHAR2(9)  
MGR               NUMBER(4)    
HIREDATE          DATE         
SAL               NUMBER(7,2)  
COMM              NUMBER(7,2)  
DEPTNO            NUMBER(2)   
 */

public class StatementMain {

	public static void main(String[] args) throws Exception{
		/***************DB접속정보**************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend0";
		String password="javabackend0";
		
		String selectSql="select * from emp order by sal desc";
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		/*
		 * ResultSet의 행의수제한
		 */
		stmt.setMaxRows(5);
		
		ResultSet rs=stmt.executeQuery(selectSql);
		while(rs.next()) {
			System.out.println(rs.getInt("empno")+"\t"+
							   rs.getString("ename")+"\t"+
							   rs.getString("job")+"\t\t"+
							   rs.getDouble("sal")+"\t"+
							   rs.getDate("hiredate"));
		}
		
		rs.close();
		/*
		 insert into emp values(9995,'KIM','MANAGER',null,to_date('2020/05/20','YYYY/MM/DD'),6000,null,40)
		 update emp set sal=6788.98 where empno>=7369 and empno<=7600;
		 delete emp where empno=7844;
		 */
		String insertSql="insert into emp values(9995,'KIM','MANAGER',null,to_date('2020/05/20','YYYY/MM/DD'),6000,null,40)";
		String updateSql="update emp set sal=6788.98 where empno>=7369 and empno<=7600";
		String deleteSql="delete emp where empno=9995";
		
		int rowCount=stmt.executeUpdate(insertSql);
		System.out.println(rowCount+" 행 insert");
		rowCount=stmt.executeUpdate(updateSql);
		System.out.println(rowCount+" 행 update");
		rowCount=stmt.executeUpdate(deleteSql);
		System.out.println(rowCount+" 행 delete");
		
		stmt.close();
		con.close();
		
	}

}














