<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.domain.Card" %>
<%@page import="com.itwill.shop.service.CardService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko">
<%@ include file="../include/head.jsp"%>
<%@ include file="login_check.jspf" %>

<%

	CardService cardService = new CardService();
	List<Card> cardList=cardService.findCardByMembersNo((int)session.getAttribute("members_no"));
%>
<style type="text/css">
div.passwordStrenth {
	background-color: #FFFFFF;
	border: 1px #CCCCCC solid;
	padding: 10px;
	width: 263px;
	display: none;
	position: absolute;
}

div.passwordStrenth p {
	margin: 0;
	padding: 5px 0 0 0;
	font-size: 11px;
	font-family: dotum;
	color: #616161;
}

div.passwordStrenth dl {
	margin: 0;
	padding: 0 6px 0 0;
	color: #373737;
	font-weight: bold;
	font-size: 11px;
	font-family: dotum;
}

div.passwordStrenth dl dt, div.passwordStrenth dl dd {
	display: inline;
	font-size: 11px;
	font-family: dotum;
	margin: 0;
	height: 15px;
	line-height: 15px;
}

div.passwordStrenth dl dt {
	color: #363636;
	font-weight: bold;
	width: 95px;
}

div.passwordStrenth dl dd {
	text-indent: 0px;
	font-size: 12px;
	width: 110px;
	background: url('/shop/data/skin/mera_ws/img/common/password_level.gif')
		no-repeat top left;
}

div.passwordStrenth dl dd.lv0 {
	color: #F52D00;
	background-position: 20px 0;
}

div.passwordStrenth dl dd.lv1 {
	color: #F52D00;
	background-position: 20px -29px;
}

div.passwordStrenth dl dd.lv2 {
	color: #F52D00;
	background-position: 20px -44px;
}

div.passwordStrenth dl dd.lv3 {
	color: #F52D00;
	background-position: 20px -59px;
}

div.passwordStrenth dl dd.lv4 {
	color: #F52D00;
	background-position: 20px -59px;
}
</style>

			<style>
.memberCols1 {
	width: 100px;
	text-align: right;
	padding-right: 10px;
	font: bold 8pt 돋움;
	color: #5D5D5D;
	letter-spacing: -1px;
}

.memberCols2 {
	text-align: left;
	padding-left: 10px;
}

.memberCols3 {
	width: 95px;
	font: 8pt 돋움;
	color: #5D5D5D;
	letter-spacing: -1px;
}

.scroll {
	scrollbar-face-color: #FFFFFF;
	scrollbar-shadow-color: #AFAFAF;
	scrollbar-highlight-color: #AFAFAF;
	scrollbar-3dlight-color: #FFFFFF;
	scrollbar-darkshadow-color: #FFFFFF;
	scrollbar-track-color: #F7F7F7;
	scrollbar-arrow-color: #838383;
}

#boxScroll {
	width: 96%;
	height: 130px;
	overflow: auto;
	background-color: #ffffff;
	color: #585858;
	font: 9pt 돋움;
	border: 1px #dddddd solid;
	overflow-x: hidden;
	text-align: left;
	margin: auto;
}

#pwdManual {
	border: 2px solid #BFBFBF;
	display: none;
	position: absolute;
	width: 410px;
	background: #ffffff;
	margin-top: 10px;
}

#pwdManual p {
	background: #F1F1F1
		url('/shop/data/skin/mera_ws/img/common/blt_tip_gr.gif') no-repeat
		10px center;
	margin: 0;
	padding: 12px 10px 12px 50px;
	color: #373737;
	font-weight: bold;
}

#pwdManual p.close {
	background: none;
	padding: 0px 10px 5px 0;
	margin: 0;
	text-align: right;
}

#pwdManual ul {
	list-style: none;
	margin: 0;
	padding: 15px;
}

#pwdManual ul li {
	color: #6E6E6E;
	font-size: 11px;
	line-height: 17px;
	letter-spacing: -1px;
}

