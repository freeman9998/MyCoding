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
		stu1.basicData(1, "김정은", 98, 55, 75);
		stu2.basicData(2, "김대리", 33, 40, 28);
		stu3.basicData(3, "이대리", 84, 88, 98);
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		stu1.totData();
		stu2.totData();
		stu3.totData();
		stu1.avgData();
		stu2.avgData();
		stu3.avgData();
		stu1.gradeData();
		stu2.gradeData();
		stu3.gradeData();
		stu1.rankData(2);
		stu2.rankData(3);
		stu3.rankData(1);
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		stu1.headprint();
		stu1.print();
		stu2.print();
		stu3.print();

	}

}
