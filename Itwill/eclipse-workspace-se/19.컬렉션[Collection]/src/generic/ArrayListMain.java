package generic;
import java.util.ArrayList;
import java.util.Iterator;

import sun.security.rsa.RSACore;

public class ArrayListMain {

	public static void main(String[] args) {
		System.out.println("-------------Object[]-------------");
		/*
		Account acc1=new Account(1111, "KIM", 33000, 0.05);
		Account acc2=new Account(2222, "GIM", 23000, 0.15);
		Account acc3=new Account(3333, "SIM", 34000, 0.35);
		Account acc4=new Account(4444, "XIM", 35000, 0.65);
		Account acc5=new Account(5555, "BIM", 99000, 0.95);
		Object o1=acc1;
		Object o2=acc2;
		Object o3=acc3;
		Object o4=acc4;
		Object o5=acc5;
		
		Object[] anyTypeArray=new Object[5];
		anyTypeArray[0]=o1;
		anyTypeArray[1]=o2;
		anyTypeArray[2]=o3;
		anyTypeArray[3]=o4;
		anyTypeArray[4]=o5;
		
		for (int i = 0; i < anyTypeArray.length; i++) {
			Account tempAccount=(Account)anyTypeArray[i];
			tempAccount.print();
		}
		*/
		Account acc1=new Account(1111, "KIM", 33000, 0.05);
		Account acc2=new Account(2222, "KIM", 23000, 0.15);
		Account acc3=new Account(3333, "SIM", 34000, 0.35);
		Account acc4=new Account(4444, "XIM", 35000, 0.65);
		Account acc5=new Account(5555, "BIM", 99000, 0.95);
		System.out.println("----------------ArrayList[참조형]------------------");
		ArrayList<Account> accountList=new ArrayList<Account>(); 
		
		int size = accountList.size();
		System.out.println("#size:"+size);
		System.out.println("********** 1.add *****************");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		accountList.add(new Account(6666, "SIX", 60000, 6.6));
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList.toString());
		accountList.add(0, new Account(1000, "FIRST", 10000, 1.1));
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList.toString());
		System.out.println("********** 2.set *****************");
		accountList.set(3,new Account(3333, "SAM", 330000, 3.3));
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		
		System.out.println("********** 3.get *****************");
		Account getAccount = accountList.get(3);
		getAccount.print();
		getAccount = accountList.get(accountList.size()-1);
		getAccount.print();
		System.out.println("********** 4.remove *****************");
		Account removeAccount=accountList.remove(0);
		removeAccount.print();
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("*********** 5.전체출력**************");
		for(int i=0;i<accountList.size();i++) {
			accountList.get(i).print();
		}
		System.out.println("*********** 5.전체출력[enhanced for]**************");
		for(Account account:accountList) {
			account.print();
		}
		
		System.out.println("*********** 계좌번호 5555번 계좌한개   출력**************");
		for(int i=0;i<accountList.size();i++) {
			Account tempAccount = accountList.get(i);
			if(tempAccount.getNo()==5555) {
				tempAccount.print();
				break;
			}
			
		}
		System.out.println("*********** 계좌이름 KIM인  계좌여러개 출력[Quiz]**************");
		for(int i=0;i<accountList.size();i++) {
			Account tempAccount=accountList.get(i);
			if(tempAccount.getOwner().equals("KIM")) {
				tempAccount.print();
			}
		}
		
		System.out.println("*********** 계좌번호 5555번 계좌한개   삭제 **************");
		for(int i=0;i<accountList.size();i++) {
			Account tempAccount = accountList.get(i);
			if(tempAccount.getNo()==5555) {
				System.out.println("before remove size:"+accountList.size());
				accountList.remove(i);
				System.out.println("after remove size:"+accountList.size());
				break;
			}
		}
		System.out.println("*********** 계좌이름 KIM인  계좌여러개 삭제[Quiz]**************");
		for(int i=0;i<accountList.size();i++) {
			Account tempAccount=accountList.get(i);
			if(tempAccount.getOwner().equals("KIM")) {
				accountList.remove(i);
				i--;
			}
		}
		Account.headerPrint();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			tempAccount.print();
		}
		
		
		System.out.println("################## iteration #######################");
		Iterator<Account> accIter = accountList.iterator();
		while(accIter.hasNext()) {
			Account tempAccount=accIter.next();
			tempAccount.print();
		}
		
		System.out.println("--------------ArrayList[Wrapper]-------");
		ArrayList<Integer> scoreList=new ArrayList<Integer>();
		scoreList.add(new Integer(90));
		scoreList.add(30);
		scoreList.add(45);
		scoreList.add(34);
		scoreList.add(12);
		scoreList.add(99);
		scoreList.add(62);
		scoreList.add(88);
		System.out.println("---add----");
		System.out.println(scoreList);
		System.out.println("---get----");
		int getScore = scoreList.get(0);
		System.out.println(getScore);
		System.out.println("---set----");
		scoreList.set(0, new Integer(100));
		scoreList.set(1, 100);
		System.out.println(scoreList);
		System.out.println("---remove---");
		System.out.println("#size:"+scoreList.size());
		Integer removeScore = scoreList.remove(0);
		int rscore=removeScore;//UnBoxing
		System.out.println(rscore);
		System.out.println("#size:"+scoreList.size());
		System.out.println("----------전체출력-------");
		for (Integer score : scoreList) {
			//int tscore=score.intValue();
			int tscore=score;
			System.out.print(score+" ");
		}
		System.out.println();
		System.out.println("########### iteration #########");
		Iterator<Integer> scoreIter = scoreList.iterator();
		while (scoreIter.hasNext()) {
			int score = scoreIter.next();
			System.out.print(score+" ");
		}
		System.out.println();
		System.out.println("--------------ArrayList<String>-----------");
		ArrayList<String> nameList=new ArrayList<String>();
		nameList.add("KIM");
		nameList.add("SIM");
		nameList.add("KIM");
		nameList.add("CIM");
		nameList.add("VIM");
		String str=new String("UIM");
		nameList.add(str);
		System.out.println("---add--");
		System.out.println("size:"+nameList.size());
		System.out.println(nameList.toString());
		nameList.add("HHH");
		System.out.println(nameList);
		nameList.add(3,"KKK");
		System.out.println(nameList);
		System.out.println("--set--");
		nameList.set(3, "THREE");
		System.out.println(nameList);
		System.out.println("--remove(int index)--");
		nameList.remove(5);
		System.out.println("--remove(Object e)--");
		System.out.println(nameList);
		//nameList.remove(new String("KIM"));
		nameList.remove("KIM");
		System.out.println(nameList);
		System.out.println("---------전체출력-------");
		for (String name : nameList) {
			System.out.print(name+",");
		}
		System.out.println();
		System.out.println("---------전체출력[Iteration]-------");
		Iterator<String> nameIter = nameList.iterator();
		while (nameIter.hasNext()) {
			String name =nameIter.next();
			System.out.print(name+" ");
		}
		System.out.println();
		
	}
}













