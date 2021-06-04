package com.itwill.cart.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class CartDao {
	private DataSource dataSource;
	public CartDao() throws Exception {
		InitialContext ic = new InitialContext();
	    dataSource = (DataSource)ic.lookup("java:/comp/env/jdbc/OracleDB");
	}
	
	public boolean isProductExist(int p_no) throws Exception{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String existStr = "select c.m_no, p.p_no, p.p_name from cart c join product p on (p.p_no = c.p_no) where c.p_no=?";
		boolean isExist = false;
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(existStr);
			pstmt.setInt(1, p_no);
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null)
				pstmt.close();
			if(con != null)
				con.close();
		}
		return isExist;
	}
	
	
	public int insert (int m_no, int p_no, int c_quantity) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int rows;
		String insertStr = "insert into cart (m_no, p_no, c_quantity, c_price) values (?,?,?,?*(select p_price from product where p_no = ?))";
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(insertStr);
			pstmt.setInt(1, m_no);
			pstmt.setInt(2, p_no);
			pstmt.setInt(3, c_quantity);
			pstmt.setInt(4, c_quantity);
			pstmt.setInt(5, p_no);
			rows = pstmt.executeUpdate();
			return rows;
		} finally {
			if(pstmt != null)
				pstmt.close();
			if(con !=null)
				con.close();
		}
	}
	
	//상품 선택 
	public ArrayList<HashMap> SelectAll (int m_no) throws Exception {
		ArrayList<HashMap> cartList = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String SelectStr = "select c.m_no, p.p_no, p.p_name,p.p_price, c.c_quantity, c.c_price from cart c join product p on (p.p_no = c.p_no) where c.m_no= ?";
		try {												//
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(SelectStr);
			pstmt.setInt(1, m_no);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				HashMap hs = new HashMap<>();
				hs.put("m_no", rs.getInt("m_no"));
				hs.put("p_no", rs.getInt("p_no"));
				hs.put("p_name", rs.getString("p_name"));
				hs.put("p_price", rs.getString("p_price"));
				hs.put("c_quantity", rs.getInt("c_quantity"));
				hs.put("c_price", rs.getInt("c_price"));
				
				cartList.add(hs);
			}
		} finally {
			if(pstmt != null)
				pstmt.close();
			if(con != null)
				con.close();
		}
		return cartList;
	}
	
	
	//상품 업데이트 
	public int CartUpdate(int m_no, int p_no, int c_quantity) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		String updateStr = "update cart set c_quantity=?, c_price = (select p_price * ? from product where p_no = ? ) where m_no =? and p_no =?";
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(updateStr);
			pstmt.setInt(1, c_quantity);
			pstmt.setInt(2, c_quantity);
			pstmt.setInt(3, p_no);
			pstmt.setInt(4, m_no);
			pstmt.setInt(5, p_no);
			int rows = pstmt.executeUpdate();
			return rows;
		}  finally {
			if(pstmt != null)
				pstmt.close();
			if(con !=null)
				con.close();
		}
	}
	
	
	//상품딜리트 
	public int Delete(int p_no) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		String delStr = "delete from cart where p_no=? ";
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(delStr);
			pstmt.setInt(1, p_no);
			int rows = pstmt.executeUpdate();
			return rows;
			
		}finally {
			if(pstmt != null)
				pstmt.close();
			if(con != null)
				con.close();
		}
	}
	
	public int DeleteAll(int m_no) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		String delStr = "delete from cart where m_no=? ";
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(delStr);
			pstmt.setInt(1, m_no);
			int rows = pstmt.executeUpdate();
			return rows;
			
		}finally {
			if(pstmt != null)
				pstmt.close();
			if(con != null)
				con.close();
		}
	}
	public ArrayList<HashMap> countsum (int m_no) throws Exception {
		ArrayList<HashMap> cartsum = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String SelectStr = "select c.m_no, p.p_no, p.p_name,p.p_price, c.c_quantity, c.c_price from cart c join product p on (p.p_no = c.p_no) where c.m_no= ?";
		try {												//
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(SelectStr);
			pstmt.setInt(1, m_no);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				HashMap hs = new HashMap<>();
				hs.put("countsum", rs.getInt("countsum"));
			
				cartsum.add(hs);
			}
		} finally {
			if(pstmt != null)
				pstmt.close();
			if(con != null)
				con.close();
		}
		return cartsum;
	}

	public int findCartCountByNo(int m_no) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int findCartCount = 0;
		String cartCountStr = "select count(*) from cart where m_no=? ";
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(cartCountStr);
			pstmt.setInt(1, m_no);
			rs = pstmt.executeQuery();	
			if(rs.next()) {
				findCartCount = rs.getInt("count(*)");
			}
		}finally {
			if(pstmt != null)
				pstmt.close();
			if(con != null)
				con.close();
		}
		return findCartCount;
	}

}
