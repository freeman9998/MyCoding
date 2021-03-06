<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>관리자 페이지</title>
<link
	href="stylesheets/twitter-bootstrap-3b3dd3a/docs/assets/css/bootstrap.css"
	rel="stylesheet">
<link href="stylesheets/Mainpage_Layout.css" rel="stylesheet"
	type="text/css">
<link href="stylesheets/admin/admin_status.css" rel="stylesheet"
	type="text/css">
<script
	src="stylesheets/twitter-bootstrap-3b3dd3a/docs/assets/js/bootstrap.js"></script>
</head>

<body>
	<div id="wrap">
		<jsp:include page="share/header.jsp"></jsp:include>

		<!--전체 크기 -->
		<div class="navbar">
			<div class="navbar-inner">
				<div class="container">
					<ul class="nav">
						<li class="active"><a
							href="AdminManageController?action=status">사용현황</a></li>
						<li><a href="AdminManageController?action=reserve">예매/취소율
						</a></li>
						<li><a href="AdminManageController?action=master">권한 관리</a></li>
						<li><a href="ConcertManageController?action=register">공연추가
								/ 수정</a></li>
						<li></li>
					</ul>
				</div>
			</div>
		</div>
		<div id="content">
			<!-- 실직적으로 보여질 정보들-->
			<div class="section_1" id="status">
				<table class="sheet" border="1">
					<tbody>
						<tr>
							<td colspan="6" class="data">2012. 00. 00 (월)</td>
						</tr>
						<tr>
							<td class="number">접속 00명 &nbsp; 신규리뷰 00명</td>
						</tr>
						<tr>
							<td class="number">로그인 00명 &nbsp; 1:1문의 00명</td>
						</tr>
						<tr>
							<td class="number">신규회원 00명 &nbsp; 전문가 리뷰 00명</td>
						<tr>
							<td class="number">공연예매 00명</td>
						</tr>

					</tbody>
				</table>
			</div>

		</div>

		<jsp:include page="share/footer.jsp"></jsp:include>
	</div>

</body>
</html>