<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예매취소 페이지</title>
<link href="stylesheets/twitter-bootstrap-3b3dd3a/docs/assets/css/bootstrap.css" rel="stylesheet">
<link href="stylesheets/Mainpage_Layout.css" rel="stylesheet" type="text/css">
<link href="stylesheets/reservation/unreserve.css" rel="stylesheet" type="text/css">
<script src="stylesheets/twitter-bootstrap-3b3dd3a/docs/assets/js/bootstrap.js"></script>
</head>

<body>
	<div id="wrap">
		<jsp:include page="share/header.jsp"></jsp:include>	
	
		<!--전체 크기 -->
		<div class="navbar">
			<div class="navbar-inner">
				<div class="container">
					<ul class="nav">
						<li><a href="ConcertManageController?action=index">공연</a></li>
						<li><a href="ReservationManageController?action=index">예약 </a></li>
						<li><a href="ReviewManageController?action=index">리뷰</a></li>
						<li><a href="membership.jsp">멤버십</a></li>
					</ul>
				</div>
			</div>
		</div>
		
		<div id="content">
			<!-- 실직적으로 보여질 정보들-->
			<div class="section_1" id="reserve_detail">
				<!--예매상세내역-->
				<ul>
					<li>
						<h2>예매 내역</h2>
						<table border="1">
							<tr>
								<th width="150">예약 공연명</th>
								<td colspan="3" width="460">삼봉이발소</td>
							</tr>
							<tr>
								<th>공연일</th>
								<td>2012.10.31 (수)</td>
								<th>공연시간</th>
								<td>16:00</td>
							</tr>
							<tr>
								<th>공연장소</th>
								<td>명지시네마</td>
								<th>예매수량</th>
								<td>1매</td>
							</tr>
							<tr>
								<th>예매일시</th>
								<td>2012.10.03 20:12</td>
								<th>상태</th>
								<td>주문완료</td>
							</tr>
							<tr>
								<th>티켓수령</th>
								<td colspan="3">현장수령 방식</td>
							</tr>
							<tr>
								<th>결제금액</th>
								<td colspan="3">15,000원 (입금완료)</td>
							</tr>
						</table>
					</li>
					<li>
						<h2>결제 내역</h2>
						<table border="1">
							<tr>
								<th width="420">무통장 계좌정보</th>
								<th width="100">입금날짜</th>
								<th width="100">금액</th>
							</tr>
							<tr>
								<td>입금은행 : 농협중앙회 103-1186242-9512 입금자 : 홍길동</td>
								<td>2012.10.3</td>
								<td>15,000원</td>
							</tr>
						</table>
					</li>
					<li>
						<h2>예매취소</h2>
						<table border="1">
							<tr>
								<th width="120">예매 날짜</th>
								<th width="120">공연 일</th>
								<th width="200">공연제목</th>
								<th width="100">금액</th>
								<th width="80">예약취소</th>
							</tr>
							<tr>
								<td>2012.10.03 20:12</td>
								<td>2012.10.18 16:00</td>
								<td>삼봉이발소</td>
								<td>15,000원</td>
								<td><button>취소</button></td>
							</tr>
						</table>
					</li>
				</ul>
			</div>

			<div class="section_1" id="reserve_note">
				<!--예매상세내역-->
				<ul>
					<hr />
					<li>예매내용, 결제 변경안내</li> 동일 상품에 대해서 날짜, 시간, 좌석, 가격등급, 결제 등의 일부 변경을
					원하시는 경우 기존예매건을 취소하시고 재예매하셔야 합니다. 단, 할인은 재예매 시점을 기준으로 적용됩니다.
					<br />

					<li>환불 안내</li> 예매 취소시에 환불 계좌번호를 남기고, 그 계좌를 통해 취소수수료 및 이체수수료를 제외한
					금액을 환불받습니다. 취소 후 고객님의 계좌로 입금까지 약 5-7일 정도가 소요됩니다. (주말 제외) 환불은 반드시
					예매자 본인 명의의 계좌로만 받으실 수 있습니다. 단, 예매자 본인 명의의 계좌가 없을 경우에는 직계 가족 명의의 계좌에
					한하여 가능하며, 이 경우 관계를 증명할 수 있는 증빙서류를 팩스나 우편 등으로 코코엔터테인먼트 공연기획본부로 보내주셔야
					합니다.
				</ul>
			</div>
		</div>

		<jsp:include page="share/footer.jsp"></jsp:include>
	</div>
</body>
</html>