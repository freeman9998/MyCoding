
public class AcademyMemberCastingMain {

	public static void main(String[] args) {
		AcademyStudent st1=new AcademyStudent(1, "KIM","LINUX");
		AcademyMember m1=st1;
		AcademyMember m2=new AcademyStudent(2, "KAN","JAVA");
		AcademyMember m3=new AcademyGangsa(3, "HONG", "OFFICE");
		AcademyMember m4=new AcademyGangsa(4, "SIM", "ANDROID");
		AcademyMember m5=new AcademyStaff(5, "LEE", "MARKETING");
		AcademyMember m6=new AcademyStaff(6, "JUNG", "ACCOUNTING");
		
		m1.print();
		m2.print();
		m3.print();
		m4.print();
		m5.print();
		m6.print();
		
		

	}

}
