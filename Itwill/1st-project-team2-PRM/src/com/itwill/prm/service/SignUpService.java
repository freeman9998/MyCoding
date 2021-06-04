package com.itwill.prm.service;


import com.itwill.prm.dao.MembersDao;
import com.itwill.prm.vo.Members;

public class SignUpService {
	private MembersDao membersDao;

	
	public SignUpService() {
		membersDao = new MembersDao();
		
	}
	/*
	 * 회원가입
	 */

	/*
	 * 이메일 존재여부
	 */
	public boolean isExistedId(int member_no) throws Exception{
	      boolean isExisted = false;
	      Members members = membersDao.selectByNo(member_no);
	      if(members == null) {
	         isExisted = false;
	      }else if(members != null) {
	         isExisted = true;
	      }
	      
	      return isExisted;
	   }
		
	
	  public boolean selectOverchk(String address) throws Exception {
	       boolean isExisted = false;
	       Members members = membersDao.selectByID(address);
	       if(members == null) {
	         isExisted = true;
	      }else if(members != null) {
	         isExisted = false;
	      }
	       return isExisted;
	    
	   }
	  public int updateId_Pw(String member_id,String member_password,int member_no) throws Exception {
	      int rowCount = membersDao.updateByNo(member_id,member_password,member_no);
	      return rowCount; 
	   }   

}
