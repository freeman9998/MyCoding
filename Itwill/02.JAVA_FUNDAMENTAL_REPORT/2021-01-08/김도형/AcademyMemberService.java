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
	public static final int MEMBER_STUDENT = 1;
	public static final int MEMBER_STAFF = 2;
	public static final int MEMBER_GANGSA = 3;
	
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
		AcademyMember findMember=null;
		for (AcademyMember member : members) {
			if (member.getNo() == no) {
				findMember = member;
				break;
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
		for (AcademyMember member : members) {
			if (member.getName().equals(name)) {
				count++;
			}
		}
		findMembers = new AcademyMember[count];
		int index = 0;
		for (AcademyMember member : members) {
			if (member.getName().equals(name)) {
				findMembers[index] = member;
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
	
	public AcademyMember[] findAcademyMembersByType(int type) {
		AcademyMember[] findMembers=null;
		if (type == MEMBER_STUDENT) {
			int count = 0;
			for (AcademyMember member : members) {
				if (member instanceof AcademyStudent) {
					count++;
				}
			}
			findMembers = new AcademyMember[count];
			int index = 0;
			for (AcademyMember member : members) {
				if (member instanceof AcademyStudent) {
					findMembers[index] = member;
					index++;
				}				
			}
		}else if (type == MEMBER_STAFF) {
			int count=0;
			for (AcademyMember member : members) {
				if (member instanceof AcademyStaff) {
					count++;
				}
			}
			findMembers = new AcademyMember[count];
			int index = 0;
			for (AcademyMember member : members) {
				if (member instanceof AcademyStaff) {
					findMembers[index] = member;
					index++;
				}
			}
		}else if (type == MEMBER_GANGSA) {
			int count = 0;
			for (AcademyMember member : members) {
				if (member instanceof AcademyGangsa) {					
					count++;
				}
			}
			findMembers = new AcademyMember[count];
			int index = 0;
			for (AcademyMember member : members) {
				if (member instanceof AcademyGangsa) {
					findMembers[index] = member;
					index++;
				}
			}
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
		AcademyMember[] students = this.findAcademyMembersByType(MEMBER_STUDENT);
		int count = 0;
		for (AcademyMember member : students) {
			AcademyStudent tempStudent = (AcademyStudent)member;
			if (tempStudent.getBan().equals(ban)) {
				count++;
			}
		}
		findMembers = new AcademyMember[count];
		int index = 0;
		for (AcademyMember member : students) {
			AcademyStudent tempStudent = (AcademyStudent)member;
			if (tempStudent.getBan().equals(ban)) {
				findMembers[index] = member;
				index++;
			}
		}
		return findMembers;
	}
	public AcademyMember[] findAcademyStaffByDepart(String depart) {
		AcademyMember[] findMembers=null;
		AcademyMember[] staffs = this.findAcademyMembersByType(MEMBER_STAFF);
		int count = 0;
		for (AcademyMember member : staffs) {
			AcademyStaff tempStaff = (AcademyStaff)member;
			if (tempStaff.getDepart().equals(depart)) {
				count++;
			}
		}
		findMembers = new AcademyMember[count];
		int index = 0;
		for (AcademyMember member : staffs) {
			AcademyStaff tempStaff = (AcademyStaff)member;
			if (tempStaff.getDepart().equals(depart)) {
				findMembers[index] = member;
				index++;
			}
		}
		return findMembers;
	}
	public AcademyMember[] findAcademyGangsaBySubject(String subject) {
		AcademyMember[] findMembers=null;
		AcademyMember[] gangsas = this.findAcademyMembersByType(MEMBER_GANGSA);
		int count = 0;
		for (AcademyMember member : gangsas) {
			AcademyGangsa tempGangsa = (AcademyGangsa)member;
			if (tempGangsa.getSubject().equals(subject)) {
				count++;
			}
		}
		findMembers = new AcademyMember[count];
		int index = 0;
		for (AcademyMember member : gangsas) {
			AcademyGangsa tempGangsa = (AcademyGangsa)member;
			if (tempGangsa.getSubject().equals(subject)) {
				findMembers[index] = member;
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
		if (searchMember instanceof AcademyStudent) {
			AcademyMember[] students = this.findAcademyMembersByType(MEMBER_STUDENT);
			int count = 0;
			for (AcademyMember member : students) {
				AcademyStudent student = (AcademyStudent)member;
				AcademyStudent searchStudent = (AcademyStudent)searchMember;
				if (student.getBan().equals(searchStudent.getBan())) {
					count++;					
				}				
			}
			findMembers = new AcademyMember[count];
			int index = 0;
			for (AcademyMember member : students) {
				AcademyStudent student = (AcademyStudent)member;
				AcademyStudent searchStudent = (AcademyStudent)searchMember;
				if (student.getBan().equals(searchStudent.getBan())) {
					findMembers[index] = member;
					index++;				
				}
			}
		}else if (searchMember instanceof AcademyGangsa) {
			AcademyMember[] gangsas = this.findAcademyMembersByType(MEMBER_GANGSA);
			int count = 0;
			for (AcademyMember member : gangsas) {				
				AcademyGangsa gangsa = (AcademyGangsa)member;
				AcademyGangsa searchGangsa = (AcademyGangsa)searchMember;
				if (gangsa.getSubject().equals(searchGangsa.getSubject())) {
					count++;
				}
			}
			findMembers = new AcademyMember[count];
			int index = 0;
			for (AcademyMember member : gangsas) {
				AcademyGangsa gangsa = (AcademyGangsa)member;
				AcademyGangsa searchGangsa = (AcademyGangsa)searchMember;
				if (gangsa.getSubject().equals(searchGangsa.getSubject())) {
					findMembers[index] = member;
					index++;
				}				
			}			
		}
		return findMembers;
	}	
}
