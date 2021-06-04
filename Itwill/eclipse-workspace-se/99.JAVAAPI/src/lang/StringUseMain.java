package lang;

public class StringUseMain {

	public static void main(String[] args) {
		String str1="Have a nice day!!!";
		String str2="오늘은 월요일 형변환에 대해서 공부했어요!!";
		System.out.println("-------------------length()------------");
		int length1=str1.length();
		System.out.println(length1);
		System.out.println(str2.length());
		System.out.println("자바가 재미있네요!!!".length());
		String emptyStr="";
		System.out.println("empty string length:"+emptyStr.length());
		if(emptyStr.equals("")) {
			System.out.println("empty string 입니다.[equals]");
		}
		if(emptyStr.length()==0) {
			System.out.println("empty string 입니다[length==0].");
		}
		/*
		 * NullPointerException --> null.xxx()
		 */
		String id=null;
		if( id==null || id.length()==0 ) {
			System.out.println("아이디를 입력하세요!!!");
		}
		System.out.println("---------------String.substring()--------------");
		System.out.println("Have a nice day!!!".substring(7));
		/*
		
		String  String.substring(int beginIndex, int endIndex)
			Returns a string that is a substring of this string. 
			The substring begins at the specified beginIndex 
			and extends to the character at index endIndex - 1.
			Thus the length of the substring is endIndex - beginIndex. 

		 */
		System.out.println("Have a nice day!!!".substring(7,11));
		System.out.println("Have a nice day!!!".substring(7,11).length());
		System.out.println("오늘은 월요일 형변환에 대해서 공부했어요!!".substring(8));
		System.out.println("오늘은 월요일 형변환에 대해서 공부했어요!!".substring(8,11));
		System.out.println("오늘은 월요일 형변환에 대해서 공부했어요!!".substring(4,7));
		System.out.println("--------------charAt()-----------");
		String userId="test#00";
		char firstChar=userId.charAt(0);
		if((firstChar>='a' && firstChar<='z') ||(firstChar>='A' && firstChar<='Z')) {
			System.out.println(firstChar+" 는 아이디첫글자로 유효합니다..");
		}else {
			System.out.println(firstChar+" 는 아이디첫글자로 유효안합니다..");
		}
		
		for (int i = 0; i < userId.length(); i++) {
			char tempChar = userId.charAt(i);
			if((tempChar>='a' && tempChar<='z')||
			   (tempChar>='A' && tempChar<='Z')||
			   (tempChar>='0' && tempChar<='9')) {
				System.out.println("아이디로 유효한문자:"+tempChar);
			}else {
				System.out.println("아이디로 유효안한문자:"+tempChar);
			}
		}
		
		System.out.println("-------------String.split()-----------------");
		String cardNo="123-569-894-78789";
		String[] cardNoArray = cardNo.split("-");
		System.out.println(cardNoArray.length);
		for (int i = 0; i < cardNoArray.length; i++) {
			System.out.println(cardNoArray[i]);
		}
		
		System.out.println("------------------String.replace(char,char)---------------");
		String str3="우리는 자바를 공부합니다. 자바는 객체지향언어입니다.";
		String result3 = str3.replace('자', '멀');
		System.out.println(result3);
		String result4=str3.replace("자바", "파이썬");
		System.out.println(result4);
		String result5 = str3.replaceFirst("자바", "파이썬");
		System.out.println(result5);
		System.out.println("-------------String.toUpperCase,toLowerCase--------------");
		System.out.println("jAVa".toUpperCase());
		System.out.println("jAVa".toLowerCase());
		System.out.println("-------------String.equalsIgnoreCase---------------------");
		System.out.println("Yes".equalsIgnoreCase("yes"));
		System.out.println("Yes".equalsIgnoreCase("YES"));
		System.out.println("Yes".equalsIgnoreCase("yeS"));
		System.out.println("------------startWith,endWith--------------");
		String fileName="xxx.gif";
		if(fileName.endsWith(".gif")|| fileName.endsWith(".jpg")) {
			System.out.println(fileName+" 은 이미지 파일입니다");
		} 
		String[] names= {"김경호","김미숙","최경녀","김은희","신명숙"};
		int count=0;
		for (int i = 0; i < names.length; i++) {
			if(names[i].startsWith("김")) {
				//System.out.print(names[i]+" ");
				count++;
			}
		}
		System.out.println();
		String[] kimArray=new String[count];
		int index=0;
		for (int i = 0; i < names.length; i++) {
			if(names[i].startsWith("김")) {
				kimArray[index]=names[i];
				index++;
			}
		}
		System.out.println("kimArray length:"+kimArray.length);
		for (int i = 0; i < kimArray.length; i++) {
			System.out.print(kimArray[i]+" ");
		}
		System.out.println();
		
		System.out.println("------------------trim()----------------------");
		String id2="   guar d   ";
		System.out.println(id2.length());
		System.out.println(id2.trim());
		System.out.println(id2.trim().length());
		String spaceStr="        ";
		if(spaceStr.trim().equals("")) {
			System.out.println("empty string");
		}
		if(spaceStr.trim().length()==0) {
			System.out.println("empty string");
		}
		
		System.out.println("--------------String.indexOf()-------------------");
		String fileName2="xxx.txt";//--> xxx-복사본.txt
		int dotIndex = fileName2.indexOf(".");
		System.out.println(dotIndex);
		String fileNameNoExt = fileName2.substring(0,dotIndex);
		System.out.println(fileNameNoExt);
		String fileExt=fileName2.substring(dotIndex);
		System.out.println(fileExt);
		String copyFileName = fileNameNoExt+"-복사본"+fileExt;
		System.out.println("--->"+copyFileName);
		
		System.out.println("-------------------------------------------------");
		
		
		
		
		
		
		
	}
}
