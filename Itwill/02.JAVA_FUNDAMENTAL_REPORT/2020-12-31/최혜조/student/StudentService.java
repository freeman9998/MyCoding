package com.itwill05.service.student;

import com.itwill05.service.account.Account;

public class StudentService {
	
	public final static int FIELD_NO=1;
	public final static int FIELD_NAME=2;
	public final static int FIELD_TOTAL=3;
	public final static int FIELD_RANK=4;
	public final static int SORT_ASC=1;
	public final static int SORT_DESC=2;
	
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
	 *  0.전체학생출력
	 */
	public void print() {
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
	}
	
	// 배열객체 프린트
	public void arrayPrint(Student[] student) {
		Student.headerPrint();
		for (int i = 0; i < student.length; i++) {
			student[i].print();
		}
	}
	
	/*
	 * 0.학생객체받아서 추가
	 */
	public void addStudent(Student student) {
		
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
	public void rank() {
		
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if(students[i].getTot()<students[j].getTot()) {
					students[i].increaseRank();
				}
			}
		}
	}
	/*
	 * 3. 전체학생반환
	 */
	public Student[] allstudent() {
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
	 * 5. 학점A인 학생들 반환
	 */
	public Student[] findByGrade(char grade) {
		
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getGrade()==grade) {
				count ++;
			}
		}
		Student[] findStudent = new Student[count];
		int index = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getGrade()==grade) {
				findStudent[index] = students[i];
				index++;
			}
		}
		return findStudent;
	}
	/*
	 * 5-1. 이름이 KIM인 학생들 반환
	 */
	public Student[] findByName(String name) {
		
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getName().equals(name)) {
				count ++;
			}
		}
		Student[] findStudent = new Student[count];
		int index = 0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getName().equals(name)) {
				findStudent[index] = students[i];
				index++;
			}
		}
		return findStudent;
	}
	
	
	/*
	 * 6. 학생석차로 오름차순정렬
	 * 
	 * standard --> 1:학번,2:이름,3:총점,4:석차
	 * order    --> 1:오름차순,2:내림차순
	 */
	
	public void sort(int standard, int order) {
		
		if(standard==FIELD_NO) {
			if(order==SORT_ASC) {
				//학번으로 오름차순
				for (int i = 0; i < students.length; i++) {
					for (int j = 0; j < students.length-1; j++) {
						if (students[j].getNo() > students[j+1].getNo()) {
							Student tempstu = students[j];
							students[j]=students[j+1];
							students[j+1]=tempstu;
						}
					}
						}
			}else if(order==SORT_DESC) {
				//학번으로 내림차순
				for (int i = 0; i < students.length; i++) {
					for (int j = 0; j < students.length-1; j++) {
						if (students[j].getNo() < students[j+1].getNo()) {
							Student tempstu = students[j];
							students[j]=students[j+1];
							students[j+1]=tempstu;
						}
					}
				}
			}
		}else if(standard==FIELD_NAME) {
			if(order==SORT_ASC) {
				//이름으로 오름차순
				for (int i = 0; i < students.length; i++) {
					for (int j = 0; j < students.length-1; j++) {
						
						if (students[j].getName().compareTo(students[j+1].getName())>0) {
							Student tempstu = students[j];
							students[j]=students[j+1];
							students[j+1]=tempstu;
						}
					}
					
				}
			}else if(order==SORT_DESC) {
				//이름으로 내림차순
				for (int i = 0; i < students.length; i++) {
					for (int j = 0; j < students.length-1; j++) {
						
						if (students[i].getName().compareTo(students[i+1].getName())<0) {
							Student tempstu = students[j];
							students[j]=students[j+1];
							students[j+1]=tempstu;
						}
					}
					
				}
			}
		}else if(standard==FIELD_TOTAL) {
			if(order==SORT_ASC) {
				for (int i = 0; i <students.length; i++) {
					for (int j = 0; j < students.length-1; j++) {
						if (students[j].getTot() > students[j+1].getTot()) {
						Student tempstu = students[j];
						students[j]=students[j+1];
						students[j+1]=tempstu;
						}
					}
				}
			} else if(order == SORT_DESC) {
				for (int i = 0; i < students.length; i++) {
					for (int j = 0; j < students.length-1; j++) {
						if (students[j].getTot() < students[j+1].getTot()) {
							Student tempstu = students[j];
							students[j]=students[j+1];
							students[j+1]=tempstu;
						}
					}
				}
	
			}
	} else {
		if(order==SORT_ASC) {
			for (int i = 0; i < students.length; i++) {
				for (int j = 0; j < students.length-1; j++) {
					if (students[j].getRank() > students[j+1].getRank()) {
						Student tempstu = students[j];
						students[j]=students[j+1];
						students[j+1]=tempstu;
						}
					}
				}
			
		}else if(order==SORT_DESC) {
			for (int i = 0; i < students.length; i++) {
				for (int j = 0; j < students.length-1; j++) {
					if (students[j].getRank() < students[j+1].getRank()) {
					Student tempstu = students[j];
					students[j]=students[j+1];
					students[j+1]=tempstu;
					}
				}
			}
		}
		
	  }
	
	}
}
	

