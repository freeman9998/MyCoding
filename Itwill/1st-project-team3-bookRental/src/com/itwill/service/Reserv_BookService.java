package com.itwill.service;

import java.util.List;

import com.itwill.dao.BookDao;
import com.itwill.dao.BookMemberDao;
import com.itwill.dao.Reserv_BookDao;
import com.itwill.vo.Book;
import com.itwill.vo.BookMember;
import com.itwill.vo.Reserv_Book;

public class Reserv_BookService {
	private static final int TOTAL_COUNT = 1;
	private BookDao bookDao;
	private BookMemberDao bookMemberDao;
	private Reserv_BookDao reserv_BookDao;
	public Reserv_BookService() {
		reserv_BookDao = new Reserv_BookDao();
	}
	
	public boolean booksearch(String book_title) throws Exception{
		boolean isRent = false;
		List<Book> searchBook = null;
		searchBook = findTitleAll(book_title);
		
		if(searchBook != null) {
			isRent = true;
		}
		
		return isRent;
	}
	/*
	public int ReservationBook(int reservBook)throws Exception{
		//BookMember bookMember = bookMemberDao.selectById(reservBook.getMember_id());
		//Book book = bookDao.selectByNo(reservBook.getBook_no());
	}*/
	
	public List<Book> findTitleAll(String book_title) throws Exception{
		return reserv_BookDao.selectByTitleAll(book_title);
	}
	public List<Book> findNoAll(int book_no)throws Exception{
		return reserv_BookDao.selectByNoAll(book_no);
	}
	
	public Book findByNo(int no) throws Exception{
		return reserv_BookDao.selectByNo(no);
	}
	/*public int Reservation_Book()throws Exception{
		Book book = book.getBook_no();
		BookMember bookMember = bookMemberDao.selectById();
	}*/
	public boolean BookTotal(Book book) throws Exception{
		boolean isReserv = false;
		int count = 0;
		if(book.getBook_total() - TOTAL_COUNT > 0) {
			count = reserv_BookDao.updateByCount(book.getBook_total()-TOTAL_COUNT, book);
		}
		if(count>0) {
			isReserv = true;
		}
		return isReserv;
	}
	public void reservationBook(String id, int no)throws Exception{
		
		reserv_BookDao.insert(id, no);
	}
/*
	public List<Book> rentalList(String id) throws Exception{
		
		return reserv_BookDao.selectByIdRental(id);
		
	}*/
	
	public boolean checkReservBook(String memberId, int bookNo) throws Exception {
		boolean result = false;
		System.out.println(memberId + bookNo);
		Reserv_Book reservBook = new Reserv_Book();
		reservBook = reserv_BookDao.selectByMemberIdAndBookNo(memberId,bookNo);
		if (reservBook != null) {
			if (reservBook.getBook_no() == bookNo && reservBook.getMember_id().equals(memberId)) {
				result = true;
			}
		}

		return result;
	}
	
	public void cancleReserv(String memberId, int bookNo) throws Exception {
		reserv_BookDao.cancleReservIdAndNo(memberId,bookNo);
	}
	
}
