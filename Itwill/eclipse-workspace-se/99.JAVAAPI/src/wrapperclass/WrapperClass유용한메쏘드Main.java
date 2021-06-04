package wrapperclass;

public class WrapperClass유용한메쏘드Main {

	public static void main(String[] args) {
		int y = 2147483647;
		System.out.println("*********** int(double,float,boolean) -->String");
		String yStr = Integer.toString(y);
		System.out.println(yStr);
		String yStr2= y+"";
		System.out.println(yStr2);
		String yStr3=Integer.toBinaryString(y);
		System.out.println(yStr3);
		
		/*
		 * String --> 기본형(int,double,boolean...)
		 */
		System.out.println("*********** String-->기본형");
		int i = Integer.parseInt("213125");
		System.out.println(i);
		double d=Double.parseDouble("3.14159");
		System.out.println(d);
		boolean b=Boolean.parseBoolean("false");
		System.out.println(b);
		
		
		
	}

}











