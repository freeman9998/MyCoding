package com.itwill01.field;
/*
 * 성적처리를 위해 필요한 학생객체를 만들기 위한 클래스
 */
public class Student {
	/*
	 * << 속성 >>
	 *  번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차를
	 *  저장할 필드의 선언
	 */
	
	//Student 객체의 멤버필드 선언
	int no;//번호
	String name;//이름
	int kor, eng, math, tot;//국어, 영어, 수학, 총점
	double avg;//평균
	char grade;//평점
	int rank;//석차
}
