package com.itwill.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.itwill.dao.BookMemberDao;
import com.itwill.vo.BookMember;

public class BookMemberService {

	private BookMemberDao bookMemberDao;
	
	public BookMemberService() {
		bookMemberDao=new BookMemberDao();
	}
	
	/*
	 * 회원가입 = 아이디 중복체크,
	 */
	
	
	/*
	 * 아이디 존재여부
	 */
	public boolean isExistedId(String id) throws Exception{
		
		boolean isExistedId=false;
		BookMember bookmember = bookMemberDao.selectById(id);
		if (bookmember == null) {
			isExistedId = false;
		}else if (bookmember != null) {
			isExistedId=true;
		}	
		return isExistedId;
	}
	
	/*
	 * 아이디 조건 체크
	 */
	public int patternCheckId(String id) {
		
		if (id == null || id.equals("")) {
			return 1;                                                                   
			//입력된 아이디가 비었을 경우
		}
		
		Pattern idALL = null; //소문자,대문자,특수기호,숫자,4~20자 이하			
		Matcher match;
		int charType = 0;
		
		idALL = Pattern.compile("^[a-z]{1}[a-zA-Z0-9_]{3,21}$");
		
		match=idALL.matcher(id); //첫글자 소문자로 시작 , 대문자 및 숫자 조합 4~20자 이하
		if (match.find()) charType++;//있다면 조건 만족 +1	
		
		if(charType < 1) {
			return 1;
			
		}
		
		return 0;
	}
	
	/*
	 * 비밀번호 조건 체크
	 */
	public int patternCheck(String password) {
		
		
		if(password == null||password.equals("")) {
			return 1;
			//입력된 비번이 비었을 경우
		}
		
		Pattern pAlphabetLow = null; //대문자
		Pattern pAlphabetUp = null;  //소문자
		Pattern pNum = null;		//숫자
		Pattern pSpecial = null;	//특수기호
		
		Matcher match;
		int charType = 0;
		
		pAlphabetLow= Pattern.compile("[a-z]");
		pAlphabetUp = Pattern.compile("[A-Z]");
		pNum = Pattern.compile("[0-9]");
		pSpecial = Pattern.compile("\\p{Punct}");
		
		match = pAlphabetLow.matcher(password); //패스워드 중에 소문자가 있는가?
		if(match.find()) charType++; //있다면 조건 만족 +1
		
		match = pAlphabetUp.matcher(password); //패스워드 중에 소문자가 있나?
		if(match.find()) charType++; //있다면 조건 만족 +1
		
		match = pNum.matcher(password);//패스워드 중에 숫자가 있나?
		if(match.find()) charType++; //있다면 조건 만족 +1
		
		match = pSpecial.matcher(password);//패스워드 중에 특수문자가 있나?
		if(match.find()) charType++;//있다면 조건 만족 +1
		
		if(charType <= 1) {
			return 2;
			//비밀번호가 조건을 만족하지 못함
		}
		if(charType == 2) {
			if(password.length() < 10) {
				return 3;
				//2가지 조건이 만족 됐는데 입력된 비번이 10글자보다 짧을 경우 다시 입력 하세용
			} else {
				return 0; //좋은 비번
			}
		}
		if(charType >= 3) {
			if(password.length() < 8) {
				return 4;
				//3가지 조건이 만족 됐는데 입력된 비번이 8글자보다 짧을 경우 다시 입력 하세용
			}else {
				return 0; //좋은 비번
			}
		}
		
		return 0;
	}
	
	
	/*
	 * 로그인
	 */
	public int login(String id ,String password) throws Exception{
		/*
		 * 0.성공
		 * 1.아이디존재안함
		 * 2.패쓰워드불일치 
		 */
		int result=-9999;
		if(isExistedId(id)) {
			//아이디존재(회원인경우)
			BookMember findMember = bookMemberDao.selectById(id);
			System.out.println(findMember);
			if(findMember.getMember_password().equals(password)) {
				//패드워드일치
				result=0;
			}else {
				//패드워드불일치
				result=2;
			}
		}else {
			//아이디존재안함
			result=1;
		}
		return result;
	}
	
	
	/*
	 * (회원아이디 1명 검색)
	 */	
	public BookMember findById(String id) throws Exception{
		return bookMemberDao.selectById(id);
	}
	
	/*
	 * 회원수정
	 * - 회원이 수정하고자 하는 정보만 입력하도록 한다.
	 * - 비어있는 정보는 업데이트 되지 않는다. 
	 * - 비밀번호를 수정하고자 한다면(입력되었다면) 비밀번호와 비밀번호 확인이 일치해야 한다. 
	 */
	
