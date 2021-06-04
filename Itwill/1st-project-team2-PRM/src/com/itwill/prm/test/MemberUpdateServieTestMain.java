package com.itwill.prm.test;

import com.itwill.prm.service.MemberUpdateService;
import com.itwill.prm.vo.Members;


public class MemberUpdateServieTestMain {

	public static void main(String[] args) throws Exception {
		
		//중복체크
		MemberUpdateService service = new MemberUpdateService();
		String address = "aa@naver.com";
		boolean a  = service.selectOverChk(address);
		
		System.out.println(a);

		//수정
		String updatename = "dkdkdk@naver.com";
		String updatepassword= "aa5549";
		
		Members member = service.selectByNo(101213);
		
		System.out.println("회원정보조회 결과값 : 아이디 :"+member.getMember_id()+"//비밀번호 :"+member.getMember_password());
		String id = member.getMember_id();
		String password = member.getMember_password();
		
		
		if(id!=updatename) {
			member.setMember_id(updatename);
			service.updateId_Pw(member);	
		}else{ 
			
			System.out.println("수정될게없습니다.");	
		}
		
		if(password!=updatepassword) {
			member.setMember_password(updatepassword);
			service.updateId_Pw(member);
		}else {
			System.out.println("수정될게없습니다.");
		}
		
		Members result = service.selectByNo(101213);
		System.out.println("회원정보조회 (수정후) 결과값 : 아이디:"+result.getMember_id()+"//비밀번호 :"+result.getMember_password());
	}

}