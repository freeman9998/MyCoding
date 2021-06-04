package 김동현;

public class AcademyMemberService {

	private static final int STUDENT = 0;
	private static final int STAFF = 1;
	private static final int GANGSA = 2;

	private AcademyMember[] members = {
			new AcademyStudent(1, "KIM", "자바"), new AcademyStudent(2, "LEE", "리눅스"), new AcademyStudent(3, "KIM", "자바"),
			new AcademyStudent(4, "LEE", "IOT"), new AcademyGangsa(5, "CHOI", "프로그래밍"),
			new AcademyGangsa(6, "KIM", "DB"), new AcademyGangsa(7, "DIM", "OS"), new AcademyStaff(8, "AIM", "영업"),
			new AcademyStaff(9, "QIM", "생산") };

	/*
	 * 1.AcademyMember 전체출력
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
		int cnt = 0;

		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				cnt++;
			}
		}

		AcademyMember[] findMembers = new AcademyMember[cnt];
		cnt = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				findMembers[cnt] = members[i];
				cnt++;
			}
		}
		return findMembers;
	}

	/*
	 * 3-1.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	public AcademyMember[] findByAcademyStudents() {
		AcademyMember[] students = null;
		int cnt = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				cnt++;
			}
		}
		students = new AcademyMember[cnt];
		cnt = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStudent) {
				students[cnt] = members[i];
				cnt++;
			}
		}
		return students;
	}

	/*
	 * 3-2.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	public AcademyMember[] findByAcademyStaffs() {
		AcademyMember[] staffs = null;
		int cnt = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				cnt++;
			}
		}
		staffs = new AcademyMember[cnt];
		cnt = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyStaff) {
				staffs[cnt] = members[i];
				cnt++;
			}
		}
		return staffs;
	}

	/*
	 * 3-3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	public AcademyMember[] findByAcademyGangsas() {
		AcademyMember[] gangsas = null;
		int cnt = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				cnt++;
			}
		}
		gangsas = new AcademyMember[cnt];
		cnt = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyGangsa) {
				gangsas[cnt] = members[i];
				cnt++;
			}
		}
		return gangsas;
	}

	/*
	 * 3-4.AcademyMember 중에서 타입에 해당하는 객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	public AcademyMember[] findAcademyMembersByType(int type) {
		AcademyMember[] findMembers = null;
		int cnt = 0;

		switch (type) {
		case STUDENT:
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStudent) {
					cnt++;
				}
			}
			findMembers = new AcademyMember[cnt];
			cnt = 0;
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStudent) {
					findMembers[cnt] = members[i];
					cnt++;
				}
			}
			break;
		case STAFF:
			cnt = 0;
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStaff) {
					cnt++;
				}
			}
			findMembers = new AcademyMember[cnt];
			cnt = 0;
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStaff) {
					findMembers[cnt] = members[i];
					cnt++;
				}
			}
			break;
		case GANGSA:
			cnt = 0;
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyGangsa) {
					cnt++;
				}
			}
			findMembers = new AcademyMember[cnt];
			cnt = 0;
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyGangsa) {
					findMembers[cnt] = members[i];
					cnt++;
				}
			}
			break;
		}
		return findMembers;
	}

	/*
	 * 4-1.AcademyMember 중에서 자바반인 AcademyStudent객체들 배열참조변수반환해줘
	 */

	public AcademyMember[] findAcademyStudentByBan(String ban) {
		AcademyMember[] findStudent = findAcademyMembersByType(STUDENT);
		AcademyMember[] findMembers = null;
		int cnt = 0;

		for (int i = 0; i < findStudent.length; i++) {
			AcademyStudent std = (AcademyStudent) findStudent[i];
			if (std.getBan().equals(ban)) {
				cnt++;
			}
		}

		findMembers = new AcademyMember[cnt];
		cnt = 0;
		for (int i = 0; i < findStudent.length; i++) {
			AcademyStudent std = (AcademyStudent) findStudent[i];
			if (std.getBan().equals(ban)) {
				findMembers[cnt] = std;
				cnt++;
			}
		}
		return findMembers;
	}

