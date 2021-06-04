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
		for (AcademyMember fm : findMembers) {
			fm.print();
		}
		System.out.println("3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findStudents=academyMemberService.findByAcademyStudents();
		for (AcademyMember student : findStudents) {
			student.print();
		}
		System.out.println("3.AcademyMember 중에서 AcademyStaff객체들  모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findStaffs = academyMemberService.findByAcademyStaffs();
		for (AcademyMember staff : findStaffs) {
			staff.print();
		}
		System.out.println("3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		AcademyMember[] findGangsas = academyMemberService.findByAcademyGangsas();
		for (AcademyMember gangsa : findGangsas) {
			gangsa.print();
		}
		System.out.println("3-1.AcademyMember 중에서 Type값을 주면 그 타입의 객체들 모두 반환해줘");
		AcademyMember[] findMembersByType = academyMemberService.findAcademyMembersByType(2);
		for (AcademyMember findType : findMembersByType) {
			findType.print();
		}
		System.out.println(
		"4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		AcademyMember[] findBan = academyMemberService.findAcademyStudentByBan("자바");
		for (AcademyMember findStuBan : findBan) {
			findStuBan.print();
		}
		System.out.println(
		"4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		AcademyMember[] findDepart = academyMemberService.findAcademyStaffByDepart("영업");
		for (AcademyMember findStfDepart : findDepart) {
			findStfDepart.print();
		}
		System.out.println(
		"4.AcademyMember 중에서 DB과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		AcademyMember[] findSubject = academyMemberService.findAcademyGangsaBySubject("DB");
		for (AcademyMember findGangsaSubject : findSubject) {
			findGangsaSubject.print();
		}
		System.out.println("---------------------------------------------");
		System.out.println(
				"5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		AcademyMember[] findStudent=academyMemberService.findAcademyMembers(new AcademyStudent(0, null, "자바"));
		for (AcademyMember academyMember : findStudent) {
			academyMember.print();
		}
		System.out.println(
				"5.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		AcademyMember[] findStaff =academyMemberService.findAcademyMembers(new AcademyStaff(0, null, "영업"));
		for (AcademyMember academyMember : findStaff) {
			academyMember.print();
		}
		System.out.println(
				"5.AcademyMember 중에서 OS과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		AcademyMember[] findGangsa = academyMemberService.findAcademyMembers(new AcademyGangsa(0, null, "OS"));
        for (AcademyMember academyMember : findGangsa) {
			academyMember.print();
		}
	}

}
