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
	public final static int STUDENT=1;
	public final static int GANGSA=2;
	public final static int STAFF=3;
	
	private AcademyMember[] members={
			new AcademyStudent(1, "KIM", "자바"),
			new AcademyStudent(2, "LEE", "리눅스"),
			new AcademyStudent(3, "KIM", "자바"),
			new AcademyStudent(4, "LEE", "IOT"),
			new AcademyGangsa(5, "CHOI", "프로그래밍"),
			new AcademyGangsa(6, "KIM", "DB"),
			new AcademyGangsa(7, "DIM", "자바"),
			new AcademyStaff(8, "AIM", "영업"),
			new AcademyStaff(9, "QIM", "생산")
	};
	
	//1.AcademyMember 전체출력
	public void print() {
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
	}
	
	//2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘
	public AcademyMember findByNo(int no) {
		AcademyMember findMember = null;
		for (int i = 0; i < members.length; i++) {
			if(members[i].getNo()==no) {
				findMember = members[i];
				break;
			}
		}
		return findMember;
	}
	
	//2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	public AcademyMember[] findByname(String name) {
		AcademyMember[] findMembers = null;
		int count =0;
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equals(name)) {
				count++;
			}
		}
		findMembers = new AcademyMember[count];
		int index = 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equals(name)) {
				findMembers[index]=members[i];
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
			if(members[i] instanceof AcademyStaff ) {
				count++;
			}
		}
		staffs=new AcademyMember[count];
		int index=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				staffs[index]=members[i];
				index++;
			}
		}
		return staffs;
	}
	public AcademyMember[] findByAcademyGangsas() {
		AcademyMember[] gangsas=null;
		int count=0;
		for (int i=0;i<members.length;i++) {
			if(members[i] instanceof AcademyGangsa) {
				count++;
			}
		}
		gangsas=new AcademyMember[count];
		int index=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				gangsas[index]=members[i];
				index++;
			}
		}
		return gangsas;
	}

	public AcademyMember[] findAcademyMembersByType(int type) {
		AcademyMember[] findMembers=null;
		if(type==STUDENT) {
			
			int count=0;
			for (int i=0;i<members.length;i++) {
				if(members[i] instanceof AcademyStudent ) {
					count++;
				}
			}
			findMembers=new AcademyMember[count];
			int index=0;
			for (int i = 0; i < members.length; i++) {
				if(members[i] instanceof AcademyStudent) {
					findMembers[index]=members[i];
					index++;
				}
			}
			
		}else if(type==GANGSA) {
			findMembers = this.findByAcademyGangsas();
			
		}else if(type==STAFF) {
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

		AcademyMember[] findMembers = null;
		
		AcademyMember[] tempMembers = this.findAcademyMembersByType(STUDENT);
		int count =0;
		for (int i = 0; i < tempMembers.length; i++) {
			if(((AcademyStudent)tempMembers[i]).getBan().equals(ban)) {
				count++;
			}
		}
		findMembers = new AcademyMember[count];
		int index =0;
		for (int i = 0; i < tempMembers.length; i++) {
			if(((AcademyStudent)tempMembers[i]).getBan().equals(ban)) {
				findMembers[index] =tempMembers[i];
				index++;
			}
		}
		
		return findMembers;
	}
	
	
	public AcademyMember[] findAcademyStaffByDepart(String depart) {

		AcademyMember[] findMembers=null;
		
		AcademyMember[] tempMembers = this.findByAcademyStaffs();
		int count =0;
		for (int i = 0; i < tempMembers.length; i++) {
			if(((AcademyStaff)tempMembers[i]).getDepart().equals(depart)) {
				count++;
			}
		}
		findMembers = new AcademyMember[count];
		int index =0;
		for (int i = 0; i < tempMembers.length; i++) {
			if(((AcademyStaff)tempMembers[i]).getDepart().equals(depart)) {
				findMembers[index]=tempMembers[i];
				index++;
			}
		}
		return findMembers;
	}
	public AcademyMember[] findAcademyGangsaBySubject(String subject) {
		AcademyMember[] findMembers=null;
		AcademyMember[] tempMembers = this.findAcademyMembersByType(GANGSA);
		int count = 0;
		for (int i = 0; i < tempMembers.length; i++) {
			if(((AcademyGangsa)tempMembers[i]).getSubject().equals(subject)) {
				count++;				
			}
		}
		findMembers = new AcademyMember[count];
		int index =0;
		for (int i = 0; i < tempMembers.length; i++) {
			if(((AcademyGangsa)tempMembers[i]).getSubject().equals(subject)) {
				findMembers[index]=tempMembers[i];
				index++;
			}
		}
		
		return findMembers;
	}
	/*
	5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘
	5.AcademyMember 중에서 영업부인  AcademyStaff객체들 배열참조변수반환해줘
	5.AcademyMember 중에서 자바과목인  AcademyGangsa객체들 배열참조변수반환해줘
	*/
	public AcademyMember[] findAcademyMembers(AcademyMember searchMember) {
		AcademyMember[] findMembers=null;
		if(searchMember instanceof AcademyStudent) {
			AcademyMember[] tempMembers = this.findByAcademyStudents();
			int count =0;
			for (int i = 0; i < tempMembers.length; i++) {
				if(((AcademyStudent)tempMembers[i]).getBan().equals(((AcademyStudent)searchMember).getBan())) {
					count++;
				}
			}
			findMembers = new AcademyMember[count];
			int index = 0;
			for (int i = 0; i < tempMembers.length; i++) {
				if(((AcademyStudent)tempMembers[i]).getBan().equals(((AcademyStudent)searchMember).getBan())) {
					findMembers[index] = tempMembers[i];
					index++;
				}
			}		
		} else if(searchMember instanceof AcademyStaff) {
			AcademyMember[] tempMembers = this.findByAcademyStaffs();
			int count =0;
			for (int i = 0; i < tempMembers.length; i++) {
				if(((AcademyStaff)tempMembers[i]).getDepart().equals(((AcademyStaff)searchMember).getDepart())) {
					count++;
				}
			}
			findMembers = new AcademyMember[count];
			int index=0;
			for (int i = 0; i < tempMembers.length; i++) {
				if(((AcademyStaff)tempMembers[i]).getDepart().equals(((AcademyStaff)searchMember).getDepart())) {
					findMembers[index] =tempMembers[i];
					index++;
				}				
			}
		} else if(searchMember instanceof AcademyGangsa){
			AcademyMember[] tempMembers = this.findByAcademyGangsas();
			int count =0;
			for (int i = 0; i < tempMembers.length; i++) {
				if(((AcademyGangsa)tempMembers[i]).getSubject().equals(((AcademyGangsa)searchMember).getSubject())) {
					count++;
				}
			}
			findMembers = new AcademyMember[count];
			int index=0;
			for (int i = 0; i < tempMembers.length; i++) {
				if(((AcademyGangsa)tempMembers[i]).getSubject().equals(((AcademyGangsa)searchMember).getSubject())) {
					findMembers[index] =tempMembers[i];
					index++;
				}				
			}
		}
		return findMembers;
	}
	
	
	
	
}
