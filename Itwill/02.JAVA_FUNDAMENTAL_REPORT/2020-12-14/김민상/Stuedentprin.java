package com.itwill00.variable;

public class Stuedentprin {

	public static void main(String[] args) {
		/*
		 * 1.출력할 데이터를 담을 변수선언
		 * << 학번 이름 국어 영어 수학 총점 평균 석차 >>
		 */
		int no;
		String name;
		int kor;
		int eng;
		int math;
		double average = 68.2;
		int order;
		char grade;
		/*
		 * 2.변수에 데이터대입
		 * << 학번 이름 국어 영어 수학 >>
		 * << 총점 평균 평점 석차 >>
		 */
		no = 1;
		name="김";
		kor= 34;
		eng = 45;
		math = 67;
		order = 0;
		grade = 'C' ;
		/*
		 * 3.변수를 출력
		 */

		/*
		 * --------------- 학생 성적 출력 --------------------
		   학번 이름 국어 영어 수학 총점 평균 석차
	       ---------------------------------------------------
	       1 김 34 45 67200 68.2 C 0
		 */
		
		System.out.println("--------------- 학생 성적 출력 --------------------");
		System.out.println("학번 이름 국어 영어 수학 총점  평균 평점 석차");
		System.out.println("---------------------------------------------------");
		System.out.println("  "+no+"   "+name+"   "+kor+"   "+eng+"   "+math+"   "+(kor+eng+math)+"  "+average+"   "+grade+"    "+order);

	}

}
