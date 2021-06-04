public class VariableTypes {
	public static void main(String[] args) {
		/*
		 * 논리형(1byte)
		 *   - 논리형변수 bool1,bool2,bool3
		 *   - 논리형리터럴(데이타): true,false
		 */
		boolean bool1;
		boolean bool2;
		boolean bool3;
		
		bool1 = true;
		bool2 = false;
		bool3 = true;
		/*
		bool3 = 777;
		Type mismatch: cannot convert from int to boolean
		*/
		/*
		 * <<한줄복사>>
		 * ctrl + alt +  down arrow
		 */
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		
		
		/*
		 * 문자한개형(2byte)[0~65535]
		 *   문자형변수 : munja1,munja2,munja3,munja4
		 *   문자형리터럴(데이타):'A','힣','C','1'
		 */
		char munja1,munja2,munja3,munja4,munja5;
		char munja11,munja44;
		munja1 = 'A';
		munja11= 65;
		int munja111=65;
		
		munja2 = 'B';
		munja3 = 'C';
		munja4 = '김';
		munja44=44608;
		munja5 ='7';
		
		System.out.println(munja1);
		System.out.println(munja11);
		System.out.println(munja111);
		
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja4);
		System.out.println((int)munja4);
		System.out.println(munja44);
		System.out.println(munja5);
		/*
		 * 숫자형
		 *   1.정수형 (byte ,short,int long)
		 *     - 정수형리터럴 : 1,2,56,67  
		 *   2.실수형 (float,double)
		 *     - 실수형리터럴: 0.1,.1,3.14159,10000.0
		 *   
		 */
		byte b1,b2,b3,b4;
		b1 = 0;
		b2 = -128;
		b3 = 127;
		b4 = 0b01111111;
		/*
		Type mismatch: cannot convert from int to byte
		b3 = 128;
		*/
		short s1,s2,s3,s4;
		s1 = -32768;
		s2 = 32767;
		s3 = 0b0111111111111111;
		/*
		Type mismatch: cannot convert from int to short
		s3 = 32768;
		*/
		int i1,i2,i3,i4;
		i1 = -2147483648;
		i2 = 2147483647;
		System.out.println(i2);
		i3 = 0b01111111111111111111111111111111;
		System.out.println(i3);
		/*
		The literal 2147483648 of type int is out of range 
		i4 = 2147483648;
		 */
		
		long l1,l2,l3,l4;
		l1 = -2147483649L;
		l2 = 2147483648L;
		
		
		float f1,f2;
		f1 = 0.1F;
		f2 = 3.14F;
		
		double d1,d2,d3,d4;
		d1=1.0;
		d2=3.14158;
		d3=3.345e6;
		d4=3.345e-6;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		double dd=0.123456789123456789;
		float ff=0.123456789123456789F;
		System.out.println(dd);
		System.out.println(ff);
		double dd1=123456789123456789.0;
		float ff1=123456789123456789.0F;
		System.out.println(dd1); 
		System.out.println(ff1); 
		
		String str1="오늘은 ";
		String str2="화요일 ";
		String str3="변수를 공부합니다.";
		String str4 = str1 + str2 + str3;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
