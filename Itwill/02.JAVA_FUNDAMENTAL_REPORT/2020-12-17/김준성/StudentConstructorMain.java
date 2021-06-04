package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 * 학생객체생성(3명)
		 * 1명은 기본생성자 사용 학생객체데이터(번호, 이름, 국어, 영어, 수학) 입력메소드 호출
		 * 2명은 인자 5개 생성자 사용
		 */
		Student std1 = new Student();
		Student std2 = new Student(2, "LEE", 99, 72, 100);
		Student std3 = new Student(3, "SON", 84, 78, 67);

		/*
		 * 학생객체기본데이터(번호, 이름, 국어, 영어, 수학) 입력메소드 호출(3명)
		 */
		std1.setData(1, "KIM", 49, 69, 79);

		/*
		 * 학생총점계산 메소드 호출(3명)
		 */
		std1.total();
		std2.total();
		std3.total();

		/*
		 * 학생평균계산 메소드 호출(3명)
		 */
		std1.avg();
		std2.avg();
		std3.avg();

		/*
		 * 학생평점계산 메소드 호출(3명)
		 */
		std1.grade();
		std2.grade();
		std3.grade();

		/*
		 * 학생데이터 출력메소드 호출(3명)
		 */
		std1.headerPrint();
		std1.print();
		std2.print();
		std3.print();

		/*
		 * 학생 student1 의 이름변경
		 * 학생 student1 의 총점데이터 반환받은후 메인에서 출력
		 * 학생 student2 의 학점데이터 반환받은후 메인에서 출력
		 */
		std1.setName("LIM");
		int total = std1.getTotal();
		String name = std1.getName();
		System.out.println("----------------------------------------------------");
		System.out.println(name + " 의 총점: " + total);
		name = std2.getName();
		char grade = std2.getGrade();
		System.out.println(name + " 의 평점: " + grade);
		
		
	}

}
