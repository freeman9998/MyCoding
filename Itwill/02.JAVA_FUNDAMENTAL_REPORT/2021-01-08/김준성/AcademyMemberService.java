package com.itwill05.service.academy;

import java.util.*;

/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {
	public final static int MEMBER_STUDENT = 1;
	public final static int MEMBER_STAFF = 2;
	public final static int MEMBER_TEACHER = 3;

	private AcademyMember[] members = { new AcademyStudent(1, "KIM", "자바"), new AcademyStudent(2, "LEE", "리눅스"),
			new AcademyStudent(3, "KIM", "자바"), new AcademyStudent(4, "LEE", "IOT"),
			new AcademyTeacher(5, "CHOI", "프로그래밍"), new AcademyTeacher(6, "KIM", "DB"),
			new AcademyTeacher(7, "DIM", "OS"), new AcademyStaff(8, "AIM", "영업"), new AcademyStaff(9, "QIM", "생산") };

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
				break;
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

		if (count == 0) {
			return null;
		}

		findMembers = new AcademyMember[count];
		count = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				findMembers[count] = members[i];
				count++;
			}
		}

		return findMembers;
	}

	/*
	 * 3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyTeacher객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
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

	public AcademyMember[] findByAcademyTeachers() {
		AcademyMember[] teachers = null;
		int count = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyTeacher) {
				count++;
			}
		}
		teachers = new AcademyMember[count];
		int index = 0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] instanceof AcademyTeacher) {
				teachers[index] = members[i];
				index++;
			}
		}
		return teachers;
	}

	/*
	 * public AcademyMember[] findAcademyMembersByType(int type) { AcademyMember[]
	 * findMembers=null;
	 * 
	 * return findMembers; }
	 */
	public AcademyMember[] findAcademyMembersByType(int type) {
		AcademyMember[] findMembers = null;
		switch (type) {
		case MEMBER_STUDENT:
			findMembers = findByAcademyStudents();
			break;

		case MEMBER_STAFF:
			findMembers = findByAcademyStaffs();
			break;

		case MEMBER_TEACHER:
			findMembers = findByAcademyTeachers();
			break;

		default:
			return null;
		}
		return findMembers;
	}

	/*
	 * 4.AcademyMember 중에서 자바반인 AcademyStudent 객체들 배열참조변수반환해줘 4.AcademyMember 중에서
	 * 영업부서인 AcademyStaff 객체들 배열참조변수반환해줘 4.AcademyMember 중에서 자바과목인 AcademyTeacher
	 * 객체들 배열참조변수반환해줘
	 */
	public AcademyMember[] findAcademyStudentByAcademyClass(String academyClass) {
		AcademyMember[] findMembers = findAcademyMembersByType(MEMBER_STUDENT);

		int count = 0;
		int index = 0;
		for (int i = 0; i < findMembers.length; i++) {
			AcademyStudent students = (AcademyStudent) findMembers[i];
			if (students.getAcademyClass().equals(academyClass)) {
				count++;
			}
		}
		AcademyMember[] findStudents = new AcademyMember[count];
		for (int i = 0; i < findMembers.length; i++) {
			AcademyStudent students = (AcademyStudent) findMembers[i];
			if (students.getAcademyClass().equals(academyClass)) {
				findStudents[index] = findMembers[i];
				index++;
			}
		}

		return findStudents;
	}

	public AcademyMember[] findAcademyStaffByDepart(String depart) {
		AcademyMember[] findMembers = findAcademyMembersByType(MEMBER_STAFF);

		int count = 0;
		int index = 0;
		for (int i = 0; i < findMembers.length; i++) {
			AcademyStaff staffs = (AcademyStaff) findMembers[i];
			if (staffs.getDepart().equals(depart)) {
				count++;
			}
		}
		AcademyMember[] findStaffs = new AcademyMember[count];
		for (int i = 0; i < findMembers.length; i++) {
			AcademyStaff staffs = (AcademyStaff) findMembers[i];
			if (staffs.getDepart().equals(depart)) {
				findStaffs[index] = findMembers[i];
				index++;
			}
		}

		return findStaffs;
	}

	public AcademyMember[] findAcademyTeacherBySubject(String subject) {
		AcademyMember[] findMembers = findAcademyMembersByType(MEMBER_TEACHER);

		int count = 0;
		int index = 0;
		for (int i = 0; i < findMembers.length; i++) {
			AcademyTeacher teachers = (AcademyTeacher) findMembers[i];
			if (teachers.getSubject().equals(subject)) {
				count++;
			}
		}
		AcademyMember[] findTeachers = new AcademyMember[count];
		for (int i = 0; i < findMembers.length; i++) {
			AcademyTeacher teachers = (AcademyTeacher) findMembers[i];
			if (teachers.getSubject().equals(subject)) {
				findTeachers[index] = findMembers[i];
				index++;
			}
		}

		return findTeachers;
	}

	/*
	 * 5.AcademyMember 중에서 자바반인 AcademyStudent객체들 배열참조변수반환해줘 5.AcademyMember 중에서
	 * 자바반인 AcademyStudent객체들 배열참조변수반환해줘 5.AcademyMember 중에서 자바반인 AcademyStudent객체들
	 * 배열참조변수반환해줘
	 */
	public AcademyMember[] findAcademyMembers(AcademyMember searchMember) {
		AcademyMember[] findMembers = null;
		if (searchMember instanceof AcademyStudent) {
			AcademyStudent searchStudents = (AcademyStudent) searchMember;
			findMembers = findAcademyStudentByAcademyClass(searchStudents.getAcademyClass());
		} else if (searchMember instanceof AcademyStaff) {
			AcademyStaff searchStaffs = (AcademyStaff) searchMember;
			findMembers = findAcademyStaffByDepart(searchStaffs.getDepart());
		} else if (searchMember instanceof AcademyTeacher) {
			AcademyTeacher searchTeachers = (AcademyTeacher) searchMember;
			findMembers = findAcademyTeacherBySubject(searchTeachers.getSubject());
		} else {
			return null;
		}

		return findMembers;
	}

}