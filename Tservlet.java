import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/simple")
public class Tservlet extends HttpServlet{
        public void doGet(HttpServletRequest req, HttpServletResponse res){
                try{
					PrintWriter out = res.getWriter();
					out.println("Hello Servlet");
					out.close();
                }catch(Exception ex){}
        }
}