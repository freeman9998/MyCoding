package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		/*
		1.출력할 데이타를 담을 변수선언
		 */
		
		int id,kor,eng,math,total,rank;
		String name;
		char aver;
		/*
		 2.변수에 데이타 대입
		 */
		id = 1;
		name = "KIM";
		kor = 80;
		eng = 75;
		math = 80;
		total = 235;
		aver = 'C';
		rank = 1;
		/*
		 3.변수를 출력
		 */

		/*
--------------- 학생 성적 출력 --------------------
학번 이름 국어 영어 수학 총점 평균 석차
------------------------------------------------------
 1    KIM    34   45   67   200   68.2   C    0
		 */
		System.out.println("--------------- 학생 성적 출력 --------------------");
		System.out.println("학번 이름 국어 영어 수학 총점 평균 석차");
		System.out.println("------------------------------------------------------");
		System.out.println("  " + id + "   " + name + "  " + kor + "    " + eng + "    " + math + "   " + total + "   " + aver + "     " + rank);
		
	}

}
