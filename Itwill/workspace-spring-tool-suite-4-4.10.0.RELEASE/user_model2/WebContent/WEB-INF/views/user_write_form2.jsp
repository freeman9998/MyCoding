<%@page import="com.itwill.user.User"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	User fuser=(User)request.getAttribute("fuser");
	if(fuser==null){
		fuser = new User("","","","");
	}
	String MSG=(String)request.getAttribute("MSG");
	if(MSG==null){
		MSG="";
	}
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>����� ����</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel=stylesheet href="css/styles.css" type="text/css">
<link rel=stylesheet href="css/user.css" type="text/css">
<style type="text/css" media="screen">
</style>
<script type="text/javascript">
	function userCreate() {
		if (document.f.userId.value == "") {
			alert("����� ���̵� �Է��Ͻʽÿ�.");
			f.userId.focus();
			return false;
		}
		if (document.f.password.value == "") {
			alert("��й�ȣ�� �Է��Ͻʽÿ�.");
			f.password.focus();
			return false;
		}
		if (document.f.password2.value == "") {
			alert("��й�ȣȮ���� �Է��Ͻʽÿ�.");
			f.password2.focus();
			return false;
		}
		if (document.f.name.value == "") {
			alert("�̸��� �Է��Ͻʽÿ�.");
			f.name.focus();
			return false;
		}
		if (document.f.email.value == "") {
			alert("�̸��� �ּҸ� �Է��Ͻʽÿ�.");
			f.email.focus();
			return false;
		}
		if (f.password.value != f.password2.value) {
			alert("��й�ȣ�� ��й�ȣȮ���� ��ġ�Ͽ����մϴ�.");
			f.password.focus();
			f.password.select();
			return false;
		}
		if (document.f.idDuplication.value!='idCheck') {
			alert("���̵��ߺ�üũ�� �Ͽ����մϴ�.");
			document.f.userId.focus();
			document.f.userId.select();
			
			return false;
		}
		document.f.action = "user_write_action.jsp";
		document.f.method='POST';
		document.f.submit();
	}

	
	function userList() {
		f.action = "user_list.jsp";
		f.submit();
	}
	
	// ���̵� �ߺ�üũ ȭ��open
	function openIdChk(){
		/*
		if (document.f.userId.value == "") {
			alert("���̵� �Է��Ͻʽÿ�.");
			document.f.userId.focus();
			return false;
		}
		*/
		var param="?userId="+document.f.userId.value;
		window.name = "parentForm";
		window.open("user_id_check_form.jsp"+param,
				"chkForm", "width=500,height=300,resizable = no,scrollbars = no");	
	}

	// ���̵� �Է�â�� �� �Է½� hidden�� idUncheck�� �����Ѵ�.
	// �̷��� �ϴ� ������ �ߺ�üũ �� �ٽ� ���̵� â�� ���ο� ���̵� �Է����� ��
	// �ٽ� �ߺ�üũ�� �ϵ��� �Ѵ�.
	function inputIdChk(){
		document.userInfo.idDuplication.value ="idUncheck";
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
									<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp;<b>����� ����
											- ȸ�� ����</b></td>
								</tr>
							</table> <!-- write Form  -->
							<form name="f" method="post">
								<table border="0" cellpadding="0" cellspacing="1" width="590"
									bgcolor="BBBBBB">
									<tr>
										<td width=100 align=center bgcolor="E6ECDE" height="22">�����
											���̵�</td>
										<td width=490 bgcolor="ffffff" style="padding-left: 10px" align="left">
											<input type="text" readonly="readonly" style="width: 150px" name="userId"  value="<%=fuser.getUserId()%>">&nbsp;&nbsp;
											<input type="button" value="���̵��ߺ��˻�" onclick="openIdChk();">
											<input type="hidden" name="idDuplication" value="idUncheck" >
											<font color="red"><%=MSG%></font>
										</td>
									</tr>
									<tr>
										<td width=100 align=center bgcolor="E6ECDE" height="22">��й�ȣ</td>
										<td width=490 bgcolor="ffffff" style="padding-left: 10px" align="left">
											<input type="password" style="width: 150px" name="password"
											value="<%=fuser.getPassword()%>">
										</td>
									</tr>
									<tr>
										<td width=100 align=center bgcolor="E6ECDE" height="22">��й�ȣ
											Ȯ��</td>
										<td width=490 bgcolor="ffffff" style="padding-left: 10px" align="left">
											<input type="password" style="width: 150px" name="password2"
											value="<%=fuser.getPassword()%>">
										</td>
									</tr>
									<tr>
										<td width=100 align=center bgcolor="E6ECDE" height="22">�̸�</td>
										<td width=490 bgcolor="ffffff" style="padding-left: 10px" align="left">
											<input type="text" style="width: 150px" name="name"
											value="<%=fuser.getName()%>">
										</td>
									</tr>
									<tr>
										<td width=100 align=center bgcolor="E6ECDE" height="22">�̸���
											�ּ�</td>
										<td width=490 bgcolor="ffffff" style="padding-left: 10px" align="left">
											<input type="text" style="width: 150px" name="email"
											value="<%=fuser.getEmail()%>">
										</td>
									</tr>
								</table>
							</form> <br />

							<table border=0 cellpadding=0 cellspacing=1>
								<tr>
									<td align=center><input type="button" value="ȸ�� ����"
										onClick="userCreate()"> &nbsp; <input type="button"
										value="���" onClick="userList()"></td>
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