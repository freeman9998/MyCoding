package com.itwill.service;

import java.util.List;

import com.itwill.dao.BookDao;
import com.itwill.vo.Book;


public class BookService {
	private static final int TOTAL_COUNT_DOWN =1;
	private static final int TOTAL_COUNT_UP =1;
	private BookDao bookDao;
	
	public BookService() {
		bookDao= new BookDao();
	}
	
	public boolean bookSearch (String book_title) throws Exception {
		boolean isRent = false;
		List<Book> searchedBook = null;
		
		searchedBook = findByTitleAll(book_title);
		
		if(searchedBook != null) {
			isRent = true;
		}
		
		return isRent;
	}

	public List<Book> findByTitleAll(String book_title) throws Exception{
		//return bookDao.selectByTitleAll("%"+book_title+"%");
		return bookDao.selectByTitleAll(book_title);
	}
	
	public Book findByNo(int no) throws Exception{
		return bookDao.selectByNo(no);
	}
	
	public Book findByTitle(String title) throws Exception{
		return bookDao.selectByTitle(title);
	}
	
	public boolean decreaseBookTotal(Book book) throws Exception {
		boolean isRent = false;
		int count = 0;
		if(book.getBook_total()-TOTAL_COUNT_DOWN > 0) {
		count =bookDao.updateByTotal(book.getBook_total()-TOTAL_COUNT_DOWN, book);
		} 
		if(count > 0) {
			isRent =true;
		}
		
		return isRent;
	}
	

	public List<Book> findAll() throws Exception{
		return bookDao.selectAll();
	}
	public boolean increaseBookTotal(Book book) throws Exception {
		boolean isRent = false;
		int count = 0;
		count =bookDao.updateByTotal(book.getBook_total()+TOTAL_COUNT_UP, book);
		if(count > 0) {
			isRent =true;
		}
		
		return isRent;
	}
	
}