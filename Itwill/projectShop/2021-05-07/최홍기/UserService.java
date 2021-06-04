package com.itwill.shop.user;

public class UserService {
	
	private UserDao userDao;
	
	public UserService() throws Exception {
		userDao = new UserDao();
	}
	
	public User select(String userId) throws Exception {
		return userDao.selectUserById(userId);
	}
	
	public int insert(User user) throws Exception {
		return userDao.insertUser(user);
	}
	
	public int update(User user) throws Exception {
		return userDao.updateUser(user);
	}
	
	public int delete(String userId) throws Exception {
		return userDao.deleteUser(userId);
	}
}
