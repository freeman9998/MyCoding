package com.itwill01.method;


public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student stdnt1=new Student();
		Student stdnt2=new Student();
		Student stdnt3=new Student();
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		
		stdnt1.setData(1, "KIM", 90, 91, 92);
		stdnt2.setData(2, "LEE", 72, 70, 83);
		stdnt3.setData(3, "CHO", 95, 93, 77);
				
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		stdnt1.total();
		stdnt2.total();
		stdnt3.total();
		
		stdnt1.avg();
		stdnt2.avg();
		stdnt3.avg();
		
		stdnt1.grade();
		stdnt2.grade();
		stdnt3.grade();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		stdnt1.headerPrint();
		stdnt1.print();
		stdnt2.print();
		stdnt3.print();
		return;
	}
}