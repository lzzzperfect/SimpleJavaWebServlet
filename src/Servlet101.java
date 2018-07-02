import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Created by liuzhengping on 2018/6/28.
 */
public class Servlet101 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //
        int id=Integer.parseInt(request.getParameter("id"));
        String firstName=request.getParameter("firstname");

        //
        PrintWriter out = response.getWriter();
        out.println("The new one added is: id:"+id+", First Name: "+firstName);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        FirstExample firstExample=new FirstExample();
        try {
            firstExample.test();
        } catch (SQLException e) {
            System.out.println("sql error");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("class error");
            e.printStackTrace();
        }
        //check it out on http://localhost:8080/Servlet101
        PrintWriter out =response.getWriter();
        out.println("<html>");
        out.println("<head><title>Servlet Showcase</title></head>");
        out.println("<body>All the student info are displayed in Output" + "<br/> 666 " +"</body>");
        out.println("</html>");


    }
}