	public int BookmemberUpdate(BookMember bookMember, String password, String pass_check, String phone_1, String phone_2, String phone_3
			, String email_1, String email_2) throws Exception{

		int isUpdate =-9999;
		
		if(password.equals("") && pass_check.equals("")) {
			password = bookMember.getMember_password();
			pass_check = bookMember.getMember_password();
		}
		
		if(password.equals("") && !pass_check.equals("")) {
			isUpdate= -2; //비번만 입력되지 않았을 때
			return isUpdate;
		}
		
		if(!password.equals("") && !pass_check.equals("")) {
			//비밀번호를 수정하고자 값을 입력
			if(!password.equals(pass_check)) {
				isUpdate = -1; //비번과 비번확인이 일치하지 않습니다. 출력.
				return isUpdate;
			}else {
				
				if(patternCheck(password)==2) {
					isUpdate= -3; //비번이 조건을 만족하지 못한 경우
					return isUpdate;
				}else if(patternCheck(password) == 3) {
					isUpdate= -4; //비번이 2개 조건을 만족했지만 10자리보다 짧을 경우
					return isUpdate;
				}else if(patternCheck(password) == 4) {
					isUpdate= -5; //비번이 3개 조건을 만족했지만 8자리보다 짧을 경우
					return isUpdate;
				}
			}
		}
		
		if(phone_1.equals("")) {
			phone_1 = bookMember.getMember_phone_1();
		}
		if(phone_2.equals("")) {
			phone_2 = bookMember.getMember_phone_2();
		}
		if(phone_3.equals("")) {
			phone_3 = bookMember.getMember_phone_3();
		}
		if(email_1.equals("")) {
			email_1 = bookMember.getMember_email_1();
		}
		if(email_2.equals("")) {
			email_2 = bookMember.getMember_email_2();
		}
		
		return bookMemberDao.updateById(bookMember.getMember_id(), password, phone_1, phone_2, phone_3	, email_1, email_2);
	}
	
	
	
	/*
	 * 회원가입
	 */
	public int memberRegister(BookMember newMember, String password_chack) throws Exception {
		/*
		 * 아이디존재여부체크
		 *     - 존재하면 메세지
		 *     - 존재안하면 가입(DB저장).
		 *     - 비밀번호와 비밀번호 확인일치 확인
		 */
		
		int isRegister= -9999;
		
		//아이디 조건
		if (patternCheckId(newMember.getMember_id()) == 1) {
			isRegister = -1;// 아이디 조건에 만족하지 못했을경우
			return isRegister;
		}
		
		
		//비밀번호 조건
		if(patternCheck(newMember.getMember_password()) == 1) {
			isRegister= -2; //비번이 입력되지 않았을 경우
			return isRegister;
		}else if(patternCheck(newMember.getMember_password()) == 2) {
			isRegister= -3; //비번이 조건을 만족하지 못한 경우
			return isRegister;
		}else if(patternCheck(newMember.getMember_password()) == 3) {
			isRegister= -4; //비번이 2개 조건을 만족했지만 10자리보다 길 경우
			return isRegister;
		}else if(patternCheck(newMember.getMember_password()) == 4) {
			isRegister= -5; //비번이 3개 조건을 만족했지만 8자리보다 길 경우
			return isRegister;
		}

		if(!isExistedId(newMember.getMember_id())&&
				newMember.getMember_password().equals(password_chack)) {
			//아이디중복안됨-->가입가능
			//newMember.getMember_password()가 password_chack(ui변수)와 일치 --> 가입가능
			bookMemberDao.create(newMember);
			isRegister= 0;
		}else if(isExistedId(newMember.getMember_id())){
			//아이디중복
			//이미 가입된 아이디입니다 출력은 ui에서
			isRegister= 1;
		}else if(!newMember.getMember_password().equals(password_chack)) {
			//비밀번호 확인 불일치
			//비밀번호가 일치하지 않습니다. 출력은 ui에서
			isRegister = 2;
		}
		
		return isRegister;
	}
	
	
	/*
	 * 회원탈퇴
	 */
	public int memberUnRegister(BookMember loginMember, String password_chack) throws Exception{
		//비밀번호와 password_chack(ui변수)가 일치할 경우, 회원탈퇴 진행
		if(loginMember.getMember_password().equals(password_chack)) {
			return bookMemberDao.deleteById(loginMember.getMember_id());		
		}else {
			return -1; //비번이 일치하지 않습니다 출력
		}
	} 
	
	/*
	 * 대여시 회원 총대여권수 증가
	 */
	public void increaseMemberTotalBookCount(BookMember loginMember) throws Exception {
		//loginMember.
		BookMember member=bookMemberDao.selectById(loginMember.getMember_id());
		bookMemberDao.updateByCount(member.getMember_count()+1, loginMember);
	}
	
	
	
	
	
}
