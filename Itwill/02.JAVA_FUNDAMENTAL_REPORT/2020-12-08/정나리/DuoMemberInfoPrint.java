package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int memNum = 181818; //회원 번호
		String memName = "홍길동"; //회원 이름
		int memBirth = 201212; // 회원 생년월일
		int memId = 3495039; //회원 주민번호 뒷자리
		String memSex = "male"; //회원 성별
		int memMarri = 0; //회원 결혼 횟수
		boolean memSmoke = true; //회원 흡연여부
		
		System.out.println("*************************");
		System.out.println("회원번호 : "+ memNum);
		System.out.println("이    름 : "+ memName);
		System.out.println("주민번호 : "+ memBirth + "-" + memId);
		System.out.println("성    별 : "+ memSex);
		System.out.println("결혼횟수 : "+ memMarri);
		System.out.println("흡연여부 : "+ memSmoke);
		System.out.println("*************************");
		

	}

}
