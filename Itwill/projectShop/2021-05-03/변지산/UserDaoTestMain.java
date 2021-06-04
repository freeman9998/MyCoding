package com.itwill.shop.user;

public class UserDaoTestMain {

	public static void main(String[] args) throws Exception{
		UserDao userDao = new UserDao();
		/*
		userDao.insertUser("kim01", "0101", "김길둥","kim01@gmail.com");
		
		userDao.updateUser("kim01","0111","김갑수","kim01@gmail.com");
		*/
		String userF= "kim01";
		System.out.println("------------"+userF+"유저------------");
		userDao.findOneUser(userF);
		/*
		System.out.println("--------------유저전체------------------");
		userDao.findAllUser();
		
		userDao.deleteUser("hong03");
		*/
		System.out.println("--------------유저전체---------------");
		userDao.findAllUser();
	}

}
