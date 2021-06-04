package com.itwill.shop.service;

import org.apache.ibatis.session.SqlSession;

import com.itwill.shop.dao.UserInfoDao;
import com.itwill.shop.dao.UserInfoDaoImpl;
import com.itwill.shop.dao.exception.ExistedUserException;
import com.itwill.shop.dao.exception.PasswordMismatchException;
import com.itwill.shop.dao.exception.UserNotFoundException;
import com.itwill.shop.dao.mapper.UserInfoMapper;
import com.itwill.shop.domain.UserInfo;

public class UserInfoService {
	private static UserInfoService _instance=null;
	private UserInfoDao userInfoDao;
	
	private UserInfoService() throws Exception{
		userInfoDao = new UserInfoDaoImpl();
	}
	public static UserInfoService getInstance() throws Exception{
		if(_instance==null) {
			_instance = new UserInfoService();
		}
		return _instance;
	}

	/* 회원가입 아이디중복체크*/
	public int create(UserInfo userInfo) throws Exception {
		if(existedUser(userInfo.getUser_id())) {
			throw new ExistedUserException(userInfo.getUser_id()+" 이미 존재하는 아이디입니다.");		
		}
		
		return userInfoDao.create(userInfo);
	}
	
	/*회원로그인*/
	public UserInfo login(String user_id, String password) throws Exception {
		UserInfo user = userInfoDao.findUserInfoById(user_id);
		if(user==null) {
			throw new UserNotFoundException(user_id+"는 존재하지않는 아이디입니다.");
		}
		if(!user.isMatchPassword(password)) {
			throw new PasswordMismatchException("비밀번호가 일치하지않습니다.");
		}
		return user;
	}

	public UserInfo findUserInfoById(String user_id) {
		return userInfoDao.findUserInfoById(user_id);
	}

	public int updateUserInfoById(UserInfo userInfo) {
		return userInfoDao.updateUserInfoById(userInfo);
	}

	public int deleteUserInfoById(String user_id) {
		return userInfoDao.deleteUserInfoById(user_id);
	}
	/*
	 * 인자로 전달되는 아이디를 가지는 사용자가 존재하는지의 여부를판별
	 */
	public boolean existedUser(String user_id) {
		boolean isExist = false;
		int count = userInfoDao.existedUser(user_id);
		if(count==1)isExist=true;
		return isExist;
	}
	

	
	
}
