package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		int  no = 1, kor = 34, eng = 45, math = 67, sum = 200, rank = 0;
		String name = "KIM";
		char grade = 'C';
		double avg = 68.2;
		
		System.out.println("-----------------학생 성적출력----------------------");
		System.out.println("학번  이름  국어  영어  수학  총점  평균  평점  석차");
		System.out.println("----------------------------------------------------");
		System.out.println(" "+no+"    "+name+"    "+kor+"    "+eng+"    "+math+"    "+sum+"  "+avg+"   "+grade+"     "+rank);
				
		

	}

}
