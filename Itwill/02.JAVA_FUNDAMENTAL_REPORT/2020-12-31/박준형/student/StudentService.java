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
			new Student(10,"TES",50,50,50)
			
	};
	/*
	 *  0.전체학생출력
	 */
	public void print() {
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
	}
	/*
	 * 0.학생객체받아서 추가
	 */
	public void addStudent(Student student) {
		Student[] tempStudent = new Student[students.length+1];
		tempStudent[students.length]=student;
		for (int i = 0; i < students.length; i++) {
			tempStudent[i]=students[i];
		}
		students=tempStudent;
	}
	/*
	 * 1. 전체학생총점,평균,평점계산
	 */
	public void calculate() {
		//Student에 계산 메쏘드 있는줄 몰라서 만든거..
//		for (int i = 0; i < students.length; i++) {
//			int total=0;
//			students[i].setTot(total=total+students[i].getKor()+students[i].getEng()+students[i].getMath());
//			students[i].setAvg(total/3.0);
//			if (students[i].getAvg() >= 90)
//				students[i].setGrade('A');
//			else if (students[i].getAvg() >= 80)
//				students[i].setGrade('B');
//			else if (students[i].getAvg() >= 70)
//				students[i].setGrade('C');
//			else if (students[i].getAvg() >= 60)
//				students[i].setGrade('D');
//			else
//				students[i].setGrade('F');
//		}
		for (int i = 0; i < students.length; i++) {
			students[i].calculateTotal();
			students[i].calculateAvg();
			students[i].calculateGrade();
		}
	}
	/*
	 * 2. 전체학생 총점으로 석차계산
	 */
	public void calcRank() {
		for (int i = 0; i < students.length; i++) {
			students[i].setRank(students[i].getRank()+1);
			for (int j = 0; j < students.length; j++) {
				if (students[i].getTot()<students[j].getTot()) {
					students[i].increaseRank();
				}
			}
		}
	}
	
	/*
	 * 3. 전체학생반환
	 */
	public Student[] getArrayStudent() {
		return students;
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
	 * 5-1. 학점A인 학생들 반환
	 */
	public Student[] findByGrade(char grade) {
		Student[] findStudent=null;
		int count=0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getGrade()=='A') {
				count++;
			}
		}
		findStudent = new Student[count];
		count = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getGrade()=='A') {
				findStudent[count]=students[i];
				count++;
			}
		}
		
		return findStudent;
	}
	
	public Student[] findByName(String name) {
		Student[] findStudent=null;
		int count=0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getName().equals(name)) {
				count++;
			}
		}
		findStudent = new Student[count];
		count = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getName().equals(name)) {
				findStudent[count]=students[i];
				count++;
			}
		}
		
		return findStudent;
	}
	/*
	 * 6. 학생석차로 오름차순정렬
	 */
	public void sotrAsc() {
		for (int i = 0; i < students.length-1; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if(students[j].getRank() > students[j+1].getRank()) {
					Student tempStudent = students[j];
					students[j]=students[j+1];
					students[j+1]=tempStudent;
				}
			}
		}
	}
}
