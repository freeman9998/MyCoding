package com.tiwill02.constructor;

public class StudentFeldMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		
		Student sd1 = new Student();
		sd1.setStudentData(1, "호재황", 76, 84, 97);
		
		Student sd2 = new Student(2,"임희준",97,86,100);
		Student sd3 = new Student(3,"김정민",76,27,87);
		/*
		 * 학생총점계산 메쏘드 호출(3명) 
		 * 학생평균계산 메쏘드 호출(3명) 
		 * 학생평점계산 메쏘드 호출(3명)
		 */
		sd1.calculateTotal();
		sd2.calculateTotal();
		sd3.calculateTotal();
		
		sd1.calculateAvg();
		sd3.calculateAvg();
		sd2.calculateAvg();
		
		sd1.calculateGrade();
		sd2.calculateGrade();
		sd3.calculateGrade();
		
		/*
		 * 학생데이타3명 출력메쏘드 호출
		 */
		
		sd1.headerPrint();
		sd1.print();
		sd2.print();
		sd3.print();
		
		/*
		 * 학생 student1 의 이름변경
		 * 학생 student1 의 총점데이타 반환받은후 메인에서출력
		 * 학생 student2 의 학점데이타 반환받은후 메인에서출력
		 */
		System.out.println();
		System.out.println();
		
		sd1.setName("황재호");
		sd1.print();
		
		int stu1Total = sd1.getTot();
		System.out.println("stu1 총점 : " + stu1Total);

		char stu2Grade = sd2.getGrade();
		System.out.println("stu2 학점 : " + stu2Grade);


		
		
				
				
				

	}

}
