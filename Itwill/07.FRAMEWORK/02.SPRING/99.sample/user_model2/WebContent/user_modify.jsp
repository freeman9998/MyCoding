<%@page import="com.itwill.user.User"%>
<%@page import="com.itwill.user.UserManager"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@include file="loginCheck.jspf" %>
<%
	User user=(User)request.getAttribute("user");
%>      
<html>
<head>
<title>����� ����</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel=stylesheet href="css/user.css" type="text/css">
<script language="JavaScript">
function userModify() {
	
	if ( f.password.value == "" ) {
		alert("��й�ȣ�� �Է��Ͻʽÿ�.");
		f.password.	focus();
		return false;
	}
	if ( f.name.value == "" ) {
		alert("�̸��� �Է��Ͻʽÿ�.");
		f.name.focus();
		return false;
	}
	if ( f.email.value == "" ) {
		alert("�̸����� �Է��Ͻʽÿ�.");
		f.email.focus();
		return false;
	}
	if ( f.password.value != f.password2.value) {
		alert("�о������ Ȯ���� ��ġ�Ͽ����մϴ�.");
		f.password2.focus();
		return false;
	}
	f.action = "modify.do";
	f.submit();
}

function userList() {
	f.action = "list.do";
	f.submit();
}
</script>
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0 marginwidth=0 marginheight=0>
<br>
<table width=780 border=0 cellpadding=0 cellspacing=0>
	<tr>
	  <td width="20"></td>
	  <td>
  <!--contents-->
	  <table width=590 border=0 cellpadding=0 cellspacing=0>
		  <tr>
			<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b>����� ���� - ����� �߰�</b></td>
		  </tr>
	  </table>  
	  <br>
	  <!-- modify Form  -->
	  <form name="f" method="post">
	  <input type="hidden" name="userId" value="<%=user.getUserId()%>"/>	  
	  <table border="0" cellpadding="0" cellspacing="1" width="590" bgcolor="BBBBBB">
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">����� ���̵�</td>
			<td width=490 bgcolor="ffffff" style="padding-left:10">
				<%=user.getUserId() %>
			</td>
		  </tr>
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">��й�ȣ</td>
			<td width=490 bgcolor="ffffff" style="padding-left:10">
				<input type="password" style="width:150" name="password" value="<%=user.getPassword()%>">
			</td>
		  </tr>
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">��й�ȣ Ȯ��</td>
			<td width=490 bgcolor="ffffff" style="padding-left:10">
				<input type="password" style="width:150" name="password2" value="<%=user.getPassword()%>">
			</td>
		  </tr>
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">�̸�</td>
			<td width=490 bgcolor="ffffff" style="padding-left:10">
				<input type="text" style="width:240" name="name" value="<%=user.getName()%>">
			</td>
		  </tr>
		  <tr>
			<td width=100 align=center bgcolor="E6ECDE" height="22">�̸��� �ּ�</td>
			<td width=490 bgcolor="ffffff" style="padding-left:10">
				<input type="text" style="width:240" name="email" value="<%=user.getEmail() %>">
			</td>
		  </tr>		  
	  </table>
	  </form>
	  <br>
	  
	  <table width=590 border=0 cellpadding=0 cellspacing=0>
		  <tr>
			<td align=center>
			<input type="button" value="����" onClick="userModify()"> &nbsp;
			<input type="button" value="���" onClick="userList()">
			</td>
		  </tr>
	  </table>

	  </td>
	</tr>
</table>  

</body>
</html>