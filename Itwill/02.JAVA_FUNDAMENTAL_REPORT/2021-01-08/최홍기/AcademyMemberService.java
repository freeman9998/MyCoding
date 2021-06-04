package com.itwill05.service.academy;

import java.util.Iterator;
/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {
	
	public final static int STUDENT = 1;
	public final static int GANGSA = 2;
	public final static int STAFF = 3;
	
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
	
	public void print() {
		for (AcademyMember academyMember : members) {
			academyMember.print();
		}
		
	}
	/*
	1.AcademyMember 전체출력
    */
	
	/*
	 * 2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘
	 */
	public AcademyMember findByNo(int no) {
		AcademyMember findMember=null;
		for (AcademyMember academyMember : members) {
			if(academyMember.getNo() == no) {
				findMember = academyMember;
			}
		}
		return findMember;
	}
	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember[] findByName(String name) {
		AcademyMember[] findMembers=null;
		int count = 0;
		for (AcademyMember academyMember : members) {
			if(academyMember.getName().equals(name)) {
				count++;
			}
		}
		findMembers = new AcademyMember[count];
		int index = 0;
		for (AcademyMember academyMember : members) {
			if(academyMember.getName().equals(name)) {
				findMembers[index] = academyMember;
				index++;
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
		AcademyMember[] students=null;
		int count=0;
		for (int i=0;i<members.length;i++) {
			if(members[i] instanceof AcademyStudent ) {
				count++;
			}
		}
		students=new AcademyMember[count];
		int index=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				students[index]=members[i];
				index++;
			}
		}
		return students;
	}
	public AcademyMember[] findByAcademyStaffs() {
		AcademyMember[] staffs=null;
		int count=0;
		for (int i=0;i<members.length;i++) {
			if(members[i] instanceof AcademyStaff) {
				count++;
			}
		}
		staffs=new AcademyMember[count];
		int index=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				staffs[index]=members[i];
				index++;
			}
		}
		return staffs;
	}
	public AcademyMember[] findByAcademyGangsas() {
		AcademyMember[] gansas=null;
		int count=0;
		for (int i=0;i<members.length;i++) {
			if(members[i] instanceof AcademyGangsa) {
				count++;
			}
		}
		gansas=new AcademyMember[count];
		int index=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				gansas[index]=members[i];
				index++;
			}
		}
		return gansas;
	}
	
	public AcademyMember[] findAcademyMembersByType(int type) {
		AcademyMember[] findMembers=null;
		int count=0;
		int index=0;
		switch (type) {
		case STUDENT:
			for (int i=0;i<members.length;i++) {
				if(members[i] instanceof AcademyStudent ) {
					count++;
				}
			}
			findMembers= new AcademyMember[count];
			for (int i = 0; i < members.length; i++) {
				if(members[i] instanceof AcademyStudent) {
					findMembers[index]=members[i];
					index++;
				}
			}
			break;

		case GANGSA:
			for (int i=0;i<members.length;i++) {
				if(members[i] instanceof AcademyGangsa ) {
					count++;
				}
			}
			findMembers= new AcademyMember[count];
			for (int i = 0; i < members.length; i++) {
				if(members[i] instanceof AcademyGangsa) {
					findMembers[index]=members[i];
					index++;
				}
			}
			break;
		
		case STAFF:
			for (int i=0;i<members.length;i++) {
				if(members[i] instanceof AcademyStaff) {
					count++;
				}
			}
			findMembers= new AcademyMember[count];
			for (int i = 0; i < members.length; i++) {
				if(members[i] instanceof AcademyStaff) {
					findMembers[index]=members[i];
					index++;
				}
			}
			break;	
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
		AcademyMember[] students = findAcademyMembersByType(STUDENT);
		int count = 0;
		int index = 0;
		for (int i=0; i<students.length; i++) {
			AcademyStudent temp = (AcademyStudent)students[i];
			if(temp.getBan().equals(ban)) {
				count++;
			}					
		}
		findMembers= new AcademyMember[count];
		for (int i=0; i<students.length; i++) {
			AcademyStudent temp = (AcademyStudent)students[i];
			if(temp.getBan().equals(ban)) {
				findMembers[index] = students[i];
				index++;
			}		
		}
		return findMembers;
	}	
	public AcademyMember[] findAcademyStaffByDepart(String depart) {
		AcademyMember[] findMembers=null;
		AcademyMember[] staffs = findAcademyMembersByType(STAFF);
		int count = 0;
		int index = 0;
		for (int i=0; i<staffs.length; i++) {
			AcademyStaff temp = (AcademyStaff)staffs[i];
			if(temp.getDepart().equals(depart)) {
				count++;
			}					
		}
		findMembers= new AcademyMember[count];
		for (int i=0; i<staffs.length; i++) {
			AcademyStaff temp = (AcademyStaff)staffs[i];
			if(temp.getDepart().equals(depart)) {
				findMembers[index] = staffs[i];
				index++;
			}		
		}
		return findMembers;
	}
	public AcademyMember[] findAcademyGangsaBySubject(String subject) {
		AcademyMember[] findMembers=null;
		AcademyMember[] gangsas = findAcademyMembersByType(GANGSA);
		int count = 0;
		int index = 0;
		for (int i=0; i<gangsas.length; i++) {
			AcademyGangsa temp = (AcademyGangsa)gangsas[i];
			if(temp.getSubject().equals(subject)) {
				count++;
			}					
		}
		findMembers= new AcademyMember[count];
		for (int i=0; i<gangsas.length; i++) {
			AcademyGangsa temp = (AcademyGangsa)gangsas[i];
			if(temp.getSubject().equals(subject)) {
				findMembers[index] = gangsas[i];
				index++;
			}		
		}
		return findMembers;
	}
	/*
	5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘
	5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘
	5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘
	*/
	public AcademyMember[] findAcademyMembers(AcademyMember searchMember) {
		AcademyMember[] findMembers=null;
		int count = 0;
		int index = 0;
		if(searchMember instanceof AcademyStudent) {
			AcademyStudent sm = (AcademyStudent)searchMember;
			AcademyMember[] students = findAcademyMembersByType(STUDENT);
			for (int i = 0; i < students.length; i++) {
				AcademyStudent tm = ((AcademyStudent)students[i]);
				if(sm.getBan().equals(tm.getBan())) {
					count++;
				}
			}
			findMembers = new AcademyMember[count];
			for (int i = 0; i < students.length; i++) {
				AcademyStudent tm = ((AcademyStudent)students[i]);
				if(sm.getBan().equals(tm.getBan())) {
					findMembers[index] = students[i];
					index++;
				}
			}
		}
		if(searchMember instanceof AcademyGangsa) {
			AcademyGangsa sm = (AcademyGangsa)searchMember;
			AcademyMember[] gangsas = findAcademyMembersByType(GANGSA);
			for (int i = 0; i < gangsas.length; i++) {
				AcademyGangsa tm = ((AcademyGangsa)gangsas[i]);
				if(sm.getSubject().equals(tm.getSubject())) {
					count++;
				}
			}
			findMembers = new AcademyMember[count];
			for (int i = 0; i < gangsas.length; i++) {
				AcademyGangsa tm = ((AcademyGangsa)gangsas[i]);
				if(sm.getSubject().equals(tm.getSubject())) {
					findMembers[index] = gangsas[i];
					index++;
				}
			}
		}
		if(searchMember instanceof AcademyStaff) {
			AcademyStaff sm = (AcademyStaff)searchMember;
			AcademyMember[] staffs = findAcademyMembersByType(STAFF);
			for (int i = 0; i < staffs.length; i++) {
				AcademyStaff tm = ((AcademyStaff)staffs[i]);
				if(sm.getDepart().equals(tm.getDepart())) {
					count++;
				}
			}
			findMembers = new AcademyMember[count];
			for (int i = 0; i < staffs.length; i++) {
				AcademyStaff tm = ((AcademyStaff)staffs[i]);
				if(sm.getDepart().equals(tm.getDepart())) {
					findMembers[index] = staffs[i];
					index++;
				}
			}
		}
		return findMembers;
	}	
}