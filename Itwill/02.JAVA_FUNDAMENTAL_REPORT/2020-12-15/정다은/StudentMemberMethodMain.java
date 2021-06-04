package com.itwill01.field;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		 * 학생객체생성(3명)
		 */	
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		
		/*
		 * 학생객체 기본데이타(번호,이름,국어,영어,수학) 입력메소드 호출(3명)
		 */
		
		stu1.setStuData(1, "KIM", 74, 81, 67);
		stu2.setStuData(2, "LEE", 88, 87, 91);
		stu3.setStuData(3, "JUNG", 82, 57, 96);
		
		
		/*
		 * 학생총점계산,학생평균계산,학생평점계산 메소드 호출
		 */
		//총점 계산
		stu1.setTot();
		stu2.setTot();
		stu3.setTot();
		
		//평균 계산
		
		stu1.setAvg();
		stu2.setAvg();
		stu3.setAvg();
		
		//평점 계산
		stu1.setGrade();
		stu2.setGrade();
		stu3.setGrade();
		
		//석차
		stu1.setRank(3);
		stu2.setRank(1);
		stu3.setRank(2);
		
		
		/*
		 * 학생데이타 출력메소드 호출
		 */
		stu1.headerPrint();
		stu1.print();
		stu2.print();
		stu3.print();
		

	}

}
