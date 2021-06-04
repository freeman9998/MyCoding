
public class CarFactoryMain{

	public static void main(String[] args) {
		Engine e1=new Engine("A", 8900);
		Car c1=new Car();
		c1.setNo(1);
		c1.setModel("PORSCHE");
		//c1.engine=e1;
		c1.setEngine(e1);
		c1.print();
	}

}
