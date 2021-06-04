/*
제어문
   1. if 문
       -형식 : 
	      stmt0;
		   if(조건문 ){
		      //조건문 -->   논리형데이타가 반환되는 연산 
			  //                   혹은 논리형변수(리터럴)
			  stmt1;
		   }else{
		      stmt2;
		   }
		   stmt3;

		   조건데이타가 true인경우  stmt0-->stmt1-->stmt3;
		   조건데이타가 false인경우  stmt0-->stmt2-->stmt3;
 */
public class IfTest {

	public static void main(String[] args) {
		System.out.println("stmt1");
		
		boolean condition=false;
		
		if(condition) {
			System.out.println("stmt2");
			System.out.println("stmt3");
			System.out.println("stmt4");
		}else {
			System.out.println("stmt5");
			System.out.println("stmt6");
			System.out.println("stmt7");
		}
		System.out.println("stmt8");
		System.out.println("stmt9");
		System.out.println("stmt10");
		
		int x=21;
		int y=30;
		if(x > y) {
			System.out.println("true-->21 > 30");
		}else {
			System.out.println("false-->21 > 30");
		}
		
		if (x < y) {
			System.out.println("true--> 21 < 30");
		}
		if(x==y) {
			System.out.println("true--> 21==30");
		}
		if(x!=y) {
			System.out.println("true--> 21!=30");
		}
		
		System.out.println("----------지역변수의범위----------");
		int a=90;
		if(true) {
			int b=80;
			System.out.println("a="+a);
			System.out.println("b="+b);
		}
		System.out.println("a="+a);
		//System.out.println("b="+b);
		System.out.println("end");
		return;
		//System.out.println("after return");
	}

}
