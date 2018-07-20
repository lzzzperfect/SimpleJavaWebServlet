/**
 * Created by liuzhengping on 2018/6/29.
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FirstExample {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/web_student_tracker";
    static final String USER = "root";
    static final String PASS = "123456";
    public List<List<String>> test() throws SQLException, ClassNotFoundException {
        System.out.println("Welcome to first example...");
        Connection connection=null;
        Statement statement=null;
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connecting to database...");
        connection = DriverManager.getConnection(DB_URL,USER,PASS);
        //statement initial
        statement=connection.createStatement();
        //display all students' id and firstName in STUDENT
        String sql="SELECT id, first_name FROM student";
        ResultSet resultSet=statement.executeQuery(sql);
        List<List<String>> res=new LinkedList<>();
        while (resultSet.next()){
            List<String> cur=new ArrayList<>();
            int id  = resultSet.getInt("id");
            String first = resultSet.getString("first_name");
            System.out.print("ID: " + id);

            System.out.print(", FirstName: " + first+";   ");
            cur.add(id+"");
            cur.add(first);
            res.add(cur);
        }
        System.out.println();
        System.out.println("All result output");
        resultSet.close();
        statement.close();
        connection.close();
        System.out.println("Goodbye!");
        return res;
    }
}
