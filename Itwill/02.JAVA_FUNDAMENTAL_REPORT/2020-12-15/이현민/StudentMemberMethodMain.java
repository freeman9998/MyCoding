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
		stu1.basicInput(1, "KIM", 93, 82, 86);
		stu2.basicInput(2, "LEE", 85, 96, 93);
		stu3.basicInput(3, "SON", 77, 82, 80);
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		stu1.totCalculate();
		stu2.totCalculate();
		stu3.totCalculate();
		
		stu1.avgCalculate();
		stu2.avgCalculate();
		stu3.avgCalculate();
		
		stu1.gradeCalculate();
		stu2.gradeCalculate();
		stu3.gradeCalculate();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		stu1.headerPrint();
		stu1.print();
		stu2.print();
		stu3.print();
		return;
	}
}