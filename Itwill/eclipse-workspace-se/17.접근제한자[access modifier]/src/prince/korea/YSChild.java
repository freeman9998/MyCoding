package prince.korea;

import president.korea.YS;

public class YSChild extends YS{
	/*
	public int public_member_field;
	protected int protected_member_field;
	int default_member_field;
	private int private_member_field;
	
	public void public_method() {
		System.out.println("YS.public_method()");
	}
	protected void protected_method() {
		System.out.println("YS.protected_method()");
	}
	void default_method() {
		System.out.println("YS.default_method()");
		
	}
	private void private_method() {
		System.out.println("YS.private_method()");
	}
	*/
	public void access2() {
		this.public_member_field=1;
		this.protected_member_field=2;
		//this.default_member_field=3;
		//this.private_member_field=4;
		this.public_method();
		this.protected_method();
		//this.default_method();
		//this.private_method();
		
		
	}
	
	
}
















