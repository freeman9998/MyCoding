package com.itwill05.service.car;


public class CarService {
	
	private Car[] carArr;
	
	public CarService() {
		carArr=new Car[30];
	}
	public CarService(int count) {
		carArr=new Car[count];
	}
	/*
	0. 차객체인자로받아서 입차후 성공실패여부반환
	     - 주차장이 만차이면 입차실패
	     - 차량번호중복체크
	*/
	public boolean ipChar(Car inCar) {
		boolean isSuccess=false;
		
		
		for(int i = 0 ; i< carArr.length; i++) {
			if(carArr[i] != null && carArr[i].getNo().equals(inCar.getNo()) ) {
				System.out.println(inCar.getNo() + "는 중복된 차량번호입니다.");
				return isSuccess;
			}
		}
		
		int cnt = 0;
		for(int i = 0 ; i< carArr.length; i++) {
			if(carArr[i] != null) {
				cnt++;}
		}
		
		if(cnt == carArr.length ) {
			isSuccess = false;
			return isSuccess;
		}
		
		for(int i = 0 ; i< carArr.length; i++) {
			if(carArr[i] == null ) {
				carArr[i] = inCar;
				isSuccess = true;
				break;	
			}
		}
		
		return isSuccess;
	}
	
	
	
	//1. 전체차량출력
	public void print() {
		Car.headerPrint();
		for(int i = 0 ; i < carArr.length ; i++) {
			if(carArr[i] != null) {
			carArr[i].print(); 
			}
		}
	}
	
	
	
	//2. 주차구획수반환
	public int allParkingLot() {
		return carArr.length;
	}
	
	//3. 주차가능주차구획수반환
	public int emptyParkingLot() {
		int cnt = 0;
		for(int i = 0; i < carArr.length; i++) {
			if(carArr[i] == null) {
				cnt++;
			}
		}
		return cnt;
	}
	
	
	//5. 차량번호(4567번) 인자받아서 차객체한대 참조변수반환
	public Car findCarNo(String no) {
		Car car=null;
		for(int i = 0 ; i < carArr.length; i++) {
			if(carArr[i] != null && carArr[i].getNo().equals(no)) {
				car = carArr[i];
				break;
			}
		}
		return car;
	}
	
	//6. 입차시간(8시이후)인자받아서 차객체배열 참조변수반환
	public Car[] findCarInTime(int in) {
		int cnt = 0;
		
		for(int i = 0 ; i < carArr.length; i++) {
			if(carArr[i] != null && carArr[i].getInTime() >= in) {
				cnt++;
			}
		}
		
		Car[] car= new Car[cnt];
		cnt = 0;
		for(int i = 0 ; i < carArr.length; i++) {
			if(carArr[i] != null && carArr[i].getInTime() >= in) {
				car[cnt] = carArr[i];
				cnt++;
			}
		}
		return car;
	}
	
	
	//7. 차량번호(7891번),출차시간(12시)인자로 받아서 출차"
	public void exitCar(String no, int outTime) {
		for(int i = 0 ; i < carArr.length; i++) {
			if(carArr[i] != null && carArr[i].getNo().equals(no)) {
				carArr[i].setOutTime(outTime);
				carArr[i].calculateFee();
			}
		}
	}
	
	
}