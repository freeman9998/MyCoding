package com.itwill03.����;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * ȸ����ü����
		 */
		/*
		 * å��ü����
		 */
		
		/*
		 * ȸ���� å�� �뿩
		 * 
		 * å��ü���������� ȸ���� �������������
		 */
		/*
		 * ȸ���������(ȸ�������� ȸ���� ����å�� �������)
		 */
		Book book = new Book(10, "�ڹ�������", "�ڹ�", "�ڹ�");
		BookMember bookMember = new BookMember(7, "���ڹ�", "010-1234-1234",book);
		
		bookMember.printMemberInfo();
	}
}