package com.itwill00.variable;

public class StudentPrint {
	public static void main(String[] args) {
		int num = 1;
		String name = "KIM";
		int kor = 23;
		int eng = 56;
		int math = 44;
		int sum = 456;
		float avg = 23.5f;
		char grade = 'A';
		int rank = 7;

		System.out.println("---------------학생 성적출력-----------------------");
		System.out.println("학번  이름  국어  영어  수학  총점   평균 평점 석차");
		System.out.println("---------------------------------------------------");
		// System.out.println(" 1 KIM 23 56 44 456 23.5 A 7");
		System.out.println("  " + num + "   " + name + "   " + kor + "    " + eng + "    " + math + "    " + sum
				+ "    " + avg + "   " + grade + "   " + rank);
	}

}
