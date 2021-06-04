package com.itwill01.field;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		//사용자정의타입의 변수를 선언 및 객체 생성
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		student1.setStudentData(1, "홍길동", 100, 94, 76);
		student2.setStudentData(2, "김둘리", 45, 70, 90);
		student3.setStudentData(3, "도우너", 85, 75, 89);
		
		/*
		 학생총점,평균,평점 계산 메쏘드 호출(3명)
		 */
		student1.claculate();
		student2.claculate();
		student3.claculate();

		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		student1.print();
		student2.print();
		student3.print();

	}

}
