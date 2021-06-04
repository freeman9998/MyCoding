package com.itwill06.collection.academy;

/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {
	public final static int STUDENT_NUM=1;
	public final static int GANGSA_NUM=2;
	public final static int STAFF_NUM=3;
	
	private AcademyMember[] members={
			new AcademyStudent(1, "KIM", "자바"),
			new AcademyStudent(2, "LEE", "리눅스"),
			new AcademyStudent(3, "KIM", "자바"),
			new AcademyStudent(4, "LEE", "IOT"),
			new AcademyGangsa(5, "CHOI", "프로그래밍"),
			new AcademyGangsa(6, "KIM", "DB"),
			new AcademyGangsa(7, "DIM", "OS"),
			new AcademyStaff(8, "AIM", "영업"),
			new AcademyStaff(9, "QIM", "생산")
	};

	
	/*
	1.AcademyMember 전체출력
    */
	public void print() {
		for (AcademyMember academyMember : members) {
			academyMember.print();
		}
	}
	
	/*
	 * 2-1.번호 1   번 AcademyMember 객체 참조변수반환해줘
	 
	 */
	public AcademyMember findByNo(int no) {
		AcademyMember findMember = null;

		for (int i = 0; i < members.length; i++) {
			if (members[i].getNo() == no) {
				findMember = members[i];
			}
		}
		return findMember;
	}
	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember[] findByName(String name) {
		AcademyMember[] findMembers=null;
		int arrLength =0;
		
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				arrLength++;
			}
		}
		findMembers = new AcademyMember[arrLength];
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equals(name)) {
				findMembers[count]=members[i];
				count++;
			}
		}
		
		return findMembers;
	}
	
	/*
	3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	3.AcademyMember 중에서 AcademyStaff객체들  모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	*/
	public AcademyMember[] findByAcademyStudents() {
		AcademyMember[] students = null;
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				count++;
			}
		}
		students = new AcademyMember[count];
		int index = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				students[index] = members[i];
				index++;
			}
		}
		return students;
	}

	public AcademyMember[] findByAcademyStaffs() {
		AcademyMember[] staffs = null;
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				count++;
			}
		}
		staffs = new AcademyMember[count];
		int index = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				staffs[index] = members[i];
				index++;
			}
		}
		return staffs;
	}

	public AcademyMember[] findByAcademyGangsas() {
		AcademyMember[] gangsas = null;
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				count++;
			}
		}
		gangsas = new AcademyMember[count];
		int index = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				gangsas[index] = members[i];
				index++;
			}
		}
		return gangsas;
	}
	
	public AcademyMember[] findAcademyMembersByType(int type) {
		AcademyMember[] findMembers = null;
		if (type == STUDENT_NUM) {
			findMembers = this.findByAcademyStudents();
		}
		if (type == GANGSA_NUM) {
			findMembers = this.findByAcademyGangsas();
		}
		if (type == STAFF_NUM) {
			findMembers = this.findByAcademyStaffs();
		}

		return findMembers;
	}
	
	
	/*
	4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘
	4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘
	4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘
	*/
	public AcademyMember[] findAcademyStudentByBan(String ban) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	public AcademyMember[] findAcademyStaffByDepart(String depart) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	public AcademyMember[] findAcademyGangsaBySubject(String subject) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	/*
	5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘
	5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘
	5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘
	*/
	public AcademyMember[] findAcademyMembers(AcademyMember searchMember) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	

	
}