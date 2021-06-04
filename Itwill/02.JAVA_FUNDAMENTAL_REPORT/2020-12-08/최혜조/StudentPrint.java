package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		
		int num = 1;
		String name = "KIM";
		int language = 34;
		int english = 45;
		int math = 65;
		int all = 200;
		double avg = 68.2; 
		char rating = 'C';
		int rank = 0;
	
		System.out.println("---------------학생 성적출력--------------------");
		System.out.println("학번  이름  국어 영어 수학 총점   평균 평점 석차");
		System.out.println("------------------------------------------------");
		System.out.println(" " + num + "    " + name + "    " + language + "   " + english + "   " + math + "   " + all + "   " + avg + "  " + rating + "    " + rank);

	}

}
