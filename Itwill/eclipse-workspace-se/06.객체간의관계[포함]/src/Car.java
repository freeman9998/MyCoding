
public class Car {
	private int no;
	private String model;
	private Engine engine;
	public Car() {
	}
	
	public void print() {
		System.out.print(this.no+" "+this.model+" ");
		this.engine.print();
	}
	//setter
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
