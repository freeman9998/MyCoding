package com.itwill00.variable;

public class IfUseExe {

	public static void main(String[] args) {
		
		int year1= 1900;
		int year2= 2100;
		int year3= 2200;
		int year4= 2300;
		int year5= 2500;		
	
		if((year1%4 ==0)&&(year1%100 !=0)||(year1%400 ==0))
		{
			System.out.printf("%d �� ����\n", year1);
		} else {
			System.out.printf("%d �� ���\n", year1);
		}
		
		if((year2%4==0)&&(year2%100!=0)||(year2%400==0))
		{
			System.out.printf("%d �� ����\n", year2);
		} else {
			System.out.printf("%d �� ���\n", year2);
		}
		
		if((year3%4==0)&&(year3% 100!=0)||(year3%400==0))
		{
			System.out.printf("%d �� ����\n", year3);
		} else {
			System.out.printf("%d �� ���\n", year3);
		}
		
		if((year4%4==0)&&(year4%100!=0)||(year4%400==0))
		{
			System.out.printf("%d �� ����\n", year4);
		} else {
			System.out.printf("%d �� ���\n", year4);
		}
		
		if((year5%4==0)&&(year5%100!=0)||(year5%400==0))
		{
			System.out.printf("%d �� ����\n", year5);
		} else {
			System.out.printf("%d �� ���\n", year5);
		}
		
		char c ='��';
		if(c >='��'&& c <= '�R') {
			System.out.printf( "%c�� �ѱ��Դϴ�.\n", c);
		}
		if(c >='A'&& c <='Z') {
			System.out.printf( "%c�� ���ĺ� �빮�� �Դϴ�.\n", c);
		}
		if(c >='a'&& c <='z') {
			System.out.printf( "%c�� ���ĺ� �ҹ��� �Դϴ�.\n", c);
		}
		if(c >='0'&& c<='9') {
			System.out.printf( "%c�� ������ ���� �Դϴ�.\n", c);
		}
		
		char idFirstLetter ='��';

		if (('A'<=idFirstLetter && idFirstLetter <='Z') || ('a'<=idFirstLetter && idFirstLetter <='z')) {
			System.out.println("���̵�� ����");
		} else {
			System.out.println("���̵�� ������");
		}

	}
}