package com.itwill00.variable;
/*
 * 1.클래스이름
	StudentPrint 

2.클래스 구성요소
        메인메쏘드블록1개

3.실행결과
	
---------------학생 성적출력--------------------
학번  이름  국어 영어 수학 총점   평균 평점 석차
------------------------------------------------
 1    KIM    34   45   67   200   68.2   C    0

 *
 */

public class StudentPrint {

	public static void main(String[] args) {
		int no=1;
		String name="KIM";
		int kor=34;
		int eng=45;
		int math=67;
		int tot=kor+eng+math;
		double everage=tot/3;
		char type='C';
		int rank=0;
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("---------------학생 성적출력--------------------");
		System.out.println("학번  이름  국어 영어 수학 총점   평균 평점 석차");
		System.out.println("------------------------------------------------");
		System.out.println( no+"     "+name+"   "+kor+"    "+eng+"   "+math+"  "+tot+"     "+everage+"    "+type+"  "
				+ " "+rank);
		 
		
		
		

	}

}
