package com.itwill.shop.dao.mapper;

import com.itwill.shop.domain.UserInfo;

public interface UserInfoMapper {
	
	public int create(UserInfo userInfo);
	
	public UserInfo findUserInfoById(String user_id);
	
	public int updateUserInfoById(UserInfo userInfo);
	
	public int deleteUserInfoById(String user_id);
	
	public int existedUser(String user_id);
}
