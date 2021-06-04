class MemberMethodThis{
	int memberField1;
	char memberField2;
	double memberField3;
	
	void setData(int memberField1,char memberField2 ,double memberField3) {
		/*
		 * this : 
		 *    - self참조변수
		 *    - print메쏘드를 가지고있는 객체의 주소값
		 */
		this.memberField1=memberField1;
		this.memberField2=memberField2;
		this.memberField3=memberField3;
	}
	void setMemberField1(int memberField1) {
		this.memberField1 = memberField1;
	}
	void print() {
		System.out.println(this.memberField1);
		System.out.println(this.memberField2);
		System.out.println(this.memberField3);
	}
}


public class MemberMethodThisMain {

	public static void main(String[] args) {
		MemberMethodThis mmt1=new MemberMethodThis();
		/*
		mmt1.memberField1=12121;
		mmt1.memberField2='김';
		mmt1.memberField3=3.14159;
		*/
		
		mmt1.setData(12121,'김',3.14159);
		/*
		mmt1.memberField1=777777;
		*/
		mmt1.setMemberField1(77777);
		/*
		System.out.println(mmt1.memberField1);
		System.out.println(mmt1.memberField2);
		System.out.println(mmt1.memberField3);
		*/
		mmt1.print();
	}

}
