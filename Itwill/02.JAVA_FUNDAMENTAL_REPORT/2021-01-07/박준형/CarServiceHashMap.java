package com.itwill06.collection.car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CarServiceHashMap {
	
	private HashMap<String,Car> carMap;
	private int count;// 주차장 구획수

	public CarServiceHashMap() {
		carMap = new HashMap<String,Car>();
		count = 10;
	}

	public CarServiceHashMap(int count) {
		carMap = new HashMap<String,Car>();
		this.count = count;
	}

	/*
	 * 0. 차객체인자로받아서 입차후 성공실패여부반환 
	 *   - 주차장이 만차이면 입차실패
	 */
	public boolean ipCha(Car inCar) {
		boolean isSuccess=false;
		//중복된 차량번호가 있는지 확인
		//if(carMap.containsKey(inCar.getNo())){} 가능하다.
		for (String key : carMap.keySet()) {
			if(inCar.getNo().equals(key)) {
				return isSuccess;
			}
		}
		//주차장이 만차인 경우
		if(carMap.size()==count) {
			return isSuccess;
		}
		carMap.put(inCar.getNo(),inCar);
		isSuccess = true;
		return isSuccess;
	}

	/*
	 * 1. 전체차량출력
	 */
	public void print() {
		Car.headerPrint();
		/*
		 while문 형식
		Iterator<String> carIter = carMap.keySet().iterator();
		while (carIter.hasNext()) {
			Car car = (Car)carMap.get(carIter.next());
				car.print();
		}
		*/
		//for문을 이용한 출력
		for (String key : carMap.keySet()) {
			Car car = carMap.get(key);
			car.print();
		}
	}

	/*
	 * 2. 차량번호(4567번) 인자받아서 차객체한대 참조변수반환
	 */
	public Car findByNo(String no) {
		Car findCar =null;
		//containsKey를 이용하여 해당 차량번호가 존재하는지 확인
		if(carMap.containsKey(no)) {
			findCar=carMap.get(no);			
			return findCar;
		}
		return findCar;
	}

	/*
	 * 3. 입차시간(8시이후)인자받아서 ArrayList(차객체배열) 참조변수반환
	 */
	public ArrayList<Car> findByInTime(int inTime) {
		ArrayList<Car> findCars = new ArrayList<Car>();
		for (String key : carMap.keySet()) {
			Car car = carMap.get(key);
			if(car.getInTime()>=8) {
				findCars.add(car);
			}
		}
		return findCars;
	}

	/*
	 * 4. 차량번호(7891번),출차시간(12시)인자로 받아서 출차";
	 */
	public Car chulCha(String no, int outTime) {
		Car removeCar= null;
		/*
		containsKey를 이용하여 해당 차량번호가 존재하는지 확인
		*/
		if(carMap.containsKey(no)) {
			removeCar=carMap.get(no);	
			carMap.remove(no);
			removeCar.setOutTime(outTime);
			//주차요금 계산까지 해주기
			removeCar.calculateFee();
			return removeCar;
		}
		return removeCar;
	}
	/*
	 * 5. 주차전체구획수반환 
	 */
	public int getParkingLotCount() {
		return this.count;
	}
	
	/*
	  6. 주차가능주차구획수반환
	 */
	public int getAvailableParkingLotCount() {
		return count-carMap.size();
	} 
	
}
