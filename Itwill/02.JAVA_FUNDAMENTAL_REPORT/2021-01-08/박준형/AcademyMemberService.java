package com.itwill05.service.academy;

import java.nio.channels.MembershipKey;

/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {

	private AcademyMember[] members = { 
			new AcademyStudent(1, "KIM", "자바"), 
			new AcademyStudent(2, "LEE", "리눅스"),
			new AcademyStudent(3, "KIM", "자바"), 
			new AcademyStudent(4, "LEE", "IOT"),
			new AcademyGangsa(5, "CHOI", "자바"),
			new AcademyGangsa(6, "KIM", "DB"), 
			new AcademyGangsa(7, "DIM", "OS"),
			new AcademyStaff(8, "AIM", "영업"), 
			new AcademyStaff(9, "QIM", "생산") 
			};

	/*
	 * 1.AcademyMember 전체출력
	 */
	public void print() {
		for (AcademyMember academyMember : members) {
			academyMember.print();
		}

	}

	/*
	 * 2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘
	 * 
	 */
	public AcademyMember findByNo(int no) {
		AcademyMember findMember = null;
		for (AcademyMember academyMember : members) {
			if (academyMember.getNo() == no) {
				findMember = academyMember;
			}
		}
		return findMember;
	}

	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember[] findByName(String name) {
		AcademyMember[] findMembers = null;
		int count = 0;

		for (AcademyMember academyMember : members) {
			if (academyMember.getName().equals(name)) {
				count++;
			}
		}

		findMembers = new AcademyMember[count];
		count = 0;

		for (AcademyMember academyMember : members) {
			if (academyMember.getName().equals(name)) {
				findMembers[count] = academyMember;
				count++;
			}
		}
		return findMembers;
	}

	/*
	 * 3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
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
		AcademyMember[] gangas = null;
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				count++;
			}
		}
		gangas = new AcademyMember[count];
		int index = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				gangas[index] = members[i];
				index++;
			}
		}
		return gangas;
	}
	/*
	 * public AcademyMember[] findAcademyMembersByType(int type) { AcademyMember[]
	 * findMembers=null;
	 * 
	 * return findMembers; }
	 */

	/*
	 * 4.AcademyMember 중에서 자바반인 AcademyStudent객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 영업부서인 AcademyStaff 객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘
	 */

	public AcademyMember[] findAcademyStudentByBan(String ban) {
		AcademyMember[] findMembers = null;
		int count = 0;

		for (AcademyMember academyMember : members) {
			if(academyMember instanceof AcademyStudent) {
				if (((AcademyStudent) academyMember).getBan().equals(ban)) {
					count++;
				}				
			}
		}

		findMembers = new AcademyMember[count];
		count = 0;

		for (AcademyMember academyMember : members) {
			if(academyMember instanceof AcademyStudent) {
				if (((AcademyStudent) academyMember).getBan().equals(ban)) {
					findMembers[count]=academyMember;
					count++;
				}				
			}
		}
		return findMembers;
	}

	public AcademyMember[] findAcademyStaffByDepart(String depart) {
		AcademyMember[] findMembers = null;
		int count = 0;

		for (AcademyMember academyMember : members) {
			if(academyMember instanceof AcademyStaff) {
				if (((AcademyStaff) academyMember).getDepart().equals(depart)) {
					count++;
				}				
			}
		}

		findMembers = new AcademyMember[count];
		count = 0;

		for (AcademyMember academyMember : members) {
			if(academyMember instanceof AcademyStaff) {
				if (((AcademyStaff) academyMember).getDepart().equals(depart)) {
					findMembers[count]=academyMember;
					count++;
				}				
			}
		}
		return findMembers;
	}

	public AcademyMember[] findAcademyGangsaBySubject(String subject) {
		AcademyMember[] findMembers = null;
		int count = 0;

		for (AcademyMember academyMember : members) {
			if(academyMember instanceof AcademyGangsa) {
				if (((AcademyGangsa) academyMember).getSubject().equals(subject)) {
					count++;
				}				
			}
		}

		findMembers = new AcademyMember[count];
		count = 0;

		for (AcademyMember academyMember : members) {
			if(academyMember instanceof AcademyGangsa) {
				if (((AcademyGangsa) academyMember).getSubject().equals(subject)) {
					findMembers[count]=academyMember;
					count++;
				}				
			}
		}
		return findMembers;
	}

	/*
	 * 5.AcademyMember 중에서 자바반인 AcademyStudent객체들 배열참조변수반환해줘 
	 * 5.AcademyMember 중에서 생산부서인 AcademyStaff객체들 배열참조변수반환해줘 
	 * 5.AcademyMember 중에서 DB반인 AcademyGangsa객체들 배열참조변수반환해줘
	 */
	public AcademyMember[] findAcademyMembers(AcademyMember searchMember) {
		AcademyMember[] findMembers = null;
		int count = 0;
		for (AcademyMember academyMember : members) {
			if(searchMember instanceof AcademyStudent && academyMember instanceof AcademyStudent) {
				if(((AcademyStudent)academyMember).getBan().equals(((AcademyStudent)searchMember).getBan())){
					count++;					
				}
			}else if(searchMember instanceof AcademyStaff && academyMember instanceof AcademyStaff){
				if(((AcademyStaff)academyMember).getDepart().equals(((AcademyStaff)searchMember).getDepart())){
					count++;					
				}
			}else if(searchMember instanceof AcademyGangsa && academyMember instanceof AcademyGangsa){
				if(((AcademyGangsa)academyMember).getSubject().equals(((AcademyGangsa)searchMember).getSubject())){
					count++;					
				}
			}
		}
		
		findMembers = new AcademyMember[count];
		count=0;
		
		for (AcademyMember academyMember : members) {
			if(searchMember instanceof AcademyStudent && academyMember instanceof AcademyStudent) {
				if(((AcademyStudent)academyMember).getBan().equals(((AcademyStudent)searchMember).getBan())){
					findMembers[count]=academyMember;
					count++;					
				}
			}else if(searchMember instanceof AcademyStaff && academyMember instanceof AcademyStaff){
				if(((AcademyStaff)academyMember).getDepart().equals(((AcademyStaff)searchMember).getDepart())){
					findMembers[count]=academyMember;
					count++;					
				}
			}else if(searchMember instanceof AcademyGangsa && academyMember instanceof AcademyGangsa){
				if(((AcademyGangsa)academyMember).getSubject().equals(((AcademyGangsa)searchMember).getSubject())){
					findMembers[count]=academyMember;
					count++;					
				}
			}
		}
		return findMembers;
	
	}

}