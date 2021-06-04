package com.itwill.shop.user;

public class UserService {
	private UserDao userDao;
	public UserService() throws Exception{
		userDao = new UserDao();
	}
	
	public User create(User user) throws Exception{
		
		
		return userDao.insertUser(user);
	}
	public User update(User user)throws Exception{
		return userDao.updateUser(user);
	}
	public String delete(String user)throws Exception{
		return userDao.deleteUser(user);
	}
	
}
