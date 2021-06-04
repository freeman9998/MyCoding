package itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
		      학생객체데이타(번호, 이름, 국어, 영어, 수학)입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student std1 = new Student();
		std1.basicData(1, "PARK", 93, 85, 98);
		Student std2 = new Student(2, "LEE", 85, 70, 47);
		Student std3 = new Student(3, "KIM", 85, 64, 31);
	
		
		/*
		 * 학생총점계산 메쏘드 호출(3명) 
		 * 학생평균계산 메쏘드 호출(3명) 
		 * 학생평점계산 메쏘드 호출(3명)
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
		 * 학생데이타3명 출력메쏘드 호출
		 */
		std1.headPrint();
		std1.print();
		std2.print();
		std3.print();
	
		
		/*
		 * 학생 student1 의 이름변경
		 * 학생 student1 의 총점데이타 반환받은후 메인에서출력
		 * 학생 student2 의 학점데이타 반환받은후 메인에서출력
		 */
		// 이름변경
		std1.setName("HAN");
		//반환 후 출력
		int std1Tot = std1.getTot();
		System.out.println("학생 Student1(" + std1.getName() + ")의 총점 : " + std1Tot);
		//반환 후 출력
		char std2Grade = std2.getGrade();
		System.out.println("학생 Student2(" + std2.getName() + ")의 학점 : " + std2Grade);
		
		
	}

}
