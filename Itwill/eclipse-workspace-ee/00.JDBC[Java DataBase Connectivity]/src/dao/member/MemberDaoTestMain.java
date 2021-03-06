package dao.member;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception{
		MemberDao memberDao=new MemberDao();
		/*****************insert*********
		System.out.println("1.create: "+memberDao.create(new Member("aaa","aaa", "에이군 ", "서울시민", 45, "T", null)));
		System.out.println("1.create: "+memberDao.create(new Member("bbb","bbb", "비이군", "서울시민", 45, "T", null)));
		System.out.println("1.create: "+memberDao.create(new Member("ccc","ccc", "씨이꾼", "서울시민", 45, "T", null)));
		****************************/
		
		Member member = memberDao.selectById("aaa");
		System.out.println("2.selectById:"+member);
		member.setM_name("김변경");
		member.setM_address("변경주소");
		member.setM_age(34);
		member.setM_married("F");
		System.out.println("3.updateById:"+memberDao.updateById(member));
		System.out.println(memberDao.selectById("aaa"));
		System.out.println("4.deleteById:"+memberDao.deleteById("yyyy"));
		System.out.println("5.selectAll:"+memberDao.selectAll());
	}

}
