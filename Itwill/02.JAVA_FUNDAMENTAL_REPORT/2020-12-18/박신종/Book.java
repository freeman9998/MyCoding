package com.itwill03.����;

import com.sun.org.apache.regexp.internal.recompile;

public class Book {
	/*
	 * - ĸ��ȭ�ϼ���
	 * - �����ڸ� �����ϼ���
	 * 
	 * <<�Ӽ�>>
	 *  å��ȣ
	 *  å����
	 *  å�з�
	 *  å����
	 * 
	 * <<���>>
	 *   å�������
	 *   
	 */
	private int bookNum;
	private String bookName;
	private String bookCategory;
	private String bookInfo;
	
	public Book() {
	}
	
	public Book(int bookNum, String bookName, String bookCategory, String bookInfo) {
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.bookCategory = bookCategory;
		this.bookInfo = bookInfo;
	}

	public void printInfo() {
		System.out.println("-----------ȸ������ ���� å ����-----------");
		System.out.printf("å��ȣ : %d, å���� : %s, å�з� : %s, å���� : %s ", bookNum, bookName, bookCategory, bookInfo);
	}
}
