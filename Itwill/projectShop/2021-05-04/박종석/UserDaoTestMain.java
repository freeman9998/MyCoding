package com.itwill.shop.user;



public class UserDaoTestMain {

	public static void main(String[] args)throws Exception {
		UserDao userDao=new UserDao();
			User ud1=userDao.selectOneUser("jong1");
			System.out.println(ud1);
			
		
		//System.out.println(userDao.insertMainUser(new User("kim2","233","greg","grgw2")));
		System.out.println(userDao.updateMainUser(new User("kim2", "7777", "변경", "변경")));
	}

}
