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
		stu1.setData(1, "김갑수", 82, 74, 88);
		Student stu2 = new Student(2, "김덕배", 88, 80, 66);
		Student stu3 = new Student(3, "홍길동", 76, 88, 82);
		
		/*
		 * 학생총점계산 메쏘드 호출(3명) 
		 * 학생평균계산 메쏘드 호출(3명) 
		 * 학생평점계산 메쏘드 호출(3명)
		 */
		stu1.calculatetot();
		stu1.calculateavg();
		stu1.calculateif();

		stu2.calculatetot();
		stu2.calculateavg();
		stu2.calculateif();
		
		stu3.calculatetot();
		stu3.calculateavg();
		stu3.calculateif();
		
		/*
		 * 학생데이타3명 출력메쏘드 호출
		 */
		stu1.headprint();
		stu1.print();
		stu2.print();
		stu3.print();
		
		
		
		/*
		 * 학생 student1 의 이름변경
		 * 학생 student1 의 총점데이타 반환받은후 메인에서 출력
		 * 학생 student2 의 학점데이타 반환받은후 메인에서 출력
		 */
		System.out.println("------------------------------------");

		stu1.setName("김길수");
		System.out.println("------------이름이 바뀐 학생 성적------------");
		System.out.printf("%s %s %s %s %s %s %s %s %s%n","번호","이름","국어","영어","수학","총점","평균","학점","석차");
		System.out.println("---------------------------------------------");
		stu1.print();
		
		System.out.println("---------------------------------------------");
		System.out.printf("1번 학생의 총점 : ");
		System.out.println(stu1.getTot()); 
		System.out.println(stu2.getGrade());
		
	}

}
