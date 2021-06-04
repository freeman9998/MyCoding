package com.itwill.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itwill.dao.BookDao;
import com.itwill.dao.BookMemberDao;
import com.itwill.dao.Borrow_BookDao;
import com.itwill.vo.Book;
import com.itwill.vo.BookMember;
import com.itwill.vo.Borrow_Book;

public class Borrow_BookService {
	private Borrow_BookDao borrowDao;
	private BookMemberDao bookMemberDao;
	private BookDao bookDao;
	public Borrow_BookService() {
		borrowDao=new Borrow_BookDao();
		bookMemberDao=new BookMemberDao();
		bookDao=new BookDao();
	}
	
//반납할 책 있는지 확인 

public int existReturnBook(String memberId) throws Exception {
	int returnCount=0;
	List<Borrow_Book> booklist=borrowDao.selectById(memberId);
	returnCount=booklist.size();
	return returnCount;	
}
//책한개 반납 --학생 빌릴수있는 권수 증가 ,책의 권수증가 
public int returnOneBook(int borrowBookNo)throws Exception{
	Borrow_Book borrowMember=borrowDao.selectByNo(borrowBookNo);
	Book book=bookDao.selectByNo(borrowMember.getBook_no());
	BookMember bookMember=bookMemberDao.selectById(borrowMember.getMember_id());
	
	
	int returnRow=borrowDao.deleteByNo(borrowBookNo);
	
	
	if(bookMember.getMember_count()>0) {
		
		bookMemberDao.updateByCount(bookMember.getMember_count()-1,bookMember);
	}
	bookDao.updateByTotal(book.getBook_total()+1,book);
	
	return returnRow;
}

//책모두반납 
public int allReturnBookById(String id) throws Exception {
List<Borrow_Book> borrowList=borrowDao.selectById(id);
	for (Borrow_Book borrow_Book : borrowList) {
	Book book=bookDao.selectByNo(borrow_Book.getBook_no());
	bookDao.updateByTotal(book.getBook_total()+1,book);
	
	BookMember bookMember=bookMemberDao.selectById(borrow_Book.getMember_id());
	if(bookMember.getMember_count()>0) {
	     bookMemberDao.updateByCount(bookMember.getMember_count()-1, bookMember);
	
		}
	}
	
	int returnRow=borrowDao.deleteByName(id);
	return returnRow;
}
//패널티 부과 날짜비교 
	public int compareDate(Borrow_Book borrow_book) {
			
		Date today =new Date();
		
		int result=borrow_book.getBorrow_return().compareTo(today);
		
	
		return result;
		
	}
//책 고유번호로 borrow_book하나 반환

	public Borrow_Book selectBorrowBook(int no) throws Exception{
		Borrow_Book bb=borrowDao.selectByNo(no);
		
		return bb;
	}
//한명이 빌린 책들 반환
	public List<Borrow_Book> selectById (String id) throws Exception{
		List<Borrow_Book> bookList=borrowDao.selectById(id);

		
		return bookList;
	}

//책 대여시 book_no와 member_id update 메서드
	public void updateRentMemberIdAndBookNo(String memberId, int bookNo) throws Exception {
		System.out.println(memberId+bookNo);
		borrowDao.update(memberId, bookNo);
	}


}
	
	
	
	
	
	
	
	
	
	
	
	

