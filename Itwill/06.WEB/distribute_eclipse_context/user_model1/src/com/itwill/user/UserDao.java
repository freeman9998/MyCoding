package com.itwill.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.ConnectionFactory;
/*
 사용자관리에서 데이타베이스와의 작업을 전담하는 클래스
 USERINFO 테이블에 사용자를 추가,삭제,검색,수정등의 작업을한다.
 */
public class UserDao  {
	
	
	public UserDao() throws Exception {
		
	}
	/*
	 * 사용자관리테이블에 새로운사용자생성
	 */
	public int create(User user) throws Exception {
		return 0;
	}

	/*
	 * 기존의 사용자정보를 수정
	 */
	public int update(User user) throws Exception {
		return 0;
	}

	/*
	 * 사용자아이디에해당하는 사용자를 삭제
	 */
	public int remove(String userId) throws Exception {
		return 0;
	}
	
	/*
	 * 사용자아이디에해당하는 정보를 데이타베이스에서 찾아서
	 * User 도메인클래스에 저장하여 반환
	 */
	public User findUser(String userId) throws Exception {
		return null;
	}
	/*
	 * 모든사용자 정보를 데이타베이스에서 찾아서 
	 * List<User> 콜렉션 에 저장하여 반환
	 */
	public ArrayList<User> findUserList() throws Exception {
		return null;
	}
	/*
	 * 인자로 전달되는 아이디를 가지는 사용자가 존재하는지의 여부를판별
	 */
	public boolean existedUser(String userId)throws Exception{
		return true;
	}
	
}














