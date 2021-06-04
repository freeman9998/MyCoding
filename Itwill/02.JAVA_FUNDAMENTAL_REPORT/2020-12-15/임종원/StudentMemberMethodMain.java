package com.itwill02.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
	
		/*
		학생객체생성(3명)
		*/
		Student sd1 = new Student();
		Student sd2 = new Student();
		Student sd3 = new Student();
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		sd1.studentData(1,"임종원",100,100,50,0);
		sd2.studentData(2,"홍길동",50,30,30,0);
		sd3.studentData(3,"이순신",20,80,100,0);
		
		//학생총점계산 메쏘드 호출(3명)
		sd1.studentTot();
		sd2.studentTot();
		sd3.studentTot();
		
		//학생평균계산 메쏘드 호출(3명)
		sd1.studentAvg();
		sd2.studentAvg();
		sd3.studentAvg();
		
		//학생평점계산 메쏘드 호출(3명)
		sd1.studentGrade();
		sd2.studentGrade();
		sd3.studentGrade();		
		
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		sd1.headPrint();
		sd1.print();
		sd2.print();
		sd3.print();
		return;
		
	}

}
