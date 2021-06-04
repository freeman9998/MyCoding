package com.itwill.user.dao;

public class UserDaoTestDaoMain {

	public static void main(String[] args) throws Exception {
		UserDao userDao = new UserDao();
			
			System.out.println("insert : " + userDao.insertId("jenyo", 1111, "황재호", "Hjenyo7673@gmail.com");
			
			System.out.println("selectId : " + userDao.selectId("jenyo");
			
			System.out.println("update : " + userDao.updatId("Jenyo", 1111, "황재호", "jenyo7673@gmail.com", "jenyo");
			
			System.out.println("delete : " + userDao.deleteId("jenyo");
			
		
			
			

	}

}
