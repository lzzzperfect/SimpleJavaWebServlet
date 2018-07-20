import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by liuzhengping on 2018/6/28.
 */
public class Servlet101 extends javax.servlet.http.HttpServlet {



    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //

        int id=Integer.parseInt(request.getParameter("id"));
        System.out.println("id is: "+id);//can't be reached
        String firstName=request.getParameter("firstname");

        AddStudent addStudent=new AddStudent();

        try {
            addStudent.add(id,firstName);
        } catch (SQLException e) {
            System.out.println("有问题");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("有问题");
            e.printStackTrace();
        }

        PrintWriter out =response.getWriter();
        out.println("<html>");
        out.println("<head><title>Servlet Showcase</title></head>");
        out.println("<body>Adding student processed" + "<br/> 777 " +"</body>");
        out.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        FirstExample firstExample=new FirstExample();
        List<List<String>> resList = null;
        try {
            resList=firstExample.test();
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
        out.println("<body>All the student info are displayed in Output<br/><br/>" );
        // + "<br/> 363453 " +"</body>");
        if(resList!=null){
            for(List<String> list:resList){
                out.println("id: "+list.get(0)+", firstName is: "+list.get(1)+"<br/>");

            }
        }else{
            out.println("no students found <br/>" );
        }

        out.println("</body>");
        out.println("</html>");


    }
}
