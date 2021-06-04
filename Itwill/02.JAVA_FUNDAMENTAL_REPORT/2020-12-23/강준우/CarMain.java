public class CarMain {

	public static void main(String[] args) {
		//Car[] carArray=new Car[30];
		
		Car[] carArray= {
				null,null,new Car("5654", 8),null,null,
				new Car("3422", 12),null,null,null,null,
				null,null,null,null,new Car("7789", 11),
				new Car("1120", 10),null,null,null,null,
				null,new Car("2389", 9),null,null,null,
				null,null,null,null,new Car("5555", 6)
		};
		/*
		null.메쏘드() --> NullPointerException
		 */
		System.out.println("1.전체 차량출력");
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null) {
				carArray[i].print();
			}
		}
		System.out.println("2.전체주차구획수");
		System.out.println(">> "+carArray.length);
		System.out.println("3.주차가능주차구획수");
		int count=0;
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]==null) {
				count++;
			}
		}
		System.out.println(">> "+ count);
		System.out.println("4.입차");
		/*
		 * 1.차량객체생성
		 */
			Car car=new Car("1231", 9);
		/*
		 * 2.빈자리찾아서대입
		 */
			for (int i = 0; i < carArray.length; i++) {
				if(carArray[i]==null) {
					carArray[i]=car;
					break;
				}
			}
		
		System.out.println("5.입차시간 10시이후 차량여러대 찾아서 정보출력");
		for (int i = 0; i < carArray.length; i++) {
			if(carArray[i]!=null && (carArray[i].getInTime() > 10)) {
				carArray[i].print();
			}
		}
		
	}

}
