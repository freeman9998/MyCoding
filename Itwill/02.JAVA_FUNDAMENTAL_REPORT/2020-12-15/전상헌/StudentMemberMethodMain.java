package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student stu1=new Student();
		Student stu2=new Student();
		Student stu3=new Student();

		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		stu1.information(1, "KIM", 50, 60, 70);
		stu2.information(2, "LEE", 80, 20, 50);
		stu3.information(3, "JUN", 90, 10, 40);
		
		
		
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		
		
		// 학생총점계산 메쏘드 호출(3명)
		stu1.total();
		stu2.total();
		stu3.total();
		
		//학생평균계산 메쏘드 호출(3명)
		stu1.average();
		stu2.average();
		stu3.average();
		
		//학생평점계산 메쏘드 호출(3명)
		stu1.rank();
		stu2.rank();
		stu3.rank();

		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		stu1.printHeader();
		stu1.totalInformation();
		stu2.totalInformation();
		stu3.totalInformation();
		
	}

}