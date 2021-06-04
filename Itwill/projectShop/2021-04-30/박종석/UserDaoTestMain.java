package com.itwill.shop.user.test;

import com.itwill.shop.user.UserDao;

public class UserDaoTestMain {

	public static void main(String[] args)throws Exception {
		UserDao userDao=new UserDao();
			userDao.selectManyMain();
			userDao.SelectOneMain();
			userDao.DeleteMain();
			userDao.InsertMain();
			userDao.UpdateMain();
	}

}
