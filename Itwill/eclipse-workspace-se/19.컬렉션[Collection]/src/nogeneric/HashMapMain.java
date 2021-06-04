package nogeneric;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap carMap=new HashMap();
		System.out.println("#map size:"+carMap.size());
		System.out.println("---------put(key,value)----------");
		Car c1=new Car("34호1234", 12);
		carMap.put("34호1234", c1);
		carMap.put("22수1344", new Car("22수1344",13));
		carMap.put("12미1344", new Car("12미1344",14));
		carMap.put("22양7844", new Car("22양7844",17));
		carMap.put("22가9977", new Car("22가9977",19));
		System.out.println("map size:"+carMap.size());
		System.out.println(carMap);
		System.out.println("---존재하는키가 입력되면 객체가바뀐다.----");
		carMap.put("22가9977", new Car("22가9977",5));
		System.out.println("#map size:"+carMap.size());
		System.out.println(carMap);
		System.out.println("-------------get(key)--------------");
		Car getCar=(Car)carMap.get("12미1344");
		getCar.setOutTime(19);
		getCar.calculateFee();
		getCar.print();
		getCar = (Car)carMap.get("99홓3333");
		if(getCar!=null) {
			getCar.print();
		}else {
			System.out.println("차량이존재하지않습니다.");
		}
		System.out.println("---------containsKey(key)----------------");
		if(carMap.containsKey("22가9977")) {
			getCar=(Car)carMap.get("22가9977");
			getCar.print();
		}
		
		System.out.println("---------remove(key)----------------");
		Car removeCar = (Car)carMap.remove("22양7844");
		if(removeCar!=null) {
			System.out.println("삭제성공:"+removeCar);
			removeCar.print();
		}
		System.out.println("# map size:"+carMap.size());
		System.out.println("-------------주자창전체차량출력---------------");
		System.out.println("################## iteration #######################");
		Set keySet = carMap.keySet();
		Iterator keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String tempKey=(String)keyIter.next();
			Car car=(Car)carMap.get(tempKey);
			car.print();
		}
		
		
		
	}

}