	// 4-2.AcademyMember 중에서 영업부서인 AcademyStaff 객체들 배열참조변수반환해줘
	public AcademyMember[] findAcademyStaffByDepart(String depart) {
		AcademyMember[] findStaff = findAcademyMembersByType(STAFF);
		AcademyMember[] findMembers = null;
		int cnt = 0;

		for (int i = 0; i < findStaff.length; i++) {
			AcademyStaff staff = (AcademyStaff) findStaff[i];
			if (staff.getDepart().equals(depart)) {
				cnt++;
			}
		}

		findMembers = new AcademyMember[cnt];
		cnt = 0;
		for (int i = 0; i < findStaff.length; i++) {
			AcademyStaff staff = (AcademyStaff) findStaff[i];
			if (staff.getDepart().equals(depart)) {
				findMembers[cnt] = staff;
				cnt++;
			}
		}
		return findMembers;
	}

	// 4-3.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘
	public AcademyMember[] findAcademyGangsaBySubject(String subject) {
		AcademyMember[] findGangsa = findAcademyMembersByType(GANGSA);
		AcademyMember[] findMembers = null;
		int cnt = 0;

		for (int i = 0; i < findGangsa.length; i++) {
			AcademyGangsa gangsa = (AcademyGangsa) findGangsa[i];
			if (gangsa.getSubject().equals(subject)) {
				cnt++;
			}
		}
		findMembers = new AcademyMember[cnt];
		cnt = 0;
		for (int i = 0; i < findGangsa.length; i++) {
			AcademyGangsa gangsa = (AcademyGangsa) findGangsa[i];
			if (gangsa.getSubject().equals(subject)) {
				findMembers[cnt] = gangsa;
				cnt++;
			}
		}
		return findMembers;
	}

	/*
	 * 5.AcademyMember 중에서 자바반인 AcademyStudent객체들 배열참조변수반환해줘 5.AcademyMember 중에서
	 * 자바반인 AcademyStudent객체들 배열참조변수반환해줘 5.AcademyMember 중에서 자바반인 AcademyStudent객체들
	 * 배열참조변수반환해줘
	 */
	public AcademyMember[] findAcademyMembers(AcademyMember searchMember) {
		AcademyMember[] findMembers = null;

		if (searchMember instanceof AcademyStudent) {
			AcademyMember[] students = findAcademyMembersByType(STUDENT);
			int cnt = 0;

			for (int i = 0; i < students.length; i++) {
				AcademyStudent std = (AcademyStudent) students[i];
				if (std.getBan().equals(((AcademyStudent) searchMember).getBan())) {
					cnt++;
				}
			}
			findMembers = new AcademyMember[cnt];
			cnt = 0;

			for (int i = 0; i < students.length; i++) {
				AcademyStudent std = (AcademyStudent) students[i];
				if (std.getBan().equals(((AcademyStudent) searchMember).getBan())) {
					findMembers[cnt] = std;
					cnt++;
				}
			}

		} else if (searchMember instanceof AcademyStaff) {
			AcademyMember[] staffs = findAcademyMembersByType(STAFF);
			int cnt = 0;

			for (int i = 0; i < staffs.length; i++) {
				AcademyStaff staff = (AcademyStaff) staffs[i];
				if (staff.getDepart().equals(((AcademyStaff) searchMember).getDepart())) {
					cnt++;
				}
			}
			findMembers = new AcademyMember[cnt];
			cnt = 0;

			for (int i = 0; i < staffs.length; i++) {
				AcademyStaff staff = (AcademyStaff) staffs[i];
				if (staff.getDepart().equals(((AcademyStaff) searchMember).getDepart())) {
					findMembers[cnt] = staff;
					cnt++;
				}
			}
		} else if (searchMember instanceof AcademyGangsa) {
			AcademyMember[] gangsas = findAcademyMembersByType(GANGSA);
			int cnt = 0;

			for (int i = 0; i < gangsas.length; i++) {
				AcademyGangsa gangsa = (AcademyGangsa) gangsas[i];
				if (gangsa.getSubject().equals(((AcademyGangsa) searchMember).getSubject())) {
					cnt++;
				}
			}

			findMembers = new AcademyMember[cnt];
			cnt = 0;

			for (int i = 0; i < gangsas.length; i++) {
				AcademyGangsa gangsa = (AcademyGangsa) gangsas[i];
				if (gangsa.getSubject().equals(((AcademyGangsa) searchMember).getSubject())) {
					findMembers[cnt] = gangsa;
					cnt++;
				}
			}
		}
		return findMembers;
	}
}
