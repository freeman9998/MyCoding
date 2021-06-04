package com.itwill.user.dao;

public class UserDaoTestDaoMain {

	public static void main(String[] args) throws Exception {
		UserDao userDao = new UserDao();
		
		userDao.insert("jenyo2", 1111, "황재호", "Hjenyo7673@gmail.com");
		userDao.selectAll();
		userDao.selectOne("jenyo2");
		userDao.update("jenyo3", 2222, "황재호", "kinjaki@naver.com"	, "jenyo2");
		userDao.delete("jenyo3");
		
		
			
			

	}

}
