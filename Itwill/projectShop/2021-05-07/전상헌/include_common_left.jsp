<%@page import="com.itwill.shop.user.User"%>
<%@page import="com.itwill.shop.user.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
	String loginUser=(String)session.getAttribute("loginUser");
	UserService userService=new UserService();
	User user=userService.selectOneUser(loginUser);
	
	
	%>
<script type="text/javascript">
	function login_message() {
		alert('로그인하세요');
		location.href = 'user_login_form.jsp';
	}
</script>
<p>
	<strong>메 뉴</strong>
</p>
<ul>
	<%if(loginUser==null){ %>
	<li><a href="user_write_form.jsp">회원가입</a></li>
	<li><a href="user_login_form.jsp">로그인</a></li>
	<%}else{ %>
	<li><a href="user_view.jsp"><%=loginUser %>님</a>&nbsp;<a href="user_logout_action.jsp">로그아웃</a></li>
	<%} %>
	<li><a href="shop_product_list.jsp">쇼핑몰</a></li>
	<li><a href="shop_jumun_list.jsp">주문목록</a></li>
	<li><a href="shop_view_cart.jsp">장바구니</a></li>
	<li><a href="guest_list.jsp">방명록리스트</a></li>
	<li><a href="board_write_form.jsp">방명록쓰기</a></li>
</ul>
