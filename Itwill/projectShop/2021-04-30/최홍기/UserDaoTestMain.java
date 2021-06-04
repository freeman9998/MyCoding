package com.itwill.shop.user.test;

import com.itwill.shop.user.UserDao;

public class UserDaoTestMain {

	public static void main(String[] args) throws Exception {
		UserDao userDao = new UserDao();
		
		System.out.println("select :***********************");
		//userDao.selectUserById();
		
		System.out.println("delete :***********************");
		//userDao.deleteUser();
		
		System.out.println("insert :***********************");
		//userDao.insertUser();
		
		System.out.println("update :***********************");
		//userDao.updateUser();
		
	}

}
