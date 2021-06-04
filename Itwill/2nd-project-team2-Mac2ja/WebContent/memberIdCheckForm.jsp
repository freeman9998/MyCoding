<%@page import="com.itwill.shop.service.MembersService"%>
<%@ page import="com.itwill.shop.domain.Members"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	MembersService membersService = new MembersService();	
	Members members = membersService.findMembersById(request.getParameter("email"));
	String checkId="nun";
	if(members==null){
		checkId="";
	}else{
		checkId=members.getMembers_email();
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>아이디 중복 체크</title>
<!-- 
<link rel=stylesheet href="css/styles.css" type="text/css">
<link rel=stylesheet href="css/user.css" type="text/css">
 -->
<style type="text/css">
#wrap {
	width: 490px;
	text-align: center;
	margin: 0 auto 0 auto;
}

#chk {
	text-align: center;
}

#cancelBtn {
	visibility: visible;
}

#useBtn {
	visibility: visible;
}
</style>

<script type="text/javascript">
		
		
		// 이메일 아이디 중복체크
		function emailCheck(){
				var email = document.getElementById("memberId").value;	
				var checkEmail = '<%=checkId%>';
				if (!email) {
					alert("검색할 이메일을 입력하시고 중복체크를 하세요.");
					return false;
				}
				if(checkEmail!=email){
					alert("사용가능한 이메일 입니다.");
					document.getElementById("useBtn").disabled=false;
				}else{
					alert("존재하는 아이디 입니다.");
					document.getElementById("memberId").value="";
				}
			}
		
		
		
		// 사용하기 클릭 시 부모창으로 값 전달 
		function sendCheckValue(){
			// 중복체크 결과인 idCheck 값을 전달한다.
			//opener.document.form.idDuplication.value ="idCheck";
			// 회원가입 화면의 ID입력란에 값을 전달
			opener.document.f.email.value = document.getElementById("memberId").value;
			opener.document.f.idCheck.value = document.getElementById("idCheck").value;
			if (opener != null) {
            	opener.chkForm = null;
            	self.close();
            	//window.close();
			}	
		}	
		
	</script>

</head>
<body>
	<div id="wrap">
		<br> <b><font size="4" color="gray">이메일 중복체크</font></b>
		<hr size="1" width="460">
		<br>
		<div id="chk">
			<form id="checkForm">
				<input type="text" name="memberId" id="memberId" value="<%=request.getParameter("email")%>"> 
				<input type="hidden" name="idCheck" id="idCheck" value="<%=request.getParameter("email")%>">
				<input type="button" value="중복확인" onclick="emailCheck()">
			</form>
			<div id="msg"></div>
			
			<br><input id="useBtn"  disabled='disabled' type="button" value="사용하기" onclick="sendCheckValue()">
			 <input id="cancelBtn" type="button" value="취소" onclick="window.close()">
		</div>
	</div>
</body>
</html>