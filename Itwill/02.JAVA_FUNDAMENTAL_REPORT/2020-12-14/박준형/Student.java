package com.itwill01.field;
/*
 * 성적처리를 위해 필요한 학생객체를 만들기 위한 클래스
 */
public class Student {
	/*
	 * << 속성 >>
	 * 번호,이름,국어,영어,수학,총점,평균,평점(A,B,C),석차
	 * 저장할 필드의 선언
	 */
	
	int num; //학생 번호
	String name; //학생 이름
	int kor; //학생의 국어점수
	int eng; //학생의 영어점수
	int math; //학생의 수학점수
	int total; //학생의 총점
	float avg; //학생의 평균점수
	char score; //학생의 평점
	int rank; //학생의 석차
}
