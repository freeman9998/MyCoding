package com.itwill.test;

import com.itwill.dao.BookMemberDao;
import com.itwill.vo.BookMember;

public class BookMemberDaoTestMain {
	
	public static void main(String[] args) throws Exception {
		
		BookMemberDao bookMemberDao = new BookMemberDao();
		System.out.println("1.create -->" + bookMemberDao.create(new BookMember("liml", "1234", "유유유", "2020,20,20", "010", "8575", "7632", "olg99912", "@c.com", null,0,0)));
		BookMember bookmember = bookMemberDao.selectById("aaaa");
		System.out.println("2.selectByNo -->"+bookmember);
		bookmember.setMember_password("12345");
		bookmember.setMember_email_1("jw1111111");
		bookmember.setMember_email_2("@hanmail.net");
		bookmember.setMember_phone_1("010");
		bookmember.setMember_phone_2("8575");
		bookmember.setMember_phone_3("7632");
		//System.out.println("3.updateById -->"+bookMemberDao.updateById(bookmember));
		System.out.println("4.selectAll -->:"+bookMemberDao.selectAll());	
		
		//반납팀 사용 dao 멤버의 카운터 업데이트
		System.out.println("5.updateByCount-->"+bookMemberDao.updateByCount(1, bookMemberDao.selectById("aaaa")));
		
//		System.out.println("4.deleteById -->:"+bookMemberDao.deleteByNo(2));
	}
	
}
