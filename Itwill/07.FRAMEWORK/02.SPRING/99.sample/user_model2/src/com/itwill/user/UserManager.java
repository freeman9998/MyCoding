package com.itwill.user;

import java.util.List;

/*
 * - 사용자관리를위한 업무를 실행하는 클래스
 * - UserDao클래스를 사용해서(데이타베이스의 데이타를 사용해서)
 *   비즈니스 로직을 수행하는역할을한다.
 * - 웹컴포넌트(JSP,Servlet)들이 호출하게되는 클래스 
 */
public class UserManager {
	/*******singleton********/
	private static UserManager  _instance;
	private UserManager(){
		System.out.println("UserManager생성자:"+this);
	}
	public static UserManager getInstance(){
		if(_instance==null){
			_instance=new UserManager();
		}
		return _instance;
	}
	/***********************/
	
	//가입
	public int create(User user)throws Exception,ExistedUserException{
		//1.userId존재여부확인(UserDao.existedUser())
		if(this.getUserDao().existedUser(user.getUserId())){
			throw new ExistedUserException(user.getUserId()+" 는 이미 존재하는 아이디입니다.");
		}
		//2.DB insert(UserDao.create())
		int row=this.getUserDao().create(user);
		return row;
	}
	//로그인
	public User login(String userId,String password)throws UserNotFoundException,Exception{
		//1. 입력되는 아이디의 존재여부파악
		User user = this.findUser(userId);
		//2. 패쓰워드 일치여부확인
		if(!user.isMatchPassword(password)){
			throw new PasswordMismatchException("패쓰워드가 일치하지않습니다.");
		}
		return user;
		
	}
	//회원리스트
	public List<User> findUserList() throws Exception{
		return getUserDao().findUserList();
	}
	
	//회원상세보기
	public User findUser(String userId)throws Exception,UserNotFoundException{
		User user=getUserDao().findUser(userId);
		if(user==null){
			//존재하지않는 아이디
			throw new UserNotFoundException(userId+"  는 존재하지않는 아이디입니다.");
		}
		return user;
	}
	//회원수정
	public int update(User user)throws Exception{
		return getUserDao().update(user);
	}
	//회원삭제
	public int remove(String userId)throws Exception{
		return getUserDao().remove(userId);
	}
	
	/*
	 * UserDao객체반환메쏘드
	 */
	private UserDao getUserDao(){
		return UserDao.getUserDao();
	}
	
}
