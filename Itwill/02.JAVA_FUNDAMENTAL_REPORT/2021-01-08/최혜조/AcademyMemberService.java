package com.itwill05.service.academy;

/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {
	
	public static final int STUDENT = 1;
	public static final int STAFF = 2;
	public static final int GANGSA = 3;
	
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
	
	public void print(AcademyMember[] member) {
		for (int i = 0; i < member.length; i++) {
			member[i].print();
		}
	}
	
	/*
	 * 2-1.번호 1   번 AcademyMember 객체 참조변수반환해줘
	 
	 */
	public AcademyMember findByNo(int no) {
		AcademyMember findMember=null;
		for (AcademyMember academyMember : members) {
			if(academyMember.getNo()==no) {
				findMember = academyMember;
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
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equals(name)) {
				count ++;
			}
		}
		
		findMembers = new AcademyMember[count];
		int index = 0;
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equals(name)) {
				findMembers[index] = members[i];
				index ++;
			}
		}
		return findMembers;
	}
	
	/*
	3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	3.AcademyMember 중에서 AcademyStaff객체들  모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	*/
	
	//학생
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
	
	// 스태프
	public AcademyMember[] findByAcademyStaffs() {
		AcademyMember[] Staff=null;
		int count=0;
		for (int i=0;i<members.length;i++) {
			if(members[i] instanceof AcademyStaff ) {
				count++;
			}
		}
		Staff =new AcademyMember[count];
		int index=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				Staff[index]=members[i];
				index++;
			}
		}
		return Staff;
	}
	
	//강사
	
	public AcademyMember[] findByAcademyGangsas() {
		AcademyMember[] Gangsas=null;
		int count=0;
		for (int i=0;i<members.length;i++) {
			if(members[i] instanceof AcademyGangsa ) {
				count++;
			}
		}
		Gangsas =new AcademyMember[count];
		int index=0;
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				Gangsas[index]=members[i];
				index++;
			}
		}
		return Gangsas;
	}
	
	//통합
	
	public AcademyMember[] findAcademyMembersByType(int type) {
		AcademyMember[] findMembers=null;
		switch(type) {
		
			case STUDENT : {
				int count=0;
				for (int i=0;i<members.length;i++) {
					if(members[i] instanceof AcademyStudent ) {
						count++;
					}
				}
				findMembers =new AcademyMember[count];
				int index=0;
				for (int i = 0; i < members.length; i++) {
					if(members[i] instanceof AcademyStudent) {
						findMembers[index]=members[i];
						index++;
					}
				}
				break;
			
			}
	
			case STAFF : {
				int count=0;
				for (int i=0;i<members.length;i++) {
					if(members[i] instanceof AcademyStaff ) {
						count++;
					}
				}
				findMembers =new AcademyMember[count];
				int index=0;
				for (int i = 0; i < members.length; i++) {
					if(members[i] instanceof AcademyStaff) {
						findMembers[index]=members[i];
						index++;
					}
				}
				break;
			}
			
			case GANGSA :{
				int count=0;
				for (int i=0;i<members.length;i++) {
					if(members[i] instanceof AcademyGangsa ) {
						count++;
					}
				}
				findMembers =new AcademyMember[count];
				int index=0;
				for (int i = 0; i < members.length; i++) {
					if(members[i] instanceof AcademyGangsa) {
						findMembers[index]=members[i];
						index++;
					}
				}
				break;
			}
				
		}
		
		return findMembers;
	}
	
	
	/*
	4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘
	4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘
	4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘
	*/
	
	// 반으로 학생찾기
	public AcademyMember[] findAcademyStudentByBan(String ban) {
		
		AcademyMember[] find = this.findAcademyMembersByType(STUDENT);
		AcademyMember[] findMembers = null;
		
		int count = 0;
		for (int i = 0; i < find.length; i++) {
			if(((AcademyStudent) find[i]).getBan().equals(ban)) {
				count ++;
			}
		}
		
		findMembers = new AcademyMember[count];
		int index = 0;
		for (int i = 0; i < find.length; i++) {
			if(((AcademyStudent) find[i]).getBan().equals(ban)) {
				findMembers[index] = find[i];
				index ++;
			}
		}

		return findMembers;
		
	}
	
	// 부서로 스태프찾기
	public AcademyMember[] findAcademyStaffByDepart(String depart) {
		
		AcademyMember[] find = this.findAcademyMembersByType(STAFF);
		AcademyMember[] findMembers = null;
		
		int count = 0;
		for (int i = 0; i < find.length; i++) {
			if(((AcademyStaff) find[i]).getDepart().equals(depart)) {
				count ++;
			}
		}
		
		findMembers = new AcademyMember[count];
		int index = 0;
		for (int i = 0; i < find.length; i++) {
			if(((AcademyStaff) find[i]).getDepart().equals(depart)) {
				findMembers[index] = find[i];
				index ++;
			}
		}
		return findMembers;
	}
	
	// 과목으로 강사찾기
	public AcademyMember[] findAcademyGangsaBySubject(String subject) {
		
		AcademyMember[] find = this.findAcademyMembersByType(GANGSA);
		AcademyMember[] findMembers=null;
		
		int count = 0;
		for (int i = 0; i < find.length; i++) {
			if(((AcademyGangsa) find[i]).getSubject().equals(subject)) {
				count ++;
			}
		}
		
		findMembers = new AcademyMember[count];
		int index = 0;
		for (int i = 0; i < find.length; i++) {
			if(((AcademyGangsa) find[i]).getSubject().equals(subject)) {
				findMembers[index] = find[i];
				index ++;
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
		
		AcademyMember[] findMembers = null;
	

		if(searchMember instanceof  AcademyStudent) {
			
			AcademyMember[] find = this.findAcademyMembersByType(STUDENT);
			
			int count = 0;
			for (int i = 0; i < find.length; i++) {
				if(((AcademyStudent) find[i]).getBan().equals((((AcademyStudent) searchMember).getBan()))) {
					count ++;
				}
			}
			
			findMembers = new AcademyMember[count];
			int index = 0;
			for (int i = 0; i < find.length; i++) {
				if(((AcademyStudent) find[i]).getBan().equals((((AcademyStudent) searchMember).getBan()))) {
					findMembers[index] = find[i];
					index ++;
				}
			}

			return findMembers;
			
		} else if(searchMember instanceof AcademyStaff) {
			AcademyMember[] find = this.findAcademyMembersByType(STAFF);
				
			int count = 0;
			for (int i = 0; i < find.length; i++) {
				if(((AcademyStaff) find[i]).getDepart().equals((((AcademyStaff) searchMember).getDepart()))) {
						count ++;
				}
			}
				
			findMembers = new AcademyMember[count];
			int index = 0;
			for (int i = 0; i < find.length; i++) {
				if(((AcademyStaff) find[i]).getDepart().equals((((AcademyStaff) searchMember).getDepart()))) {
					findMembers[index] = find[i];
					index ++;
				}
			}
				
			return findMembers;

			} else {
				AcademyMember[] find = this.findAcademyMembersByType(GANGSA);
				
				int count = 0;
				for (int i = 0; i < find.length; i++) {
					if(((AcademyGangsa) find[i]).getSubject().equals((((AcademyGangsa) searchMember).getSubject()))) {
							count ++;
					}
				}
					
				findMembers = new AcademyMember[count];
				int index = 0;
				for (int i = 0; i < find.length; i++) {
					if(((AcademyGangsa) find[i]).getSubject().equals((((AcademyGangsa) searchMember).getSubject()))) {
						findMembers[index] = find[i];
						index ++;
					}
			}
		
			return findMembers;
	
		
		
			}
	
	}
	
}