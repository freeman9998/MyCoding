package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		
		stu1.setStudentData(1, "KIM", 88, 92, 71);
		stu2.setStudentData(2, "LEE", 76, 56, 67);
		stu3.setStudentData(3, "PARK", 100, 58, 79);
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		
		stu1.total();
		stu2.total();
		stu3.total();
		
		stu1.average();
		stu2.average();
		stu3.average();
		
		stu1.calculategrade();
		stu2.calculategrade();
		stu3.calculategrade();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		
		System.out.printf("---------------학생 성적출력-------------------%n");
		System.out.printf("%s %2s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");
		stu1.print();
		stu2.print();
		stu3.print();
		
		
	}

}