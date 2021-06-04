<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%
	SimpleDateFormat format = new SimpleDateFormat ("HH");
	String format_time = format.format (System.currentTimeMillis());
	
	String sMembers_id="";
	int sMembers_no=0;
	if(session.getAttribute("members_email")!=null){
		sMembers_id = (String)session.getAttribute("members_email");
		sMembers_no = (int)session.getAttribute("members_no");	
	}
%>
<script type="text/javascript">
	function ck() {
		alert("로그인이 필요한 서비스 입니다.");
		location.href="memberLoginForm.jsp";
	}
</script>				
<div id="header">
	<a name="top"></a>
	<div id="header_main">
		<div id="tlogo">
			<div class="top_logo" style="margin-left:350px;">
				<a href="mac_main.jsp">
				<img src="./res/mac_logo.png" width="191px"></a>
			</div>

			<div class="tarea3">
				<ul>
					<%if(!sMembers_id.equals("")){ %>
					<li>
						<a href="memberLoginOut.jsp">로그아웃</a>	
					</li>
					<li>
						<a href="memberMypage.jsp">마이페이지</a>
					</li>
					<li>
						 <a href="cartForm.jsp">장바구니</a>
					</li>
					<%}else{ %>
					<li>
						<a href="memberLoginForm.jsp">로그인</a>	
					</li>
					<li>
						<a href="memberWriteForm.jsp">회원가입</a>
					</li>
					<%} %>
				</ul>
			</div>
		</div>
	</div>
	<div id="header_main_2">
		<div class="inner">
			<ul>
				<li class="sm11"><a href="memberMypage.jsp">마이페이지</a></li>
				
				<li class="sm12"><a href="memberCardForm.jsp">카드관리</a></li>
				
				<li class="sm13"><a href="memberAddressForm.jsp">주소관리</a></li>
				
				<li class="sm14"><a href="jumunListView.jsp">주문조회</a></li>
			</ul>
		</div>
	</div>
</div>