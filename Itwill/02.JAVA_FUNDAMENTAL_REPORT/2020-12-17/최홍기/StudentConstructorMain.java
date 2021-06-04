package com.itwill02.constructor;


public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student student1 = new Student();
		student1.setStudentData(1, "KIM", 87, 54, 62);
		
		Student student2 = new Student(2, "LEE", 77, 85, 64);
		Student student3 = new Student(3, "YUN", 62, 76, 53);
		/*
		 * 학생총점계산 메쏘드 호출(3명) 
		 * 학생평균계산 메쏘드 호출(3명) 
		 * 학생평점계산 메쏘드 호출(3명)
		 */
		student1.calculateTotal();
		student2.calculateTotal();
		student3.calculateTotal();
		
		student1.calculateAvg();
		student2.calculateAvg();
		student3.calculateAvg();
		
		student1.calculateGrade();
		student2.calculateGrade();
		student3.calculateGrade();
		/*
		 * 학생데이타3명 출력메쏘드 호출
		 */
		student1.headerPrint();
		student1.print();
		student2.print();
		student3.print();
		/*
		 * 학생 student1 의 이름변경
		 * 학생 student1 의 총점데이타 반환받은후 메인에서출력
		 * 학생 student2 의 학점데이타 반환받은후 메인에서출력
		 */
		student1.setName("JIN");
		//System.out.println(student1.getName());
		System.out.println("student1.getTot() : " + student1.getTot());
		System.out.println("student2.getGrade() : " +student2.getGrade());

	}

}