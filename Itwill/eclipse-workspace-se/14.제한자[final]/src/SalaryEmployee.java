public class SalaryEmployee extends Employee {
	private int annualSalary;//연봉
	public SalaryEmployee() {
	}
	public SalaryEmployee(int no,String name,int annualSalary) {
		super(no,name);
		this.annualSalary = annualSalary;
	}
	@Override
	public void calculatePay() {
		this.setPay(this.annualSalary/12);
	}
	/*
	<< Cannot override the final method from Employee >>
	public double calculateIncentive() {
		return 0.0;
	}
	*/
	public void print() {
		super.print();
		System.out.println(annualSalary);
	}
	public int getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	
}
