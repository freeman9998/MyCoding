package generic;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain {

	public static void main(String[] args) {
		HashSet<Account> accSet = new HashSet<Account>();
		System.out.println("---------------------HashSet[참조형]----------------------");
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
		System.out.println("-------------전체출력[toArray]-----------------");
		Object[] accArray = accSet.toArray();
		for (int i = 0; i < accArray.length; i++) {
			Account tAccount=(Account)accArray[i];
			tAccount.print();
		}
		
		System.out.println("################## iteration #######################");
		Iterator<Account> accIter = accSet.iterator();
		while(accIter.hasNext()) {
			Account tempAccount=accIter.next();
			tempAccount.print();
		}
		System.out.println("---------------------HashSet[String]----------------------");
		Set<String> nameSet = new HashSet<String>();
		nameSet.add(new String("KIM"));
		nameSet.add("JIM");
		nameSet.add("GIM");
		nameSet.add("DIM");
		nameSet.add("SIM");
		System.out.println("add --> "+nameSet);
		nameSet.add("KIM");
		System.out.println("add --> "+nameSet);
		if(nameSet.contains("KIM")) {
			System.out.println("KIM문자열을가진 String 객체가존재");
		}
		System.out.print("remove-->"+nameSet.remove("KIM")+" ");
		System.out.println(nameSet);
		System.out.println();
		System.out.print("iteration-->");
		Iterator<String> nameIter = nameSet.iterator();
		while(nameIter.hasNext()) {
			String name=nameIter.next();
			System.out.print(name+" ");
		}
		System.out.println();
		System.out.println("---------------------HashSet[Wrapper]----------------------");
		Set<Integer> lottoSet = new HashSet<Integer>();
		lottoSet.add(34);
		lottoSet.add(12);
		lottoSet.add(2);
		lottoSet.add(41);
		lottoSet.add(11);
		System.out.println("-----add------");
		System.out.println("#size:"+lottoSet.size());
		lottoSet.add(34);
		lottoSet.add(34);
		lottoSet.add(34);
		lottoSet.add(34);
		lottoSet.add(34);
		System.out.println("#size:"+lottoSet.size());
		
		
		
		
		
		
		
	}

}
