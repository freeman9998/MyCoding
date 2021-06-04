
public class CarConstructorMain {

	public static void main(String[] args) {
		Car car1=new Car("2345", 1);
		car1.setOutTime(5);
		car1.calculateFee();
		car1.print();
		
		Car car2=new Car();
		car2.setIpChaData("8989", 6);
		car2.setOutTime(9);
		car2.calculateFee();
		car2.print();
		
		System.out.println("-----------주차장 오늘 모든출력[admin]--------");
		Car cara=new Car("1111", 1, 2, 4500);
		Car carb=new Car("3421", 3, 7, 3400);
		Car carc=new Car("2216", 11, 15, 5600);
		Car card=new Car("1111", 3, 4, 6789);
		Car care=new Car("7867", 10, 19, 8900);
		Car carf=new Car("5643", 9, 12, 1000);
		cara.headerPrint();
		cara.print();
		carb.print();
		carc.print();
		card.print();
		care.print();
		carf.print();
		

	}

}
