package com.itwill0.annotation;
@Component("")
public class MemberService {
	
	public String member1;
	public String member2;
	
	public MemberService() {
		// TODO Auto-generated constructor stub
	}
	public String getMember1() {
		return member1;
	}
	public void setMember1(String member1) {
		this.member1 = member1;
	}
	public String getMember2() {
		return member2;
	}
	public void setMember2(String member2) {
		this.member2 = member2;
	}
	public void login() {
		System.out.println("#### MemberService.login()");
	}
}
