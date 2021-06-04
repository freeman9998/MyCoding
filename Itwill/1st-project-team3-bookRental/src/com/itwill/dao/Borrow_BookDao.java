package com.itwill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.vo.Book;
import com.itwill.vo.BookMember;
import com.itwill.vo.Borrow_Book;

public class Borrow_BookDao {
	/*************책대여*************/
	
	public int create(BookMember bookMember,Book book) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(Borrow_BookSQL.BORROW_BOOK_INSERT);
		pstmt.setString(1, bookMember.getMember_id());
		pstmt.setInt(2, book.getBook_no());
	
		int rowCount=pstmt.executeUpdate();
		
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
		
		
	}
	
	
	/*************빌린 책 1권 찾기 (번호) ***********/
	public Borrow_Book selectByNo(int borrow_no) throws Exception{
		Borrow_Book borrow_book = null;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(Borrow_BookSQL.BORROW_BOOK_SELECT_NO);
		pstmt.setInt(1, borrow_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			borrow_book = new Borrow_Book(
					rs.getInt("borrow_no"),
					rs.getString("member_id"),
					rs.getInt("book_no"),
					rs.getDate("borrow_rental"),
					rs.getDate("borrow_return"));
		}
		ConnectionFactory.releaseConnection(con);
		return borrow_book;	
	}
	
	/*************한 사람이 빌린 책 찾기(멤버아이디)***************/
	public List<Borrow_Book> selectById(String memeber_id) throws Exception{
		ArrayList<Borrow_Book> bookList=new ArrayList<Borrow_Book>();
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(Borrow_BookSQL.BORROW_BOOK_SELECT_ID);
		pstmt.setString(1, memeber_id);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			bookList.add(new Borrow_Book(
					rs.getInt("borrow_no"),
					rs.getString("member_id"),
					rs.getInt("book_no"),
					rs.getDate("borrow_rental"),
					rs.getDate("borrow_return")));
		}
		ConnectionFactory.releaseConnection(con);
		return bookList;	
		
	}
	
	/*************대여중인 책 모두 찾기**************/
	
	public List<Borrow_Book> selectAll() throws Exception{
		ArrayList<Borrow_Book> borrow_book=new ArrayList<Borrow_Book>();
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(Borrow_BookSQL.BORROW_BOOK_SELECT_ALL);
		ResultSet rs= pstmt.executeQuery();
		while(rs.next()) {
			borrow_book.add(new Borrow_Book(
					rs.getInt("borrow_no"),
					rs.getString("member_id"),
					rs.getInt("book_no"),
					rs.getDate("borrow_rental"),
					rs.getDate("borrow_return")));
		}
		ConnectionFactory.releaseConnection(con);
		return borrow_book;
	}
	/**********빌린 책 반납*************/
	public int deleteByNo(int borrow_no) throws Exception{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(Borrow_BookSQL.BORROW_BOOK_DELETE);
		pstmt.setInt(1, borrow_no);
		int rowCount = pstmt.executeUpdate();
		
		ConnectionFactory.releaseConnection(con);
		
		return rowCount;
	}
	/**********한 사람이 빌린 책 모두 반납*************/
	public int deleteByName(String member_id) throws Exception{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(Borrow_BookSQL.BORROW_BOOK_DELETE_ID);
		pstmt.setString(1, member_id);
		int rowCount = pstmt.executeUpdate();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}
	
	/***********책 대여시 멤버아이디와 책넘버 업데이트*******/
	public int update(String memberId, int bookNo) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt=con.prepareStatement(Borrow_BookSQL.BORROW_BOOK_INSERT);
		pstmt.setString(1, memberId);
		pstmt.setInt(2, bookNo);
	
		int rowCount=pstmt.executeUpdate();
		
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
		
		
	}
	
	
	

}