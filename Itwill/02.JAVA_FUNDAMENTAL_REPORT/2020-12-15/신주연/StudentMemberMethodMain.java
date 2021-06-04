package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		
		// Student객체의 주소값을 저장을 저장할 참조변수선언
		// Student.Class로 부터 힙메모리에 Student객체를 찍고, 
		// 각 객체의 주소값을 st1,st2,st3 변수에 대입.
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		

		/* setDate메쏘드를 호출시켜 각 데이터를 대입.
		setDate메소드 호출은 각st1,st2,st3객체에 setDate의 이름을 갖는 
		메소드를 실행하기위해 스레드를 setDate메소드로 보낸다.*/
		
		st1.setDate(15,"KIM",98,76,54);
		st2.setDate(18, "LEE", 67, 58, 99);
		st3.setDate(22, "PARK", 89, 65, 87);
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		
		//calculateTot메쏘드 호출
		st1.calculateTot();
		st2.calculateTot();
		st3.calculateTot();
		
		//calculateAvg메쏘드 호출
		st1.calculateAvg();
		st2.calculateAvg();
		st3.calculateAvg();
		
		//calculateGrade메쏘드 호출
		st1.calculateGrade();
		st2.calculateGrade();
		st3.calculateGrade();

		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		
		// setPrint메쏘드와 print메쏘드 호출
		st1.setPrint();
		st1.print();
		st2.print();
		st3.print();

	}

}
