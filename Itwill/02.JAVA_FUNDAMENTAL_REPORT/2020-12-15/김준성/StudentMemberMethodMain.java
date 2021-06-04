package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		 * Student 클래스를 통해서 Student 객체 생성 후 번지를 각 변수에 저장
		 */
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();

		/*
		 * 학생객체기본데이터(번호, 이름, 국어, 영어, 수학) 입력메소드 호출(3명)
		 */
		std1.setData(1, "KIM", 49, 69, 79);
		std2.setData(2, "LEE", 999, 72, 100);
		std3.setData(3, "SON", 84, 78, 67);

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

	}

}
