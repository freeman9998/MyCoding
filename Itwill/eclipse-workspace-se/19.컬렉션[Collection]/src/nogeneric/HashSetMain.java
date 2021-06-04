package nogeneric;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

	public static void main(String[] args) {
		HashSet accSet = new HashSet();
		System.out.println("#set size:"+accSet.size());
		Account acc1=new Account(1111, "KIM", 33000, 0.05);
		Account acc2=new Account(2222, "KIM", 23000, 0.15);
		Account acc3=new Account(3333, "SIM", 34000, 0.35);
		Account acc4=new Account(4444, "XIM", 35000, 0.65);
		Account acc5=new Account(5555, "BIM", 99000, 0.95);
		System.out.println("---------add-------------");
		accSet.add(acc1);
		accSet.add(acc2);
		accSet.add(acc3);
		accSet.add(acc4);
		accSet.add(acc5);
		System.out.println("#set size:"+accSet.size());
		System.out.println(accSet);
		System.out.println("---------add[중복객체]-------------");
		/*
		 * - equals 메쏘드를 사용해서 중복체크를한다.
		 */
		accSet.add(acc2);
		accSet.add(acc3);
		boolean isAdd=accSet.add(acc4);
		System.out.println("isAdd:"+isAdd);
		System.out.println("#set size:"+accSet.size());
		System.out.println("---------remove()-------------");
		boolean isRemove = accSet.remove(acc5);
		System.out.println("isRemove:"+isRemove);
		System.out.println("#set size:"+accSet.size());
		System.out.println(accSet);
		System.out.println("--------------isEmpty-------------");
		System.out.println(accSet.isEmpty());
		System.out.println("--------------isContains-------------");
		if(accSet.contains(acc1)) {
			System.out.println("acc1의 주소 존재:"+acc1);
		}
		System.out.println("-------------전체출력-----------------");
		
		System.out.println("################## iteration #######################");
		Iterator accIter = accSet.iterator();
		while(accIter.hasNext()) {
			Account tempAccount=(Account)accIter.next();
			tempAccount.print();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
