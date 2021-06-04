package com.itwill01.field;

public class StudentMemberMathodMain {

	public static void main(String[] args) {
		
		/*
		학생객체생성(3명)
		*/
		
		// 학생객체 생성 후 주소값 참조변수 대입
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		
		//
		s1.setData(1,"나얼",100,98,50);
		s2.setData(2,"박효신",90,80,70);
		s3.setData(3,"이수",60,40,100);
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
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
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		
		s1.headerPrint();
		s1.print();
		s2.print();
		s3.print();
		
	}


	}


