package com.itwill.test;

import com.itwill.dao.BookDao;
import com.itwill.dao.BookMemberDao;
import com.itwill.dao.Borrow_BookDao;
import com.itwill.vo.Book;
import com.itwill.vo.BookMember;


public class Borrow_BookDaoTestMain {
	
	public static void main(String[] args) throws Exception{
		Borrow_BookDao bbd = new Borrow_BookDao();
		BookMemberDao bmd=new BookMemberDao();
		BookDao bd=new BookDao();

		
		Book b=bd.selectByNo(10);
		System.out.println(b);
	
		 
		int rowCount=bbd.create(new BookMember("aaaa", "111", "33", "1", "2", "3", "4", "5", "6", null, 0, 0),b);
		
		System.out.println(rowCount);
		//System.out.println(rowCount);
		
		
		
		//System.out.println("1.대여 -->" + bbd.create(new Borrow_Book(17, 1, 13, null, null)));
		//System.out.println("2.빌린책 1권 찾기 -->" + bbd.selectByNo(36));
		//System.out.println("3.한 사람이 빌린 책 찾기 -->"+ bbd.selectById("aaaa"));
		
		
		
		/*System.out.println("3.한 사람이 빌린 책 찾기 -->" + bbd.selectByNo(5));
		List<Borrow_Book> bookList=bbd.selectByNo(5);
		System.out.println(bookList.size());
		for (Borrow_Book borrow_Book : bookList) {
			System.out.println(borrow_Book);
		}
		*/
		
		//System.out.println("4.대여중인 책 모두 찾기 -->" +bbd.selectAll());
		//System.out.println("5.빌린책 반납 -->"+bbd.deleteByNo(53));
		//System.out.println("6.빌린사람 책 다 반납 -->" +bbd.deleteByName("ffff"));
				
	
	}

}
