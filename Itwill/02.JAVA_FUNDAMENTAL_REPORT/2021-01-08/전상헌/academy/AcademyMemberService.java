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
	private static final int STUDENT_NO=1;
	private static final int STAFF_NO=2;
	private static final int GANGSA_NO=3;
	
	
	
	
	
	
	
	
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
	 * 2-1.번호 1   번 AcademyMember 객체 참조변수반환해줘
	 
	 */
	public AcademyMember findByNo(int no) {
		AcademyMember findMember=null;
		return findMember;
	}
	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember[] findByName(String name) {
		AcademyMember[] findMembers=null;
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
		AcademyMember[] findMembers=null;
		int count=0;
		for (int i = 0; i < members.length; i++) {
		if(	members[i] instanceof AcademyStaff) {
			count++;
		}
		}
		findMembers=new AcademyMember[count];
		int index=0;
		for (int i = 0; i < members.length; i++) {
			if(	members[i] instanceof AcademyStaff) {
				findMembers[index]=members[i];
				index++;
			}
		
		}
		
		return findMembers;
	}
	public AcademyMember[] findByAcademyGangsas() {
		AcademyMember[] findMembers=null;
		int count=0;
		for (int i = 0; i < members.length; i++) {
		if(	members[i] instanceof AcademyGangsa) {
			count++;
		}
		}
		findMembers=new AcademyMember[count];
		int index=0;
		for (int i = 0; i < members.length; i++) {
			if(	members[i] instanceof AcademyGangsa) {
				findMembers[index]=members[i];
				index++;
			}
		
		}
		
		return findMembers;
	}
	
	public AcademyMember[] findAcademyMembersByType(int type) {
		
		
		switch (type) {
		case STUDENT_NO:
			
			int count=0;
			for (int i=0;i<members.length;i++) {
				if(members[i] instanceof AcademyStudent ) {
					count++;
				}
			}
			AcademyMember[]	students=new AcademyMember[count];
			int index=0;
			for (int i = 0; i < members.length; i++) {
				if(members[i] instanceof AcademyStudent) {
					students[index]=members[i];
					index++;
				}
			}
			return students;
			
		case STAFF_NO:
			AcademyMember[] findMembers=null;
			int count2=0;
			for (int i = 0; i < members.length; i++) {
			if(	members[i] instanceof AcademyStaff) {
				count2++;
			}
			}
			findMembers=new AcademyMember[count2];
			int index2=0;
			for (int i = 0; i < members.length; i++) {
				if(	members[i] instanceof AcademyStaff) {
					findMembers[index2]=members[i];
					index2++;
				}
			
			}
			
			return findMembers;
			
		case GANGSA_NO:
			AcademyMember[] findMembers2=null;
			int count3=0;
			for (int i = 0; i < members.length; i++) {
			if(	members[i] instanceof AcademyGangsa) {
				count3++;
			}
			}
			findMembers2=new AcademyMember[count3];
			int index3=0;
			for (int i = 0; i < members.length; i++) {
				if(	members[i] instanceof AcademyGangsa) {
					findMembers2[index3]=members[i];
					index3++;
				}
			
			}
			
			return findMembers2;
			
		default:
			System.out.println("1.학생 2.강사 3.스태프");
			System.out.println("------전체학생표---------");
			return members;
		
			
		}
		
		
		
		
		
		
		
	}

	
	
	
	
	//4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘
	public AcademyMember[] findAcademyStudentByBan(String ban) {
		/*
	    findMembers=new AcademyStudent[count];
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
			
				findMembers[index]=(AcademyStudent)members[i];
				index++;
				
			}	
		}
		count=0;
		index=0;
		
		
		for (int i = 0; i < findMembers.length; i++) {
			if (findMembers[i].getBan().equals(ban)) {
				count++;
			}
		}
		findMember=new AcademyMember[count];
		for (int i = 0; i < findMembers.length; i++) {
			if (findMembers[i].getBan().equals(ban)) {
				findMember[index]=findMembers[i];
				index++;
			}
		}
		
		
		
		
		return findMember;
	}
		 */
		
		
		
		AcademyMember[] findMembers=null;
		int count=0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
			AcademyStudent acc=(AcademyStudent)members[i];
			if(acc.getBan().equals(ban)) {
				count++;
			}
		
			}
		}
		findMembers =new AcademyMember[count];
		int index=0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
			AcademyStudent acc=(AcademyStudent)members[i];
			if(acc.getBan().equals(ban)) {
				findMembers[index]=members[i];
				index++;
			}
		
			}
		}
		return findMembers;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘
	public AcademyMember[] findAcademyStaffByDepart(String depart) {
		/*
		AcademyMember[] findMembers = null;
		AcademyStaff[] findMember = null;

		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				count++;
			}
		}
		findMember = new AcademyStaff[count];
		int index = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				findMember[index] = (AcademyStaff) members[i];
				index++;

			}
		}
		index = 0;
		count = 0;
		for (int i = 0; i < findMember.length; i++) {
			if (findMember[i].getDepart().equals(depart)) {
				count++;

			}
		}
		findMembers = new AcademyMember[count];
		for (int i = 0; i < findMember.length; i++) {
			if (findMember[i].getDepart().equals(depart)) {
				findMembers[index] = findMember[i];
				index++;
			}
		}

		return findMembers;
*/
		AcademyMember[] findMembers=null;
		int count=0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				AcademyStaff acc=(AcademyStaff)members[i];
			if(acc.getDepart().equals(depart)) {
				count++;
			}
		
			}
		}
		findMembers =new AcademyMember[count];
		int index=0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				AcademyStaff acc=(AcademyStaff)members[i];
				if(acc.getDepart().equals(depart)) {
				findMembers[index]=members[i];
				index++;
			}
		
			}
		}
		return findMembers;
	}
	
	
	
	
	
	
	
	
	
	//4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘
	public AcademyMember[] findAcademyGangsaBySubject(String subject) {
		/*
		AcademyMember[] findMembers = null;
		AcademyGangsa[] findMember = null;

		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				count++;
			}
		}
		findMember = new AcademyGangsa[count];
		int index = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				findMember[index] = (AcademyGangsa) members[i];
				index++;

			}
		}
		index = 0;
		count = 0;
		for (int i = 0; i < findMember.length; i++) {
			if (findMember[i].getSubject().equals(subject)) {
				count++;

			}
		}
		findMembers = new AcademyMember[count];
		for (int i = 0; i < findMember.length; i++) {
			if (findMember[i].getSubject().equals(subject)) {
				findMembers[index] = findMember[i];
				index++;
			}
		}

		return findMembers;
*/
		AcademyMember[] findMembers=null;
		int count=0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				AcademyGangsa acc=(AcademyGangsa)members[i];
			if(acc.getSubject().equals(subject)) {
				count++;
			}
		
			}
		}
		findMembers =new AcademyMember[count];
		int index=0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				AcademyGangsa acc=(AcademyGangsa)members[i];
				if(acc.getSubject().equals(subject)) {
				findMembers[index]=members[i];
				index++;
			}
		
			}
		}
		return findMembers;
	}
	


	
	
	//5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘
	
	
	public AcademyMember[] findAcademyMembers(AcademyMember searchMember) {
			if (searchMember instanceof AcademyStudent) {
				AcademyMember[] findMembers=null;
				int count=0;
				for (int i = 0; i < members.length; i++) {
					if (members[i] instanceof AcademyStudent) {
					AcademyStudent acc=(AcademyStudent)members[i];
					if(acc.getBan().equals(((AcademyStudent) searchMember).getBan())) {
						count++;
					}
				
					}
				}
				findMembers =new AcademyMember[count];
				int index=0;
				for (int i = 0; i < members.length; i++) {
					if (members[i] instanceof AcademyStudent) {
					AcademyStudent acc=(AcademyStudent)members[i];
					if(acc.getBan().equals(((AcademyStudent) searchMember).getBan())) {
						findMembers[index]=members[i];
						index++;
					}
				
					}
				}
				return findMembers;
				
			} else if (searchMember instanceof AcademyStaff) {

				AcademyMember[] findMembers = null;
				int count = 0;
				for (int i = 0; i < members.length; i++) {
					if (members[i] instanceof AcademyStaff) {
						AcademyStaff acc = (AcademyStaff) members[i];
						if (acc.getDepart().equals(((AcademyStaff) searchMember).getDepart())) {
							count++;
						}

					}
				}
				findMembers = new AcademyMember[count];
				int index = 0;
				for (int i = 0; i < members.length; i++) {
					if (members[i] instanceof AcademyStaff) {
						AcademyStaff acc = (AcademyStaff) members[i];
					if (acc.getDepart().equals(((AcademyStaff) searchMember).getDepart())) {
						findMembers[index] = members[i];
						index++;
					}

				}
			}
				return findMembers;
				

			}else if (searchMember instanceof AcademyGangsa) {
				AcademyMember[] findMembers=null;
				int count=0;
				for (int i = 0; i < members.length; i++) {
					if (members[i] instanceof AcademyGangsa) {
						AcademyGangsa acc=(AcademyGangsa)members[i];
					if(acc.getSubject().equals(((AcademyGangsa) searchMember).getSubject())) {
						count++;
					}
				
					}
				}
				findMembers =new AcademyMember[count];
				int index=0;
				for (int i = 0; i < members.length; i++) {
					if (members[i] instanceof AcademyGangsa) {
						AcademyGangsa acc=(AcademyGangsa)members[i];
						if(acc.getSubject().equals(((AcademyGangsa) searchMember).getSubject())) {
						findMembers[index]=members[i];
						index++;
					}
				
					}
				}
				return findMembers;

			}else {
				return null;
			}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	
}