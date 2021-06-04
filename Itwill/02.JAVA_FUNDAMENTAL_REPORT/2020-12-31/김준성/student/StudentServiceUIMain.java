package com.itwill05.service.student;

import java.util.*;

public class StudentServiceUIMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		StudentService studentService = new StudentService();
		System.out.println("*****************************");
		System.out.println("     학생성적관리프로그램");
		System.out.println("*****************************");
		while (run) {
			System.out.println("------------메뉴-------------");
			System.out.println("0. 전체학생출력");
			System.out.println("1. 전체학생총점,평균,평점계산");
			System.out.println("2. 전체학생 총점으로 석차계산");
			System.out.println("3. 번호로   검색");
			System.out.println("4. 학점으로 검색");
			System.out.println("5. 이름으로 검색");
			System.out.println("6. 학생총점으로 오름차순정렬");
			System.out.println("7. 학생이름으로 오름차순정렬");
			System.out.println("8. 종료");
			System.out.println("----------------------------");
			System.out.print("메뉴번호선택> ");

			int menuNo = scanner.nextInt();
			if (menuNo == 0) {
				// 0. 전체학생출력
				Student.headerPrint();
				studentService.print();
				System.out.println();
			} else if (menuNo == 1) {
				// 1. 전체학생총점,평균,평점계산
				studentService.calculate();
				Student.headerPrint();
				studentService.print();
				System.out.println();
			} else if (menuNo == 2) {
				// 2. 전체학생 총점으로 석차계산
				studentService.rank();
				Student.headerPrint();
				studentService.print();
				System.out.println();
			} else if (menuNo == 3) {
				// 3. 번호로 검색
				System.out.print(" >>번호입력: ");
				int no = scanner.nextInt();
				Student findStudent = studentService.findByNo(no);
				if (findStudent != null) {
					Student.headerPrint();
					findStudent.print();
					System.out.println();
				} else {
					System.out.println(no + "번 학생은 없습니다.");
					System.out.println();
				}
			} else if (menuNo == 4) {
				// 4. 학점으로 검색
				System.out.print(" >>학점입력: ");
				String gradeStr = scanner.next();
				char grade = gradeStr.toUpperCase().charAt(0);
				if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
					Student[] findStudents = studentService.findByGrade(grade);
					if (findStudents != null) {
						Student.headerPrint();
						for (int i = 0; i < findStudents.length; i++) {
							findStudents[i].print();
						}
					} else {
						System.out.println("학점이 " + grade + "인 학생이 없습니다.");
					}
				} else {
					System.out.println("학점을 잘못 입력하였습니다.");
				}
				System.out.println();
			} else if (menuNo == 5) {
				// 5. 이름으로 검색
				System.out.print(" >>이름입력: ");
				String name = scanner.next().toUpperCase();
				Student[] findStudents = studentService.findByName(name);
				if (findStudents != null) {
					Student.headerPrint();
					for (int i = 0; i < findStudents.length; i++) {
						findStudents[i].print();
					}
				} else {
					System.out.println("이름이 " + name + "인 학생은 없습니다.");
				}
				System.out.println();
			} else if (menuNo == 6) {
				// 6. 학생총점으로 오름차순정렬
				studentService.sortByRankASC();
				Student.headerPrint();
				studentService.print();
				System.out.println();
			} else if (menuNo == 7) {
				// 7. 학생이름으로 오름차순정렬
				studentService.sortByNameASC();
				Student.headerPrint();
				studentService.print();
				System.out.println();
			} else if (menuNo == 8) {
				run = false;
				System.out.println("학생성적관리프로그램을 종료합니다.");
			}
		}

	}

}