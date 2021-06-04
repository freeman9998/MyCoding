
public class CarMain {

	public static void main(String[] args) {
	Car[] carArr = {
			null,null,new Car("5654", 8),null,null,
			new Car("3422", 12),null,null,null,null,
			null,null,null,null,new Car("7789", 11),
			null,new Car("1013", 9),null,null,null,
			null,new Car("0815", 18),null,null,null,
			null,null,null,null,new Car("0901",6)
	};
	
	System.out.println("1.전체차량 출력");
	Car.headerPrint();
	for (int i = 0; i < carArr.length; i++) {
		if(carArr[i]!=null) {
		carArr[i].print();
		}
	}
	System.out.println("2.전체 주차구획수");
	System.out.println(carArr.length);
	System.out.println("3.주차가 가능한 주차구획수");
	int count = 0;
	for (int i = 0; i < carArr.length; i++) {
		if(carArr[i]==null) {
			count++;
		}
	}
	System.out.println(count);
	System.out.println("4.입차");
	/*
	 * 1.차량객체생성
	 * 2.빈자리찾아서 대입
	 */
	Car car1 = new Car("4885", 16);
	for (int i = 0; i < carArr.length; i++) {
		if(carArr[i]==null) {
			carArr[i]=car1;
			break;
		}
	}

	System.out.println("5.입차시간 10시이후 차량 여러대 찾아서 출력");
	Car.headerPrint();
	
	for (int i = 0; i < carArr.length; i++) {
		if(carArr[i]!=null&&carArr[i].getInTime()>10) {
			carArr[i].print();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	}

}
