package com.itwill02.constructor;


public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 �л���ü����(3��)
		  - 1���� �⺻�����ڻ��
		      �л���ü����Ÿ(��ȣ, �̸�, ����, ����, ����)�Է¸޽��ȣ��
		  - 2���� ����5�� �����ڻ��
		 */
		Student stu1 = new Student();
		Student stu2 = new Student(2,"park", 80,70,60);
		Student stu3 = new Student(3,"kin", 70,60,50);
		
		stu1.setStudentData(1, "jung", 90, 80, 70);
		
		/*
		 * �л�������� �޽�� ȣ��(3��) 
		 * �л���հ�� �޽�� ȣ��(3��) 
		 * �л�������� �޽�� ȣ��(3��)
		 */
		stu1.calculateTotal();
		stu2.calculateTotal();
		stu3.calculateTotal();
		
		stu1.calculateAvg();
		stu2.calculateAvg();
		stu3.calculateAvg();
		
		stu1.calculateGrade();
		stu2.calculateGrade();
		stu3.calculateGrade();
		/*
		 * �л�����Ÿ3�� ��¸޽�� ȣ��
		 */
		stu1.headerPrint();
		stu1.print();
		stu2.print();
		stu3.print();
		
		/*
		 * �л� student1 �� �̸�����
		 * �л� student1 �� ��������Ÿ ��ȯ������ ���ο������
		 * �л� student2 �� ��������Ÿ ��ȯ������ ���ο������
		 */
		stu1.setStudentNameData("choi");
		int stu1Total = stu1.getCalculateTotal();
		System.out.println("stu1 ���� : " + stu1Total);

		char stu2Grade = stu2.getCalculateGrade();
		System.out.println("stu2 ���� : " + stu2Grade);

	}

}