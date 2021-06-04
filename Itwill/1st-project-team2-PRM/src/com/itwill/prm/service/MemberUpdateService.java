package com.itwill.prm.service;

import com.itwill.prm.dao.MembersDao;
import com.itwill.prm.vo.Members;



public class MemberUpdateService {
	
	private MembersDao membersDao;
	
	public MemberUpdateService() {
		membersDao = new MembersDao();
	}
		
		//회원정보수정 
		public int updateId_Pw(Members members) throws Exception {
			int rowCount = membersDao.updateByNo(members.getMember_id(),members.getMember_password(),members.getMember_no());
			return rowCount; 
		}	
		
			
		//중복체크
		public boolean selectOverChk(String address) throws Exception {
			
			boolean isExisted = false;
			Members member = membersDao.selectByID(address);
			if(member != null) {
				//아이디가 있음 (해당 아이디가 이미 존재함)
				isExisted = false;
			}else if(member == null) {
				//아이디 없음(수정 가능한 아이디)
				isExisted = true;
			}
			return isExisted;
			
		}
		
		//회원번호로 조회(급여명세서)
		public Members selectByNo(int member_no) throws Exception {
			
			return membersDao.selectByNo(member_no);
		}
}