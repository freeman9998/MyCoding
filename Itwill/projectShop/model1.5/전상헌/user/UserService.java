package com.itwill.shop.user;

import java.util.ArrayList;

public interface UserService {

	int insertUser(User user) throws Exception;

	int deleteUser(String userid) throws Exception;

	ArrayList<User> selectAllUser() throws Exception;

	User selectOneUser(String userid) throws Exception;

	int updateUser(User user, String userid) throws Exception;

}