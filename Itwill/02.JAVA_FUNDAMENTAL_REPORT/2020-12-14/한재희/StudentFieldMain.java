package com.itwill01.field;

public class StudentFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체를 2명 생성
		 */

		Student stu1;
		stu1 = new Student();

		Student stu2;
		stu2 = new Student();

		/*
		 * 학생객체에 기본 데이터(번호,이름,국어,영어,수학) 대입(2명)
		 */

		stu1.no = 1;
		stu1.name = "HJH";
		stu1.kor = 91;
		stu1.eng = 84;
		stu1.math = 76;

		stu2.no = 2;
		stu2.name = "HCH";
		stu2.kor = 82;
		stu2.eng = 93;
		stu2.math = 68;

		/*
		 * 학생 총점, 평균, 평점 계산 후 대입(2명)
		 */

		stu1.tot = stu1.kor + stu1.eng + stu1.math;
		stu2.tot = stu2.kor + stu2.eng + stu2.math;

		// 학생 객체의 avg 멤버필드에 계산 후 값 대입

		stu1.avg = stu1.tot / 3.0;
		stu2.avg = stu2.tot / 3.0;

		if (stu1.avg >= 90) {
			stu1.grade = 'A';
		} else if (stu1.avg >= 80) {
			stu1.grade = 'B';
		} else if (stu1.avg >= 70) {
			stu1.grade = 'C';
		} else if (stu1.avg >= 60) {
			stu1.grade = 'D';
		} else {
			stu1.grade = 'F';
		}

		if (stu2.avg >= 90) {
			stu2.grade = 'A';
		} else if (stu2.avg >= 80) {
			stu2.grade = 'B';
		} else if (stu2.avg >= 70) {
			stu2.grade = 'C';
		} else if (stu2.avg >= 60) {
			stu2.grade = 'D';
		} else {
			stu2.grade = 'F';
		}
		
		/*
		 * 학생 데이터 출력
		 */
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d\n", stu1.no, stu1.name, stu1.kor, stu1.eng, stu1.math, stu1.tot, stu1.avg, stu1.grade, stu1.rank);
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d\n", stu2.no, stu2.name, stu2.kor, stu2.eng, stu2.math, stu2.tot, stu2.avg, stu2.grade, stu2.rank);
	}

}
