package com.itwill02.constructor;

import sun.nio.fs.DefaultFileSystemProvider;

public class StudentConstructorMain {

	public static void main(String[] args) {
		
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student st1 = new Student();
		st1.setStudentData(1, "LIM", 70, 50, 100);
		Student st2 = new Student(2, "kim", 50, 50, 30);
		
		Student st3 = new Student(3, "ham", 60, 100, 50);
		/*
		 * 학생총점계산 메쏘드 호출(3명) 
		 * 학생평균계산 메쏘드 호출(3명) 
		 * 학생평점계산 메쏘드 호출(3명)
		 */
		st1.calculateTotal();
		st1.calculateAvg();
		st1.calculateGrade();
		st2.calculateTotal();
		st2.calculateAvg();
		st2.calculateGrade();
		st3.calculateTotal();
		st3.calculateAvg();
		st3.calculateGrade();
		
		/*
		 * 학생데이타3명 출력메쏘드 호출
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
		System.out.println();
		
		st1.setStudentName("nam");
		
		int st1TotalData = st1.calculateTotal();
		String msg = "의 총점데이타 : ";
		System.out.println(st1.getName()+msg+st1TotalData);			
		
		
		char st2GradeData =  st2.calculateGrade();
		String msg2 = "의 학점데이타 : ";
		System.out.println(st2.getName()+msg2+st2GradeData);
		System.out.println();						
		
		
		
		//st1 이름 변경후 출력 "lim" - > "nam"
		st1.headerPrint();
		st1.print();
		st2.print();
		st3.print();
	}

}
