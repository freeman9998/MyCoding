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
		stu1.basicInput(1, "KIM", 90, 87, 81);
		Student stu2 = new Student(2, "LEE", 86, 92, 100);
		Student stu3 = new Student(3, "SON", 80, 70, 76);
		/*
		 * 학생총점계산 메쏘드 호출(3명) 
		 * 학생평균계산 메쏘드 호출(3명) 
		 * 학생평점계산 메쏘드 호출(3명)
		 */
		stu1.totCalculate();
		stu2.totCalculate();
		stu3.totCalculate();

		stu1.avgCalculate();
		stu2.avgCalculate();
		stu3.avgCalculate();
		
		stu1.gradeCalculate();
		stu2.gradeCalculate();
		stu3.gradeCalculate();
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
		stu1.setName("KOO");
		int stu1Tot = stu1.getTot();
		System.out.println("학생 student1("+stu1.getName()+")의 총점: "+stu1Tot);
		char stu2Grade = stu2.getGrade();
		System.out.println("학생 student2("+stu2.getName()+")의 학점: "+stu2Grade);
	}
}