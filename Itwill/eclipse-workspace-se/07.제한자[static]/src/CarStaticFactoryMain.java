
public class CarStaticFactoryMain {

	public static void main(String[] args) {
		Car.count=100;
		System.out.println("1.차량생산대수:"+ Car.count);
		Car c1=new Car(1, "SM3", "RED");
		//Car.count=Car.count+1;
		Car c2=new Car(2, "SM4", "GREEN");
		//Car.count=Car.count+1;
		Car c3=new Car(3, "SM5", "BLUE");
		Car.headerPrint();
		c1.print();
		c2.print();
		c3.print();
		
		System.out.println("차량생산대수 Car.count:"+Car.count);
		System.out.println("차량생산대수 c1.count:"+c1.count);
		System.out.println("차량생산대수 c2.count:"+c2.count);
	}

}
