package com.itwill.dao;

public class Reserv_BookSQL {
	//도서  예약
	public static final String RESERV_BOOK =
			"insert into reserv_book(reserv_no, member_id, book_no) VALUES(reserv_book_SEQ.nextval,?,?)";
	
	//도서 예약시 도서를 선점하기 때문에 토탈값에 변화를 준다
	public static final String RESERV_BOOK_COUNT =
			"update book set book_total = ?where book_no = ? ";
	
	public static final String BOOK_SELECT_NO=
			"select book_no, book_title, book_author, book_summary, book_total from book where book_no=? ";
	
	public static final String BOOK_SELECT_ID_AND_NO=
			"select reserv_no, member_id, book_no from reserv_book where member_id=? and book_no=? ";
	
	//도서 예약 취소
	public static final String RESERV_BOOK_DELETE = 
			"delete reserv_book where reserv_no = ?";
	
	//예약도서 대여시 삭제 
	public static final String RESERV_BOOK_NO_MEMBER_ID_DELETE = 
			"delete reserv_book where member_id=? and book_no=?";
	
	//예약 현황 확인
	public static final String RESERV_BOOK_ALL =
			"select reserv_no, member_id, book_no, resrev_count from reserv_book where  member_id = ?";
	
	
	//도서 검색
	public static final String BOOK_SEARCH_TITLE_ALL =
			"select book_no, book_title, book_author, book_summary, book_total from book where book_title like'%'||?||'%'";
	
	//도서 
	public static final String BOOK_TOTAL_CHECK =
			"select book_total from book where book_no=?";
	public static final String BOOK_RENTAL_ALL =
			"select bb.book_no, b.book_title, b.book_author, bb.borrow_rental, bb.borrow_return from borrow_book bb, book b where bb.book_no = b.book_no and bb.member_id = ?";
	
	
}