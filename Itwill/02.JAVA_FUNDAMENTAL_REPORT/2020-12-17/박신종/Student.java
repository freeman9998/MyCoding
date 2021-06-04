package com.itwill02.constructor;

/*
 * ����ó���� ���� �ʿ��� �л���ü�� ����� ���� Ŭ����
 *  - ĸ��ȭ
 */
public class Student {
	/*
	 * << �Ӽ� >> ��ȣ �̸� ���� ���� ���� ���� ��� ���� ���� 
	 * << ��� >> �⺻����Ÿ�Է�,�������,��հ��,�������, ���
	 */

	/*
	������� ����
	*/
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	private int rank;
	/*
	 * <<�����ڸ޽�� ����[�����ε�]>>
	 *  - ���� 0��¥�� ������(�⺻�����ڼ���) 
	 *  - ���� 5��¥��(��ȣ �̸� ���� ���� ����) �����ڼ���
	 */
	
	// �⺻������ ����
	public Student() {
		
	}
	// ���ڰ��� �ʿ�� �ϴ� ������ �ʱ� ����	
	public Student(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}



	/*
	����޽�� ����
	*/
	public void setStudentData(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void setStudentNameData(String name) {
		this.name = name;
	}

	public void calculateTotal() {
		this.tot = this.kor + this.eng + this.math;
	}
	
	// ������ ��ȯ���ֱ� ���� �޼��� �߰�
	public int getCalculateTotal() {
		return this.tot;
	}

	public void calculateAvg() {

		this.avg = (((int) ((this.tot / 3.0) * 100.0)) / 100.0);
	}

	public char calculateGrade() {

		if (this.avg >= 90)
			this.grade = 'A';
		else if (this.avg < 90 && this.avg >= 80)
			this.grade = 'B';
		else if (this.avg < 80 && this.avg >= 70)
			this.grade = 'C';
		else if (this.avg < 70 && this.avg >= 60)
			this.grade = 'D';
		else
			this.grade = 'F';

		return grade;
	}
	// ������ ��ȯ���ֱ� ���� �޼��� �߰�
	public char getCalculateGrade() {
		return this.grade;
	}

	public void headerPrint() {
		System.out.printf("---------------�л� �������-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n", "�й�", "�̸�", "����", "����", "����", "����", "���", "����", "����");
		System.out.printf("-----------------------------------------------%n");

	}

	public void print() {
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n", this.no, this.name, this.kor, this.eng, this.math,
				this.tot, this.avg, this.grade, this.rank);
	}

}