#ipinManual {
	border: 2px solid #BFBFBF;
	display: none;
	position: absolute;
	width: 560px;
	z-index: 999;
}

#ipinManual .ipinmTop {
	background-color: #F1F1F1;
	color: #373737;
	font-weight: bold;
	padding: 7px;
}

#ipinManual .ipinmBottom {
	background-color: #FFFFFF;
	padding: 10px 0px;
}

#ipinManual .ipinmBottom .ipinmbText {
	color: #6E6E6E;
	font-size: 11px;
	line-height: 17px;
	margin-left: 20px;
}

#ipinManual .ipinmBottom .ipinmbText a {
	color: #6E6E6E;
	font-size: 11px;
	font-weight: bold;
	line-height: 17px;
}

#ipinManual .ipinmBottom .ipinmbDotted {
	border-top: 1px dotted #C0C0C0;
	margin: 10px 20px;
}

#ipinManual .ipinmBottom .ipinmbSolid {
	border-top: 1px solid #C0C0C0;
	margin: 10px 20px;
}

#ipinManual .ipinmBottom .ipinmbTerm {
	margin: 10px 20px;
}

#ipinManual .ipinmBottom .ipinmbButton {
	margin: 15px 10px 5px 10px;
	text-align: center;
}

#form * {
	/*font-family: 'Spoqa Han Sans';*/
	
}

.h4 {
	font-weight: bold;
}

.h4 span {
	font-weight: normal;
	color: #777 !important;
}

.star {
	color: #777 !important;
}

table.intable th {
	color: #777;
}

input[type=text] {
	border-color: #d5d4d3 !important;
}
</style>
<body style="">
	<%@ include file="../include/MyPagetop.jsp"%>
	<div id="content">
		<!-- 상단이미지 || 현재위치 -->
		<div class="atit">
			<p>카드관리</p>
			<span class="path"><img src="./res/ico_home.gif" alt="HOME"
				style="cursor: pointer;"> <b>카드관리</b></span>
		</div>
<%for(Card card:cardList){ %>
	
				<div style="height: 30px"></div>
				<div
					style="border-bottom: 1px solid #ccc; padding-bottom: 65px; margin-bottom: 40px;">
					<p class="h4">
						카드정보확인 
					</p>

					<table width="20%" cellpadding="0" cellspacing="0" border="0"
						class="intable">
						<tbody>
							<tr>
								<th
									style="padding-left: 20px; color: #717071; font-weight: bold;">카드번호
									<em class="star">*</em>
								</th>
								<!--(카드번호를 불러온다)-->
								<td width=145 height=26 align=center class=t1><%=card.getCard_number()%></td>

							</tr>
							<tr>
								<th
									style="padding-left: 20px; color: #717071; font-weight: bold;">카드명 
									<em class="star">*</em>
								</th>
								<!--(카드명을 불러온다)-->

								<td width=145 height=26 align=center class=t1><%=card.getCard_name()%></td>

							</tr>
							
							
							
							
						</tbody>
					</table>

				</div>
<%} %>
				<div id="avoidDbl"
					style="padding: 70px 0 100px 0; border-top: 1px solid #ccc; margin-top: 70px; text-align: center;">
					<input type="button" onclick="location.href='card_Write_Form.jsp'"
						style="width: 230px; background: #344336; color: #fff; display: inline-block; line-height: 65px; text-align: center; font-size: 20px; margin-right: 10px; cursor: pointer;"
						value="카드추가"> <input type="button" border="0"
						onclick="history.back()"
						style="width: 230px; background: #344336; color: #fff; display: inline-block; line-height: 65px; text-align: center; font-size: 20px; cursor: pointer;"
						value="이전으로">
				</div>
			</form>
		</div>
		<!-- End indiv -->
	</div>
	<%@ include file="../include/bottom.jsp"%>
</body>
</html>