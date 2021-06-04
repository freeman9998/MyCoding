  
package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student smmm1 = new Student();
		Student smmm2 = new Student();
		Student smmm3 = new Student();
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		smmm1.setStudentData(1, "KIM", 34, 56, 67);
		smmm2.setStudentData(2, "LEE", 77, 82, 89);
		smmm3.setStudentData(3, "SON", 84, 66, 78);
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		smmm1.calculateTot();
		smmm2.calculateTot();
		smmm3.calculateTot();
		
		smmm1.calculateAvg();
		smmm2.calculateAvg();
		smmm3.calculateAvg();
		
		smmm1.gradeMethod();
		smmm2.gradeMethod();
		smmm3.gradeMethod();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		smmm1.print();
		smmm2.print();
		smmm3.print();
		
	}

}