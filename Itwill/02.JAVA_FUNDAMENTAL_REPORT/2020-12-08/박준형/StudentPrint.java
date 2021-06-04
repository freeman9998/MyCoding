package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		/*
		 * 1.출력할 데이타를 담을 변수선언
		 */
		int student_no,kor_score,eng_score,math_score,total_score,student_rank;
		float average_score;
		String student_name;
		char average_point;
		/*
		 * 2.변수에 데이타대입
		 * <<학번,이름,국어,영어,수학>>
		 * <<총점,평균,평점,석차>>
		 */
		student_no=1;
		student_name="Bak";
		kor_score=100;
		eng_score=80;
		math_score=99;
		total_score=279;
		average_score=93.0F;
		average_point='A';
		student_rank=4;
		/*
		 * 3.변수를 출력
		 -------------------학생 성적출력---------------------
		 학번  이름  국어  영어  수학  총점  평균  평점  석차
		 -----------------------------------------------------
 		   1    KIM    34   45   67   200   68.2   C    0
		 */
		
		System.out.println("-------------------학생 성적출력---------------------");
		System.out.println("학번  이름  국어  영어  수학  총점  평균  평점  석차");
		System.out.println("-----------------------------------------------------");
		System.out.println(" "+student_no+"    "+student_name+"    "+kor_score+"    "+eng_score+"    "+math_score+"   "+total_score+"   "+average_score+"   "+average_point+"    "+student_rank);
	}

}
