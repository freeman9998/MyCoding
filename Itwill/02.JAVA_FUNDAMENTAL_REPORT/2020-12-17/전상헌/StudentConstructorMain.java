package com.itwill02.constructor;


public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		//new 는 객체를 생성하는 연산자 new 뒤에는 생성자를 붙여 객체를 생성 
		//생성한뒤 변수를 선언하여 변수에 주소값을 저장
		Student stu1=new Student();
		//stu1변수에 접근연산자.를 이용하여 학생객체데이타 입력메쏘드를 호출
		stu1.setStudentData(1, "HONG", 62,55, 81);
		
		//매개변수가있는 생성자를 이용하여 바로 값을 저장
		Student stu2=new Student(2, "LIE", 50, 60, 70);
		Student stu3=new Student(3, "HEE", 70, 68, 30);
		
		
		
		/*
		 * 학생총점계산 메쏘드 호출(3명) 
		 * 학생평균계산 메쏘드 호출(3명) 
		 * 학생평점계산 메쏘드 호출(3명)
		 */
		
		
		//학생총점계산 메쏘드 호출
		stu1.calculateTotal();
		stu2.calculateTotal();
		stu3.calculateTotal();
		
		
		//학생평균계산 메쏘드 호출
		stu1.calculateAvg();
		stu2.calculateAvg();
		stu3.calculateAvg();
		
		//학생평점계산 메쏘드 호출
		stu1.calculateGrade();
		stu2.calculateGrade();
		stu3.calculateGrade();
		
		
		
		
		
		/*
		 * 학생데이타3명 출력메쏘드 호출
		 */
		stu1.headerPrint();
		stu1.print();
		stu2.print();
		stu3.print();
		
		
		
		
		/*
		 * 학생 student1 의 이름변경
		 * 학생 student1 의 총점데이타 반환받은후 메인에서출력
		 * 학생 student2 의 학점데이타 반환받은후 메인에서출력
		 */
		//student에서 getter setter작성후 stu1이름변경
		stu1.setName("CHI");
		System.out.println("-----------------------------------");
		System.out.println(stu1.getTot());
		System.out.println(stu2.getGrade());
		
		
		

	}

}