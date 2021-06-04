package com.itwill.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itwill.vo.Book;
import com.itwill.vo.BookMember;
import com.itwill.vo.Borrow_Book;
import com.itwill.vo.Reserv_Book;

public class Reserv_BookDao {
	/***********도서 예약*************/
	public int insert(Reserv_Book reserv_Book)throws Exception{
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(Reserv_BookSQL.RESERV_BOOK);
		pstmt.setString(1, reserv_Book.getMember_id());
		pstmt.setInt(2, reserv_Book.getBook_no());
		
		int rowCount=pstmt.executeUpdate();
		
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}
	
	/************예약 취소*************/
	public int cancleReserv(int reserv_no)throws Exception{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(Reserv_BookSQL.RESERV_BOOK_DELETE);
		
		pstmt.setInt(1, reserv_no);
		
		int rowCount = pstmt.executeUpdate();
		ConnectionFactory.releaseConnection(con);
		
		return rowCount;
	}
	
	public int cancleReservIdAndNo(String memberId, int bookNo)throws Exception{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(Reserv_BookSQL.RESERV_BOOK_NO_MEMBER_ID_DELETE);
		pstmt.setString(1, memberId);
		pstmt.setInt(2, bookNo);
		
		int rowCount = pstmt.executeUpdate();
		ConnectionFactory.releaseConnection(con);
		
		return rowCount;
	}
	//
	public Book selectByNo(int book_no) throws Exception{
		Book book = null;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(Reserv_BookSQL.BOOK_SELECT_NO);
		pstmt.setInt(1, book_no);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			book = new Book(rs.getInt("book_no"), rs.getString("book_title"), rs.getString("book_author"),
					rs.getString("book_summary"), rs.getInt("book_total"));
		}
		return book;
	}
	/*
	public List<Book> selectByIdRental(String bmid) throws Exception{
		List<Book> rentalbook = new ArrayList<Book>();
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(Reserv_BookSQL.BOOK_RENTAL_ALL);
		pstmt.setString(1, bmid);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			rentalbook.add(new Book(rs.getInt("book_no"), rs.getString("book_title"), rs.getString("book_author")+
					new Borrow_Book(rs.getDate("borrow_rental"),rs.getDate("borrow_return"))));
		}
		return rentalbook;
		
	}
	*/
	
	//도서 예약시 미리 카운트 감소
	public int updateByCount(int count,Book book) throws Exception{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(Reserv_BookSQL.RESERV_BOOK_COUNT);
		pstmt.setInt(1,count);
		pstmt.setInt(2, book.getBook_no());
		
		int rowCount = pstmt.executeUpdate();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}
	//도서 번호 인자 
	public List<Book> selectByNoAll(int bookno)throws Exception{
		List<Book> bookList = new ArrayList<Book>();
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(BookSQL.BOOK_SELECT_NO);
		pstmt.setInt(1, bookno);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			bookList.add(new Book(rs.getInt("book_no"), rs.getString("book_title"), rs.getString("book_author"),
					rs.getString("book_summary"), rs.getInt("book_total")));
		}
		return bookList;
	}
	
	
	
	 public List<Book> selectByTitleAll(String bookTitle) throws Exception {
		List<Book> bookList = new ArrayList<Book>();
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(BookSQL.BOOK_SELECT_TITLE_ALL);
		pstmt.setString(1, bookTitle);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			bookList.add(new Book(rs.getInt("book_no"), rs.getString("book_title"), rs.getString("book_author"),
					rs.getString("book_summary"), rs.getInt("book_total")));
		}
		return bookList;
	}

	public void insert(String m_id, int book) throws Exception{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(Reserv_BookSQL.RESERV_BOOK);
		pstmt.setString(1, m_id);
		pstmt.setInt(2, book);
		
		int rowCount=pstmt.executeUpdate();
		
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		
		return;
		
	}
	
	public Reserv_Book selectByMemberIdAndBookNo(String memeberId, int bookNo) throws Exception {
		Reserv_Book reservBook = null;
		System.out.println(memeberId);
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(Reserv_BookSQL.BOOK_SELECT_ID_AND_NO);
		pstmt.setString(1, memeberId);
		pstmt.setInt(2, bookNo);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			reservBook = new Reserv_Book(rs.getInt("reserv_no"), rs.getString("member_id"), rs.getInt("book_no"));
		}
		return reservBook;
		
		
	}
	
	
	
}