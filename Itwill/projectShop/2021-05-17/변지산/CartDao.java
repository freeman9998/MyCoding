package com.itwill.shop.cart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.product.Product;
import com.itwill.shop.user.User;

public class CartDao {
	
	public int add(String sUserId,int p_no,int cart_qty) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		
		String insertSql="insert into cart values(cart_p_no_SEQ.nextval,"+cart_qty+","+p_no+",'"+sUserId+"')";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println("insert row count:"+insertRowCount);
		return insertRowCount;
		
		
	}
	public int update(String sUserId,int p_no,int cart_qty) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="javabackend11";
		String password="javabackend11";
		
		String updateSql="update cart set cart_qty = cart_qty + "+cart_qty+" where userid = '"+sUserId+"' and p_no = "+p_no+";";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println("update row count:"+updateRowCount);
		return updateRowCount;
		
		
	}
	public List<Cart> cartList(String sUserId) throws Exception{
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javabackend11";
		String password = "javabackend11";
		
		ArrayList<Cart> cartList=new ArrayList<Cart>();
		String selectManySql=
		"select * from cart c join product p on c.p_no=p.p_no join userinfo u on c.userid=u.userid  where u.userid='"+sUserId+"'";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectManySql);
		while (rs.next()) {
				Cart cart=new Cart(rs.getInt("cart_no"),
								   rs.getInt("cart_qty"),
								   new Product(rs.getInt("p_no"),rs.getString("p_name") ,rs.getInt("p_price"),
										       rs.getString("p_image"),rs.getString("p_desc"),rs.getInt("p_click_count")),
								   new User(rs.getString("userid"), rs.getString("password"), rs.getString("name"), rs.getString("email")));
				cartList.add(cart);
			}
		return cartList;
	}
	
	
	public int deleteCartByNo(String userId, int cart_no) throws Exception{
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javabackend11";
		String password = "javabackend11";
		
		String delete = "delete cart where userid = '"+userId+"' and p_no = "+cart_no+"";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(delete);
		stmt.close();
		con.close();
		return rowCount;
	}
	
	
	public int deleteCart(String userId) throws Exception{
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javabackend11";
		String password = "javabackend11";
		
		String delete = "delete cart where userid = '"+userId+"'";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(delete);
		stmt.close();
		con.close();
		return rowCount;
	}
	
}