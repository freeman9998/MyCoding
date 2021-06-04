<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko">
<%@ include file="../include/head.jsp"%>
<body style="">
<%@ include file="../include/top.jsp"%>
	<div class="indiv" style="margin: 0 auto; width: 1100px;">
		<!-- Start indiv -->
		
		<div class="hundred logborder">
			<div class="innertit">
				<p>로그인</p>
				<span>로그인이 필요한 서비스입니다. 회원이 아니시면 회원가입을 해주세요.</span> <br> <span
					style="color: #f0301b; font-weight: 500; text-align: left !important;">이메일과 비밀번호를 
					입력해주세요.</span>
			
			</div>
			<form method="post" action="memberLoginaction.jsp" id="form"
				name="form">
				<div class="idsave">
					<p style="margin-bottom: 7px;">
						<input type="text" name="members_email" onfocus="this.value='';" value="" placeholder="이메일" class="txtborder">
						
					</p>
					<p style="margin-bottom: 10px;">
						<input type="password" name="members_password" onfocus="this.value='';"	value="" placeholder="비밀번호" class="txtborder">
						
					</p>
					<p>
						<input type="image" src="./res/btn_login.gif">
					</p>
					<p style="text-align: left; width: 400px; margin: 5px auto;">
						<input type="checkbox" name="" value="">이메일저장
					</p>
				</div>
			</form>

			

			<div class="joinfind">
				<a href="memberIdPwFind.jsp" onfocus="blur()">이메일찾기</a>
				&nbsp;<span style="color: #aaa; font-size: 11px;">｜</span>&nbsp; <a
					href="memberIdPwFind.jsp" onfocus="blur()">비밀번호찾기</a>
				&nbsp;<span style="color: #aaa; font-size: 11px;">｜</span>&nbsp; <a
					href="memberWriteForm.jsp" onfocus="blur()">회원가입</a>
			</div>
		</div>
	</div>
	<%@ include file="../include/bottom.jsp"%>
</body>
</html>