package com.itwill00.variable;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class StudentScorePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언 - 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A,B,C), 석차
		 */
		int no, no2;
		String name, name2;
		int kor, eng, math, kor2, eng2, math2;
		int tot, tot2;
		double avg, avg2;
		char grade, grade2;
		int rank = 0, rank2 = 0;
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력
		 */
		no = 1;
		name = "KIM";
		kor = 100;
		eng = 100;
		math = 100;

		no2 = 2;
		name2 = "LIM";
		kor2 = 50;
		eng2 = 50;
		math2 = 100;

		String msg = "잘못된 점수 입력입니다.";
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크 - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */

		if (kor < 0 || kor > 100) {
			System.out.println(kor + msg);
			return;
		} else if (eng < 0 || eng > 100) {
			System.out.println(eng + msg);
			return;
		} else if (math < 0 || math > 100) {
			System.out.println(math + msg);
			return;
		} else if (kor2 < 0 || kor2 > 100) {
			System.out.println(kor2 + msg);
			return;
		} else if (eng2 < 0 || eng2 > 100) {
			System.out.println(eng2 + msg);
			return;
		} else if (math2 < 0 || math2 > 100) {
			System.out.println(math2 + msg);
			return;
		}
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */

		// 총점
		int student_tot1, student_tot2;
		student_tot1 = kor + eng + math;
		student_tot2 = kor2 + eng2 + math2;

		// 평균
		double student_avg1, student_avg2;
		student_avg1 = student_tot1 / 3.0; // 88.666666666
		student_avg2 = student_tot2 / 3.0; // 26.66666

		// 평점
		char student1_grade1 = ' ';
		char student1_grade2 = ' ';

		if (student_avg1 >= 90 && student_avg1 <= 100) {
			student1_grade1 = 'A';
			System.out.println(student1_grade1);
		} else if (student_avg1 >= 80 && student_avg1 <= 89) {
			student1_grade1 = 'B';
			System.out.println(student1_grade1);
		} else if (student_avg1 >= 70 && student_avg1 <= 79) {
			student1_grade1 = 'C';
			System.out.println(student1_grade1);
		} else if (student_avg1 >= 60 && student_avg1 <= 69) {
			student1_grade1 = 'D';
			System.out.println(student1_grade1);
		} else if (student_avg1 >= 00 && student_avg1 <= 59) {
			student1_grade1 = 'F';
			System.out.println(student1_grade1);
		} 

		if (student_avg2 >= 90 && student_avg2 <= 100) {
			student1_grade2 = 'A';
			System.out.println(student1_grade2);
		} else if (student_avg2 >= 80 && student_avg2 <= 89) {
			student1_grade2 = 'B';
			System.out.println(student1_grade2);
		} else if (student_avg2 >= 70 && student_avg2 <= 79) {
			student1_grade2 = 'C';
			System.out.println(student1_grade2);
		} else if (student_avg2 >= 60 && student_avg2 <= 69) {
			student1_grade2 = 'D';
			System.out.println(student1_grade2);
		} else if (student_avg2 >= 00 && student_avg2 <= 59) {
			student1_grade2 = 'F';
			System.out.println(student1_grade2);
		}
		/*
		 * - 출력포맷 - 평균은 소수점이하 2째자리수에서 반올림하세요 - 석차는 구하지마세요 --------------학생
		 * 성적출력------------------- 학번 이름 국어 영어 수학 총점 평균 평점 석차
		 * ----------------------------------------------- 1 김경호 42 56 78 334 34.8 A 3 2
		 * 김경수 45 53 76 334 34.8 A 2 -----------------------------------------------
		 */
		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번 이름 국어 영어 수학 총점   평균   평점  석차");
		System.out.printf(" %d  %5s  %d  %d  %d  %d  %.2f  %2c  %5d\n",no,name,kor,eng,math,student_tot1,student_avg1,student1_grade1,rank);
		System.out.printf(" %d  %5s  %d  %3d  %4d  %d  %.2f  %3c  %5d\n",no2,name2,kor2,eng2,math2,student_tot2,student_avg2,student1_grade2,rank2);
		System.out.println("-----------------------------------------------");
	}
}
