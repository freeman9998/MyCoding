package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		
		Student std1 = new Student();
		std1.setStudentData(1, "김우주", 90, 81, 85);
		
		Student std2 = new Student(2, "김하나", 37, 54, 80);
		Student std3 = new Student(3, "김뚝딱", 89, 68, 70);
		
		
		//학생총점계산 메쏘드 호출(3명) 
		std1.calculateTot();
		std2.calculateTot();
		std3.calculateTot();
		
		// 학생평균계산 메쏘드 호출(3명) 
		std1.calculateAvg();
		std2.calculateAvg();
		std3.calculateAvg();

		
		// 학생평점계산 메쏘드 호출(3명)
		std1.calculateGrade();
		std2.calculateGrade();
		std3.calculateGrade();
		
		/*
		 * 학생데이타3명 출력메쏘드 호출
		 */
		
		std1.headPrint();
		std1.print();
		std2.print();
		std3.print();
		
		
		 // 학생 student1 의 이름변경
		std1.setName("김영희");
		
		System.out.println("");
		std1.headPrint();
		std1.print();
		std2.print();
		std3.print();
		
		 
		System.out.println("");
		// 학생 student1 의 총점데이타 반환받은후 메인에서출력
		System.out.println(std1.getName()+"의 총점 : " + std1.getTot());
		
		// 학생 student2 의 학점데이타 반환받은후 메인에서출력
		System.out.println(std2.getName()+"의 학점 : " + std2.getGrade());
		
		
	}

}
