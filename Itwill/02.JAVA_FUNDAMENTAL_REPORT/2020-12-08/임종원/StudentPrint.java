package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		
	int num = 1;
	String name="kim";
	int kor=34;
	int eng=45;
	int math=67;
	int sum=200;
	double avr=68.2;
	char rating='C';
	int standing_order=0;
	
	
	
		System.out.println("----------학생 성적출력----------");
		System.out.println("학번 이름 국어 영어 수학 총점  평균 평점 석차");
		System.out.println(num+"     "+name+"  "+kor+"   "+eng+"   "
							+math+"  "+sum+"   "+avr+"  "+rating+"    "+standing_order);
		
/*
---------------학생 성적출력--------------------
학번  이름  국어 영어 수학 총점   평균 평점 석차
------------------------------------------------
 1    KIM    34   45   67   200   68.2   C    0
*/
	}

}
