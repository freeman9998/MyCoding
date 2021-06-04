package com.itwill05.service.account;

import com.sun.org.apache.regexp.internal.recompile;

/*
 * ���࿡�� ���°�ü�� �����ϱ����� Ŭ����
 */
public class Account {
	/*
	 * ����ʵ�
	 */
	private int no;			//���¹�ȣ
	private String owner;   //������
	private int balance;    //�ܰ�
	private double iyul;	//����
	/*
	 * ������
	 */
	public Account() {
		
	}
	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}
	/*
	 * ����޽��
	 */
	//���µ���Ÿ��set�ϴ� �޽��
	public void setAccountData(
			int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	//�Աݸ޽��
	public void deposit(int m) {
		this.balance=this.balance+m;
	}
	//��ݸ޽��
	public void withDraw(int m) {
		this.balance = this.balance-m;
	}
	//�������Ʈ
	public static void headerPrint() {
		System.out.println("----------------------");
		System.out.println("��ȣ  �̸�  �ܰ�  ����");
		System.out.println("----------------------");
	}
	
	//����������¸޽��
	public void print() {
		String changeName = changeOwnerName(this.owner);
		System.out.printf("%d  %s  %d  %4.1f %n",this.no,changeName,this.balance,this.iyul);
		/*
		 1.ù���� �빮��
		 2.5�ڸ������
		 3.ù�����̿ܿ���****(4��)
		
		1111	K****	 89000	 1.3
		*/
	}
	
	public String changeOwnerName(String owner) {
		String upperName = this.owner.toUpperCase();
		String changeName = upperName.charAt(0)+"****";
		
		return changeName;
	}
	
	//getter �޽��
	public int getNo() {
		return this.no;
	}
	public String getOwner() {
		return this.owner;
	}
	public int getBalance() {
		return this.balance;
	}
	public double getIyul() {
		return this.iyul;
	}
	//setter �޽��
	public void setNo(int no) {
		this.no = no;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	
	
}