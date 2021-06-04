<%@page import="com.itwill.board.BoardManager"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
    boolean result = (boolean)request.getAttribute("result");
%>
<script type="text/javascript">
<%if(result){%>
	alert('삭제완료');
	location.href = 'list.do';
 <%} else{%>
	alert('삭제실패');
	location.href = 'list.do';
<%}%>
</script>
