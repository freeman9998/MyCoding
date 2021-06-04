<%@page import="com.itwill.member.Member"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/*********   case2********************
	String msg = request.getParameter("msg");
	if(msg==null){
		msg="";
	}
	msg=URLDecoder.decode(msg,"UTF-8");
	*/
	Member fmember = (Member)request.getAttribute("fmember");
	if(fmember==null){
		fmember= new Member("","","","","");
	}
	String msg=(String)request.getAttribute("msg");
	if(msg==null)msg="";
	
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>사용자 관리</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=stylesheet href="css/styles.css" type="text/css">
<link rel=stylesheet href="css/user.css" type="text/css">
<style type="text/css" media="screen">
</style>
<script type="text/javascript">
	function memberCreate() {
		if (document.f.m_id.value == "") {
			alert("사용자 아이디를 입력하십시요.");
			document.f.m_id.focus();
			return false;
		}
		
		if (f.m_password.value == "") {
			alert("비밀번호를 입력하십시요.");
			f.m_password.focus();
			return false;
		}
		
		if (f.m_password2.value == "") {
			alert("비밀번호확인을 입력하십시요.");
			f.m_password2.focus();
			return false;
		}
		
		if (f.m_name.value == "") {
			alert("이름을 입력하십시요.");
			f.m_name.focus();
			return false;
		}
		
		if (f.m_phone.value == "") {
			alert("핸드폰 번호를 입력하십시요.");
			f.phone.focus();
			return false;
		}
		
		if (f.m_email.value == "") {
			alert("이메일 주소를 입력하십시요.");
			f.email.focus();
			return false;
		}
		
		if (f.m_password.value != f.m_password2.value) {
			alert("비밀번호와 비밀번호확인은 일치하여야합니다.");
			f.m_password.focus();
			f.m_password.select();
			return false;
		}
		
		f.action = "member_write_action.jsp";
		f.method='POST';
		f.submit();
	}

	function shopMain() {
		f.action = "shop_main.jsp";
		f.submit();
	}
	
	
</script>
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0
	marginwidth=0 marginheight=0>
	<!-- container start-->
	<div id="container">
		<!-- header start -->
		<div id="header">
			<!-- include_common_top.jsp start-->
			<jsp:include page="include_common_top.jsp"/>
			<!-- include_common_top.jsp end-->
		</div>
		<!-- header end -->
		<!-- navigation start-->
		<div id="navigation">
			<!-- include_common_left.jsp start-->
			<jsp:include page="include_common_left.jsp"/>
			<!-- include_common_left.jsp end-->
		</div>
		<!-- navigation end-->
		<!-- wrapper start -->
		<div id="wrapper">
			<!-- content start -->
			<!-- include_content.jsp start-->
			<div id="content">
				<table width=0 border=0 cellpadding=0 cellspacing=0>
					<tr>
						<td>
							<!--contents--> <br />
							<table style="padding-left: 10px" border=0 cellpadding=0
								cellspacing=0>
								<tr>
									<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b>회원 가입</b></td>
								</tr>
							</table> <!-- write Form  -->
							<form name="f" method="post">
								<table border="0" cellpadding="0" cellspacing="1" width="590"
									bgcolor="BBBBBB">
									<tr>
										<td width=120 align=center bgcolor="E6ECDE" height="22"> 아이디
											</td>
										<td width=490 bgcolor="ffffff" style="padding-left: 10px" align="left">
											<input type="text" style="width: 150px" name="m_id"
											value="<%=fmember.getM_id()%>">&nbsp;&nbsp;<font color="red"><%=msg%></font>
										</td>
									</tr>
									<tr>
										<td width=120 align=center bgcolor="E6ECDE" height="22">비밀번호</td>
										<td width=490 bgcolor="ffffff" style="padding-left: 10px" align="left">
											<input type="password" style="width: 150px" name="m_password"
											value="<%=fmember.getM_password()%>">
										</td>
									</tr>
									<tr>
										<td width=120 align=center bgcolor="E6ECDE" height="22"> 비밀번호 재확인
											</td>
										<td width=490 bgcolor="ffffff" style="padding-left: 10px" align="left">
											<input type="password" style="width: 150px" name="m_password2"
											value="<%=fmember.getM_password()%>">
										</td>
									</tr>
									<tr>
										<td width=120 align=center bgcolor="E6ECDE" height="22"> 이름 </td>
										<td width=490 bgcolor="ffffff" style="padding-left: 10px" align="left">
											<input type="text" style="width: 150px" name="m_name"
											value="<%=fmember.getM_name()%>">
										</td>
									</tr>
									<tr>
										<td width=120 align=center bgcolor="E6ECDE" height="22"> 핸드폰 번호
											</td>
										<td width=490 bgcolor="ffffff" style="padding-left: 10px" align="left">
											<input type="text" style="width: 150px" name="m_phone"
											value="<%=fmember.getM_phone()%>">
										</td>
									</tr>
									<tr>
										<td width=120 align=center bgcolor="E6ECDE" height="22">이메일 주소
											</td>
										<td width=490 bgcolor="ffffff" style="padding-left: 10px" align="left">
											<input type="text" style="width: 150px" name="m_email"
											value="<%=fmember.getM_email()%>">
										</td>
									</tr>
								</table>
							</form> <br />

							<table border=0 cellpadding=0 cellspacing=1>
								<tr>
									<td align=center>
										<input type="button" value="회원가입"
											onclick="memberCreate();"> &nbsp; 
										<input type="button"
											value="취소" onClick="shopMain();"></td>
								</tr>
							</table>

						</td>
					</tr>
				</table>
			</div>
			<!-- include_content.jsp end-->
			<!-- content end -->
		</div>
		<!--wrapper end-->
		<div id="footer">
			<!-- include_common_bottom.jsp start-->
			<jsp:include page="include_common_bottom.jsp"/>
			<!-- include_common_bottom.jsp end-->
		</div>
	</div>
	<!--container end-->
</body>
</html>
