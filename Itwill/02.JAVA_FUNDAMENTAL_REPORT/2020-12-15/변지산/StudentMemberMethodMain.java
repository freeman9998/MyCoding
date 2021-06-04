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
		stu1.setData(1, "김갑수", 92, 74, 88);
		stu2.setData(2, "박상무", 76, 92, 84);
		stu3.setData(3, "홍길동", 70, 62, 96);
		// student 클래스에 setData라 데이터를 받을 
		
	
		
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		//1번째학생
		stu1.calculatetot();
		stu1.calculateavg();
		stu1.calculateif();
		//2번째학생
		stu2.calculatetot();
		stu2.calculateavg();
		stu2.calculateif();
		//3번째학생
		stu3.calculatetot();
		stu3.calculateavg();
		stu3.calculateif();
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		stu1.headprint();
		stu1.print();
		stu2.print();
		stu3.print();

	}

}
