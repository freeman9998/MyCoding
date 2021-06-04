package com.itwill.shop.user;

import java.util.ArrayList;

public class UserDaoTest {
	public static void main(String[] args) throws Exception {
		UserDao userDao=new UserDao();
		System.out.println(userDao.selectOne("bb"));	
		System.out.println("------------------------------");
		ArrayList<User> userList=userDao.selectAll();
		for (User user : userList) {
			System.out.println(user);
		}
		System.out.println("------------------------------");
	//	System.out.println(userDao.insert(new User("추가","추가2","추가3", "추가4")));
	//	System.out.println(userDao.update(new User("변경", "변경", "변경", "변경"),"추가"));
	//	System.out.println(userDao.delete("변경"));
	}


}
