package SelectC;

public class DvdMember {
	private int no;//회원번호
	private String name;//회원이름
	private String tel;//전화번호
	private Dvd[] dvds;//빌린dvd들[최대3개]
	public DvdMember() {
		
	}
	
	public DvdMember(int no, String name, String tel) {
		this.no = no;
		this.name = name;
		this.tel = tel;
	}



	public String setdvds(Dvd[] dvds) {
		if(dvds.length>3) {
			return "대여 갯수를 초과하셨습니다.";
		}else {
			this.dvds=dvds;
			return "정상처리 되었습니다.";
		}
	}
	
	public Dvd[] getdvds() {
		return dvds;
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
	
	public void print() {
		System.out.println(no+"\t"+name+"\t"+tel+"\t");
	}
}
