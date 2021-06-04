package com.itwill04.array;

public class StudentArrayMain {

	public static void main(String[] args) {
		/*
		 * 0.�л��迭��ü�ʱ�ȭ
		 */
		Student[] students = { 
				new Student(1, "KIM", 89, 93, 94), 
				new Student(2, "HIM", 88, 77, 98),
				new Student(3, "AIM", 65, 87, 99), 
				new Student(4, "BIM", 75, 97, 60), 
				new Student(5, "XIM", 85, 98, 90),
				new Student(6, "TIM", 95, 88, 77), 
				new Student(7, "ZIM", 99, 93, 95), 
				new Student(8, "LIM", 83, 80, 99),
				new Student(9, "QIM", 73, 90, 80),
		};

		/*
		 * 1. ��ü�л�����,���,�������
		 */
		System.out.println("1. ��ü�л�����,���,�������");
		for (int i = 0; i < students.length; i++) {
			students[i].calculateTotal();
			students[i].calculateAvg();
			students[i].calculateGrade();
		}
		
		/*
		 * 2. ��ü�л� �������� �������
		 */
		System.out.println("2. ��ü�л� �������� �������");
		int rank[] = {1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		for(int i = 0 ; i < students.length; i++) {
			for(int j = 0 ; j < students.length; j++) {
				if(students[i].getTot() < students[j].getTot()) {
					rank[i]++;
				}
			}
		}
		for(int i =0 ; i < students.length; i++) {
			students[i].setRank(rank[i]);
		}
		/*
		 * 3. ��ü�л����
		 */
		System.out.println("3. ��ü�л���� ");
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		/*
		 * 4. ��ȣ3�� �л��Ѹ� ���
		 */
		System.out.println("4.��ȣ3�� �л��Ѹ� ���  ");
		for (int i = 0; i < students.length; i++) {
			if(students[i].getNo() == 3) {
				students[i].print();
				break;
			}
		}

		/*
		 * 5. ����A�� �л��� ���
		 */

		System.out.println("5. ����A�� �л��� ���");
		for(int i = 0 ; i < students.length; i++) {
			if(students[i].getGrade() == 'A') {
				students[i].print();
			}
		}

		/*
		 * 6. �л��������� ������������
		 */
		System.out.println("6. �л��������� ������������");

		Student.headerPrint();
		for(int j = 0; j < students.length; j++) {
			for (int i = 0; i < students.length-1; i++) {
				if(students[i].getTot() > students[i+1].getTot()) {
					Student tempStu = new Student();
					tempStu = students[i+1];
					students[i+1] = students[i];
					students[i] = tempStu;
				}
			}
		}
		
		for(int i = 0 ; i < students.length ; i++) {
			students[i].print();
		}
		/*
		 * 7. �л����������� ������������
		 */
		System.out.println("7. �л����������� ������������");

		Student.headerPrint();
		for(int j = 0; j < students.length; j++) {
			for (int i = 0; i < students.length-1; i++) {
				if(students[i].getGrade() > students[i+1].getGrade()) {
					Student tempStu = new Student();
					tempStu = students[i+1];
					students[i+1] = students[i];
					students[i] = tempStu;
				}
			}
		}
		
		for(int i = 0 ; i < students.length ; i++) {
			students[i].print();
		}
		
	}

}