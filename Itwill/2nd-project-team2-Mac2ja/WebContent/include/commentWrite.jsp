<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String checkIdCh="";
	if(session.getAttribute("members_email")!=null){
		checkIdCh = (String)session.getAttribute("members_email");
	}
%>
<script type="text/javascript">
	function confirmCh() {
		var checkId = document.getElementById("memberId").value;
		if(checkId==""){
			alert("로그인 해주세요.");
		}else{
			document.comWrtie.submit();
		}
	}
</script>
<body style="">
	<form action="commentWriteAction.jsp" method="POST" name="comWrtie">
	<input type="hidden" name="food_no" value="310"/>
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
																		required="" fld_esssential="" readonly="readonly"  label="작성자" value="<%=checkIdCh%>">
																</div>
															</td>
														</tr>
														<tr>
															<td colspan="2" height="1" bgcolor="#DEDEDE"
																style="padding: 0px;"></td>
														</tr>
														<tr>
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
						<img src="./res/btn_confirm.gif" onClick="confirmCh()">&nbsp; 
						<img src="./res/btn_order_back.gif" onclick="history.back()" style="cursor: pointer; vertical-align: bottom; height: 55;">
					</div>
					</td>
				</tr>
			</tbody>
			
		</table>
	</form>
</body>
</html>