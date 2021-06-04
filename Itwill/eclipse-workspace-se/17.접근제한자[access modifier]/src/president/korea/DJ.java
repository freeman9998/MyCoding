package president.korea;

public class DJ {
	public int public_member_field;
	protected int protected_member_field;
	int default_member_field;
	private int private_member_field;
	
	public void public_method() {
		System.out.println("DJ.public_method()");
	}
	protected void protected_method() {
		System.out.println("DJ.protected_method()");
	}
	void default_method() {
		System.out.println("DJ.default_method()");
		
	}
	private void private_method() {
		System.out.println("DJ.private_method()");
	}
}
