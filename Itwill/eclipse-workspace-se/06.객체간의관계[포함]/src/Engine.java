
public class Engine {
	private String type;
	private int cc;
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	public Engine(String type, int cc) {
		this.type = type;
		this.cc = cc;
	}
	public void print() {
		System.out.println(this.type+" "+this.cc);
	}
	//getter,setter
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
}
