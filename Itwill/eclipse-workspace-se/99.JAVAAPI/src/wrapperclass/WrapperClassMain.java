package wrapperclass;
/*
- Wrapper 클래스
	자바데이타형은 기본데이타형과 레퍼런스 데이타 형으로 구분됩니다.
	기본데이타형으로는 int,boolean,double... 등이 제공됩니다.
	이런기본 데이타형을 객체로 사용할수있는 방법으로 Wrapper 클래스가 제공됩니다.
	Wrapper 클래스는 각종유용한 기능들을 메서드로 제공받을수있다는	장점이있습니다.
	Integer,Boolean,Double,Character,Float,Long,Byte,Short
 */
public class WrapperClassMain {

	public static void main(String[] args) {
		/*
		 * WrapperClass객체생성
		 */
		/*
		Boxing 
		 기본타입값--> Wrapper객체
		*/ 
		Integer wi1=null;
		wi1=new Integer(89);
		Integer wi2=new Integer("89");
		Double wd1=new Double(3.14159);
		Double wd2=new Double("3.14159");
		Boolean wb1=new Boolean(true);
		Boolean wb2=new Boolean("true");
		
		/*
		 * UnBoxing
		 *   Wrapper객체-->기본형값
		 */
		int i1=wi1.intValue();
		int i2=wi2.intValue();
		double d1=wd1.doubleValue();
		double d2=wd2.doubleValue();
		boolean b1=wb1.booleanValue();
		boolean b2=wb2.booleanValue();
		
		/*
		 * Auto Boxing
		 */
//		Integer wi3 = new Integer(89);
		Integer wi3 = 89;
		Integer wi4 = 89;
		Double wd3=3.14159;
		Double wd4=3.14159;
		Boolean wb3=true;
		Boolean wb4=false;
		
		/*
		 * Auto UnBoxing
		 */
		//int i11 = wi1.intValue();
		int i11 = wi1;
		int i22 = wi2;
		double d11=wd1;
		double d22=wd2;
		boolean b11=wb1;
		boolean b22=wb2;
		
		System.out.println("*******************AUTO BOXING*********************");
		Integer ia=89;
		Integer ib=45;
		Integer ic=78;
		Integer id=99;
		Integer ie=23;
		System.out.println("*******************UPCASATING*********************");
		Object oa = ia;
		Object ob = ib;
		Object oc = ic;
		Object od = id;
		Object oe = ie;
		
		System.out.println("***************AUTO BOXING,UPCASTING****************");
		Object ooa=89;
		Object oob=45;
		Object ooc=78;
		Object ood=99;
		Object ooe=23;
	 
		System.out.println("******************Object[]********************");
		Object[] scoreArray=new Object[10];
		scoreArray[0]=89;
		scoreArray[1]=43;
		scoreArray[2]=33;
		scoreArray[3]=67;
		scoreArray[4]=77;
		scoreArray[5]=11;
		scoreArray[6]=34;
		scoreArray[7]=92;
		scoreArray[8]=99;
		scoreArray[9]=66;
		for (int i = 0; i < scoreArray.length; i++) {
			Integer tempScore =(Integer)scoreArray[i];
			//int score = tempScore.intValue();//UnBoxing
			int score = tempScore;// Auto UnBoxing
			System.out.print(score+" ");
		}		
		System.out.println();
		
		System.out.println("---- Object타입의 변수에는 자식타입의 객체주소를 대입할수있다.-------------");
		System.out.println("---- Object타입의 변수에는 기본형데이타는 대입불가능-----------------------");
		System.out.println("---- Object타입의 변수에는 기본형데이타는 자동으로 Wrapper객체로Boxing되어서"
				+ "참조변수가 대입된다.-----------------------");
		Object[] anyData=new Object[10];
		anyData[0]=56;
		anyData[1]=true;
		anyData[2]=3.10;
		/*
		anyData[3]=new Car();
		anyData[3]=new Account();
		*/
		
		

	}

}
