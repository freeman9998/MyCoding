package 선택과제C;

public class DvdMember {
	private int no;//회원번호
	private String name;//회원이름
	private String tel;//전화번호
	private Dvd[] dvds;//빌린dvd들[최대3개]
	
	public DvdMember() {
		
	}
	
	public DvdMember(int no, String name, String tel) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
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
	public static void headerprint() {
		System.out.println("------------DvdShop Info------------------");
		System.out.printf("%7s %6s %9s\n","회원번호","이름", "전화번호");	
		System.out.println("------------------------------------------");
	}
	public void print() {
		System.out.printf("%8d %9s %15s\n",this.no,this.name,this.tel);
		System.out.println("------------------------------------------");
		if(dvds.length>=4)
		{
			System.out.println(" ※ Dvd는 최대 3개까지 대여 가능합니다. ※ ");
		}
		Dvd.headerprint();
		for (int i = 0; i < 3; i++) {
			this.getDvds()[i].print();
		}
	}
}
