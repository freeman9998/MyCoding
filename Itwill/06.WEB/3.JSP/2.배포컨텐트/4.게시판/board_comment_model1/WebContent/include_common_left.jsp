<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<p>
	<strong>�� ��</strong>
</p>
<ul>
		<%
		String sUserId=(String)session.getAttribute("sUserId");
		if(sUserId!=null){
		%>
	    	<li><a href=""><%=sUserId%>��</a>&nbsp;<a href="user_logout_action.jsp">�α׾ƿ�</a></li>
	    <%}else{ %>
			<li><a href="user_login.jsp">�α���</a></li>
		<%} %>
		<li><a></a></li>
		<li><a href="guest_list.jsp">����</a></li>
		<li><a href="shop_product_list.jsp">���θ�</a></li>
		<li><a href="javascript:userLogin();">ȸ������</a></li>
		<li><a href="board_list.jsp">�Խ���</a></li>
</ul>
<script type="text/javascript">
	function userLogin(){
		alert('�α��� �ϼ���!!')
		location.href='user_login.jsp';
	}
</script>    

