package com.itwill01.field;

                        public class StudentConstructorMain {

	            public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		  - 학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		 
		  - 2명은 인자5개 생성자사용
		 */
		
		// 1명만 기본생성자 사용하여 입력메소드 호출
		Student s1 = new Student();
		s1.setData(1,"나얼",100,98,50);
		Student s2 = new Student(2,"박효신",90,80,70);
		Student s3 = new Student(3,"이수",60,40,100);
		
		
		/*
		 * 학생총점계산 메쏘드 호출(3명) 
		 * 학생평균계산 메쏘드 호출(3명) 
		 * 학생평점계산 메쏘드 호출(3명)
		 */

		// 총점메쏘드 호출
		s1.calculatetot();
		s2.calculatetot();
		s3.calculatetot();
		
		// 평균메쏘드 호출
		s1.calculateavg();
		s2.calculateavg();
		s3.calculateavg();
		
		// 평점메쏘드 호출
		s1.calculategrade();
		s2.calculategrade();
		s3.calculategrade();
		
		
		
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
		s1.setName("김범수");
	
		int s1Tot = s1.getTot();
		System.out.println("학생 student1 : " + s1.getTot());
		
		int s2Grade = s2.getGrade();
		System.out.println("학생 student2 : " +s2.getGrade());

		

	}

}