package com.itwill01.field;

public class StudentFieldMain {

	public static void main(String[] args) {
		/*
		  학생 객체 2명 생성
		 */
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		/*
		  학생 객체에 2명 기본 데이타(번호,이름,국어,영어,수학) 대입
		 */
		stu1.no = 1;
		stu2.no = 2;
		stu1.name = "김경호";
		stu2.name = "김경미";
		stu1.kor = 56;
		stu2.kor = 70;
		stu1.eng = 65;
		stu2.eng = 95;
		stu1.math = 45;
		stu2.math = 88;
		
		/*
		  학생 2명 총점,평균,석차 대입
		 */
		stu1.tot = stu1.kor + stu1.eng + stu1.math;
		stu2.tot = stu2.kor + stu2.eng + stu2.math;
		stu1.avg = stu1.tot / 3.0;
		stu2.avg = stu2.tot / 3.0;
		stu1.rank = 2;
		stu2.rank = 1;
		
		//학생객체의 grade멤버필드에 조건실행 후 대입
		if (stu1.avg >= 90) {
			stu1.grade = 'A';
		} else if (stu1.avg >= 70) {
			stu1.grade = 'B';
		} else if (stu1.avg >= 60) {
			stu1.grade = 'C';
		} else if (stu1.avg >= 40) {
			stu1.grade = 'D';
		} else {
			stu1.grade = 'F';
		}

		if (stu2.avg >= 90) {
			stu2.grade = 'A';
		} else if (stu2.avg >= 70) {
			stu2.grade = 'B';
		} else if (stu2.avg >= 60) {
			stu2.grade = 'C';
		} else if (stu2.avg >= 40) {
			stu2.grade = 'D';
		} else {
			stu2.grade = 'F';
		}
		
	
		/*
		  학생 데이타 출력
		 */
		System.out.printf("----------------학생 성적출력------------------%n");
		System.out.printf("%s %s %s %s %s %s %s %s %s %n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%2d %4s %3d %4d %4d %4d %5.1f %2c %3d%n", stu1.no, stu1.name, stu1.kor, stu1.eng, stu1.math,
				stu1.tot, stu1.avg, stu1.grade, stu1.rank);
		System.out.printf("%2d %4s %3d %4d %4d %4d %5.1f %2c %3d%n", stu2.no, stu2.name, stu2.kor, stu2.eng, stu2.math,
				stu2.tot, stu2.avg, stu2.grade, stu2.rank);

	}

}
