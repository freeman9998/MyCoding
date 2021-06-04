package com.itwill05.service.car;

public class CarService {

	private Car[] carArray;

	public CarService() {
		carArray = new Car[30];
	}

	public CarService(int count) {
		carArray = new Car[count];
	}

	/*
	 * 0. 차객체인자로받아서 입차후 성공실패여부반환 - 주차장이 만차이면 입차실패 - 차량번호중복체크
	 */
	public boolean carIn(Car car) {
		boolean isSuccess = false;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				if (carArray[i].getNo().equals(car.getNo())) {
					return isSuccess;
				}
			}
		}
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				carArray[i] = car;
				isSuccess = true;
				return isSuccess;
			}
		}
		return isSuccess;
	}

	// 1. 전체차량출력
	public void print() {
		Car.headerPrint();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				carArray[i].print();
			}
		}
	}

	// 2. 주차구획수반환
	public int parkingMaxNo() {
		return carArray.length;
	}

	// 3. 주차가능주차구획수반환
	public int parkingAvailableNo() {
		int count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] == null) {
				count++;
			}
		}
		return count;
	}

	// 5. 차량번호(4567번) 인자받아서 차객체한대 참조변수반환
	public Car findCarByNo(String no) {
		Car findCar = new Car();
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				if (carArray[i].getNo().equals(no)) {
					findCar = carArray[i];
				}
			}
		}
		return findCar;
	}

	// 6. 입차시간(8시이후)인자받아서 차객체배열 참조변수반환
	public Car[] findCarByInTime(int inTime) {
		int count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				if (carArray[i].getInTime() > inTime) {
					count++;
				}
			}
		}

		if (count == 0) {
			return null;
		}

		Car[] findCars = new Car[count];
		count = 0;
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				if (carArray[i].getInTime() > inTime) {
					findCars[count] = carArray[i];
					count++;
				}
			}
		}

		return findCars;
	}

	// 7. 차량번호(7891번),출차시간(12시)인자로 받아서 출차"
	public void carOut(String no, int outTime) {
		for (int i = 0; i < carArray.length; i++) {
			if (carArray[i] != null) {
				if (carArray[i].getNo().equals(no)) {
					carArray[i].setOutTime(outTime);
					carArray[i].calculateFee();
					Car.headerPrint();
					carArray[i].print();
					carArray[i] = null;
				}
			}
		}
	}

}