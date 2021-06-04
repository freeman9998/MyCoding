package com.itwill00.variable;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		st1.setData(1, "김경호",100 ,86 ,84);
		st2.setData(2, "이효리",33 ,54 ,77);
		st3.setData(3, "박종석",50 ,77 ,90);
						
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		st1.calculatetot();
		st2.calculatetot();
		st3.calculatetot();
		
		st1.calculateavg();
		st2.calculateavg();
		st3.calculateavg();
		
		st1.calculategrade();
		st2.calculategrade();
		st3.calculategrade();

		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		st1.setPrint();
        st1.print();
        st2.print();
        st3.print();
	
		
	}

}
