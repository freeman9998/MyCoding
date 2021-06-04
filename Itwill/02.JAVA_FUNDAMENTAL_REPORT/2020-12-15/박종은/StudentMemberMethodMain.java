package itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {

		/*
		학생객체생성(3명)
		*/
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		
		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		std1.basicData(1, "PARK", 98,85,93);
		std2.basicData(2, "KIM", 84,69,92);
		std3.basicData(3, "LEE", 73,14,56);
		
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		std1.totCalculate();
		std2.totCalculate();
		std3.totCalculate();
		
		std1.avgCalculate();
		std2.avgCalculate();
		std3.avgCalculate();
		
		std1.gradeCalculate();
		std2.gradeCalculate();
		std3.gradeCalculate();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */

		std1.headPrint();
		std1.print();
		std2.print();
		std3.print();
	}

}
