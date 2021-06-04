package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		
		int number,kor,eng,math,sum,rank;
		char grade;
		double avg;
		String name="KIM";
		
		number=1;
		kor=34;
		eng=45;
		math=67;
		sum=200;
		avg=68.2;
		grade='C';
		rank=0;
		
			
		
		System.out.println("---------------학생 성적출력--------------------");
		System.out.println("학번  이름  국어 영어 수학 총점   평균 평점 석차");
		System.out.println("------------------------------------------------");
		System.out.println(" " + number + "    " + name + "    " + kor + "   " + eng + "   " + math + "   " + sum + "   " + avg + "  " + grade + "    " + rank);
		

	}

}
