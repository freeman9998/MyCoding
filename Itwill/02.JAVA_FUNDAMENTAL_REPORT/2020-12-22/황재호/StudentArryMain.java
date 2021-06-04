package com.itwill04.array;

public class StudentArryMain {

	public static void main(String[] args) {
		/*
		 * 0.�л��迭��ü�ʱ�ȭ
		 */
		Student[] st = {
				new Student(1, "Ȳ��ȣ", 76, 89, 84),
				new Student(2, "��ο�", 88, 77, 98),
				new Student(3, "����ȯ", 65, 87, 99), 
				new Student(4, "������", 75, 97, 60), 
				new Student(5, "������", 85, 98, 90),
				new Student(6, "������", 95, 88, 77), 
				new Student(7, "������", 99, 93, 95), 
				new Student(8, " �� ��", 83, 80, 99),
				new Student(9, "���ϼ�", 73, 90, 80),
		};

		/*
		 * 1. ��ü�л�����,���,�������
		 */
		System.out.println("1. ��ü�л�����,���,�������");
		for(int i=0;i<st.length;i++) {
			st[i].calculateTotal();
			st[i].calculateAvg();
			st[i].calculateGrade();
		}
		/*
		 * 2. ��ü�л� �������� �������
		 */
		System.out.println("2. ��ü�л� �������� �������");
		
		int rank[] = {1, 1, 1, 1, 1, 1, 1, 1, 1};
		for(int i = 0 ; i < st.length; i++) {
			for(int j = 0 ; j < st.length; j++) {
				if(st[i].getTot() > st[j].getTot()) {
					rank[j]++;
				}
			}
		}
		for(int i =0 ; i < st.length; i++) {
			st[i].setRank(rank[i]);
		}
		
		/*
		 * 3. ��ü�л����
		 */
		System.out.println("3. ��ü�л���� ");
		
		Student.headerPrint();
		for(int i=0;i<st.length;i++) {
			st[i].print();
		}
		
		/*
		 * 4. ��ȣ3�� �л��Ѹ� ���
		 */
		System.out.println("4.��ȣ3�� �л��Ѹ� ���  ");
		for(int i=0;i<st.length;i++) {
			if(st[i].getNo()==3) {
				st[i].print();
			}
		}
		
		
		/*
		 * 5. ����A�� �л��� ���
		 */
		System.out.println("5. ����A�� �л��� ���");
		for(int i=0;i<st.length;i++) {
				if(st[i].getGrade()=='A') {
					st[i].print();
			}
		}
		
		
		
		/*
		 * 6. �л��������� ������������
		 */
		System.out.println("6. �л��������� ������������");
		for(int i=0;i<st.length-1;i++) {
			for(int j=0;j<st.length-1;j++) {
				if(st[j].getTot()>st[j+1].getTot()) {
					Student tempstudents=st[j];
					st[j]=st[j+1];
					st[j+1]=tempstudents;
				}
			}
		}
		Student.headerPrint();
		for(int i=0;i<st.length;i++) {
			st[i].print();
		}
		/*
		 * 7. �л����������� ������������
		 */
		System.out.println("6. �л����������� ������������");
		for(int i=0;i<st.length-1;i++) {
			for(int j=0;j<st.length-1;j++) {
				if(st[j].getTot()<st[j+1].getTot()) {
					//�ּұ�ȯ
					Student tempstudents=st[j];
					st[j]=st[j+1];
					st[j+1]=tempstudents;
				}
			}
		}
		
		Student.headerPrint();
		for(int i=0;i<st.length;i++) {
			st[i].print();
		}
		



}


}