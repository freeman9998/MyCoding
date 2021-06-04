package com.itwill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.vo.Book;

public class BookDao {
	public int create(Book book) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(BookSQL.BOOK_INSERT);
		pstmt.setInt(1, book.getBook_no());
		pstmt.setString(2, book.getBook_title());
		pstmt.setString(3, book.getBook_author());
		pstmt.setString(4, book.getBook_summary());
		pstmt.setInt(5, book.getBook_total());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}
	
	public Book selectByNo(int book_no) throws Exception {
		Book book = null;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(BookSQL.BOOK_SELECT_NO);
		pstmt.setInt(1, book_no);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			book = new Book(rs.getInt("book_no"), rs.getString("book_title"), rs.getString("book_author"),
					rs.getString("book_summary"), rs.getInt("book_total"));
		}
		return book;
	}
	
	public Book selectByTitle(String book_title) throws Exception {
		Book book = null;
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(BookSQL.BOOK_SELECT_NO);
		pstmt.setString(1, book_title);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			book = new Book(rs.getInt("book_no"), rs.getString("book_title"), rs.getString("book_author"),
					rs.getString("book_summary"), rs.getInt("book_total"));
		}
		return book;
	}

	
	public List<Book> selectAll() throws Exception {
		ArrayList<Book> bookList = new ArrayList<Book>();
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(BookSQL.BOOK_SELECT_ALL);

		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			bookList.add(new Book(rs.getInt("book_no"), rs.getString("book_title"), rs.getString("book_author"),
					rs.getString("book_summary"), rs.getInt("book_total")));
		}
		return bookList;
	}

	public int deleteByNo(int book_no) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(BookSQL.BOOK_DELETE);
		pstmt.setInt(1, book_no);
		int rowCount = pstmt.executeUpdate();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}

	public int updateByNo(Book book) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(BookSQL.BOOK_UPDATE);
		pstmt.setInt(1, book.getBook_no());
		pstmt.setString(2, book.getBook_title());
		pstmt.setString(3, book.getBook_author());
		pstmt.setString(4, book.getBook_summary());
		pstmt.setInt(5, book.getBook_total());
		int rowCount = pstmt.executeUpdate();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}
	
	//책번호를 받아 책의 보유 총량을 변경시키는 DAO
	public int updateByTotal(int count,Book book) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement pstmt = con.prepareStatement(BookSQL.BOOK_UPDATE_TOTAL);
		pstmt.setInt(1, count);
		pstmt.setInt(2, book.getBook_no());
		
		int rowCount = pstmt.executeUpdate();
		ConnectionFactory.releaseConnection(con);
		return rowCount;
	}
	
	//bookTitle을 포함한 모든 책 검색
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
	
	
	
}
