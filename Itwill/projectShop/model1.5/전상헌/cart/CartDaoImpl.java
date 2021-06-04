package com.itwill.shop.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.sql.DataSource;
import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

import com.itwill.shop.product.Product;
import com.itwill.shop.user.User;

public class CartDaoImpl implements CartDao {
	
	private DataSource dataSource;
		
	public CartDaoImpl() throws Exception{
		Properties properties=new Properties();
		properties.load(this.getClass().getResourceAsStream("/db.properties"));
		BasicDataSource basicDataSource=new BasicDataSource();
		basicDataSource.setDriverClassName(properties.getProperty("driverClass"));
		basicDataSource.setUrl(properties.getProperty("url"));
		basicDataSource.setUsername(properties.getProperty("user"));
		basicDataSource.setPassword(properties.getProperty("password"));
		
		
		dataSource=basicDataSource;
		
	}
	
	
	
	

	
	@Override
	public int add(String userid,int p_no,int cart_qty) throws Exception {
		Connection con=dataSource.getConnection();
	    PreparedStatement pstmt=con.prepareStatement(CartSQL.ADD_CART);
		pstmt.setInt(1, cart_qty);
		pstmt.setString(2, userid);
		pstmt.setInt(3, p_no);
		
		int insertRowCount=pstmt.executeUpdate();

		pstmt.close();
		con.close();
		
		
		return insertRowCount;
		
		
	}
	@Override
	public int update(String userid,int p_no,int cart_qty) throws Exception {
	
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(CartSQL.UPDATE_CART);
		pstmt.setInt(1, cart_qty);
		pstmt.setInt(2, p_no);
		pstmt.setString(3, userid);
		int updateRow=pstmt.executeUpdate();
		
		
		pstmt.close();
		con.close();
		
		return updateRow;
		
		
		
	}
	@Override
	public List<Cart> cartList(String sUserId) throws Exception{
	
		ArrayList<Cart> cartList=new ArrayList<Cart>();
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(CartSQL.LIST_CART);
		pstmt.setString(1, sUserId);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
				Cart cart=new Cart(rs.getInt("cart_no"),rs.getInt("cart_qty"),
								   new User(rs.getString("userid"), rs.getString("password"), rs.getString("name"), rs.getString("email")),
								   new Product(rs.getInt("p_no"),rs.getString("p_name") ,rs.getInt("p_price"),rs.getString("p_image"),rs.getString("p_desc"),rs.getInt("p_click_count")));
				
				cartList.add(cart);
			}
		rs.close();
		pstmt.close();
		con.close();
		
		return cartList;
	}
	
	@Override
	public boolean isProductExist(String userid,int p_no) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(CartSQL.isProductExist);
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
	
	
	
	
	
	@Override
	public int deleteCartByNo(int cart_no) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(CartSQL.DELETE_CART);
		pstmt.setInt(1, cart_no);
	
		int deleteRow=pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
		
		return deleteRow;
		
		
		
		
	}
	
	@Override
	public int deleteCart(String userid) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(CartSQL.DELETE_CARTALL);
		pstmt.setString(1, userid);
	
		int deleteRow=pstmt.executeUpdate();
		
		
		pstmt.close();
		con.close();
		
		
		return deleteRow;
		
		
		
		
	}

}
