<%@page import="com.itwill.shop.service.MembersService" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String findId = "";
	String findPassword = "";
	String msg = "";
	if(request.getAttribute("findId")!=null){
		findId=(String)request.getAttribute("findId");
	}else if(request.getAttribute("findPassword")!=null){
		findPassword=(String)request.getAttribute("findPassword");
		System.out.println("3");
	}else if(request.getAttribute("msg")!=null){
		msg=(String)request.getAttribute("msg");
	}
%>	
<%@ include file="../include/head.jsp"%>
<script type="text/javascript">
		window.onload = function(){
			var msg = '<%=msg%>';
			var findId='<%=findId%>';
			var findPassword='<%=findPassword%>';
			if(msg!=""&&msg!=null){
				alert(msg);
			}
			if(findId!=""){
				document.getElementById("findAfter").value=findId;
				document.getElementById("findAfter").style.visibility="visible";
			}else if(findPassword!=""){
				document.getElementById("findPwAfter").value=findPassword;
				document.getElementById("findPwAfter").style.visibility="visible";
			}
		}	

		function findIdMember() {
			if(document.findIdM.memberId.value==""||document.findIdM.memberId.value==null){
				alert("핸드폰 번호를 입력해주세요.");
			}else{
				document.findIdM.submit();
			}
		}
		
		function findPassMember() {
			if(document.findPassM.memberPassWord.value==""||document.findPassM.memberPassWord.value==null){
				alert("이메일을 입력해주세요.");
			}else{
				document.findPassM.submit();
			}
		}
	
</script>
<body style="">
	<%@ include file="../include/top.jsp"%>  
	<div class="indiv" style="margin: 0 auto; width: 1100px;">
	
		<!------------------------------------ 아이디 찾기 ---------------------------------------->
		<div class="hundred logborder">
			<div class="innertit">
				<p>아이디 찾기</p>
			
				
			</div>
			<form method="post" action="memberIdPwFindAction.jsp" id="form" name="findIdM">
				<input type="hidden" name="findHandle" value="findId">
				<div class="idsave">
					<p style="margin-bottom: 7px;">
						<input type="text" id="memberId" name="memberId" onfocus="this.value='';" value="" placeholder="핸드폰번호를 입력하세요." class="txtborder">	
						<input type="text" readonly="readonly" id="findAfter" value="" style="visibility: hidden;" class="txtborder">	
					</p>	
					
					<input type="button" onclick="findIdMember();"
                  style="width: 230px; background: #344336; color: #fff; display: inline-block; line-height: 45px; text-align: center; font-size: 20px; margin-right: 10px; 
                  cursor: pointer;" value="아이디 찾기">
         

				</div>
			</form>
		</div>
		<!------------------------------------ 아이디 찾기 끝 ---------------------------------------->
		
		<!------------------------------------ 비밀번호 찾기 ---------------------------------------->
		
		<div class="hundred logborder">
			<div class="innertit">
			<p>비밀번호 찾기</p>
			</div>
			<form method="post" action="memberIdPwFindAction.jsp" id="form" name="findPassM">
				<input type="hidden" name="findHandle" value="findpass">
				<div class="idsave">
					<p style="margin-bottom: 7px;">
						<input type="text" name="memberPassWord" onfocus="this.value='';" value="" placeholder="이메일을 입력하세요." class="txtborder">		
						<input type="text" readonly="readonly" id="findPwAfter" value="" style="visibility: hidden;" class="txtborder">	
					</p>
						
					<input type="button" onclick="findPassMember();"
                  style="width: 230px; background: #344336; color: #fff; display: inline-block; line-height: 45px; text-align: center; font-size: 20px; margin-right: 10px; 
                  cursor: pointer;" value="비밀번호 찾기">
		

				</div>
			</form>
		</div>
		<!------------------------------------ 비밀번호 찾기 끝 ---------------------------------------->
	</div>
	<%@ include file="../include/bottom.jsp"%>
</body>
</html>