package president.america;

public class Trump {
	public int public_member_field;
	protected int protected_member_field;
	int default_member_field;
	private int private_member_field;
	
	public void public_method() {
		System.out.println("Trump.public_method()");
	}
	protected void protected_method() {
		System.out.println("Trump.protected_method()");
	}
	void default_method() {
		System.out.println("Trump.default_method()");
	}
	private void private_method() {
		System.out.println("Trump.private_method()");
	}
}
