<%@page import="com.itwill.board.Board"%>
<%@page import="com.itwill.board.BoardManager"%>
<%@page contentType="text/html; charset=euc-kr"%>
<%
	//Board board = (Board)request.getAttribute("board");
   System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
%>

<html>
<head>
<title>�Խù� ���뺸��</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel=stylesheet href="./css/board.css" type="text/css">
<script language="JavaScript">
	function boardCreate() {
		f.action = "board_write.jsp";
		f.submit();
	}
	function boardReplyCreate() {
		f.action = "modify_form.do?result=2";
		f.submit();
	}
	function boardUpdate() {
		f.action = "modify_form.do?result=1";
		f.submit();
	}
	function boardRemove() {
		if (confirm("���� �����Ͻðڽ��ϱ�?")) {
			f.action = "remove.do";
			f.submit();
		}
	}
	function boardList() {
		f.action = "list.do?pageno="+${pageno};
		f.submit();
	}
</script>
</head>
<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0
	marginwidth=0 marginheight=0>
	<br>
	<table width=780 border=0 cellpadding=0 cellspacing=0>
		<tr>
			<td width="20"></td>
			<td>
				<!--contents-->
				<table width=590 border=0 cellpadding=0 cellspacing=0>
					<tr>
						<td bgcolor="f4f4f4" height="22">&nbsp;&nbsp; <b> �Խù�
								���뺸�� </b>
						</td>
					</tr>
				</table> <br> <!-- view Form  -->
				<form name="f" method="post">
					<input type="hidden" name="boardno" value="${boardno}">
					<input type="hidden" name="pageno" value="${pageno}">
					<table border="0" cellpadding="0" cellspacing="1" width="590"
						bgcolor="BBBBBB">
						<tr>
							<td width=100 align=center bgcolor="E6ECDE" height="22">�۾���</td>
							<td width=490 bgcolor="ffffff" style="padding-left: 10">${board.writer}</td>
						</tr>

						<tr>
							<td width=100 align=center bgcolor="E6ECDE" height="22">����</td>
							<td width=490 bgcolor="ffffff" style="padding-left: 10">${board.title}</td>
						</tr>
						<tr>
							<td width=100 align=center bgcolor="E6ECDE" height="22">����</td>
							<td width=490 bgcolor="ffffff" style="padding-left: 10">${board.content}</td>
						</tr>
						
					</table>
					
				</form> <br>
				<table width=590 border=0 cellpadding=0 cellspacing=0>
					<tr>
						<td align=center>
						<input type="button" value="�۾���"
							onClick="boardCreate()"> &nbsp;
							<input type="button" value="��۾���"
							onClick="boardReplyCreate()"> &nbsp;
							 
						<input type="button" value="����"
							onClick="boardUpdate()"> &nbsp; 
							<input type="button"
							value="����" onClick="boardRemove()"> &nbsp; <input
							type="button" value="����Ʈ" onClick="boardList()"></td>
					</tr>
				</table>

			</td>
		</tr>
	</table>
</body>
</html>