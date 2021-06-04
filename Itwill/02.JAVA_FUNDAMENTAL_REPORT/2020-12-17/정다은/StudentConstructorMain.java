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
		stu1.setStuData(1, "KIM", 84, 81, 67);
		
		Student stu2 = new Student(2, "Lee", 88, 97, 91);
		Student stu3 = new Student(3, "JUNG", 90, 57, 96);
		
		
		/*
		 * 학생총점계산 메쏘드 호출(3명) 
		 * 학생평균계산 메쏘드 호출(3명) 
		 * 학생평점계산 메쏘드 호출(3명)
		 */
		stu1.setTot();
		stu2.setTot();
		stu3.setTot();
		
		stu1.setAvg();
		stu2.setAvg();
		stu3.setAvg();
		
		stu1.setGrade();
		stu2.setGrade();
		stu3.setGrade();
		
		
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
		
		stu1.setName("BYUN");
		stu1.renameHeaderPrint();
		stu1.print();
		
		int resultTot1 = stu1.getTot();
		System.out.println("main --> stu1의 총점데이터 반환 :"+ resultTot1);
		
		char resultGrade = stu2.getGrade();
		System.out.println("main --> stu2의 학점데이터 반환 :"+ resultGrade);
		
		

	}

}
