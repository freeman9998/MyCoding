package study03.포함.선택;

public class Dvd {
	private int no;//번호
	private String title;//타이틀
	private String genre;//쟝르
	public Dvd() {
		// TODO Auto-generated constructor stub
	}
	public Dvd(int no, String title, String genre) {
	
		this.no = no;
		this.title = title;
		this.genre = genre;
	}
	
	public static void headerprint() {
		System.out.println("------------------- dvd ----------------------");
		System.out.printf("%s %4s %5s\n","번호","제목","장르");
		
		
	}
	
	public void print() {
		System.out.printf("%3d %6s %4s\n", this.no,this.title,this.genre);
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}