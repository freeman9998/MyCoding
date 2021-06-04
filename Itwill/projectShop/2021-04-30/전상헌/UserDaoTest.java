package com.itwill.shop.user;

public class UserDaoTest {
	public static void main(String[] args) throws Exception {
		UserDao userDao=new UserDao();
	//	userDao.selectOne("bb");
		userDao.selectAll();;
	//		userDao.insert("2", "2","2", "2");
	//userDao.update("5", "2","2", "2","2");
	userDao.delete("5");
	
	}


}
