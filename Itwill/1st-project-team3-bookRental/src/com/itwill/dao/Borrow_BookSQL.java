package com.itwill.dao;
/*
 * 이름            널?       유형         
------------- -------- ---------- 
BORROW_NO     NOT NULL NUMBER(10) 
MEMBER_NO              NUMBER(10) 
BOOK_NO                NUMBER(10) 
BORROW_RENTAL          DATE       
BORROW_RETURN          DATE      
 */
public class Borrow_BookSQL {
	
	//책빌리기 
	public static final String BORROW_BOOK_INSERT=
	"insert into borrow_book(borrow_no,member_id,book_no) values(Borrow_book_SEQ.nextval,?,?)";
	
	//책 한개 반납 -책 고유번호로 반납 
	public static final String BORROW_BOOK_DELETE=
	"delete borrow_book where borrow_no=?";
	
	
	//한사람이 빌린책 모두반납- 이름으로 반납  
	public static final String BORROW_BOOK_DELETE_ID=
			"delete borrow_book where member_id=? ";
	
	//빌린책 한개 찾기 
	public static final String BORROW_BOOK_SELECT_NO=
	"select borrow_no,member_id,book_no,borrow_rental,borrow_return from borrow_book where borrow_no=?";
	
	//한사람이 빌린책 찾기 
	public static final String BORROW_BOOK_SELECT_ID=
	"select borrow_no,member_id,book_no,borrow_rental,borrow_return from borrow_book where member_id=?";
	
	//빌린책들 모두 찾기 
	public static final String BORROW_BOOK_SELECT_ALL=
	"select borrow_no,member_id,book_no,borrow_rental,borrow_return from borrow_book ";
	

}
