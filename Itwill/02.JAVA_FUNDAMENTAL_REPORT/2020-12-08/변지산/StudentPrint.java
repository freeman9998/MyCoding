package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		/*
		 * 1.출력할 데이터를 담을 변수 선언
		 */
		int  num;
		String  name;
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		char rate;
		int rank;
		
		
		
		/*
		 * 2. 변수에 데이터를 대입
		 */
		num = 1;
		name = "KIM";
		kor = 34;
		eng = 45;
		math = 67;
		sum = 146;
		avg = 48.6;
		rate = 'B';
		rank = 13;
		
		/*
		 * 3. 변수를 출력/*
		 */
		System.out.println("-------------------학생 성적 출력-------------------");
		System.out.println("학번  이름  국어  영어  수학  총점  평균  평점  석차");
		System.out.println("----------------------------------------------------");
		System.out.println("  " + num + "    " + name + "   " + kor + "    " + eng + "    " + math + "   " + sum + "   " + avg + "    " + rate + "    " + rank );
		System.out.println("----------------------------------------------------");


	}

}
