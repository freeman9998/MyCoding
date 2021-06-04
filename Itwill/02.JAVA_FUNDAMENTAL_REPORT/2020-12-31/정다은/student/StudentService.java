package com.itwill05.service.student;



public class StudentService {
	
	private Student[] students={
			new Student(1,"KIM",89,93,94),
			new Student(2,"HIM",88,77,98),
			new Student(3,"AIM",65,87,99),
			new Student(4,"KIM",75,97,60),
			new Student(5,"XIM",85,98,90),
			new Student(6,"TIM",95,88,77),
			new Student(7,"KIM",99,93,95),
			new Student(8,"LIM",83,80,99),
			new Student(9,"QIM",73,90,80),
			
	};
	
	/*
	 * 0.학생객체받아서 추가
	 */
	public void addStudent(Student newStudent) {
		Student[] newStudents = new Student[students.length+1];
		for (int i = 0; i < students.length; i++) {
			newStudents[i]=students[i];
		}
		newStudents[students.length] = newStudent;
		this.students = newStudents;
	}
	
	/*
	 * 1. 전체학생총점,평균,평점계산
	 */
	public void calculate() {
		for (int i = 0; i < students.length; i++) {
			students[i].calculateTotal();
			students[i].calculateAvg();
			students[i].calculateGrade();
		}
	}
	
	/*
	 * 2. 전체학생 총점으로 석차계산
	 */
	public void calRank() {
		int[] ranka = {1,1,1,1,1,1,1,1,1,1};
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if(students[i].getTot() > students[j].getTot()) {
					ranka[j]++;
				}
				students[j].setRank(ranka[j]);
			}
		}
	}
	
	
	/*
	 * 3. 전체학생반환
	 */
	public void print() {
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
	}
	
	/*
	 * 4. 번호3번 학생한명 반환  
	 */
	public Student findByNo(int no) {
		Student findStudent=null;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getNo()==no) {
				findStudent=students[i];
				break;
			}
		}
		return findStudent;
	}
	/*
	 * 5. 학점A인 학생들 반환
	 */
	public Student[] findByGrade(char grade) {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getGrade()=='A') {
				count++;
			}
		}
		Student[] findStudent = new Student[count];
		int index = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getGrade()=='A') {
				findStudent[index] = students[i];
				index++;
			}
		}
		return findStudent;
	}
	/*
	 * 6. 이름KIM 인 학생들 반환
	 */
	public Student[] findByName(String name) {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getName().equals(name)) {
				count++;
			}
		}
		int index = 0;
		Student[] findStudents = new Student[count];
		for (int i = 0; i < students.length; i++) {
			if(students[i].getName().equals(name)) {
				findStudents[index] = students[i];
				index++;
			}
		}
		return findStudents;
	}
	
	
	/*
	 * 7. 학생석차로 오름차순정렬
	 */
	public void sortAsc() {
		for (int j = 0; j < students.length-1; j++) {
			for (int i = 0; i < students.length-1; i++) {
				if(students[i].getRank() < students[i+1].getRank()) {
					Student a = students[i];
					students[i] = students[i+1];
					students[i+1] = a;
				}
			}
		}
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
	}
	
	}