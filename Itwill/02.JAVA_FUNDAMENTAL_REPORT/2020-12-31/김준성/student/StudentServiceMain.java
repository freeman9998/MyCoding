package com.itwill05.service.student;

public class StudentServiceMain {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		studentService.calculate();
		Student.headerPrint();
		studentService.print();
		System.out.println();

		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		studentService.rank();
		Student.headerPrint();
		studentService.print();
		System.out.println();

		/*
		 * 3-1. 전체학생반환
		 */
		System.out.println("3. 전체학생반환 ");
		Student[] findStudents = studentService.studentReturn();
		Student.headerPrint();
		for (int i = 0; i < findStudents.length; i++) {
			findStudents[i].print();
		}
		System.out.println();

		/*
		 * 3-2. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 ");
		Student.headerPrint();
		studentService.print();
		System.out.println();

		/*
		 * 4. 번호3번 학생한명 반환
		 */
		System.out.println("4.번호3번 학생한명 반환  ");
		Student findStudent = studentService.findByNo(3);
		Student.headerPrint();
		findStudent.print();
		System.out.println();

		/*
		 * 5. 학점A인 학생들 반환
		 */
		System.out.println("5. 학점A인 학생들 반환");
		findStudents = studentService.findByGrade('A');
		Student.headerPrint();
		for (int i = 0; i < findStudents.length; i++) {
			findStudents[i].print();
		}
		System.out.println();

		/*
		 * 5. 이름KIM 인 학생들 반환
		 */
		System.out.println("5.  이름KIM 인 학생들 반환");
		findStudents = studentService.findByName("KIM");
		Student.headerPrint();
		for (int i = 0; i < findStudents.length; i++) {
			findStudents[i].print();
		}
		System.out.println();

		/*
		 * 6. 학생석차로 오름차순정렬
		 */
		System.out.println("6. 학생석차로 오름차순정렬");
		studentService.sortByRankASC();
		Student.headerPrint();
		studentService.print();
		System.out.println();

	}

}