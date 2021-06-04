
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {
		
		Account[] accArray=new Account[5];
		accArray[0]=new Account(1111, "KIM", 89000,0.6);
		accArray[1]=new Account(2222, "LIM", 39000,0.3);
		accArray[2]=new Account(3333, "JIM", 29000,0.2);
		accArray[3]=new Account(4444, "OIM", 45000,0.1);
		accArray[4]=new Account(5555, "PIM", 12000,0.8);
		Account.headerPrint();
		for (int i = 0; i < accArray.length; i++) {
			accArray[i].print();
		}
	}

}
