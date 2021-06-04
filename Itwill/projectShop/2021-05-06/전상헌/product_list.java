package com.itwill.shop.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product_list.do")
public class product_list extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDao productDao=new ProductDao();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out =response.getWriter();
		out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
		out.println("<html>");		
		out.println("<head>");		
		out.println("<title>쇼핑몰</title>");		
		out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");		
		out.println("<link rel=stylesheet href=\"css/styles.css\" type=\"text/css\">");		
		out.println("<link rel=stylesheet href=\"css/shop.css\" type=\"text/css\">");		
		
		out.println("</head>");		
		out.println("<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0\r\n"
				+ "	marginwidth=0 marginheight=0>");		
		out.println("<div id=\"container\">");		
		out.println("<div id=\"header\">");		
		out.println("<h1>");		
		out.println("<a href=\"\">WEB SAMPLE SITE</a>");		
		out.println("</h1>");		
		out.println("	</div>");		
		out.println("<div id=\"navigation\">");		
		out.println("<p>");		
		out.println("<strong>메 뉴</strong>");		
		out.println("</p>");		
		out.println("<ul>");		
		out.println("<li><a href=\"user_login_form.jsp\">로그인</a></li>");		
		out.println("<li><a href=\"user_write_form.jsp\">회원가입</a></li>");		
		out.println("<li><a href=\"\"></a></li>");		
		out.println("<li><a href=\"javascript:login_message();\">장바구니</a></li>");		
		out.println("<li><a href=\"product_list.jsp\">상품리스트</a></li>");		
		out.println("<li><a href=\"\"></a></li>");		
		out.println("<li><a href=\"board_list.jsp\">게시판리스트</a></li>");		
		out.println("<li><a href=\"board_write_form.jsp\">게시판쓰기</a></li>");		
		out.println("</ul>");		
		out.println("</div>");		
		out.println("<div id=\"wrapper\">");		
		out.println("	<div id=\"content\">");		
		out.println("	<table border=0 cellpadding=0 cellspacing=0>");		
		out.println("<tr>");		
		out.println("	<td><br />");		
		out.println("<table style=\"padding-left: 10px\" border=0 cellpadding=0\r\n"
				+ "								cellspacing=0>");		
		out.println("	<tr>");		
		out.println("<td bgcolor=\"f4f4f4\" height=\"22\">&nbsp;&nbsp;<b>쇼핑몰 -\r\n"
				+ "											상품리스트</b></td>");		
		out.println("	</tr>");		
		out.println("</table>");		
		out.println("	<form name=\"f\" method=\"post\">");		
		out.println("<table width=\"100%\" align=\"center\" border=\"1\" cellspacing=\"0\"\r\n"
				+ "									cellpadding=\"3\" bordercolordark=\"white\"\r\n"
				+ "									bordercolorlight=\"#556b2f\">");		
		out.println("<tr>");		
		try {
			ArrayList<Product> productList=productDao.productSelectMany();
			System.out.println(productList);
			for (Product product : productList) {
				
						out.println("<td align=\"center\" width=\"25%\"><a\r\n href=\"product_detail.jsp?p_no=1\">");
						out.println( "<img\r\n src=\"image/bigle.gif\" border=\"0\"></a>");
						out.println("<br /> <br /> ");
						out.println("<b>");
						out.println(product.getP_name()+"</b><br>\r\n");
						out.println("<font color=\"#FF0000\">가격:"+product.getP_price()+ "</font></td>");		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.println("</tr>");		
		out.println("</table>");		
		out.println("</form> <br /></td>");		
		out.println("</tr>");		
		out.println("</table>");		
		out.println("</div>");		
		out.println("</div>");		
		out.println("	<div id=\"footer\">");		
		out.println("<p align=\"center\">Copyright (&copy;) By Java Class 5. All\r\n rights reserved.</p>");		
		out.println("</div>");		
		out.println("	</div>");		
		out.println("</body>");		
		out.println("</html>");		
		
		
		
		
		
		
		
		
		
		
	}

}
