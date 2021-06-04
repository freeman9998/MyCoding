package com.itwill.shop.user;

import java.util.ArrayList;

public class UserService {
	private UserDao userDao;
	public UserService() {
		userDao=new UserDao();
	}
	
	public int insertUser(User user) throws Exception{
		
		return userDao.insert(user);
		
	}
	public int deleteUser(String userid) throws Exception{
		
		return userDao.delete(userid);
	}
	
	public ArrayList<User> selectAllUser() throws Exception{
		
		return userDao.selectAll();
	}
	
	public User selectOneUser(String userid) throws Exception{
		
		return userDao.selectOne(userid);
	}
	
	public int updateUser(User user,String userid) throws Exception{
		
		return userDao.update(user, userid);
	}
	
	

}
