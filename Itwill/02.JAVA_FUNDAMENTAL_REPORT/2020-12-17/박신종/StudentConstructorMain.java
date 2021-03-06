package com.itwill02.constructor;


public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student stu1 = new Student();
		Student stu2 = new Student(2,"park", 80,70,60);
		Student stu3 = new Student(3,"kin", 70,60,50);
		
		stu1.setStudentData(1, "jung", 90, 80, 70);
		
		/*
		 * 학생총점계산 메쏘드 호출(3명) 
		 * 학생평균계산 메쏘드 호출(3명) 
		 * 학생평점계산 메쏘드 호출(3명)
		 */
		stu1.calculateTotal();
		stu2.calculateTotal();
		stu3.calculateTotal();
		
		stu1.calculateAvg();
		stu2.calculateAvg();
		stu3.calculateAvg();
		
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
		stu1.setStudentNameData("choi");
		int stu1Total = stu1.getCalculateTotal();
		System.out.println("stu1 총점 : " + stu1Total);

		char stu2Grade = stu2.getCalculateGrade();
		System.out.println("stu2 학점 : " + stu2Grade);

	}

}