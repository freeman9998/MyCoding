<%@page import="com.itwill.shop.domain.CommentsPageMarker"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.shop.domain.Comments"%>
<%@page import="com.itwill.shop.service.CommentsService"%>
<%@page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%
	String checkIdP="";
	if(session.getAttribute("members_email")!=null){
		checkIdP = (String)session.getAttribute("members_email");
	}
%>
<%
	String pageno=request.getParameter("pageno");
	if(pageno==null||pageno.equals("")){
		pageno="1";
	}		

	DateFormat df = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	CommentsService commentsService = new CommentsService();
	CommentsPageMarker commentsPageMarker = commentsService.pagingComments(Integer.parseInt(pageno),Integer.parseInt(request.getParameter("Food_no")));
%>

<script type="text/javascript">
	var parentPagehandle=0;
	var childPagehandle=0;
	function parentopenpage() {
		if(childPagehandle==1){
			childPagehandle=0;
		}
		if(parentPagehandle==0){
			document.getElementById("openpage").style.display="block";
			document.getElementById("comHandle").value="parent";
			parentPagehandle=1;
		}else{
			document.getElementById("openpage").style.display="none";
			parentPagehandle=0;
		}
	}
	
	function childopenpage(group_no) {
		if(parentPagehandle==1){
			parentPagehandle=0;
		}
		if(childPagehandle==0){
			document.getElementById("openpage").style.display="block";
			document.getElementById("comHandle").value="child";
			document.getElementById("comments_no").value=group_no;
			childPagehandle=1;
		}else{
			document.getElementById("openpage").style.display="none";
			childPagehandle=0;
		}
	}
	
	
	function confirm() {
		var checkId = document.getElementById("memberId").value;
		if(checkId==""){
			alert("로그인 해주세요.");
		}else{
			document.comments.submit();
		}
	}

</script>
	
<body style="">
	<div id="content">

		<style>
