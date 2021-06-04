package com.itwill04.array;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car[] carArr = {
				null, null, new Car("45도6743", 8), null, null,
				new Car("67사2235", 12), null, null, null, null,
				null, null, null, null, new Car("12주7789", 11),
				null, new Car("99가2312", 10), null, null, null,
				null, null, new Car("85바1235", 8), null, null,
				null, null, null, new Car("55도3333", 8), null,
				};
		
		System.out.println("1. 전체 차량 출력");
		Car.headerPrint();
		for(int i = 0 ; i < carArr.length; i++) {
			if(carArr[i] != null) {
				carArr[i].print();
			}
		}
		
		System.out.print("2. 전체 주차구획수");
		System.out.println(": "+ carArr.length);
		
		System.out.print("3. 주차 가능한 주차구획수");
		int tot = 0 ;
		for(int i = 0 ;i <carArr.length;i++) {
			if(carArr[i] == null) {
				tot = tot+1;
			}
		}
		System.out.println(": "+ tot);
		
		System.out.println("4. 입차");
		
		Car car = new Car("11바3456", 14);//주차될 차
		for(int i = 0 ; i < carArr.length;i++) {
			if(carArr[i] == null) {//빈자리일 때
				carArr[i] = car; //배열에 차 객체를 대입한다
				break;//그리고 하나 넣었으면 반복문 탈출
			}
		}
		
		System.out.println("5.입차시간 10시이후 차량여러대 찾아서 정보출력");
		Car.headerPrint();
		for(int i = 0 ; i < carArr.length; i++) {
			if(carArr[i] != null && carArr[i].getInTime() > 10) {
				carArr[i].print();
			}
		}
		
		

	}

}
