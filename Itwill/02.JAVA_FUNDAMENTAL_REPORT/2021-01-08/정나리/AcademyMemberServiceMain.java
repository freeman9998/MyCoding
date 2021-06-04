package com.itwill05.service.academy;

public class AcademyMemberServiceMain {

	public static void main(String[] args) {
		AcademyMemberService academyMemberService=new AcademyMemberService();
		System.out.println("1.AcademyMember 전체출력");
		academyMemberService.print();
		
		System.out.println("2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘");
		AcademyMember findMember=academyMemberService.findByNo(1);
		findMember.print();
		System.out.println("2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘");
		AcademyMember[] findMembers = academyMemberService.findByName("KIM");
		for (AcademyMember academyMember : findMembers) {
			academyMember.print();
		}
		System.out.println("3-1.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findStudents=academyMemberService.findByAcademyStudents();
		for (AcademyMember student : findStudents) {
			student.print();
		}
		System.out.println("3-2.AcademyMember 중에서 AcademyStaff객체들  모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findStaffs=academyMemberService.findByAcademyStaffs();
		for (AcademyMember academyMember : findStaffs) {
			academyMember.print();
		}
		System.out.println("3-3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findGansa=academyMemberService.findByAcademyGangsas();
		for (AcademyMember academyMember : findGansa) {
			academyMember.print();
		}
		System.out.println("4-1.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		AcademyMember[] findStudentsBan = academyMemberService.findAcademyStudentByBan("자바");
		for (AcademyMember academyMember : findStudentsBan) {
			academyMember.print();
		}
		System.out.println("4-2.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		AcademyMember[] findStaffDepart = academyMemberService.findAcademyStaffByDepart("영업");
		for (AcademyMember academyMember : findStaffDepart) {
			academyMember.print();
		}
		System.out.println("4-3.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		AcademyMember[] findStaffGangsa = academyMemberService.findAcademyGangsaBySubject("DB");
		for (AcademyMember academyMember : findStaffGangsa) {
			academyMember.print();
		}
		System.out.println("5-1.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		findStudentsBan=academyMemberService.findAcademyMembers(new AcademyStudent(0, null, "자바"));
		for (AcademyMember academyMember : findStudentsBan) {
			academyMember.print();
		}
		System.out.println("5-2.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		findStaffDepart=academyMemberService.findAcademyMembers(new AcademyStaff(0, null, "영업"));
		for (AcademyMember academyMember : findStaffDepart) {
			academyMember.print();
		}
		System.out.println("5-3.AcademyMember 중에서 OS과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		findStaffGangsa=academyMemberService.findAcademyMembers(new AcademyGangsa(0, null, "OS"));
		for (AcademyMember academyMember : findStaffGangsa) {
			academyMember.print();
		}
		
	}

}