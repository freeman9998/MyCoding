package com.itwill.shop.user.test;

import com.itwill.shop.user.UserDao;

public class UserDaoTestMain {

	public static void main(String[] args) throws Exception {
		UserDao userDao = new UserDao();
		
		System.out.println("select :***********************");
		//userDao.selectUserById("mone");
		
		System.out.println("delete :***********************");
		//userDao.deleteUser("mone");
		
		System.out.println("insert :***********************");
		//userDao.insertUser("mone", "zzz", "zzz", "zzz");
		
		System.out.println("update :***********************");
		//userDao.updateUser("mone", "1318", "모네", "mone@mone.com");
		
	}

}
