package com.itwill00.variable;

public class Studentprint {

	public static void main(String[] args) {
		
		int no;
		String name;
		int kor;
		int eng;
		int math;
		int total;
		double ave;
		char gra;
		int rank;

		no=1;
		name="KIM";
		kor=34;
		eng=45;
		math=67;
		total=200;
		ave=68.2;
		gra='C';
		rank=0;
		

		
		
		
		System.out.println("---------------학생 성적출력-----------------------");
		System.out.println("학번  이름  국어  영어  수학  총점 평균 평점 석차");
		System.out.println("---------------------------------------------------");
		System.out.println("  "+  no +"    "+name+"   "+kor+"    "+eng+"    "+math+"   "+total+"   "+ave+"  "+gra+"  "+rank);
	
		
		
	}

}
