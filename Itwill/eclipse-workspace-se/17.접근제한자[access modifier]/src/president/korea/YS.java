package president.korea;

import president.america.Trump;

public class YS {
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
	
	public void access() {
		/***********YS클래스내부***********/
		this.public_member_field=1;
		this.protected_member_field=2;
		this.protected_member_field=3;
		this.private_member_field=4;
		this.public_method();
		this.protected_method();
		this.default_method();
		this.private_method();
		
		/***********YS와 같은패키지인 DJ접근***********/
		DJ dj=new DJ();
		dj.public_member_field=1;
		dj.protected_member_field=2;
		dj.default_member_field=3;
		//dj.private_member_field=4;
		dj.public_method();
		dj.protected_method();
		dj.default_method();
		/*
		<<The method private_method() from the type DJ is not visible>>
		dj.private_method();
		*/
		/***********YS와 다른패키지 인 Trump접근***********/
		Trump trump=new Trump();
		trump.public_member_field=1;
		/*
		trump.protected_member_field=2;
		trump.default_member_field=3;
		trump.private_member_field=4;
		*/
		trump.public_method();
		/*
		trump.protected_method();
		trump.default_method();
		trump.private_method();
		*/
	}
	
}












