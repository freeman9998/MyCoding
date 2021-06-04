package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student std1 = new Student(); //학생 객체 생성
		Student std2 = new Student();
		Student std3 = new Student();
		
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		std1.setStudentData(1, "김우주", 90, 81, 85);
		std2.setStudentData(2, "김하나", 37, 54, 80);
		std3.setStudentData(3, "김뚝딱", 89, 68, 70);
		

		//학생총점계산 메쏘드 호출(3명)
		
		std1.calculateTot();
		std2.calculateTot();
		std3.calculateTot();

		//학생평균계산 메쏘드 호출(3명)
		std1.calculateAvg();
		std2.calculateAvg();
		std3.calculateAvg();
		
		
		//학생평점계산 메쏘드 호출(3명)
		std1.calculateGrade();
		std2.calculateGrade();
		std3.calculateGrade();

		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		std1.headPrint();
		std1.print();
		std2.print();
		std3.print();
		
	}

}
