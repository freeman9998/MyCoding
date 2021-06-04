package com.itwill.test;

import com.itwill.dao.BookDao;
import com.itwill.dao.BookMemberDao;
import com.itwill.dao.Reserv_BookDao;
import com.itwill.vo.*;


public class Reserv_BookTestMain {

	public static void main(String[] args) throws Exception {
		Reserv_BookDao rbd = new Reserv_BookDao();
		BookMemberDao bmd = new BookMemberDao();
		BookDao bd = new BookDao();
		
//		System.out.println("1. 예약 --> " + rbd.insert(new Reserv_Book(0,"dddd",19,0)));
		
		//System.out.println("2.예약취소  --> : " + rbd.cancleReserv(3));
		
		//System.out.println("3. --> : " + rbd.selectByIdRental("aaaa"));
		
	}

}
