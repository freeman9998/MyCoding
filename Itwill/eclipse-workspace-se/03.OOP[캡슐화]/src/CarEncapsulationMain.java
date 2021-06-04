
public class CarEncapsulationMain {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.setIpChaData("34도5674", 5);
		//2시간뒤
		car1.setOutTime(7);
		car1.calculateFee();
		car1.print();
		
		int fee=car1.getFee();
		System.out.println("car1 주차요금조회:"+fee);
		System.out.println("car1 주차요금변경");
		car1.setFee(0);
		car1.headerPrint();
		car1.print();
		
		Car car2=new Car();
		car2.setIpChaData("45도3434", 7);
		car2.setOutTime(10);
		car2.headerPrint();
		car2.print();
		
		/*
		 *  오늘의 입출차기록
		 */
		System.out.println("-------------오늘의 입출차기록----------------");
		car1.headerPrint();
		car1.print();
		car2.print();
		

	}

}
