package com.itwill.shop.dao.test;

import com.itwill.shop.dao.UserInfoDao;
import com.itwill.shop.dao.UserInfoDaoImpl;
import com.itwill.shop.domain.UserInfo;
import com.itwill.shop.service.UserInfoService;

public class UserInfoDaoTestMain {

	public static void main(String[] args) throws Exception{
		UserInfoDao userInfoDao = new UserInfoDaoImpl();
		//System.out.println(userInfoDao.findUserInfoById("itwill3"));
		//System.out.println(userInfoDao.deleteUserInfoById("itwill3"));
		//UserInfo userInfo = new UserInfo("itwill10", "1111", "이생성", "경기도 화성시", 01053636534, "update@naver.com");
		//System.out.println(userInfoDao.updateUserInfoById(userInfo));
		//System.out.println(userInfoDao.create(userInfo));
		//System.out.println(userInfoDao.existedUser("itwill3"));
		
	}

}
