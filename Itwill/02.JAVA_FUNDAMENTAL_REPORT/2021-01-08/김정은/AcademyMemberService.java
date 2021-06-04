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
	 * 2-1.번호 1번 AcademyMember 객체 참조변수반환해줘
	 
	 */
	public AcademyMember findByNo(int no) {
		AcademyMember findMember = null;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getNo() == no) {
				findMember = members[i];
				break;
			}
		}

		return findMember;
	}
	
	/*
	 * 2-2.이름 KIM인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember[] findByName(String name) {
		int count =0;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				count++;
			}
		}
		AcademyMember[] findMembers= new AcademyMember[count];
		int index = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				findMembers[index] = members[i];
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
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				count++;
			}
		}
		staffs = new AcademyMember[count];
		int index =0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				staffs[index]=members[i];
				index++;
			}
		}
		return staffs;
	}
	public AcademyMember[] findByAcademyGangsas() {
		AcademyMember[] gangsas=null;
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				count++;
			}
		}
		gangsas= new AcademyMember[count];
		int index=0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				gangsas[index] =members[i];
				index++;
			}
		}
		return gangsas;
	}
	public final static int STUDENT = 1;
	public final static int GANGSA = 2;
	public final static int STAFF = 3;
	
	public AcademyMember[] findAcademyMembersByType(int type) {
		AcademyMember[] findMembers=null;
		switch (type) {
		case STUDENT:
			int count =0;
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStudent) {
					count++;
				}
			}
			int index = 0;
			findMembers = new AcademyMember[count];
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStudent) {
					findMembers[index]=members[i];
					index++;
				}
			}
			
			break;

		case GANGSA:
			count=0;
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyGangsa) {
					count++;
				}
			}
			index = 0;
			findMembers = new AcademyMember[count];
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyGangsa) {
					findMembers[index] =members[i];
					index++;
				}
			}
			break;
		case STAFF:
			count=0;
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStaff) {
					count++;
				}
			}
			index =0;
			findMembers = new AcademyMember[count];
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStaff) {
					findMembers[index] = members[i];
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
		int count=0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				
				AcademyStudent stu = (AcademyStudent)members[i];
				if (stu.getBan().equals(ban)) {
				     count++;
				}
			}
		}
		int index=0;
		findMembers = new AcademyMember[count];
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				AcademyStudent stu = (AcademyStudent)members[i];
				if (stu.getBan().equals(ban)) {
					findMembers[index] =members[i];
					index++;
				}
			}
		}
		return findMembers;
	}
	public AcademyMember[] findAcademyStaffByDepart(String depart) {
		AcademyMember[] findMembers=null;
		int count =0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				AcademyStaff stf = (AcademyStaff)members[i];
				if (stf.getDepart().equals(depart)) {
					count++;
				}
			}
		}
		int index =0;
		findMembers = new AcademyMember[count];
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				AcademyStaff stf = (AcademyStaff)members[i];
				if (stf.getDepart().equals(depart)) {
					findMembers[index] =members[i];
					index++;
				}
			}
		}
		return findMembers;
	}
	public AcademyMember[] findAcademyGangsaBySubject(String subject) {
		AcademyMember[] findMembers=null;
		int count=0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				AcademyGangsa gangsa = (AcademyGangsa)members[i];
				if (gangsa.getSubject().equals(subject)) {
					count++;
				}
			}
		}
		int index =0;
		findMembers = new AcademyMember[count];
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				AcademyGangsa gangsa = (AcademyGangsa)members[i];
				if (gangsa.getSubject().equals(subject)) {
					findMembers[index] = members[i];
					index++;
				}
			}
		}
		return findMembers;
	}
	/*
	5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘
	5.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘
	5.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘
	*/
	
	public AcademyMember[] findAcademyMembers(AcademyMember searchMember) {
		AcademyMember[] findMembers=null;
		if (searchMember instanceof AcademyStudent) {
			AcademyMember[] stu = findAcademyMembersByType(STUDENT);
			int count=0;
			for (int i = 0; i < stu.length; i++) {
				AcademyStudent student = (AcademyStudent)stu[i];
				if (student.getBan().equals(((AcademyStudent) searchMember).getBan())) {
					count++;
				}
			}
			int index=0;
			findMembers= new AcademyMember[count];
			for (int i = 0; i < stu.length; i++) {
				AcademyStudent student = (AcademyStudent)stu[i];
				if (student.getBan().equals(((AcademyStudent) searchMember).getBan())) {
					findMembers[index] = stu[i];
					index++;
				}
			}
		}else if (searchMember instanceof AcademyStaff) {
			AcademyMember[] stf = findAcademyMembersByType(STAFF);
			int count=0;
			for (int i = 0; i < stf.length; i++) {
				AcademyStaff staff = (AcademyStaff)stf[i];
				if (staff.getDepart().equals(((AcademyStaff) searchMember).getDepart())) {
					count++;
				}
			}
			int index =0;
			findMembers = new AcademyMember[count];
			for (int i = 0; i < stf.length; i++) {
				AcademyStaff staff = (AcademyStaff)stf[i];
				if (staff.getDepart().equals(((AcademyStaff) searchMember).getDepart())) {
					findMembers[index]=stf[i];
					index++;
				}
			}
		}else if (searchMember instanceof AcademyGangsa) {
			AcademyMember[] gs = findAcademyMembersByType(GANGSA);
			int count=0;
			for (int i = 0; i < gs.length; i++) {
				AcademyGangsa gangsa = (AcademyGangsa)gs[i];
				if (gangsa.getSubject().equals(((AcademyGangsa) searchMember).getSubject())) {
					count++;
				}
			}
			int index=0;
			findMembers = new AcademyMember[count];
			for (int i = 0; i < gs.length; i++) {
				AcademyGangsa gangsa = (AcademyGangsa)gs[i];
				if (gangsa.getSubject().equals(((AcademyGangsa) searchMember).getSubject())) {
					findMembers[index]=gs[i];
					index++;
				}
			}
		}
		
		return findMembers;
	}

}
