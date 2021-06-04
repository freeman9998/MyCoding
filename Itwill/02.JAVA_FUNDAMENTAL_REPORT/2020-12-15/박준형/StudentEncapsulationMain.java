package com.itwill01.field;

public class StudentEncapsulationMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		StudentEncapsulation student1= new StudentEncapsulation();
		StudentEncapsulation student2= new StudentEncapsulation();
		StudentEncapsulation student3= new StudentEncapsulation();
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		student1.setStudentData(1, "홍길동", 100, 98, 77);
		student2.setStudentData(2, "김개똥", 70, 63, 54);
		student3.setStudentData(3, "최민수", 81, 92, 73);
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		student1.totalcalc();
		student2.totalcalc();
		student3.totalcalc();
		
		student1.avgcalc();
		student2.avgcalc();
		student3.avgcalc();
		
		student1.scorecalc();
		student2.scorecalc();
		student3.scorecalc();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		student1.startline();
		student1.print();
		student2.print();
		student3.print();
	}

}
