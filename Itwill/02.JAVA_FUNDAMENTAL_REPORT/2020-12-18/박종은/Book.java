package itwill03.포함;

public class Book {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 * <<기능>>
	 *   책정보출력
	 *   
	 */
	
	
	// 캡슐화
	private int num;
	private String title;
	private String group;
	private String contents;
	
	// 생성자
	public Book() {
		
	}
	
	// 속성
	public Book(int num, String title, String group, String contents) {
		this.num = num;
		this.title = title;
		this.group = group;
		this.contents = contents;
	}
	
	// 출력
	public void print() {
		System.out.printf("%7d %8s %5s %6s%n", this.num, this.title, this.group ,this.contents);
	}

	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	
	
	
	
	
	
	
	
}
