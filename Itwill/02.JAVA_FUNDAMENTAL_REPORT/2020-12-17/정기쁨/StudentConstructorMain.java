package com.itwill02.constructor;


public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student st1=new Student();
		st1.setStudentData(1, "홍길동", 74, 62, 38);
		Student st2=new Student(2, "김천재", 50, 40, 20);
		Student st3=new Student(3, "정바보", 90, 88, 84);
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		*/
		st1.calculateTotal();
		st2.calculateTotal();
		st3.calculateTotal();
		 /*
		 학생평균계산 메쏘드 호출(3명)
		 */
		st1.calculateAvg();
		st2.calculateAvg();		
		st3.calculateAvg();
				/*
		 학생평점계산 메쏘드 호출(3명)
		 */
		st1.calculateGrade();
		st2.calculateGrade();
		st3.calculateGrade();

		/*
		 * 학생데이타 출력메쏘드 호출
		 */
		st1.headerPrint();
		st1.print();
		st2.print();
		st3.print();

		
		/*
		 * 학생 student1 의 이름변경
		 * 학생 student1 의 총점데이타 반환받은후 메인에서출력
		 * 학생 student2 의 학점데이타 반환받은후 메인에서출력
		 */
		st1.setName("호랑이");
		st1.headerPrint();
		st1.print();
		
		int st1TotData = st1.calculateTotal();
		System.out.println("student1("+st1.getName()+")의 총점데이터 : " + st1TotData);
		 
		char st2GradeData = st2.calculateGrade();
		System.out.println("student2("+st2.getName()+")의 학점데이터 : " + st2GradeData);
		

	}

}