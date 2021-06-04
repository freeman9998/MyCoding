package 선택과제C;

public class Dvd {
	private int no;//번호
	private String title;//타이틀
	private String genre;//쟝르
	public Dvd() {
		
	}
	public Dvd(int no, String title, String genre) {
	
		this.no = no;
		this.title = title;
		this.genre = genre;
	}
	public static void headerprint() {
		System.out.println("------------Borrowed Dvd Info-------------");
		System.out.printf("%7s %9s %9s\n","번호","제목", "장르");	
		System.out.println("------------------------------------------");
	}
	public void print() {
		System.out.printf("%8s %10s %9s\n",this.no,this.title,this.genre);
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
