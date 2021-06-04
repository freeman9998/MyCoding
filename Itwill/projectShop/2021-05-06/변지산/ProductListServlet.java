package com.itwill.shop.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductDao;

/**
 * Servlet implementation class ProductList
 */
@WebServlet("/productList.do")
public class ProductListServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		ProductDao productDao = new ProductDao();
		out.print("<head>");
		out.print("<title>쇼핑몰</title>");
		out.print("<link rel=stylesheet href=\"css/styles.css\" type=\"text/css\">");
		out.print("<link rel=stylesheet href=\"css/shop.css\" type=\"text/css\">");
		out.print("<style type=\"text/css\" media=\"screen\"></style>");
		out.print("</head>");
		out.print("<body bgcolor=#FFFFFF text=#000000 leftmargin=0 topmargin=0\r\n marginwidth=0 marginheight=0 >");
		out.print("<div id=\"container\">");
		out.print("<div id=\"header\">");
		out.print("<h1>");
		out.print("<a href=\"\">WEB SAMPLE SITE</a>");
		out.print("</h1>");
		out.print("</div>");
		out.print("<div id=\"navigation\">");
		out.print("<script type=\"text/javascript\">");
		out.print("	function login_message() {\r\n");
		out.print( "		alert('로그인하세요');");
		out.print( "		location.href = 'user_login_form.jsp';");
		out.print("</script>");
		out.print("<p>");
		out.print("<strong>메 뉴</strong>");
		out.print("</p>");
		out.print("<ul>");
		out.print("<li><a href=\"user_login_form.jsp\">로그인</a></li>");
		out.print("<li><a href=\"user_write_form.jsp\">회원가입</a></li>");
		out.print("<li><a href=\"\"></a></li>");
		out.print("<li><a href=\"javascript:login_message();\">장바구니</a></li>");
		out.print("<li><a href=\"product_list.jsp\">상품리스트</a></li>");				
		out.print("<li><a href=\"\"></a></li>");
		out.print("<li><a href=\"board_list.jsp\">게시판리스트</a></li>");
		out.print("<li><a href=\"board_write_form.jsp\">게시판쓰기</a></li>");
		out.print("</ul>");
		out.print("</div>");
		out.print("<div id=\"wrapper\">");
		out.print("<div id=\"content\">");
		out.print("<table border=0 cellpadding=0 cellspacing=0>");
		out.print("<tr>");
		out.print("<td><br/>");
		out.print("<table style=\"padding-left: 10px\" border=0 cellpadding=0 cellspacing=0>");
		out.print("<tr>");
		out.print("<td bgcolor=\"f4f4f4\" height=\"22\">&nbsp;&nbsp;<b>쇼핑몰 - 상품리스트</b></td>");
		out.print("</tr>");
		out.print("</table>");
		out.print("<form name=\"f\" method=\"post\">");
		out.print("<table width=\"100%\" align=\"center\" border=\"1\" cellspacing=\"0\" cellpadding=\"3\" bordercolordark=\"white\" bordercolorlight=\"#556b2f\">");
		out.print("<tr>");
		try {
			ArrayList<Product> productlist = productDao.selectAllProduct();
			for(Product product : productlist) {
				out.print("<td align=\"center\" width=\"25%\">");
				out.print("<a href=\"product_detail.jsp?p_no=1\">");
				out.print("<img src='image/bigle.gif' border=\"0\"></a>");
				out.print("<br /> <br /> <b>"+product.getP_name()+"</b><br>");
				out.print("<font color=\"#FF0000\">가격:"+product.getP_price()+" </font></td>");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		out.print("</table>");
		out.print("</form> <br /></td>");
		out.print("</tr>");
		out.print("</table>");
		out.print("</div>");
		out.print("</div>");
		out.print("<div id=\"footer\">");
		out.print("<p align=\"center\">Copyright (&copy;) By Java Class 5. All rights reserved.</p>");
		out.print("</div>");
		out.print("</div>");
		out.print("<body>");
		out.print("</html>");
	}

}
