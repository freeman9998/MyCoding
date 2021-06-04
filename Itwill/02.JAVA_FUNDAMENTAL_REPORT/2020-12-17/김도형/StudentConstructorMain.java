package com.itwill02.constructor;


public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
			Student s1=new Student();
			s1.setStudentData(1, "KIM", 77, 78, 90);
			
			Student s2=new Student(2, "BAK", 66, 55, 48);
			Student s3=new Student(3, "SON", 78, 82, 89);		
		
		/*
		 * 학생총점계산 메쏘드 호출(3명) 
		 * 학생평균계산 메쏘드 호출(3명) 
		 * 학생평점계산 메쏘드 호출(3명)
		 */
		s1.calculateTot();
		s2.calculateTot();
		s3.calculateTot();
		
		s1.calculateAvg();
		s2.calculateAvg();
		s3.calculateAvg();
		
		s1.calculateGrade();
		s2.calculateGrade();
		s3.calculateGrade();
				
		/*
		 * 학생데이타3명 출력메쏘드 호출
		 */
		s1.headerPrint();
		s1.print();
		s2.print();
		s3.print();
		
		/*
		 * 학생 student1 의 이름변경
		 * 학생 student1 의 총점데이타 반환받은후 메인에서출력
		 * 학생 student2 의 학점데이타 반환받은후 메인에서출력
		 */
		
		s1.setName("JUN");
		s1.headerPrint();
		s1.print();
		System.out.println("------------------------");
		int s1Tot=s1.getTot();
		System.out.printf("%s %s %d%n", s1.getName(),"의 총점: ",s1Tot);
		
		char s2Grade=s2.getGrade();
		System.out.printf("%s %s %c%n", s2.getName(),"의 학점: ",s2Grade);
		
		
		

	}

}