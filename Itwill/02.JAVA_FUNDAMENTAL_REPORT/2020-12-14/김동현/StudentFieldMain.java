package com.itwill00.variable.김동현;

public class StudentFieldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체생성(2명)
		 */
		student student1;
		student student2;

		//학생 객체를 힙메모리에 생성 후, 객체의 번지가 student1,student2에 대입
		student1 =new student();
		student2 =new student();
		
		/*
		 * 학생객체에 기본 데이터(번호,이름,국,영,수) 입력(2명)
		 */
		//학생 객체의 no,name,kor,eng,math 멤버필드에 값 대입
		student1.no = 1;
		student1.name = "Kim";
		student1.kor = 74;
		student1.eng = 81;
		student1.math = 67;
		
		student2.no = 2;
		student2.name = "Lee";
		student2.kor = 60;
		student2.eng = 32;
		student2.math = 21;
		
		/*
		 * 총점,평균,평점,석차계산 후 대입(2명)
		 */
		//학생 객체의 tot 멤버필드에 계산 후 값대입
		student1.tot = student1.kor + student1.eng + student1.math;
		student2.tot = student2.kor + student2.eng + student2.math;
		
		//학생 객체의 avg 멤버필드에 계산 후 값대입
		student1.avg = student1.tot / 3.0;
		student2.avg = student2.tot / 3.0;
	
		//학생 객체의 grade 멤버필드에 계산 후 값대입
		if(student1.avg >= 90) {
			student1.grade = 'A';
		}else if(student1.avg >= 80) {
			student1.grade = 'B';
		}else if(student1.avg >= 70) {
			student1.grade = 'C';
		}else if(student1.avg >= 60) {
			student1.grade = 'D';
		}else {
			student1.grade = 'F';
		}
		
		if (student2.avg >= 90) {
		student2.grade = 'A';
		}
		else if (student2.avg >= 80) {
		student2.grade = 'B';
		}
		else{
		student2.grade = 'C';
		}
		
		//학생 객체의 rank 멤버필드에 계산 후 값대입
		student1.rank = 2;
		student2.rank = 1;
		
		
		
		/*
		 * 학생데이타출력
		 */
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n",
						"학번","이름","국어","영어", "수학","총점","평균", "평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
				student1.no,student1.name,student1.kor,student1.eng,student1.math,student1.tot,student1.avg,student1.grade,student1.rank);
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n",
				student2.no,student2.name,student2.kor,student2.eng,student2.math,student2.tot,student2.avg,student2.grade,student2.rank);
		
		
		
		
	}

}