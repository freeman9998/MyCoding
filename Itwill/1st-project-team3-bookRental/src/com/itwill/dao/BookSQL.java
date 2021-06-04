package com.itwill.dao;

public class BookSQL {
	public static final String BOOK_INSERT = 
			"insert into book (book_no, book_title, book_author, book_summary,book_total) "
			+ "values (book_seq.nextval,?,?,?,?)";
	public static final String BOOK_UPDATE =
			"update book set book_no=?, book_title=?, book_author=?, book_summary=?,book_total=?";
	public static final String BOOK_DELETE = 
			"delete book where book_no=?";
	public static final String BOOK_SELECT_NO=
			"select book_no, book_title, book_author, book_summary, book_total from book where book_no=? ";
	public static final String BOOK_SELECT_TITLE=
			"select book_no, book_title, book_author, book_summary, book_total from book where book_title=? ";
	public static final String BOOK_SELECT_ALL=
			"select book_no, book_title, book_author, book_summary,book_total from book";
	//반납후 북의 토탈 증가 혹은 감소 sql
	public static final String BOOK_UPDATE_TOTAL=
			"update book set book_total=? where book_no=?";
	//대여시 도서 검색
	public static final String BOOK_SELECT_TITLE_ALL=
			"select book_no, book_title, book_author, book_summary, book_total from book where book_title like '%'||?||'%'";
}

