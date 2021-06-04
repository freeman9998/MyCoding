import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;


//#1. javax.servlet.http.HttpServlet 클래스를 상속 받아야한다.
public class HelloServlet extends HttpServlet{
	
	//#2. HttpServlet service 메쏘드를 오버라이딩 해야한다.
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		//#2-1.  클라이언트에 전송할 데이타의 타입(종류)설정 		
		response.setContentType("text/html;charset=euc-kr");

		//#2-2.  클라이언트에데이타를 전송하기위한 출력스트림 생성
		PrintWriter out = response.getWriter();

		//#2-3. 클라이언트로 데이타(HTML) 전송
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello Servlet!!!!</h1>");
		out.println("</body>");
		out.println("</html>");
}
}
