import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by liuzhengping on 2018/6/28.
 */
public class Servlet101 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("The Parameter are :"+request.getParameter("id"));
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //check it out on http://localhost:8080/Servlet101
        PrintWriter out =response.getWriter();
        out.println("<html>");
        out.println("<head><title>Servlet展示页</title></head>");
        out.println("<body>name:" + "<br/> sex: " +"</body>");
        out.println("</html>");
    }
}
