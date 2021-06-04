package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student student1=new Student();
		student1.setStudentData(1, "홍길동", 97, 93, 88);
		Student student2=new Student(2, "김사또", 75, 90, 80);
		Student student3=new Student(3, "덕춘", 66, 90, 63);
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		student1.totalcalc();
		student2.totalcalc();
		student3.totalcalc();
		
		student1.avgcalc();
		student2.avgcalc();
		student3.avgcalc();
		
		student1.scorecalc();
		student2.scorecalc();
		student3.scorecalc();

		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		student1.startline();
		student1.print();
		student2.print();
		student3.print();
		
		
		/*
		 * 학생 student1 의 이름변경
		 * 학생 student1 의 총점데이타 반환받은후 메인에서출력
		 * 학생 student2 의 학점데이타 반환받은후 메인에서출력
		 */
		
		student1.setName("홍익순");
		System.out.println("student1의 총점 : "+student1.getTotal());
		System.out.println("student2의 학점 : "+student2.getScore());

	}

}
