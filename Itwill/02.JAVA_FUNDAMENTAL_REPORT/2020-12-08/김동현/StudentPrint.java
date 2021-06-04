package com.itwill00.variable;

public class StudentPrint {
	public static void main(String[] args) {
		int num = 1;
		String name = "KIM";
		int kor = 12;
		int eng = 22;
		int math = 32;
		int sum = 432;
		float avg = 43.21f;
		char grade = 'B';
		int rank = 2;

		System.out.println("---------------학생 성적출력-----------------------");
		System.out.println("학번  이름  국어  영어  수학  총점   평균 평점 석차");
		System.out.println("---------------------------------------------------");
		// System.out.println(" 1 KIM 12 22 32 432 43.21 B 2");
		System.out.println(" " + num + " " + name + " " + kor + " " + eng + " " + math + " " + sum
				+ " " + avg + " " + grade + " " + rank);
	}
}
