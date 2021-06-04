package com.itwill01.field;
/*
 * 성적처리를  위해 필요한 학생객체를 만들기 위한 클래스 
 */

public class Student {
	/*
	 * <<속성>>
	 * 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차를
	 * 저장할 필드 선언
	 */
	//변수 선언 
	//데이터 타입 +변수이름 
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
	char rank;
	int level=0;
}
