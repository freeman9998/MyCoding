package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		
		int no;
		no = 1;
		
		String name;
		name = "KIM";
		
		int kor;
		kor = 23;
		
		int eng;
		eng = 56;
		
		int math;
		math = 44;
		
		int total;
		total = 456;
		
		double average;
		average = 23.5;
		
		char grade;
		grade = 'A';
		
		int rank;
		rank = 7;
		
		System.out.println("-----------------학생 성적출력----------------");
		System.out.println("학번  이름  국어  영어  수학  총점  평균  평점  석차");
		System.out.println("-------------------------------------------");
		System.out.println(" "+no+"   "+name+"  "+kor+"   "+eng+"  "+math+"   "+total+"  "+average+"  "+grade+"    "+rank);
		

	}

}
