package com.itwill.shop.user;

import java.util.ArrayList;

public interface UserDao {

	int insert(User insertUser) throws Exception;

	int delete(String userid) throws Exception;

	ArrayList<User> selectAll() throws Exception;

	User selectOne(String userid) throws Exception;

	int update(User updateUser, String userid) throws Exception;

}