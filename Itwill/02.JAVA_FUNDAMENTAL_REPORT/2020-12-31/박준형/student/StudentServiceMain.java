package com.itwill05.service.student;




public class StudentServiceMain {

	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		Student[] stuarray;
		Student stu = new Student();
		
		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		studentService.calculate();
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		studentService.calcRank();
		/*
		 * 3-1. 전체학생반환
		 */
		System.out.println("3-1. 전체학생반환 ");
		stuarray=studentService.getArrayStudent();
		/*
		 * 3-2. 전체학생출력
		 */
		Student.headerPrint();
		for (int i = 0; i < stuarray.length; i++) {
			stuarray[i].print();
		}
		/*
		 * 4. 번호3번 학생한명 반환
		 */
		System.out.println("4.번호3번 학생한명 반환  ");
		stu = studentService.findByNo(3);
		stu.print();
		/*
		 * 5-1. 학점A인 학생들 반환
		 */
		System.out.println("5-1. 학점A인 학생들 반환");
		stuarray=studentService.findByGrade('A');
		Student.headerPrint();
		for (int i = 0; i < stuarray.length; i++) {
			stuarray[i].print();
		}
		/*
		 * 5-2. 이름KIM 인 학생들 반환
		 */
		System.out.println("5-2.  이름KIM 인 학생들 반환");
		stuarray=studentService.findByName("KIM");
		Student.headerPrint();
		for (int i = 0; i < stuarray.length; i++) {
			stuarray[i].print();
		}
		/*
		 * 6. 학생석차로 오름차순정렬
		 */
		System.out.println("6. 학생석차로 오름차순정렬");
		studentService.sotrAsc();
		studentService.print();

	}

}
