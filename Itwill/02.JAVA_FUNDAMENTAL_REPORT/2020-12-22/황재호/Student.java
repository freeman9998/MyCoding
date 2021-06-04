package com.itwill04.array;

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
	public Student() {
		//���� 0�� ¥�� �⺻������
	}
	
	public Student(int no, String name, int kor, int eng, int math) {
		//���� 5�� ¥�� ������
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	/*
	����޽�� ����
	�л����� �Է� �޽��
	*/
	public void setStudentData(int no, String name, int kor, int eng, int math) {
		//�Էµ� ���� �ǵ�����
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//���� ��� �޽��
	public void calculateTotal() {
		this.tot = this.kor + this.eng + this.math;
	}
	
	//��� ��� �޽��
	public void calculateAvg() {

		this.avg = (((int) ((this.tot / 3.0) * 100.0)) / 100.0);
	}



	//���� ��� �޽��
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	//avg�� �Էµ� ������ ���� Ȯ��
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
	
	
	//1���� ����ϴ� ��� ��� �޽��
	public static void headerPrint() {
		System.out.printf("---------------�л� �������-------------------%n");
		System.out.printf("%s %s %s %s %s %s %3s %s %s%n", "�й�", "�̸�", "����", "����", "����", "����", "���", "����", "����");
		System.out.printf("-----------------------------------------------%n");

	}
	//��ü ��� �޽��
	public void print() {
		System.out.printf("%3d %5s %4d %4d %4d %4d %5.1f %3c %4d%n", this.no, this.name, this.kor, this.eng, this.math,
				this.tot, this.avg, this.grade, this.rank);
	}
	
	
	
	
	//������� ���� getter setter ������ֱ�
	
	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public int getTot() {
		return tot;
	}



	public void setTot(int tot) {
		this.tot = tot;
	}



	public char getGrade() {
		return grade;
	}



	public void setGrade(char grade) {
		this.grade = grade;
	}



	public int getRank() {
		return rank;
	}

}
