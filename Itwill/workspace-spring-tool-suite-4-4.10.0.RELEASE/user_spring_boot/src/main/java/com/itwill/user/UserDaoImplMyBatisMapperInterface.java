package com.itwill.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itwill.user.mapper.UserMapper;



@Repository("userDao")
public class UserDaoImplMyBatisMapperInterface implements UserDao {
	@Autowired
	private UserMapper userMapper;
	public UserDaoImplMyBatisMapperInterface() {
		System.out.println("#### UserDaoImplMyBatisMapperInterface() : 디폴트생성자 호출  ");
	}
	public UserDaoImplMyBatisMapperInterface(UserMapper userMapper) {
		System.out.println("#### UserDaoImplMyBatisMapperInterface(UserMapper userMapper) : 생성자 호출  ");
		this.userMapper = userMapper;
	}
	
	public void setUserMapper(UserMapper userMapper) {
		System.out.println("#### UserDaoImplMyBatisMapperInterface.setUserMapper("+userMapper+") : 호출  ");
		this.userMapper = userMapper;
	}
	

	/*
	 * 사용자관리테이블에 새로운사용자생성
	 */
	/* (non-Javadoc)
	 * @see com.itwill.user.UserDao#create(com.itwill.user.User)
	 */
	@Override
	public int create(User user) throws Exception {
		System.out.println("#### UserDaoImplMyBatisMapperInterface : create() 호출  ");
		int insertRowCount=userMapper.create(user);
		return insertRowCount;
	}

	/*
	 * 기존의 사용자정보를 수정
	 */
	/* (non-Javadoc)
	 * @see com.itwill.user.UserDao#update(com.itwill.user.User)
	 */
	@Override
	public int update(User user) throws Exception {
		System.out.println("#### UserDaoImplMyBatisMapperInterface : update() 호출  ");
		int updateRoweCount=userMapper.update(user);
		return updateRoweCount;
	}

	/*
	 * 사용자아이디에해당하는 사용자를 삭제
	 */
	/* (non-Javadoc)
	 * @see com.itwill.user.UserDao#remove(java.lang.String)
	 */
	@Override
	public int remove(String userId) throws Exception {
		System.out.println("#### UserDaoImplMyBatisMapperInterface : remove() 호출  ");
		int removeRoweCount=userMapper.remove(userId);
		return removeRoweCount;
	}
	
	/*
	 * 사용자아이디에해당하는 정보를 데이타베이스에서 찾아서
	 * User 도메인클래스에 저장하여 반환
	 */
	/* (non-Javadoc)
	 * @see com.itwill.user.UserDao#findUser(java.lang.String)
	 */
	@Override
	public User findUser(String userId) throws Exception {
		System.out.println("#### UserDaoImplMyBatisMapperInterface : findUser() 호출  ");
		User user=userMapper.findUser(userId);
		return user;
	}
	/*
	 * 모든사용자 정보를 데이타베이스에서 찾아서 
	 * List<User> 콜렉션 에 저장하여 반환
	 */
	/* (non-Javadoc)
	 * @see com.itwill.user.UserDao#findUserList()
	 */
	@Override
	public List<User> findUserList() throws Exception {
		System.out.println("#### UserDaoImplMyBatisMapperInterface : findUserList 호출  ");
		List<User> userList=userMapper.findUserList();
		return userList;
	}
	/*
	 * 인자로 전달되는 아이디를 가지는 사용자가 존재하는지의 여부를판별
	 */
	/* (non-Javadoc)
	 * @see com.itwill.user.UserDao#existedUser(java.lang.String)
	 */
	@Override
	public boolean existedUser(String userId)throws Exception{
		System.out.println("#### UserDaoImplMyBatisMapperInterface : existedUser 호출  ");
		int  count = userMapper.findUserCount(userId);
		boolean isExist=false;
		if(count==1) {
			isExist=true;
		}else {
			isExist=false;
		}
		return isExist;
	}
	
}














