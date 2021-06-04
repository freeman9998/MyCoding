public class FinalField{
	public final int PORT_NUMBER=80;
	public final double INCENTIVE_RATE;
	
	final static public int NORTH=0;
	public final static int SOUTH=1;
	public final static int EAST=2;
	public final static int WEST=3;
	
	
	public FinalField() {
		this.INCENTIVE_RATE=0.1;
		/*
		<< The final field FinalField.PORT_NUMBER cannot be assigned >>
		this.PORT_NUMBER=8080;
		this.INCENTIVE_RATE=0.3;
		*/
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