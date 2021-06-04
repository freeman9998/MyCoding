package com.itwill05.service.student;




public class StudentServiceMain {

	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		studentService.calculate();
		
		
		
		s
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		
		studentService.rankCalculating();
		/*
		 * 3-1. 전체학생반환
		 */
		System.out.println("3. 전체학생반환 ");
		Student[] allStudentArray=studentService.allStudent();
		for (int i = 0; i < allStudentArray.length; i++) {
			allStudentArray[i].print();
		}
		/*
		 * 3-2. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 ");
		studentService.print();
		/*
		 * 4. 번호3번 학생한명 반환
		 */
		System.out.println("4.번호3번 학생한명 반환  ");
		
		studentService.findByNo(3).print();
		
		/*
		 * 5. 학점A인 학생들 반환
		 */
		System.out.println("5. 학점A인 학생들 반환");
		
		Student[] findAArray=studentService.findGrade('A');
		for (int i = 0; i < findAArray.length; i++) {
			findAArray[i].print();
		}
		
		/*
		 * 5. 이름KIM 인 학생들 반환
		 */
		System.out.println("5.  이름KIM 인 학생들 반환");
		
		
		Student[] findNameArray=studentService.findName("KIM");
		for (int i = 0; i < findNameArray.length; i++) {
			findNameArray[i].print();
		}
		/*
		 * 6. 학생석차로 오름차순정렬
		 */
		System.out.println("6. 학생석차로 오름차순정렬");
		studentService.upSort();
		
		studentService.print();
		

	}

}