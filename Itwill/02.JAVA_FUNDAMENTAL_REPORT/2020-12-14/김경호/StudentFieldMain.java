package com.itwill01.field;

public class StudentFieldMain {

	public static void main(String[] args) {
		/*
		 *학생객체 2명 생성
		 */
		
		/*
		 * 학생객체에기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		
		
		/*
		 * 학생총점,평균,평점계산후 대입(2명)
		 */
		
		/*
		 * 학생데이타출력
		 */
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",1,"KIM",34,56,67,340,34.7,'A',0);
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",1,"LEE",34,56,67,340,34.7,'A',0);
	}

}