#pos_scroll {
	position: absolute;
	top: 315px;
}
</style>
		<!-- 상단이미지 || 현재위치 -->
		<div class="atit">
			<p>고객후기</p>
			<span class="path">
		</div>



		<div class="indiv" style="margin: 0;">
			<!-- Start indiv -->

			<form name="frmList" action="commentWriteAction.jsp" method="POST">
				<input type="hidden" name="sort" value="1"> <input
					type="hidden" name="page_num" value="10">

				

				

				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					style="clear: both;" class="listtablen">
					<tbody>
						<tr>
							<th width="100">프로필</th>
							<th>내용</th>
							<th width="80">작성자</th>
							<th width="80">작성일</th>
							<th width="80">평점</th>
							<th width="80">댓글작성</th>
						</tr>
					</tbody>
				</table>

				<!-- 게시판 표시 시작 -->
				<% 
				for (Comments comments : commentsPageMarker.commentsList) {%>
				<div>
					<table width="100%" cellpadding="0" cellspacing="0"
						style="border-top: none; cursor: pointer;" class="listtablen"
						>
						<tbody>
							<tr>
							<%if(comments.getComments_step() > 1){ %>
								<td width="50" align="center"></td>
								<td width="50" align="center"><img src="./image/comments/arrows.jpg"></td>
							<%}%>
								<td width="100" align="center" style="padding: 10px 0;">
								<a href="">
									<img src="./image/comments/comments.jpg" width="70"/></a></td>
								<td>
									<table cellpadding="0" cellspacing="0" border="0"
										style="border: none;">
										<tbody>
										
											<tr>
												<td style="padding-top: 5px; border: none; height: auto; text-align: left; color: #333;">
													<a href="">		
													<%= comments.getComments_content() %>
													</a>		
												</td>
											</tr>
											<tr>
												<td style="padding-top: 5px; padding-bottom: 5px; border: none; height: auto; text-align: left;">
													<a href="">
													</a>
												</td>
											</tr>
										
										</tbody>
									</table>
								</td>
								<td width="80" align="center"><%=comments.getComments_writer()%></td>
								<td width="80" align="center"><%=df.format(comments.getComments_date()) %></td>
								<td width="80" style="color: #744134;">
									<%
										String evalStr = "";
									switch(comments.getComments_star()) {
									case 1:
										evalStr = "★☆☆☆☆";
										break;
									case 2:
										evalStr = "★★☆☆☆";
										break;
									case 3:
										evalStr = "★★★☆☆";
										break;
									case 4:
										evalStr = "★★★★☆";
										break;
									case 5:
										evalStr = "★★★★★";
										break;
										
									}
									%>
									<%= evalStr %>
								</td>
								<td width="80" align="center"><img src="./image/comments/commentbtn.jpg" onclick="childopenpage(<%=comments.getComments_group()%>)"/></td>
							</tr>
						</tbody>
					</table>
				</div>

				<% } %>
				<!-- 게시판 표시 종료 -->
				</form>
				
			<!-- 페이징 start -->
			<div class="pagediv" style="margin-top: 20px; position: relative; text-align: center;"> 
			<%if(commentsPageMarker.pagemaker.getPrevGroupStartPage()>0){ %>
				<a href="productDetailView.jsp?pageno=1&Food_no=<%=request.getParameter("Food_no")%>" class="navi">◀◀</a>
			<%} %>
			<%if(commentsPageMarker.pagemaker.getPrevPage()>0){ %>
				<a href="productDetailView.jsp?pageno=<%=commentsPageMarker.pagemaker.getPrevPage()%>&Food_no=<%=request.getParameter("Food_no")%>" class="navi">◀</a>
			<%} %>
			
			<%
			  for (int i = commentsPageMarker.pagemaker.getBlockBegin(); i <= commentsPageMarker.pagemaker.getBlockEnd(); i++) {
				if (commentsPageMarker.pagemaker.getCurPage() == i) {
			%>
			<font color='blue'><strong><%=i%></strong></font>&nbsp;
			<%} else {%>
				<a href="productDetailView.jsp?pageno=<%=i%>&Food_no=<%=request.getParameter("Food_no")%>"><strong><%=i%></strong></a>&nbsp;
			<%}
				}%>
			
			<%if(commentsPageMarker.pagemaker.getNextGroupStartPage()< commentsPageMarker.pagemaker.getTotPage()){%>
				<a href="productDetailView.jsp?pageno=<%=commentsPageMarker.pagemaker.getNextPage()%>&Food_no=<%=request.getParameter("Food_no")%>">▶&nbsp;</a>
			<%}%>
			
			<%if(commentsPageMarker.pagemaker.getNextGroupStartPage()< commentsPageMarker.pagemaker.getTotPage()){%>
				<a href="productDetailView.jsp?pageno=<%=commentsPageMarker.pagemaker.getTotPage()%>&Food_no=<%=request.getParameter("Food_no")%>">▶▶</a>&nbsp;
			<%}%>	
			
			<img src="./res/btn_writes2.gif" style="cursor: pointer; position: absolute; top: 0; right: 0;" onclick="parentopenpage()">
			</div>
			<!-- 페이징 end -->
			
		</div>
		<!-- 댓글디자인 시작 -->
		<form name="comments" action="commentWriteAction.jsp" method="POST">
		<input type="hidden" id="comHandle" name="comHandle" value="0">
		<input type="hidden" id="comments_no" name="comments_no" value="0">
		<input type="hidden" name="food_no" value="<%=request.getParameter("Food_no")%>">
				<div style="display: none;" id="openpage">
				<table id="table_after" width="60%" cellpadding="0" cellspacing="0"
				border="0" style="margin: 0 auto">
			<tbody>
				<tr>
					<td
						style="border-style: solid; border-width: 10px; border-color: #000000"
						valign="top">


						<div
							style="margin-left: 20px; margin-right: 20px; margin-top: 10px;">

							<div
								style="border-width: 1px; border-style: solid; border-color: #DEDEDE; margin-top: 5px;"
								class="hundred">
								<table width="100%" cellpadding="0" cellspacing="0" border="0">
									<tbody>
										<tr>
											<td
												style="border-width: 3px; border-style: solid; border-color: #F3F3F3; padding: 5px 5px 5px 5px">

												<table width="100%" id="form" cellpadding="5"
													cellspacing="0" border="0" align="center">
													<colgroup>
														<col width="80">
													</colgroup>
													<tbody>
														<tr>
															<td colspan="2" height="1" bgcolor="#DEDEDE"
																style="padding: 0px;"></td>
														</tr>
														<tr>
															<td class="input_txt" align="right">평가</td>
															<td class="noline">
																<input type="radio" name="evalPoint" name="evalPoint" value="5" class="noline" checked="checked">★★★★★
																<input type="radio" name="evalPoint" value="4" class="noline">★★★★☆ 
																<input type="radio" name="evalPoint" value="3" class="noline">★★★☆☆ 
																<input type="radio" name="evalPoint" value="2" class="noline">★★☆☆☆
																<input type="radio" name="evalPoint" value="1" class="noline">★☆☆☆☆</td>
														</tr>
														<tr>
															<td colspan="2" height="1" bgcolor="#DEDEDE"
																style="padding: 0px;"></td>
														</tr>
														<tr>
															<td class="input_txt" align="right">작성자</td>
															<td>
																<div style="float: left; width: 50%;">
																<!-- readonly="readonly" -->
																	<input type="text" id="memberId" name="memberId" style="width: 100px;" 
																		required="" fld_esssential="" readonly="readonly"  label="작성자" value="<%=checkIdP%>">
																</div>
															</td>
														</tr>
														<tr>
															<td colspan="2" height="1" bgcolor="#DEDEDE"
																style="padding: 0px;"></td>
														</tr>
														<tr style="display: none;">
															<td class="input_txt" align="right">제목</td>
															<td><input type="text" id="title" name="title"
																style="width: 95%" required="" fld_esssential=""
																label="제목" value=""></td>
														</tr>
														<tr>
															<td colspan="2" height="1" bgcolor="#DEDEDE"
																style="padding: 0px;"></td>
														</tr>
														<tr>
															<td class="input_txt" align="right">내용</td>
															<td><textarea id="content" name="content"
																	style="width: 95%; height: 120px;" required=""
																	fld_esssential="" label="내용"></textarea></td>
														</tr>
														<tr>
															<td colspan="2" height="1" bgcolor="#DEDEDE"
																style="padding: 0px;"></td>
														</tr>

													</tbody>
												</table>
										</tr>
									</tbody>
								</table>
								
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td>
					<div align="center" style="padding-bottom: 210px;">
						<img src="./res/btn_confirm.gif" onClick="confirm()">&nbsp; 
						<img src="./res/btn_order_back.gif" onclick="history.back()" style="cursor: pointer; vertical-align: bottom; height: 55;">
					</div>
					</td>
				</tr>
			</tbody>
			
		</table>
	</div>
	</form>
	<!-- 댓글디자인 End -->
		<!-- End indiv -->
		<!-- 검색 : Start 
				<div
					style="border: 1px solid #ccc; text-align: center; padding: 20px 0;">
					<div></div>
					<div style="margin-top: 20px;">
						<span>검색어</span> 
						<select name="searchTitle" class="select" style="background: #fff; height: 28px; font-size: 14px;">
							<option value="title">내용</option>
							<option value="memberId">작성자</option>
						</select> 
						<input type="text" name="keyword" value=""style="width: 230px; padding-left: 10px; border: 1px solid #ccc; height: 26px; line-height: 26px;">
						<input type="image" src="./res/btn_search.gif" onclick="searchKeyword(this)" align="absmiddle">
					</div>
				</div>
		검색 : End -->
	</div>
</body>
</html>