package com.itwill05.service.student;

public class StudentServiceMain {

	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		studentService.calculate();
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		studentService.calculateRate();
		/*
		 * 3. 전체학생반환
		 */
		System.out.println("3. 전체학생출력 ");
		
		studentService.print();
		/*
		 * 4. 번호3번 학생한명 반환
		 */
		System.out.println("4.번호3번 학생한명 반환  ");
		Student findStudent = studentService.findByNo(3);
		findStudent.print();
		/*
		 * 5. 학점A인 학생들 반환
		 */
		System.out.println("5. 학점A인 학생들 반환");
		Student[] findStudentGrade = studentService.findByGrade('A');
		 if (findStudentGrade!=null) {
				for (int i = 0; i < findStudentGrade.length; i++) {
					findStudentGrade[i].print();
				}
			}
		/*
		 * 5-1. 이름KIM 인 학생들 반환
		 */
		System.out.println("5-1.  이름KIM 인 학생들 반환");
		Student[] findStudentName = studentService.findByName("KIM");
		if (findStudentName!=null) {
			for (int i = 0; i < findStudentName.length; i++) {
				findStudentName[i].print();
			}
		}
		/*
		 * 6. 학생석차로 오름차순정렬
		 */
		System.out.println("6. 학생석차로 오름차순정렬");
		studentService.sortByrank();
		studentService.print();

	}

}

