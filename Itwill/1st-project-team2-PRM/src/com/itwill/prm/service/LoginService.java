package com.itwill.prm.service;

import com.itwill.prm.dao.MembersDao;
import com.itwill.prm.vo.Members;

public class LoginService {
	private MembersDao memberDao;
	
	public LoginService() {
		memberDao = new MembersDao();
		
	}
	
	public Members findById(String id) throws Exception {
		Members idpw = memberDao.selectByID(id);
		Members member = memberDao.selectByNo(idpw.getMember_no());
		return member;
	}
	
	/*
	 * 아이디 중복확인
	 */
	public boolean isExistedId(String id) throws Exception {
		//DB에서 아이디 있는지 확인
		boolean isExisted = false;
		Members member = memberDao.selectByID(id);
		if(member == null) {
			//아이디 없음
			isExisted = false;
		}else if(member != null) {
			//아이디 있음
			isExisted = true;
		}
		return isExisted;
		
	}
	
	/*
	 * 로그인
	 */
	public int loginCheck(String id,String password) throws Exception {
		/*
		 0 : 로그인성공
		 1 : 없는 아이디
		 2 : 패스워드 불일치
		 */
		int result = -9999;
		if(isExistedId(id)) {
			Members findIdPw = memberDao.selectByID(id);
			if(findIdPw.getMember_password().equals(password)) {
				//패스워드 일치
				result = 0;
			}else {
				//패스워드 불일치
				result = 2;
			}
		}else {
			//아이디 없음
			result = 1;
		}
		
		return result;
		
		
	}
	
	
}