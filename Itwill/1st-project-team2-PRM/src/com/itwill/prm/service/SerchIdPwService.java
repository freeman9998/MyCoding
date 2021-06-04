package com.itwill.prm.service;



import com.itwill.prm.dao.MembersDao;
import com.itwill.prm.vo.Members;




public class SerchIdPwService {
	
	private MembersDao memberDao;
	
	
	public SerchIdPwService() {
		
		memberDao = new MembersDao();
		
	}
	
	/*
	 *아이디 존재여부
	 */
	public boolean isExistedId(int member_no) throws Exception{
		boolean isExisted=false;
		
		Members MemberIdPw = memberDao.selectByNo(member_no);
		
		if(MemberIdPw==null) {
			isExisted=false; 	//아이디 없음
		}else if(MemberIdPw!=null) {
			isExisted=true;		//아이디 있음	
		}
	
		return isExisted;
	}
	
	/*
	 * 사원번호로 사원정보 가져오기 
	 */
	public Members findById(int member_no) throws Exception{
		
		return memberDao.selectByNo(member_no);
	}

}