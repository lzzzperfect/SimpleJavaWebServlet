/**
 * Created by liuzhengping on 2018/6/29.
 */
import java.sql.*;

public class FirstExample {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/web_student_tracker";
    static final String USER = "root";
    static final String PASS = "123456";
    public void test() throws SQLException, ClassNotFoundException {
        System.out.println("Welcome to first example...");
        Connection connection=null;
        Statement statement=null;
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connecting to database...");
        connection = DriverManager.getConnection(DB_URL,USER,PASS);
        //statement initial
        statement=connection.createStatement();
        String sql="SELECT id, first_name FROM student";
        ResultSet resultSet=statement.executeQuery(sql);
        while (resultSet.next()){
            int id  = resultSet.getInt("id");
            String first = resultSet.getString("first_name");
            System.out.print("ID: " + id);

            System.out.print(", FirstName: " + first+";   ");
        }
        System.out.println();
        System.out.println("All result output");
        resultSet.close();
        statement.close();
        connection.close();
        System.out.println("Goodbye!");
    }
}
