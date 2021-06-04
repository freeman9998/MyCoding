package com.itwill01.field;

public class StudentFeldMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 3명 생성
		 */
		
		//사용자 정의타입을 이용해 변수선언 후 객체 생성 과 주소값 저장
				Student sd1 = new Student();
				Student sd2 = new Student();
				Student sd3 = new Student();
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		
				sd1.set학생(1, "황재호", 94, 74, 72, 2 );
				
				sd2.set학생(2, "김정민", 98, 95, 86, 1);
				
				sd3.set학생(3, "  김건 ", 54, 74, 26, 3);
		
				
				//  학생총점계산 메쏘드 호출(3명)
				sd1.totcalculate();
				sd2.totcalculate();
				sd3.totcalculate();
				
				// 	학생평균계산 메쏘드 호출(3명)
				sd1.avgcalculate();
				sd2.avgcalculate();
				sd3.avgcalculate();
				
				// 	학생평점계산 메쏘드 호출(3명)
				sd1.lvcalculate();
				sd2.lvcalculate();
				sd3.lvcalculate();
				
				//	과목별 유효성 체크
				sd1.calculate();
				sd2.calculate();
				sd3.calculate();
				
				//	학생데이타 출력 메쏘드 호출(3명)
				
				sd1.startprint();
				sd1.print();
				sd2.print();
				sd3.print();
				sd1.endprint();
				
				
				
				

	}

}
