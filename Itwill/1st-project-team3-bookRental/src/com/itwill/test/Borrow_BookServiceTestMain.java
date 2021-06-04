package com.itwill.test;


import com.itwill.dao.Borrow_BookDao;
import com.itwill.service.Borrow_BookService;


public class Borrow_BookServiceTestMain {

	public static void main(String[] args) throws Exception{
		Borrow_BookDao borrowBookDao=new Borrow_BookDao();
		
		Borrow_BookService borrowBookService=new Borrow_BookService();
		
		//System.out.println(borrowBookService.existReturnBook("bbbb"));	
		//System.out.println(borrowBookService.returnOneBook(133));
		//System.out.println(borrowBookService.allReturnBookById("aaaa"));	
		//System.out.println(borrowBookService.compareDate(borrowBookDao.selectByNo(134)));
		
		
		System.out.println(borrowBookDao.selectById("aaaa"));
	}

	
	
	

}
