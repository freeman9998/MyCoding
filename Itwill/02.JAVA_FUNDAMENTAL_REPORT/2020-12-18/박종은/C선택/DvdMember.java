package study03.포함.선택;



public class DvdMember {
	private int no;//회원번호
	private String name;//회원이름
	private String tel;//전화번호
	private Dvd[] dvds;//빌린dvd들[최대3개]
	public DvdMember() {
		
	}


	
	
	public DvdMember(int no, String name, String tel, Dvd[] dvds) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.dvds = dvds;
	}


	public static void headerprint() {
		System.out.println("---------------- 멤버 -------------------");
		System.out.printf("%s %5s %10s\n","번호","이름","연락처");
		
		
	}

	public void print() {
		System.out.printf("%2d %7s %16s%n", this.no, this.name, this.tel);
		Dvd.headerprint();
		for (int i = 0; i < dvds.length; i++) {
			this.getDvds()[i].print();
			System.out.println();
		}
	}




	public int getNo() {
		return no;
	}




	public void setNo(int no) {
		this.no = no;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getTel() {
		return tel;
	}




	public void setTel(String tel) {
		this.tel = tel;
	}




	public Dvd[] getDvds() {
		return dvds;
	}




	public void setDvds(Dvd[] dvds) {
		this.dvds = dvds;
	}
	
	
	
	
}