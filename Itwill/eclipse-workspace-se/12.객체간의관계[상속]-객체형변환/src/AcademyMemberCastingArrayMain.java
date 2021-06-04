
public class AcademyMemberCastingArrayMain {

	public static void main(String[] args) {
		/*
		AcademyMember mmm1=new AcademyMember();
		*/
		AcademyMember[] members=new AcademyMember[7];
		members[0] = new AcademyStudent(1, "KIM", "ARDUINO");
		members[1] = new AcademyStudent(2, "JIM", "ANDROID");
		members[2] = new AcademyStudent(3, "LIM", "IOS");
		members[3] = new AcademyGangsa(4, "김강사", "웹디자인");
		members[4] = new AcademyGangsa(5,"정강사","오피스");
		members[5]=new AcademyStaff(6, "HONG", "총무부");
		members[6]=new AcademyStaff(7, "SIM", "홍보부");
		/*
		AcademyMember[] members= {
				new AcademyStudent(1, "KIM", "ARDUINO"),
				new AcademyStudent(2, "JIM", "ANDROID"),
				new AcademyStudent(3, "LIM", "IOS"),
				new AcademyGangsa(4, "김강사", "웹디자인"),
				new AcademyGangsa(5,"정강사","오피스"),
				new AcademyStaff(6, "HONG", "총무부"),
				new AcademyStaff(7, "SIM", "홍보부")
		};
		*/
		
		System.out.println("---------AcademyMember 전체출력---------");
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
		
		/*
		  연산자--> instanceof
		     - 형태: 참조변수 instanceof 클래스이름
		     - 반환: true or false 반환
		*/
		/*
		AcademyMember am=new AcademyStudent(1,"김","오피스");
		boolean isStudentInstance = am instanceof AcademyStudent;
		System.out.println(">> isStudentInstance:"+isStudentInstance);
		if(isStudentInstance) {
			System.out.println("학생객체-->"+am);
			AcademyStudent tempStudent=(AcademyStudent)am;
			String ban = tempStudent.getBan();
			System.out.println("학생의반:"+ban);
		}
		boolean isGangsaInstance = am instanceof AcademyGangsa;
		System.out.println(">> isGangsaInstance:"+isGangsaInstance);
		boolean isStaffInstance = am instanceof AcademyStaff;
		System.out.println(">> isStaffInstance:"+isStaffInstance);
		System.out.println("------------AcademyMember중에서 AcademyStudent객체만출력-----------");
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				//AcademyStudent객체인경우
				members[i].print();
				AcademyStudent tempStudent=(AcademyStudent)members[i];
				String ban=tempStudent.getBan();
				System.out.println("  >>>>ban:"+ban);
			}
			
		}
		*/
	}
}











