package com.itwill.test;

import com.itwill.service.Reserv_BookService;

public class Reserv_BookServiceTestMain {

	public static void main(String[] args) throws Exception {
		Reserv_BookService rbs = new Reserv_BookService();
		rbs.reservationBook("dddd", 5);
		
		//System.out.println("1 : " + rbs.rentalList("bbbb"));
		
	}
}
