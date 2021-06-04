package com.itwill.shop.dao.test;

import com.itwill.shop.service.MembersService;

public class MemberServiceTestMain {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		MembersService memberService=new MembersService();
		
		//System.out.println(memberService.findMembersById("test@email.com"));
		//System.out.println(memberService.findMembersByNo(1));
		String x= "4444";
		System.out.println(memberService.findMembersByPassWord(x));
		

	}

}
