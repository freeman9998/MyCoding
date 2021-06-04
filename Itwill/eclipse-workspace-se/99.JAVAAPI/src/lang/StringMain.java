package lang;

public class StringMain {

	public static void main(String[] args) {
		/*
		 * String 객체의 명시적생성(생성자호출)
		 */
		String name1=new String("KIM");
		String name2=new String("KIM");
		if(name1==name2) {
			System.out.println("name1,name2의 주소값이 동일하다");
		}else {
			System.out.println("name1,name2의 주소값이 동일하지않다.");
		}
		/*
		 * String 객체의 암시적생성
		 * - "" 을 사용 
		 */
		
		String name3="KIM";
		String name4="KIM";
		if(name3==name4) {
			System.out.println("name3의 주소값과 name4의 주소값이 동일하다.");
		}else {
			System.out.println("name3의 주소값과 name4의 주소값이 동일하지 않다.");
		}
		if("KIM"== name3) {
			System.out.println(" \"KIM\" 의 주소값과 name3의 주소값이 동일하다.");
		}
		System.out.println("-----------------String 객체의 문자열비교(equals)--------------------");
		/*
		  <<String>>
		    public boolean equals(String compareString)
		    	- String객체가가지고있는 문자열비교로 재정의
		     Overrides:
				equals in class Object	 
		 */
		if(name1.equals(name2)) {
			System.out.println("name1과 name2의 문자열이동일하다");
		}
		if(name1.equals(name3)) {
			System.out.println("name1과 name3의 문자열이동일하다");
		}
		if(name1.equals(name4)) {
			System.out.println("name1과 name4의 문자열이동일하다");
		}
		if(name1.equals("KIM")) {
			System.out.println("name1과 KIM 의 문자열이동일하다");
		}
		if("KIM".equals("KIM")) {
			System.out.println("KIM 과 KIM 의 문자열이동일하다");
		}
		
		System.out.println("-----------오름차순정렬--------------");
		
		char c1='Z';
		char c2='A';
		System.out.println(">>>> 문자 1개비교");
		if(c1 > c2) {
			System.out.println("교환");
		}else {
			System.out.println("교환안함");
		}
		if(c1 - c2 > 0) {
			System.out.println("교환");
		}else {
			System.out.println("교환안함");
		}
		
		
		/*
		public int compareTo(String anotherString)
			Compares two strings lexicographically. 
			The comparison is based on the Unicode value of each character in the strings. 
			The character sequence represented by this String object is compared 
			lexicographically to the character sequence represented by the argument string. 
		
		    -->The result is a negative integer 
		    if this String object lexicographically precedes the argument string. 
		    
		    -->The result is a positive integer 
		    if this String object lexicographically follows the argument string. 
		    
		    -->The result is zero 
		    if the strings are equal; compareTo returns 0 exactly when the equals(Object) method would return true.
		*/
		String irum1="AB";
		String irum2="AA";
		int uncodeGap = irum1.compareTo(irum2);
		System.out.println(uncodeGap);
		if(uncodeGap > 0) {
			System.out.println("교환");
		}
		if("AA".compareTo("AB") < 0) {
			System.out.println("AA - AB < 0");
		}
		if("AB".compareTo("AA") > 0) {
			System.out.println("AB - AA > 0");
		}
		if("AA".compareTo("AA")==0) {
			System.out.println("AA-AB == 0");
		}
		
		if("홍경호".compareTo("김경호") > 0) {
			System.out.println("uncodegap:"+"홍경호".compareTo("김경호"));
		}
		if("김경호".compareTo("홍경호") < 0) {
			System.out.println("uncodegap:"+"김경호".compareTo("홍경호"));
		}
		if("김경호".compareTo("김경호")== 0) {
			System.out.println("uncodegap:"+"김경호".compareTo("김경호"));
		}
		
		
		
		
		
		
		
	}
}
