package com.itwill.test;

import com.itwill.dao.BookDao;
import com.itwill.vo.Book;

public class BookDaoTestMain {
	
	public static void main(String[] args) throws Exception {
		BookDao bookDao = new BookDao();
	
		System.out.println("1.insert -->" + bookDao.create(new Book(2, "나무", "베르베르", "이야기", 5)));
		System.out.println("2.update -->" + bookDao.updateByNo(new Book(1, "ad222", "sasdss", "ssass", 4)));
		Book book = bookDao.selectByNo(1);
		System.out.println("3.selectByNo--> " + book.getBook_title());
		System.out.println("4.deleteByNo--> " + bookDao.deleteByNo(2));
		System.out.println("5.selectAll --> " + bookDao.selectAll());
		System.out.println("6.updateCount-->"+bookDao.updateByTotal(3, book));
		
	}
}
