/*
3. 멤버필드 앞에붙일경우 --> 상수
       ex> public final int PORT_NUMBER=80;
       상수화된다. 
       식별자는 대문자로 선언한다.   
       변경금지
*/

/*
class FinalField{
	public final int PORT_NUMBER=80;
	public final double INCENTIVE_RATE;
	
	final static public int NORTH=0;
	public final static int SOUTH=1;
	public final static int EAST=2;
	public final static int WEST=3;
	
	
	public FinalField() {
		this.INCENTIVE_RATE=0.1;
		
		//<< The final field FinalField.PORT_NUMBER cannot be assigned >>
		//this.PORT_NUMBER=8080;
		//this.INCENTIVE_RATE=0.3;
		
		System.out.println(this.INCENTIVE_RATE);
		System.out.println(this.PORT_NUMBER);
	}
	public void move(int direction) {
		switch (direction) {
		case FinalField.NORTH:
			System.out.println("move north");
			break;
		case FinalField.SOUTH:
			System.out.println("move south");
			break;
		case FinalField.EAST:
			System.out.println("move east");
			break;
		case FinalField.WEST:
			System.out.println("move west");
			break;
		}
	}
}
 */
public class FinalFieldMain {

	public static void main(String[] args) {
		FinalField ff1=new FinalField();
		/*
		<< The final field FinalField.INCENTIVE_RATE cannot be assigned >>
		ff1.INCENTIVE_RATE = 0.5;
		ff1.PORT_NUMBER=9090;
		*/
		System.out.println(ff1.INCENTIVE_RATE);
		System.out.println(ff1.PORT_NUMBER);
		/*
		<< The final field FinalField.NORTH cannot be assigned >>
		FinalField.NORTH=10;
		FinalField.SOUTH=11;
		 */
		
		ff1.move(FinalField.NORTH);	
		ff1.move(FinalField.SOUTH);	
		ff1.move(FinalField.SOUTH);	
		ff1.move(FinalField.WEST);	
		ff1.move(FinalField.NORTH);	
		ff1.move(FinalField.SOUTH);	
	}

}
