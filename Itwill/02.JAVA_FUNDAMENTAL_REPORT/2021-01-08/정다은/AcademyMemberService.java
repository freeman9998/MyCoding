package com.itwill05.service.academy;

import java.util.ArrayList;

/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {
	
	public static final int STUDENT = 1;
	public static final int GANGSA = 2;
	public static final int STAFF = 3;
	
	//멤버필드 초기화
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
	 * 1.전체 멤버 출력
	 */
	public void print() {
		for (AcademyMember academyMembers : members) {
			academyMembers.print();
		}
	}

	/*
	 * 2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘
	 */
	public AcademyMember findNoMember(int no) {
		AcademyMember findMember = null;
		for (int i = 0; i < members.length; i++) {
			if(members[i].getNo() == no) {
				findMember = members[i];
				break;
			}
		}
		return findMember;
	}
	
	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember[] findNameMember(String name) {
		AcademyMember[] findMember = null;
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equals(name)) {
				count++;
			}
		}
		int index = 0;
		findMember = new AcademyMember[count];
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equals(name)) {
				findMember[index] = members[i];
				index++;
			}
		}
		return findMember;
	}
	
	/*
	 * 3.AcademyMember 중에서 AcademyStudent객체배열 참조변수반환해줘
	 */
	public AcademyMember[] findStudentMember() {
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				count++;
			}
		}
		AcademyMember[] findStudents = new AcademyMember[count];
		int index = 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				findStudents[index] = members[i];
				index++;
			}
		}
		return findStudents;
	}
	
	/*
	 * 3-1.AcademyMember 중에서 AcademyStaff객체배열 참조변수반환해줘
	 */
	public AcademyMember[] findStaffMember() {
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				count++;
			}
		}
		AcademyMember[] findStaffs = new AcademyMember[count];
		int index = 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				findStaffs[index] = members[i];
				index++;
			}
		}
		return findStaffs;
	}
	
	/*
	 * 3-2.AcademyMember 중에서 AcademyGangsa객체배열 참조변수반환해줘
	 */
	public AcademyMember[] findGangsaMember() {
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				count++;
			}
		}
		AcademyMember[] findGangsas = new AcademyMember[count];
		int index = 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				findGangsas[index] = members[i];
				index++;
			}
		}
		return findGangsas;
	}
	
	/*
	 * 3-3.type 상수로 받아서 객체배열 참조변수 반환해줘
	 */
	public AcademyMember[] findAcademyMembersByType(int type) {
		AcademyMember[] findMembers = null;
		switch (type) {
		case AcademyMemberService.STUDENT:
				int count = 0;
				for (int i = 0; i < members.length; i++) {
					if(members[i] instanceof AcademyStudent) {
						count++;
					}
				}
				findMembers = new AcademyMember[count];
				int index = 0;
				for (int i = 0; i < members.length; i++) {
					if(members[i] instanceof AcademyStudent) {
						findMembers[index] = members[i];
						index++;
					}
				}
			break;

		case AcademyMemberService.GANGSA:
			count = 0;
			for (int i = 0; i < members.length; i++) {
				if(members[i] instanceof AcademyGangsa) {
					count++;
				}
			}
			findMembers = new AcademyMember[count];
			index = 0;
			for (int i = 0; i < members.length; i++) {
				if(members[i] instanceof AcademyGangsa) {
					findMembers[index] = members[i];
					index++;
				}
			}
		break;
		
		case AcademyMemberService.STAFF:
			count = 0;
			for (int i = 0; i < members.length; i++) {
				if(members[i] instanceof AcademyStaff) {
					count++;
				}
			}
			findMembers = new AcademyMember[count];
			index = 0;
			for (int i = 0; i < members.length; i++) {
				if(members[i] instanceof AcademyStaff) {
					findMembers[index] = members[i];
					index++;
				}
			}
		break;
		}
		return findMembers;
	}
	
	/*
	 * 4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘
	 */
	public AcademyMember[] findBanStudentMember(String ban) {
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				AcademyStudent tempStudent = (AcademyStudent) members[i];
				String studentBan = tempStudent.getBan();
				if(studentBan == ban) {
					count++;
				}
			}
		}
		int index = 0;
		AcademyMember[] findMember = new AcademyMember[count];
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				AcademyStudent tempStudent = (AcademyStudent) members[i];
				String studentBan = tempStudent.getBan();
				if(studentBan == ban) {
					findMember[index] = members[i];
					index++;
				}
			}
		}
		return findMember;
	}
	
	/*
	 * 4-1.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘
	 */
	public AcademyMember[] findDepartStaffMember(String depart) {
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				AcademyStaff tempStaff = (AcademyStaff) members[i];
				String staffDepart = tempStaff.getDepart();
				if(staffDepart.equals(depart)) {
					count++;
				}
			}
		}
		int index = 0;
		AcademyMember[] findMember = new AcademyMember[count];
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				AcademyStaff tempStaff = (AcademyStaff) members[i];
				String staffDepart = tempStaff.getDepart();
				if(staffDepart.equals(depart)) {
					findMember[index] = members[i];
					index++;
				}
			}
		}
		return findMember;
	}
	
	
	/*
	 * 4-2.AcademyMember 중에서 OS과목인 AcademyGangsa 객체들 배열참조변수반환해줘
	 */
	public AcademyMember[] findSubjectGangsaMember(String subject) {
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				AcademyGangsa tempGangsa = (AcademyGangsa) members[i];
				String gangsaSubject = tempGangsa.getSubject();
				if(gangsaSubject.equals(subject)) {
					count++;
				}
			}
		}
		int index = 0;
		AcademyMember[] findMember = new AcademyMember[count];
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				AcademyGangsa tempGangsa = (AcademyGangsa) members[i];
				String gangsaSubject = tempGangsa.getSubject();
				if(gangsaSubject == subject) {
					findMember[index] = members[i];
					index++;
				}
			}
		}
		return findMember;
	}

	/*
	 * 5.AcademyMember 중에서 자바반인 AcademyStudent 객체들 배열참조변수반환해줘
	 * 5-1.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘
	 * 5-2.AcademyMember 중에서 OS과목인 AcademyGangsa 객체들 배열참조변수반환해줘
	 */
	
	public ArrayList<AcademyMember> findAcademyMembers(AcademyMember academyMember) {
		ArrayList<AcademyMember> findMember = new ArrayList<AcademyMember>();
			if(academyMember instanceof AcademyStudent) {	//1
				AcademyStudent findStu = (AcademyStudent) academyMember;
					for (int i = 0; i < members.length; i++) {			
						if(members[i] instanceof AcademyStudent) {
							AcademyStudent tempStu = (AcademyStudent) members[i];
							if(tempStu.getBan().equals(findStu.ban)) {
								findMember.add(members[i]);
							}
						}
					}
			}else if(academyMember instanceof AcademyGangsa) { //1
				AcademyGangsa findGangsa = (AcademyGangsa) academyMember;
				for (int j = 0; j < members.length; j++) {				
					if(members[j] instanceof AcademyGangsa ) {
						AcademyGangsa tempGangsa = (AcademyGangsa) members[j];
						if(tempGangsa.getSubject().equals(findGangsa.subject)) {
							findMember.add(members[j]);
						}
					}
				}
			}else if(academyMember instanceof AcademyStaff) {
				AcademyStaff findStaff = (AcademyStaff) academyMember;
				for (int i = 0; i < members.length; i++) {			
					if(members[i] instanceof AcademyStaff) {
						AcademyStaff tempStaff = (AcademyStaff) members[i];
						if(tempStaff.getDepart().equals(findStaff.depart)) {
						findMember.add(members[i]);
						}
					}
				}
			}
		return findMember;
	}

}