package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		
		// 1. 출력할 데이타를 담을 변수선언 
		// 2. 변수에 데이타 대입
		int no = 1;
		String name = "KIM";
		int kr = 23;
		int eng = 56;
		int math = 44;
		int total = 456;
		double a = 23.5;
		String b = "A";
		int c = 7;
		
		// 3. 변수를 출력
		System.out.println("---------------학생 성적출력-----------------------");
		System.out.println("학번  이름  국어  영어  수학  총점   평균 평점 석차");
		System.out.println("---------------------------------------------------");
		//System.out.println(" 1   KIM    23   56    44    456    23.5  A    7");
		System.out.println(""+  no +"   "+name+"   "+kr+"   "+eng+"   "+math+"  "+total+"  "+a+"  "+b+"  "+c+"  ");
	}

}
