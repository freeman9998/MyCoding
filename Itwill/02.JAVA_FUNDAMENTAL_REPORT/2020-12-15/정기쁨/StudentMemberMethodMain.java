package com.itwill01.field;

public class StudentMemberMethodMain {

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
		st1.setData(1, "홍길동", 75, 80, 68);
		st2.setData(2, "김똑똑", 52, 46, 48);
		st3.setData(3, "정바보", 90, 83, 72);

		/*
		 학생총점계산 메쏘드 호출(3명)
		*/
		st1.calculateTot();
		st2.calculateTot();
		st3.calculateTot();
		 /*
		 학생평균계산 메쏘드 호출(3명)
		 */
		st1.calculateAvg();
		st2.calculateAvg();		
		st3.calculateAvg();
				/*
		 학생평점계산 메쏘드 호출(3명)
		 */
		st1.calculateGrade();
		st2.calculateGrade();
		st3.calculateGrade();

		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		st1.basicPrint();
		st1.print();
		st2.print();
		st3.print();

	}

}
