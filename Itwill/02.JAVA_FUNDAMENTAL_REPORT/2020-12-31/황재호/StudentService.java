package com.itwill06.student;

import com.itwill04.array.Account;

public class StudentService {
	
	private static final int FIELD_NO = 0;
	private static final int SORT_ASC = 0;
	private static final int SORT_DESC = 0;
	private static final int FIELD_NAME = 0;
	private static final int FIELD_TOTAL = 0;
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
	 *  0.��ü�л����
	 */
	public void print() {
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
	}
	/*
	 * 0.�л���ü�޾Ƽ� �߰�
	 */
	public void addStudent(Student student) {
		
	}
	/*
	 * 1. ��ü�л�����,���,�������
	 */
	public void calculate() {
		for (int i=0;i<students.length;i++) {
			students[i].calculateTotal();
			students[i].calculateAvg();
			students[i].calculateGrade();
		}	
	}
	/*
	 * 2. ��ü�л� �������� �������
	 */
	public void calculaterank() {
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if(students[i].getTot()<students[j].getTot()) {
					students[i].increaseRank();
				}
			}
		}
	}
	/*
	 * 3. ��ü�л���ȯ
	 */
	public Student[] students() {
		return students;
	}
	/*
	 * 4. ��ȣ3�� �л��Ѹ� ��ȯ  
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
	 * 5. ����A�� �л��� ��ȯ
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
	
	//5 �̸��� KIM�� �л� ��ȯ
	
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
	 * 6. �л������� ������������
	 */
	public void sort(int standard, int order) {
		
		if(standard==FIELD_NO) {
			if(order==SORT_ASC) {
				//�й����� ��������
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
				//�й����� ��������
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
				//�̸����� ��������
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
				//�̸����� ��������
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
