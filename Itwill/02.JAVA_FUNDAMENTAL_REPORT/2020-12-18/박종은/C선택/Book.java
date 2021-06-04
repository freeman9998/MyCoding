package study03.포함.선택;

public class Book {
	/*
	 * 책번호
	 * 책제목
	 * 책분류
	 * 책설명
	 */
	private int no;
	private String title;
	private String group;
	private String contents;
	
	public Book() {
		
	}

	public Book(int no, String title, String group, String contents) {
		super();
		this.no = no;
		this.title = title;
		this.group = group;
		this.contents = contents;
	}
		public static void headerprint() {
			System.out.println("------------------------------------");
			System.out.printf("%s %s %s %s\n","책번호","책제목","책분류","책설명");
			System.out.println("------------------------------------");
		}
		
		public void print() {
			System.out.printf("%d %s %s %s\n",this.no, this.title, this.group, this.contents);
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