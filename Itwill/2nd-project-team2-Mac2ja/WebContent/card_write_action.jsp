<%@page import="java.net.URLEncoder"%>
<%@page import="com.itwill.shop.service.CardService"%>
<%@page import="com.itwill.shop.domain.exception.ExistedCardException"%>
<%@page import="com.itwill.shop.domain.Card"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("card_Write_Form.jsp");
		return;
	}
	Card newCard=null;
	try{
		request.setCharacterEncoding("UTF-8");	
		int no=0;
		String number=request.getParameter("card_no");
		String name=request.getParameter("card_name");
		String type=request.getParameter("card_type");
		String mNo=request.getParameter("members_no");
		System.out.println(number+""+name+""+type+""+mNo);
		Card card=new Card(0,number,name,Integer.parseInt(type) ,Integer.parseInt(mNo));
		CardService cardService=new CardService();
		int rowCount=cardService.createCard(card);
		response.sendRedirect("memberCardForm.jsp");
	}catch(ExistedCardException e){
		response.sendRedirect("memberCardForm.jsp?msg="+URLEncoder.encode(e.getMessage(),"UTF-8"));
		
	}catch(Exception e){
    	//알수없는예외
    	e.printStackTrace();
    	response.sendRedirect("cardError.jsp");
    }
%>
	