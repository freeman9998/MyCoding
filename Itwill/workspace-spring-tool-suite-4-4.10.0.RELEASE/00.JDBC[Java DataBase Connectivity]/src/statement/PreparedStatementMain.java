package statement;
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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
<<PreparedStatement>>
1. sql문작성
    - ?(파라메타) 를 사용해서 나중에 외부에서 데이타(리터럴)를 받을수있게한다.
      ex> insert into emp(empno,ename,job,manager,hiredate,sal,comm,deptno) values(?,?,?,?,?,?,?,?)	
    - 테이블이름,컬럼이름등은 ? 를 사용해서 외부에서 입력받을수없다.
      ex> select * from ? 
          select ?,? from emp    
2. PreparedStatement 객체생성시 인자로 sql문을 넣어서생성한다
   ex> PreparedStatement pstmt = con.prepareStatement(sql);
3. 생성된 PreparedStatement 객체에 파라메타를 setting 한다
    - sql 좌측 ? 부터 1,2,3...
   ex> 	pstmt.setInt(1,1234);              
 	   	pstmt.setString(2,'KIM');              
   		pstmt.setString(3,'MANAGER');              
  		pstmt.setInt(4,7839);              
   		pstmt.setDate(5,new Date());              
   		pstmt.setDouble(6,1000.12);              
   		pstmt.setInt(7,0);              
   		pstmt.setInt(8,10);              
 4.  실행
    - 실행시 sql문을 인자로 넣지안는다.
    ex> pstmt.executeUpdate();         
        pstmt.executeQuery();         
*/
public class PreparedStatementMain {

	public static void main(String[] args) throws Exception{
		/***************DB접속정보**************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend0";
		String password="javabackend0";
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		
		System.out.println("--------insert(PreparedStatement)------");
		String insertSql1="insert into emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(?,?,?,?,?,?,?,?)";
		/*
		PreparedStatement pstmt = con.prepareStatement(insertSql1);
		pstmt.setInt(1, 1234);
		pstmt.setString(2, "ALICE");
		pstmt.setString(3, "CLERK");
		pstmt.setInt(4, 7369);
		pstmt.setDate(5, new Date(System.currentTimeMillis()));
		pstmt.setDouble(6, 8000.89);
		pstmt.setDouble(7, 0);
		pstmt.setInt(8, 10);
		int rowCount = pstmt.executeUpdate();
		System.out.println(rowCount+" 행 insert...");
		*/
		String insertSql2="insert into emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(?,?,?,?,sysdate,?,?,?)";
		/*
		PreparedStatement pstmt = con.prepareStatement(insertSql2);
		pstmt.setInt(1, 9000);
		pstmt.setString(2, "TOM");
		pstmt.setString(3, "SALESMAN");
		pstmt.setInt(4, 7369);
		pstmt.setDouble(5, 7878.89);
		pstmt.setNull(6, Types.DOUBLE);
		pstmt.setNull(7,Types.INTEGER);
		int rowCount = pstmt.executeUpdate();
		System.out.println(rowCount+" 행 insert...");
		*/
		String insertSql3="insert into emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(?,?,?,?,to_date(?,?),?,?,?)";
		/*
		PreparedStatement pstmt = con.prepareStatement(insertSql3);
		pstmt.setInt(1, 9001);
		pstmt.setString(2, "UNCLETOM");
		pstmt.setString(3, "MANAGER");
		pstmt.setInt(4, 7369);
		pstmt.setString(5, "2000/02/12");
		pstmt.setString(6, "YYYY/MM/DD");
		pstmt.setDouble(7, 30000);
		pstmt.setDouble(8, 200);
		pstmt.setInt(9, 30);
		int rowCount = pstmt.executeUpdate();
		System.out.println(rowCount+" 행 insert...");
		*/
		String insertSql4="insert into emp values(?,?,?,?,?,?,?,?)";
		/*
		PreparedStatement pstmt = con.prepareStatement(insertSql4);
		pstmt.setInt(1, 9002);
		pstmt.setString(2, "GUARD");
		pstmt.setString(3, "OPERATOR");
		pstmt.setInt(4, 7369);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		java.util.Date hireDate =  sdf.parse("2020/12/25");
		pstmt.setDate(5,new java.sql.Date(hireDate.getTime()));
		pstmt.setDouble(6, 9000);
		pstmt.setDouble(7, 999);
		pstmt.setInt(8, 30);
		int rowCount = pstmt.executeUpdate();
		System.out.println(rowCount+" 행 insert...");
		*/
		
		
		int startSal=1000;
		int endSal=2000;
		String job="CLERK";
		
		System.out.println("------------select(Statement)-----------");
		String selectSql1="select * from emp where sal>= "+startSal+" and sal<= "+endSal+" and job='"+job+"'";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSql1);
		while (rs.next()) {
			int empno=rs.getInt("empno");
			String ename=rs.getString("ename");
			String jobs=rs.getString("job");
			double sal=rs.getDouble("sal");
			System.out.println(empno+"\t"+ename+"\t"+jobs+"\t"+sal);
		}
		rs.close();
		stmt.close();
		
		System.out.println("------------select(PreparedStatement)-----------");
		String selectSql2="select * from emp where sal>=? and sal<=? and job=?";
		PreparedStatement pstmt = con.prepareStatement(selectSql2);
		
		System.out.println("-------반복1--------");
		startSal=100;
		endSal=2000;
		job="CLERK";
		pstmt.setInt(1, startSal);
		pstmt.setInt(2, endSal);
		pstmt.setString(3, job);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			int empno=rs.getInt("empno");
			String ename=rs.getString("ename");
			String jobs=rs.getString("job");
			double sal=rs.getDouble("sal");
			System.out.println(empno+"\t"+ename+"\t"+jobs+"\t"+sal);
		}
		rs.close();
		System.out.println("-------반복2--------");
		startSal=1000;
		endSal=5000;
		job="SALESMAN";
		pstmt.setInt(1, startSal);
		pstmt.setInt(2, endSal);
		pstmt.setString(3, job);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			int empno=rs.getInt("empno");
			String ename=rs.getString("ename");
			String jobs=rs.getString("job");
			double sal=rs.getDouble("sal");
			System.out.println(empno+"\t"+ename+"\t"+jobs+"\t"+sal);
		}
	}

}













