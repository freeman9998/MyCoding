package dao.address.third;
/*
Dao(Data Access Object)
 - Address들의 데이터를 저장하고있는 Address 테이블에
   CRUD(Create, Read, Update, Delete) 작업을 할수있는
   단위(???)메쏘드를 가지고있는 클래스
 - AddressService객체의 요청(메쏘드호출)을 받아서 
   Data Access(DB)에 관련된 단위기능(CRUD)을
   수행하는 객체
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import dao.address.fourth.Address;

public class AddressDao3 {
	/****************DB접속정보*************/
	private String driverClass="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
	private String user="javabackend99";
	private String password="javabackend99";
	
	public void deleteByNo(int no) throws Exception{
		String deleteSql="delete address where no="+no;
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int deleteRowCount = stmt.executeUpdate(deleteSql);
		System.out.println(">> "+deleteRowCount+" 행 delete");
		stmt.close();
		con.close();
	}
	/*
	public void insert(String id,String name,String phone,String address) throws Exception{
		String insertSql=
				"insert into address values(address_no_seq.nextval,'"+id+"','"+name+"','"+phone+"','"+address+"')";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement  stmt=con.createStatement();
				int rowCount=stmt.executeUpdate(insertSql);
		System.out.println(">> "+rowCount+" 행 insert");
		stmt.close();
		con.close();
	}
	*/
	public void insert(Address address) throws Exception{
		String insertSql=
				"insert into address values(address_no_seq.nextval,'"
											+address.getId()+"','"
											+address.getName()+"','"
											+address.getPhone()+"','"
											+address.getAddress()+"')";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement  stmt=con.createStatement();
				int rowCount=stmt.executeUpdate(insertSql);
		System.out.println(">> "+rowCount+" 행 insert");
		stmt.close();
		con.close();
	}
	
	
	public ArrayList<Address> selectAll() throws Exception{
		ArrayList<Address> addressList=new ArrayList<Address>();
		String selectSql = "select no,id,name,phone,address from address";
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSql);
		while(rs.next()) {
			int no=rs.getInt("no");
			String id=rs.getString("id");
			String name=rs.getString("name");
			String phone=rs.getString("phone");
			String address=rs.getString("address");
			addressList.add(new Address(no, id, name, phone, address));
		}
		rs.close();
		stmt.close();
		con.close();
		
		return addressList;
	}
	public Address selectByNo(int no)throws Exception{
		String selectSql = "select no,id,name,phone,address from address where no="+no;
		Address findAddress=null;
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSql);
		if(rs.next()) {
			String id=rs.getString("id");
			String name=rs.getString("name");
			String phone=rs.getString("phone");
			String address=rs.getString("address");
			findAddress=new Address(no, id, name, phone, address);
		}
		rs.close();
		stmt.close();
		con.close();
		return findAddress;
	}
	/*
	public void updateByNo(int no,String id,String name,String phone,String address) throws Exception{
		String updateSql="update address set id='"+id+"',name='"+name+"',phone='"+phone+"',address='"+address+"' where no ="+no;
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int updateRowCount = stmt.executeUpdate(updateSql);//자동 commit
		System.out.println(">> "+updateRowCount+" 행 update");
		stmt.close();
		con.close();
	}
	*/
	public void updateByNo(Address address) throws Exception{
		String updateSql="update address set id='"+
							address.getId()+"',name='"+
							address.getName()+"',phone='"+
							address.getPhone()+"',address='"+
							address.getAddress()+"' where no ="+
							address.getNo();
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int updateRowCount = stmt.executeUpdate(updateSql);//자동 commit
		System.out.println(">> "+updateRowCount+" 행 update");
		stmt.close();
		con.close();
	}
}
