package study03.포함;

public class Dvd {
	//번호
	//타이틀
	//쟝르
	private int no;
	private String title;
	private String genre;
	
	
	public Dvd() {
		
	}
	
	
	public void headprint() {
		System.out.println("-------------dvd-------------");
		System.out.printf("%s %7s %6s\n", "번호", "제목", "장르");
		System.out.println("-----------------------------");
	}
	
	
	public Dvd(int no, String title, String genre) {
		this.no = no;
		this.title = title;
		this.genre = genre;
	}
	
	public void print() {
		System.out.printf("%3d %7s %6s\n",this.no, this.title, this.genre);
		
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