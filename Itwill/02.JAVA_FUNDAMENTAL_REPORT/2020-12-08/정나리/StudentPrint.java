package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int stNum = 1; //학생 번호
		String name = "KIM"; //학생 이름
		int scoreKr = 23; //국어
		int scoreMa = 44; //수학
		int scoreEg = 56; //영어
		int scoreSum = 456;	//총점
		double scoreAver = 23.5; //평균
		char grade = 'A'; //평점
		int rank = 7; //등수
		
		
		System.out.println("---------------학생 성적출력------------------------");
		System.out.println("학번  이름  국어  영어  수학  총점  평균  평점  석차");
		System.out.println("----------------------------------------------------");	
		System.out.println("  "+ stNum +"    "+name +"   "+ scoreKr+"    "+scoreEg+"    "+scoreMa+"   "+scoreSum+"   "+
		scoreAver+"   "+grade+"    "+rank );

	}

}
