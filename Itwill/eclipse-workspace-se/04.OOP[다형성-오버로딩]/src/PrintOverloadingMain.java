
class Print{
	public void print(int i) {
		System.out.println("print int:"+i);
	}
	public void print(String str) {
		System.out.println("print String:"+str);
	}
	public void print(double d) {
		System.out.println("print double:"+d);
	}
	public void print(boolean b) {
		System.out.println("print boolean:"+b);
	}
	public void print(char c) {
		System.out.println("print char:"+c);
	}
}
public class PrintOverloadingMain {
	public static void main(String[] args) {
		Print p=new Print();
		
		p.print(true);
		p.print(12);
		p.print('김');
		p.print(23.23);
		p.print("문자열");
		
		System.out.println("문자");
		System.out.println(12);
		System.out.println('A');
		System.out.println(false);
	}
}





























