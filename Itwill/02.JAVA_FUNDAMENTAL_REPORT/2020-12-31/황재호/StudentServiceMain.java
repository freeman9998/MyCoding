package com.itwill06.student;

public class StudentServiceMain {

	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		/*
		 * 1. ��ü�л�����,���,�������
		 */
		System.out.println("1. ��ü�л�����,���,�������");
		studentService.calculate();
		/*
		 * 2. ��ü�л� �������� �������
		 */
		System.out.println("2. ��ü�л� �������� �������");
		studentService.calculaterank();
		/*
		 * 3. ��ü�л���ȯ
		 */
		System.out.println("3. ��ü�л���� ");
		studentService.print();
		/*
		 * 4. ��ȣ3�� �л��Ѹ� ��ȯ
		 */
		System.out.println("4.��ȣ3�� �л��Ѹ� ��ȯ  ");
		studentService.findByNo(3);
		/*
		 * 5. ����A�� �л��� ��ȯ
		 */
		System.out.println("5. ����A�� �л��� ��ȯ");
		Student[] findA = studentService.findByGrade('A');
		/*
		 * 5. �̸�KIM �� �л��� ��ȯ
		 */
		System.out.println("5.  �̸�KIM �� �л��� ��ȯ");
		Student[] findKIM = studentService.findByName("KIM");

	}

}
