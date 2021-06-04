package com.itwill.shop.cart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.product.Product;
import com.itwill.shop.user.User;

public class CartDao {
	
	public int add(String userid,int p_no,int cart_qty) throws Exception {
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		/***************************************/ 
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt=con.prepareStatement("insert into cart values(CART_CART_NO_SEQ.nextval,?,?,?)");
		pstmt.setInt(1, cart_qty);
		pstmt.setString(2, userid);
		pstmt.setInt(3, p_no);
		
		int insertRowCount=pstmt.executeUpdate();

		pstmt.close();
		con.close();
		
		
		return insertRowCount;
		
		
	}
	public int update(String userid,int p_no,int cart_qty) throws Exception {
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		/***************************************/ 
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt=con.prepareStatement("update cart set cart_qty=cart_qty+? where p_no=? and userid=?");
		pstmt.setInt(1, cart_qty);
		pstmt.setInt(2, p_no);
		pstmt.setString(3, userid);
		int updateRow=pstmt.executeUpdate();
		
		
		pstmt.close();
		con.close();
		
		return updateRow;
		
		
		
	}
	public List<Cart> cartList(String sUserId) throws Exception{
		/**************** DB접속정보 *************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javabackend17";
		String password = "javabackend17";
		/***************************************/
		ArrayList<Cart> cartList=new ArrayList<Cart>();
		String selectManySql=
		"select * from cart c join product p on c.p_no=p.p_no join userinfo u on c.userid=u.userid  where u.userid='"+sUserId+"'";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectManySql);
		while (rs.next()) {
				Cart cart=new Cart(rs.getInt("cart_no"),rs.getInt("cart_qty"),
								   new User(rs.getString("userid"), rs.getString("password"), rs.getString("name"), rs.getString("email")),
								   new Product(rs.getInt("p_no"),rs.getString("p_name") ,rs.getInt("p_price"),rs.getString("p_image"),rs.getString("p_desc"),rs.getInt("p_click_count")));
				
				cartList.add(cart);
			}
		rs.close();
		stmt.close();
		con.close();
		
		return cartList;
	}
	
	public boolean isProductExist(String userid,int p_no) throws Exception {
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		/***************************************/ 
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt=con.prepareStatement("select count(p_no) from cart where userid=? and p_no=?");
		pstmt.setString(1, userid);
		pstmt.setInt(2, p_no);
		ResultSet rs =pstmt.executeQuery();
		int selectRow=0;
		if(rs.next()) {
			 selectRow=rs.getInt(1);
		}
		System.out.println(selectRow);
		boolean Exist=true;
		if(selectRow==0) {
			Exist=false;
		}
		
		rs.close();
		pstmt.close();
		con.close();
		
		return Exist;
		
		
	}
	
	
	
	
	
	public int deleteCartByNo(int cart_no) throws Exception{
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		/***************************************/ 
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt=con.prepareStatement("delete from cart where cart_no=?");
		pstmt.setInt(1, cart_no);
	
		int deleteRow=pstmt.executeUpdate();
		
		

		pstmt.close();
		con.close();
		
		
		return deleteRow;
		
		
		
		
	}
	
	public int deleteCart(String userid) throws Exception{
		/****************DB접속정보*************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend17";
		String password="javabackend17";
		/***************************************/ 
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt=con.prepareStatement("delete from cart where userid=?");
		pstmt.setString(1, userid);
	
		int deleteRow=pstmt.executeUpdate();
		
		
		pstmt.close();
		con.close();
		
		
		return deleteRow;
		
		
		
		
	}

}
