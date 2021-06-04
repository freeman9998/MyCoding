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
			System.out.printf("%d ´Â À±³â\n", year1);
		} else {
			System.out.printf("%d ´Â Æò³â\n", year1);
		}
		
		if((year2%4==0)&&(year2%100!=0)||(year2%400==0))
		{
			System.out.printf("%d ´Â À±³â\n", year2);
		} else {
			System.out.printf("%d ´Â Æò³â\n", year2);
		}
		
		if((year3%4==0)&&(year3% 100!=0)||(year3%400==0))
		{
			System.out.printf("%d ´Â À±³â\n", year3);
		} else {
			System.out.printf("%d ´Â Æò³â\n", year3);
		}
		
		if((year4%4==0)&&(year4%100!=0)||(year4%400==0))
		{
			System.out.printf("%d ´Â À±³â\n", year4);
		} else {
			System.out.printf("%d ´Â Æò³â\n", year4);
		}
		
		if((year5%4==0)&&(year5%100!=0)||(year5%400==0))
		{
			System.out.printf("%d ´Â À±³â\n", year5);
		} else {
			System.out.printf("%d ´Â Æò³â\n", year5);
		}
		
		char c ='°¡';
		if(c >='°¡'&& c <= 'ÆR') {
			System.out.printf( "%c´Â ÇÑ±ÛÀÔ´Ï´Ù.\n", c);
		}
		if(c >='A'&& c <='Z') {
			System.out.printf( "%c´Â ¾ËÆÄºª ´ë¹®ÀÚ ÀÔ´Ï´Ù.\n", c);
		}
		if(c >='a'&& c <='z') {
			System.out.printf( "%c´Â ¾ËÆÄºª ¼Ò¹®ÀÚ ÀÔ´Ï´Ù.\n", c);
		}
		if(c >='0'&& c<='9') {
			System.out.printf( "%c´Â ¼ýÀÚÇü ¹®ÀÚ ÀÔ´Ï´Ù.\n", c);
		}
		
		char idFirstLetter ='³ª';

		if (('A'<=idFirstLetter && idFirstLetter <='Z') || ('a'<=idFirstLetter && idFirstLetter <='z')) {
			System.out.println("¾ÆÀÌµð·Î ÀûÇÕ");
		} else {
			System.out.println("¾ÆÀÌµð·Î ºÎÀûÇÕ");
		}

	}
}