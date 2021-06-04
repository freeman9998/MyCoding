package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		
		/*
		학생객체생성(3명)
		*/
		Student st1=new Student();
		Student st2=new Student();
		Student st3=new Student();
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		st1.setStudentData(1, "KIM", 56, 78, 98);
		st2.setStudentData(2, "HIM", 45, 23, 56);
		st3.setStudentData(3, "DIM", 89, 91, 33);
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		/*
		st1.calculateTotal();
		st1.calculateAvg();
		st1.calculateGrade();
		
		st2.calculateTotal();
		st2.calculateAvg();
		st2.calculateGrade();
		
		st3.calculateTotal();
		st3.calculateAvg();
		st3.calculateGrade();
		*/
		st1.calculateAll();
		st2.calculateAll();
		st3.calculateAll();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		Student.headerPrint();
		st1.print();
		st2.print();
		st3.print();
	}

}
