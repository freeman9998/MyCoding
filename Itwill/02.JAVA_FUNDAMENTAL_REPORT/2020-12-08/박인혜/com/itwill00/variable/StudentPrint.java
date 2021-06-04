package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		
		int num = 1;
		String name="Kim";
		int kor=34;
		int eng=45;
		int math=67;
		int sum=200;
		double ave=68.2;
		char rating='C';
		int so=0;
		
		
		
			System.out.println("----------------학생 성적출력----------------");
			
			System.out.println("학번 이름 국어 영어 수학 총점 평균 평점 석차");
			
			System.out.println("---------------------------------------------");
			
			System.out.println("  "+num+"   "+name+"  "+kor+"   "+eng+"   "
								+math+"  "+sum+"  "+ave+"  "+rating+"    "+so);
			
	/*
	---------------학생 성적출력--------------------
	학번  이름  국어 영어 수학 총점   평균 평점 석차
	------------------------------------------------
	 1    KIM    34   45   67   200   68.2   C    0
	*/
		}

	}