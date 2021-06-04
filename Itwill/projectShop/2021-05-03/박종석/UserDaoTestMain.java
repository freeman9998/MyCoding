package com.itwill.shop.user.test;

import com.itwill.shop.user.UserDao;

public class UserDaoTestMain {

	public static void main(String[] args)throws Exception {
		UserDao userDao=new UserDao();
			//userDao.selectonemain("jong1");
			//userDao.selectmanymain();
			//userDao.deletemain("3");
			//userDao.insertmain("jong12", "2323", "이종석", "jong12@korea.com");
			userDao.updatemain("jong12", "7777", "곽종석", "jongs2@korea.com");
	}

}
