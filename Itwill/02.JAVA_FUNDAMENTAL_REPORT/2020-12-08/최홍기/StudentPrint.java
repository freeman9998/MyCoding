package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		/*
		 * 1.출력할 데이타를 담을 변수선언
		 *  << 학번,이름,국어,영어,수학,총점,평균,평점,석차 >>
		 */
		int no, kor, eng, math, total, rank;
		double avr;
		String name, rating;
		
		/*
		 * 2.변수에데이타대입
		 *  << 학번,이름,국어,영어,수학>>
		 *  << 총점,평균,평점,석차>> 
		 */
		no = 1;
		kor = 85;
		eng = 90;
		math = 95;
		total = 270;
		rank = 3;
		
		avr = 90.5;
		
		rating = "B";
		name="CHOI";
		
		/*
		 * 3.변수를 출력
		---------------학생 성적출력--------------------
		학번  이름  국어 영어 수학 총점   평균 평점 석차
		------------------------------------------------
		 */
		System.out.println("---------------학생 성적출력-----------------------");
		System.out.println("학번  이름  국어  영어  수학  총점   평균 평점 석차");
		System.out.println("---------------------------------------------------");
		//System.out.println(" 1   KIM    23   56    44    456    23.5  A    7");
		System.out.println(+  no +"     "+name+"  "+kor+"  "+eng+"  "+math+"  "+total+"  "+avr+"  "+rating+"  "+rank);
		

	}

}