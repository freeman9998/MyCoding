package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		/*
		 * 1.출력할 데이타를 담을 변수선언
		 * << 학번, 이름, 국어, 영어, 수학, 총점, 평균, 평점, 석차 >>
		 */
		int no;
		String name,grade;
		byte kor, eng, math, rank;
		short sum;
		float avg;
		
		
		/*
		 * 2.변수에 데이타 대입
		 * << 학번, 이름, 국어, 영어, 수학 >>
		 * << 총점, 평균, 평점, 석차 >> -->그대로 입력
		 */
		no = 1;
		name = "KIM";
		kor = 34;
		eng = 45;
		math = 67;
		sum = 146;
		rank = 85;
		avg = 48.67F;
		grade = "C";
		
		
		
		
		/*
		 * 3.변수를 출력
		 */
		System.out.println("---------------학생 성적출력--------------------");
		System.out.println("학번  이름  국어 영어 수학 총점  평균  평점 석차");
		System.out.println(" " + no +"   " + name + "  " + kor + "  " + eng + "  " + math + "  " + sum +" "+ avg + "  " + grade + "   "+ rank);
		System.out.println("---------------------------------------------");
		
		
		
		/*
---------------학생 성적출력--------------------
학번  이름  국어 영어 수학 총점   평균 평점 석차
---------------------------------------------
 1    KIM    34   45   67   200   68.2   C    0
		 */

	}

}
