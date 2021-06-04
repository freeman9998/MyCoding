/*
 * 숫자데이타끼리의 형변환
 */
/*
		형변환--> 숫자형데이타간에만 가능
		    
		    - 자동형변환(작은데이타-->큰데이타타입변수):promotion
			     byte-->short-->int-->long-->float-->double
		    
		    - 자동형변환안됨(큰데이타-->작은데이타타입변수):casting
			     double-->float-->long-->int-->short-->byte  
			- 형식 :  (데이타타입)변수 or 리터럴;   
*/
public class TypeCasting {

	public static void main(String[] args) {
		/*
		 - 자동형변환(작은데이타-->큰데이타타입변수):promotion
			     byte-->short(char)-->int-->long-->float-->double
		 */
		 int  i1 = 56;
		 
		 long l1 = i1;
		 System.out.println(l1);
		 double d1 = i1;
		 System.out.println(d1);
		 
		 char c1='김';
		 int i2=c1;
		 System.out.println(c1);
		 System.out.println(i2);
		 /*
		 - 자동형변환안됨(큰데이타-->작은데이타타입변수):casting(강제형변환)
	       double-->float-->long-->int-->short-->byte
	     */
		 double avgd = 85.665;
		 int avgi = (int)avgd;
		 System.out.println(avgd);
		 System.out.println(avgi);
		 /*
		  * double avgd = 85.665;
		  * Quiz: 
		  *  1.소수점이하첫째짜리까지만 남겨두고 casting
		  *  2.소수점이하둘째짜리에서 반올림  
		  */
		 
		 /*
		  * 연산시의 형변환
		  *   - 연산항들중에 가장큰타입으로 모든항이 형변환(promotion)된다.
		  */
		 
		int ii=100;
		char cc='A';
		long ll=45L;
		double dd=45.789;
		
		long lr = ii+cc+ll;
		double dr= ii+dd+cc+ll;	
		
		System.out.println("-----------------------------");
		int kor=41;
		int eng=53;
		int math=84;
		
		int tot = kor+eng+math;
		double davg = tot/3.0;
		double davg1 =((int)(davg*10))/10.0;
		System.out.println("tot:"+tot);
		System.out.println("davg:"+davg);
		System.out.println("davg1:"+davg1);
	}
}








