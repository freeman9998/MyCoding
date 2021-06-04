package com.itwill.shop.user;

public class UserDaoTestMain {

	public static void main(String[] args) throws Exception{
		UserDao userDao = new UserDao();
		
		//System.out.println("insert >> "+userDao.insertUser(new User("sim01", "sim011", "심상수", "sim01@gmail.com")));
		//System.out.println("update >> "+userDao.updateUser(new User("sim01", "sim011", "심성수", "sim01@gmail.com")));
		//System.out.println("delete >> " + userDao.deleteUser("sim01"));
		//System.out.println("select >> " + userDao.selectUser("kim01"));
		System.out.println("selectAll >> " +userDao.selectAllUser());
	}

}
