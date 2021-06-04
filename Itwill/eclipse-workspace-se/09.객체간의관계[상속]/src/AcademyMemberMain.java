
public class AcademyMemberMain {

	public static void main(String[] args) {
		/*
		AcademyMember m1=new AcademyMember(100, "누구게");
		*/
		AcademyStudent st1=new AcademyStudent(1, "KIM","LINUX");
		AcademyStudent st2=new AcademyStudent(2, "KAN","JAVA");
		AcademyGangsa gs1=new AcademyGangsa(3, "HONG", "OFFICE");
		AcademyGangsa gs2=new AcademyGangsa(4, "SIM", "ANDROID");
		AcademyStaff sf1=new AcademyStaff(5, "LEE", "MARKETING");
		AcademyStaff sf2=new AcademyStaff(6, "JUNG", "ACCOUNTING");
		/*
		st1.print();
		st2.print();
		gs1.print();
		gs2.print();
		*/
		System.out.println("-------Student---------");
		st1.studentPrint();
		st2.studentPrint();
		System.out.println("-------Gangsa---------");
		gs1.gangsaPrint();
		gs2.gangsaPrint();
		System.out.println("-------Staff---------");
		sf1.staffPrint();
		sf2.staffPrint();
	}

}
