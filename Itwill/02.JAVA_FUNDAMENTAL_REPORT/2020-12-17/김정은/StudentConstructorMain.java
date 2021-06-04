package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student stu1= new Student();
		stu1.basicData(1, "KIM", 50, 85, 70);
		
		Student stu2= new Student(2, "LEE", 88, 77, 66);
		Student stu3= new Student(3, "SIM", 45, 30, 25);
		
		
		/*
		 * 학생총점계산 메쏘드 호출(3명) 
		 * 학생평균계산 메쏘드 호출(3명) 
		 * 학생평점계산 메쏘드 호출(3명)
		 */
		stu1.totData();
		stu2.totData();
		stu3.totData();
		stu1.avgData();
		stu2.avgData();
		stu3.avgData();
		stu1.gradeData();
		stu2.gradeData();
		stu3.gradeData();
		/*
		 * 학생데이타3명 출력메쏘드 호출
		 */
		stu1.headprint();
		stu1.print();
		stu2.print();
		stu3.print();
		/*
		 * 학생 student1 의 이름변경
		 * 학생 student1 의 총점데이타 반환받은후 메인에서출력
		 * 학생 student2 의 학점데이타 반환받은후 메인에서출력
		 */
	    stu1.setName("SONG");
	    System.out.println(stu1.getName()+"의 총점데이타: "+stu1.getTot());
	    System.out.println(stu2.getName()+" 의 총점데이타: "+stu2.getGrade());

	}

}
