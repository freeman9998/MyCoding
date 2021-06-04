package com.itwill00.variable.김동현;

public class StudentMemberMethod {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		st1.studentData(1, "김자바", 82 , 43, 60, 0);
		st2.studentData(2, "박자바", 32 , 41, 23, 0);
		st3.studentData(3, "최자바", 66 , 90, 100, 0);
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		st1.tot();
		st2.tot();
		st3.tot();
		
		st1.avg();
		st2.avg();
		st3.avg();
		
		st1.grade();
		st2.grade();
		st3.grade();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		st1.headPrint();
		st1.print();
		st2.print();
		st3.print();
	}

}