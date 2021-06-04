package com.itwill05.service.academy;

public class AcademyMemberServiceMain {

	public static void main(String[] args) {
AcademyMemberService academyMemberService=new AcademyMemberService();
		
		System.out.println("1.AcademyMember 전체출력");
		academyMemberService.print();
		
		System.out.println("2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘");
		AcademyMember findMember = academyMemberService.findByNo(1);
		
		System.out.println("2-1.번호 2 번 AcademyMember 객체 참조변수반환해줘");
		findMember = academyMemberService.findByNo(2);
		
		System.out.println("2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘");
		AcademyMember[] findMembers = academyMemberService.findByname("KIM");
		
		System.out.println("3.AcademyMember 중에서 AcademyStudent객체배열 참조변수반환해줘");
		AcademyMember[] findStudents=academyMemberService.findByAcademyStudents();
		for (AcademyMember student : findStudents) {
			student.print();
		}
		
		System.out.println("3.AcademyMember 중에서 AcademyStaff객체배열 참조변수반환해줘");
		AcademyMember[] findStaffs = academyMemberService.findByAcademyStaffs();
		
		System.out.println("3.AcademyMember 중에서 AcademyGangsa객체배열 참조변수반환해줘");
		AcademyMember[] findGangsas = academyMemberService.findByAcademyGangsas();
		
		
		System.out.println(
		"4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		AcademyMember[] findMembersByBan = academyMemberService.findAcademyStudentByBan("자바");
		for (AcademyMember academyMember : findMembersByBan) {
			academyMember.print();
		}
		
		System.out.println(
		"4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		AcademyMember[] findMembersByDepart = academyMemberService.findAcademyStaffByDepart("영업");
		for (AcademyMember academyMember : findMembersByDepart) {
			academyMember.print();
		}
		
		System.out.println(
		"4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		AcademyMember[] findMembersBySub = academyMemberService.findAcademyGangsaBySubject("자바");
		for (AcademyMember academyMember : findMembersBySub) {
			academyMember.print();
		}
		
		System.out.println("---------------------------------------------");
		System.out.println(
		"5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		findMembers = academyMemberService.findAcademyMembers(new AcademyStudent(0, null, "자바"));
		for (AcademyMember academyMember : findMembers) {
			 academyMember.print();
		}
		System.out.println(	
	    "5.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		academyMemberService.findAcademyMembers(new AcademyStaff(0, null, "영업"));
		
		System.out.println(
		"5.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		academyMemberService.findAcademyMembers(new AcademyGangsa(0, null, "OS"));
		
		
	}

}
