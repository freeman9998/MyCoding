package com.itwill.test;

import com.itwill.service.BookMemberService;
import com.itwill.vo.BookMember;

public class BookMemberServiceTestMain {
	
	public static void main(String[] args) throws Exception {
		
		BookMemberService BookmemberService=new BookMemberService();
		/*
		System.out.println("1.isExistedId:"+BookmemberService.isExistedId("aaaa"));
		int isSuccess= BookmemberService.memberRegister(new BookMember("qpqpqpq", "fkfk12!", "정데이", "2020,20,20", 
				"010", "5656", "4545", "lololo", "@ggg.com", null,0,0), "fkfk12!");
		System.out.println("2.memberRegister:"+isSuccess);
		*/
		
		
		System.out.println("3.login:"+BookmemberService.login("aaaa", "aaaa"));

		BookMember findMember=BookmemberService.findById("qpqpqpq");
		System.out.println("3.findById:"+findMember);
		

		System.out.println("4.bookMemberUpdate:"+BookmemberService.BookmemberUpdate(findMember, "aaaa111", "aaaa111", "111", "1111","1111",
				"dddd",null));
	
		
		//int isSuccess= BookmemberService.memberUnRegister(findMember, "aaaa");
		//System.out.println("2.memberUnRegister:"+isSuccess);

		
			
	}
	
}
