package com.itwill03.����;

public class BookMember {
	/*
	- ĸ��ȭ
	
	<<�Ӽ�>>
	 ȸ����ȣ
	 ȸ���̸�
	 ��ȭ��ȣ
	 ����å
	<<���>>
	  ȸ��������� 
	 */
	
	private int memberNum;
	private String memberName;
	private String memberPhoneNum;
	private Book book;
	
	public BookMember() {
	}
	
	public BookMember(int memberNum,String memberName, String memberPhoneNum,Book book) {
		this.memberNum = memberNum;
		this.memberName = memberName;
		this.memberPhoneNum= memberPhoneNum;
		this.book = book;
	}
	
	public void printMemberInfo() {
		System.out.printf("ȸ����ȣ : %d, ȸ���̸� : %s, ��ȭ��ȣ : %s ", memberNum, memberName, memberPhoneNum);
		System.out.println();
		book.printInfo();
	}
}