package com.itwill01.method;

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
		st1.setData(1, "김자바", 82 , 43, 60);
		st2.setData(2, "박자바", 32 , 41, 23);
		st3.setData(3, "최자바", 66 , 90, 100);
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		st1.totCalculate();
		st2.totCalculate();
		st3.totCalculate();
		st1.avgCalculate();
		st2.avgCalculate();
		st3.avgCalculate();
		st1.gradeCalculate();
		st2.gradeCalculate();
		st3.gradeCalculate();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		st1.headerPrint();
		st1.print();
		st2.print();
		st3.print();
	}

}
