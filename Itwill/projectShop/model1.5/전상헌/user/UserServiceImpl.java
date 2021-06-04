package com.itwill.shop.user;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	public UserServiceImpl() {
		userDao=new UserDaoImpl();
	}
	
	@Override
	public int insertUser(User user) throws Exception{
		
		return userDao.insert(user);
		
	}
	@Override
	public int deleteUser(String userid) throws Exception{
		
		return userDao.delete(userid);
	}
	
	@Override
	public ArrayList<User> selectAllUser() throws Exception{
		
		return userDao.selectAll();
	}
	
	@Override
	public User selectOneUser(String userid) throws Exception{
		
		return userDao.selectOne(userid);
	}
	
	@Override
	public int updateUser(User user,String userid) throws Exception{
		
		return userDao.update(user, userid);
	}
	
	

}
