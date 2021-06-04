<%@page import="java.net.URLEncoder"%>
<%@page import="com.itwill.shop.service.AddressService"%>
<%@page import="com.itwill.shop.domain.exception.ExistedAddressException"%>
<%@page import="com.itwill.shop.domain.Address"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("addressWriteForm.jsp");
		return;
	}
	Address newAddress=null;
	try{
		request.setCharacterEncoding("UTF-8");	
		int no=0;
		String name=request.getParameter("address_name");
		String detail=request.getParameter("address_detail");
		String type=request.getParameter("address_type");
		String mNo=request.getParameter("members_no");
		Address address=new Address(0,name,detail,Integer.parseInt(type),Integer.parseInt(mNo));
		AddressService addressService=new AddressService();
		int rowCount=addressService.insertAddress(address);
		response.sendRedirect("memberAddressForm.jsp");
	}catch(ExistedAddressException e){
		response.sendRedirect("memberAddressForm.jsp?msg="+URLEncoder.encode(e.getMessage(),"UTF-8"));
		
	}catch(Exception e){
    	//알수없는예외
    	e.printStackTrace();
    	response.sendRedirect("addressError.jsp");
    }
%>