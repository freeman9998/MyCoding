

public class OuterClassMain {

	public static void main(String[] args) {
		OuterClass oc=new OuterClass();
		oc.outer_member_field=9090;
		oc.outer_member_method();
		
		/*
		OuterClass.InnerClass ic=oc.new InnerClass();
		ic.inner_member_field=437857823;
		ic.inner_member_method();
		*/
	}

}
