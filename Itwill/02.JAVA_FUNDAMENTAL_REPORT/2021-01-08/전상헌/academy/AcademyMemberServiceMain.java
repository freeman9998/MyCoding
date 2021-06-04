package com.itwill05.service.academy;

import java.util.Iterator;

public class AcademyMemberServiceMain {

	public static void main(String[] args) {
		AcademyMemberService academyMemberService=new AcademyMemberService();
		System.out.println("1.AcademyMember 전체출력");
		academyMemberService.print();
		
		System.out.println("2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘");
		AcademyMember findMember=academyMemberService.findByNo(1);

		System.out.println("2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘");
		AcademyMember[] findMembers = academyMemberService.findByName("KIM");
		
		
		System.out.println("3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findStudents=academyMemberService.findByAcademyStudents();
		for (AcademyMember student : findStudents) {
			student.print();
		}
		System.out.println("3.AcademyMember 중에서 AcademyStaff객체들  모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findStaffs=academyMemberService.findByAcademyStaffs();
		for (AcademyMember academyMember : findStaffs) {
			academyMember.print();
		}
		
		System.out.println("3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findGangsa=academyMemberService.findByAcademyGangsas();
		for (AcademyMember academyMember : findGangsa) {
			academyMember.print();
		}
		
		
		System.out.println("상수를 입력받아 반환 ");
		AcademyMember[]findmembers=academyMemberService.findAcademyMembersByType(1);
		for (AcademyMember academyMember : findmembers) {
			academyMember.print();
		}
		System.out.println("4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		
		AcademyMember[] findjavaMember=academyMemberService.findAcademyStudentByBan("자바");
		for (AcademyMember academyMember : findjavaMember) {
			academyMember.print();
		}
		
		
		System.out.println("4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		
		AcademyMember[] findDepartMember=academyMemberService.findAcademyStaffByDepart("영업");
		for (AcademyMember academyMember : findDepartMember) {
			academyMember.print();
		}
		
		
		
		System.out.println("4.AcademyMember 중에서 프로그래밍과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		AcademyMember[] findAcademyGangsaBySubject=academyMemberService.findAcademyGangsaBySubject("프로그래밍");
		for (AcademyMember academyMember : findAcademyGangsaBySubject) {
			academyMember.print();
		}
		
		System.out.println("---------------------------------------------");
		
		
		System.out.println("5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		
		
		
		AcademyMember[]  findJavaStudent=academyMemberService.findAcademyMembers(new AcademyStudent(0, null, "자바"));
		for (AcademyMember academyMember : findJavaStudent) {
			academyMember.print();
		}
		
		
		System.out.println("5.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		academyMemberService.findAcademyMembers(new AcademyStaff(0, null, "영업"));
		for (AcademyMember academyMember : academyMemberService.findAcademyMembers(new AcademyStaff(0, null, "영업"))) {
			academyMember.print();
		}
		
		
		
		System.out.println("5.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		academyMemberService.findAcademyMembers(new AcademyGangsa(0, null, "OS"));
		for (AcademyMember academyMember : academyMemberService.findAcademyMembers(new AcademyGangsa(0, null, "OS"))) {
			academyMember.print();
		}
		
	}

}