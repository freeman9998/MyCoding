package com.itwill05.service.academy;

import java.util.ArrayList;

public class AcademyMemberServiceMain {

	public static void main(String[] args) {
		AcademyMemberService academyMemberService = new AcademyMemberService();
		
		
		System.out.println("1.AcademyMember 전체출력");
			academyMemberService.print();
		
		System.out.println("2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘");
			AcademyMember findMember1 = academyMemberService.findNoMember(1);
			findMember1.print();
			
		System.out.println("2-1.번호 2 번 AcademyMember 객체 참조변수반환해줘");
			AcademyMember findMember2 = academyMemberService.findNoMember(2);
			findMember2.print();
			
		System.out.println("2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘");
			AcademyMember[] findMember3 = academyMemberService.findNameMember("KIM");
			for (AcademyMember academyMember : findMember3) {
				academyMember.print();
			}
			
		System.out.println("3.AcademyMember 중에서 AcademyStudent객체들 모두 반환해줘.[AcademyMember[]객체주소 반환]");
			AcademyMember[] findStudents = academyMemberService.findStudentMember();
			if(findStudents != null) {
				for (int i = 0; i < findStudents.length; i++) {
					findStudents[i].print();
				}
			}
		
		
		System.out.println("3-1.AcademyMember 중에서 AcademyStaff객체들 모두 반환해줘.[AcademyMember[]객체주소 반환]");
			AcademyMember[] findStaffs = academyMemberService.findStaffMember();
			if(findStaffs != null) {
				for (int i = 0; i < findStaffs.length; i++) {
					findStaffs[i].print();
				}
			}
			
		System.out.println("3-2.AcademyMember 중에서 AcademyGangsa객체들 모두 반환해줘.[AcademyMember[]객체주소 반환]");
			AcademyMember[] findGangsas = academyMemberService.findGangsaMember();
			if(findGangsas != null) {
				for (int i = 0; i < findGangsas.length; i++) {
					findGangsas[i].print();
				}
			}
		
		System.out.println("3-3.type 상수로 받아서 객체배열 참조변수 반환해줘");
		
			AcademyMember[] findMembers = academyMemberService.findAcademyMembersByType(AcademyMemberService.STAFF);
			if(findMembers != null) {
				for (int i = 0; i < findMembers.length; i++) {
					findMembers[i].print();
				}
			}
		
		System.out.println("4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
			AcademyMember[] findBanStudents = academyMemberService.findBanStudentMember("자바");
			if(findBanStudents !=null) {
				for (int i = 0; i < findBanStudents.length; i++) {
					findBanStudents[i].print();
				}
			}
			
	
		System.out.println("4-1.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
			AcademyMember[] findDepartStaffs = academyMemberService.findDepartStaffMember("영업");
			if(findDepartStaffs !=null) {
				for (int i = 0; i < findDepartStaffs.length; i++) {
					findDepartStaffs[i].print();
				}
			}
		
		System.out.println("4-2.AcademyMember 중에서 OS과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
			AcademyMember[] findSubjectGangsas = academyMemberService.findSubjectGangsaMember("OS");
			if(findSubjectGangsas !=null) {
				for (int i = 0; i < findSubjectGangsas.length; i++) {
					findSubjectGangsas[i].print();
				}
			}
	
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("5.AcademyMember 중에서 자바반인 AcademyStudent 객체들 배열참조변수반환해줘");
		ArrayList<AcademyMember> findByMembers = academyMemberService.findAcademyMembers(new AcademyStudent(0, null, "자바"));
			for (AcademyMember academyMember : findByMembers) {
				academyMember.print();
			}
			
		System.out.println("5-1.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		findByMembers = academyMemberService.findAcademyMembers(new AcademyStaff(0, null, "영업"));
			for (AcademyMember academyMember : findByMembers) {
				academyMember.print();
			}
			
		System.out.println("5-2.AcademyMember 중에서 OS과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		findByMembers = academyMemberService.findAcademyMembers(new AcademyGangsa(0, null, "OS"));
			for (AcademyMember academyMember : findByMembers) {
				academyMember.print();
			}
			
	}

}