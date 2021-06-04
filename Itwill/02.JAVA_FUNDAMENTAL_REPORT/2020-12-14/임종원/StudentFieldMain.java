package com.itwill01.field;

public class StudentFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 2명 생성 
		 * Student.class 주소값을 저장할 참조변수 선언
		 */
		Student student1;
		Student student2;

		/*
		 * Student.class를 힙 메모리에 생성 -> 객체의 주소값이 식별자에 대입 
		 */
		student1 = new Student();
		student2 = new Student();

		/*
		 * 학생객체에기본데이타(번호,이름,국어,영어,수학)대입(2명) 
		 * 학생 객체 (번호,이름,국어,영어,수학)-> StudentFieldMain 필드값에 대입
		 */
		student1.no = 1;
		student1.name = "임종원";
		student1.kor = 100;
		student1.eng = 40;
		student1.math = 30;

		student2.no = 2;
		student2.name = "홍길동";
		student2.kor = 30;
		student2.eng = 40;
		student2.math = 30;
		
		/*
		 * 학생총점,평균,평점계산후 대입(2명)
		 */
		// 총점 : 학생 객체의 합계를 StudentFieldMain 필드에 계산 후 대입
		student1.tot = student1.kor + student1.eng + student1.math;
		student2.tot = student2.kor + student2.eng + student2.math;
		
		// 평균 : 학생 객체의 평균을 StudentFieldMain 필드에 계산 후 대입
		student1.avg = student1.tot / 3.0;
		student2.avg = student2.tot / 3.0;
		
		
		//학생 임종원 
		// 평점(등급) : 학생 객체에 속한 평균값을 계산 후 등급을 StudentFieldMain 필드에 대입
		if (student1.avg >= 90) {
			student1.grade = 'A';
		} else if (student1.avg >= 80) {
			student1.grade = 'B';
		} else if (student1.avg >= 70) {
			student1.grade = 'C';
		} else if (student1.avg >= 60) {
			student1.grade = 'D';
		} else {
			student1.grade = 'F';
		}
		
		//학생 홍길동
		// 평점(등급) : 학생 객체에 속한 평균값을 계산 후 등급을 StudentFieldMain 필드에 대입
		if (student2.avg >= 90) {
			student2.grade = 'A';
		} else if (student2.avg >= 80) {
			student1.grade = 'B';
		} else if (student2.avg >= 70) {
			student2.grade = 'C';
		} else if (student2.avg >= 60) {
			student2.grade = 'D';
		} else {
			student2.grade = 'F';
		}

		// 석차 : 학생 객체의 석차를 StudentFieldMain 필드에 대입
		student1.rank = 1;
		student2.rank = 0;
		
		/*
		 * 학생데이타출력 : StudentFieldMain 필드에 대입된 값을 출력
		 */
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n", student1.no, student1.name, student1.kor,
				student1.eng, student1.math, student1.tot, student1.avg, student1.grade, student1.rank);
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n", student2.no, student2.name, student2.kor,
				student2.eng, student2.math, student2.tot, student2.avg, student2.grade, student2.rank);
	}

}
