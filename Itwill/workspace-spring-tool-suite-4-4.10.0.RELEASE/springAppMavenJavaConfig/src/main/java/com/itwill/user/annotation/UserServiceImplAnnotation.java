package com.itwill.user.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.itwill.user.User;
import com.itwill.user.UserDao;
import com.itwill.user.UserService;
import com.itwill.user.exception.ExistedUserException;
import com.itwill.user.exception.PasswordMismatchException;
import com.itwill.user.exception.UserNotFoundException;



@Service("userService")
public class UserServiceImplAnnotation implements UserService {
	/*
	 * @Autowired : annotation이존재하는 멤버필드 타입과
	 *              동일한객체(자식객체)를 찾아서 대입 
	 * @Qualifier("userDao1") : annotation이존재할때는 빈의 id가 userDao1 인객체찾아서 injection                  
	 */
	
	@Autowired
	//@Qualifier("userDao1")
	private UserDao userDao;
	
	public UserServiceImplAnnotation(){
		System.out.println("#### UserServiceImplAnnotation() : 디폴트생성자호출");
	}
	/*
	 * @Autowired : annotation이존재하는 생성자의 인자 타입과
	 *              동일한객체를 찾아서 인자로대입한후 객체생성 
	 * - 인자앞에 @Qualifier("userDao1") annotation이존재할때는 빈의 id가 userDao1인객체찾아서 injection             
	 */
	//@Autowired
	public UserServiceImplAnnotation(/*@Qualifier("userDao1")*/  UserDao userDao) {
		System.out.println("#### UserServiceImplAnnotation("+userDao+") : 디폴트생성자호출");
		this.userDao=userDao;
	}
	/*
	 * @Autowired : annotation이존재하는 set메쏘드 인자 타입과
	 *              동일한객체를 찾아서 인자로대입한후 객체생성 
	 *              
	 * @Qualifier("userDao1") annotation이존재할때는 빈의 id가 userDao1인객체찾아서 injection                  
	 */
	//@Autowired
	//@Qualifier("userDao1")
	public void setUserDao(UserDao userDao) {
		System.out.println("#### UserServiceImplAnnotation : setUserDao("+userDao+") 호출");
		this.userDao = userDao;
	}
	
	
	public int create(User user) throws ExistedUserException,Exception{
		System.out.println("#### UserServiceImplAnnotation : create() 호출");
		return 0;
	}
	
	/*
	 * User 상세보기
	 */
	public User findUser(String userId) throws UserNotFoundException,Exception{
		System.out.println("#### UserServiceImplAnnotation : findUser() 호출");
		return userDao.findUser(userId);
		
	}
	/*
	 * 로그인
	 */
	public User login(String userId,String password) 
			throws UserNotFoundException,PasswordMismatchException, Exception{
		//입력되는 아이디로 User 찾아오기
		System.out.println("# UserServiceImplAnnotation : login() 호출");
		return null;
		
	}
	public int update(User user) throws Exception{
		System.out.println("# UserServiceImplAnnotation : update() 호출");
		return 0;
	}
	public int remove(String userId) throws Exception{
		System.out.println("# UserServiceImplAnnotation : remove() 호출");
		return 0;
	}
	public List<User> findUserList() throws Exception{
		System.out.println("# UserServiceImplAnnotation : findUserList() 호출  ");
		return null;
	} 
	
	
	
	
	
	
}
