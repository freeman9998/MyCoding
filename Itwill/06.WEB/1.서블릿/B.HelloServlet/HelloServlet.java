import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;


//#1. javax.servlet.http.HttpServlet Ŭ������ ��� �޾ƾ��Ѵ�.
public class HelloServlet extends HttpServlet{
	
	//#2. HttpServlet service �޽�带 �������̵� �ؾ��Ѵ�.
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		//#2-1.  Ŭ���̾�Ʈ�� ������ ����Ÿ�� Ÿ��(����)���� 		
		response.setContentType("text/html;charset=euc-kr");

		//#2-2.  Ŭ���̾�Ʈ������Ÿ�� �����ϱ����� ��½�Ʈ�� ����
		PrintWriter out = response.getWriter();

		//#2-3. Ŭ���̾�Ʈ�� ����Ÿ(HTML) ����
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello Servlet!!!!</h1>");
		out.println("</body>");
		out.println("</html>");
}
}
