public class AcademyStudent extends AcademyMember {
	/*
	public int no;
	public String name;
	
	
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
	*/
	public String ban;//반
	public AcademyStudent() {
	}
	public AcademyStudent(int no,String name,String ban) {
		this.no=no;
		this.name=name;
		this.ban=ban;
	}
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	/*
	public void print() {
		System.out.print(no+"\t"+name+"\t");
	}
	 */
	public void print() {
		super.print();
		System.out.println(this.ban);
	}
}











