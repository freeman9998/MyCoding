<%@page import="com.itwill.board.BoardManager"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
    boolean result = (boolean)request.getAttribute("result");
%>
<script type="text/javascript">
<%if(result){%>
	alert('�����Ϸ�');
	location.href = 'list.do';
 <%} else{%>
	alert('��������');
	location.href = 'list.do';
<%}%>
</script>
