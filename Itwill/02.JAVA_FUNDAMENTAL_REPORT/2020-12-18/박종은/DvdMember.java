package study03.포함;

public class DvdMember {
	//회원번호
	//회원이름
	//전화번호
	//빌린dvd
	
	private int no;
	private String name;
	private String tel;
	private Dvd dvd;
	
	
	public DvdMember() {
		
	}
	
	public void headprint() {
		System.out.println("----------------회원--------------------");
		System.out.printf("%s %3s %9s\n","회원번호","이름","전화번호");
		System.out.println("----------------------------------------");
	}
	
	public DvdMember(int no, String name, String tel, Dvd dvd) {
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.dvd = dvd;
	}
	
	public void print() {
		System.out.printf("%5s %8s %16s\n", this.no, this.name, this.tel);
		dvd.headprint();
		dvd.print();
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

	public Dvd getDvd() {
		return dvd;
	}

	public void setDvd(Dvd dvd) {
		this.dvd = dvd;
	}
	
	
	
}