import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by liuzhengping on 2018/7/20.
 */
public class AddStudent {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/web_student_tracker";
    static final String USER = "root";
    static final String PASS = "123456";
    public void add(int id, String firstName) throws SQLException, ClassNotFoundException {
        System.out.println("Welcome to adding method...");
        Connection connection=null;
        Statement statement=null;
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connecting to database...");
        connection = DriverManager.getConnection(DB_URL,USER,PASS);
        //statement initial
        statement=connection.createStatement();

        //add id and firstName in STUDENT
        //"INSERT INTO `time_entry`(pid,tid,rid,tspend,description) VALUE ('"+pid+"','"+tid+"','"+rid+"',"+tspent+",'"+des+"')"
        String sql="INSERT INTO `student`(id,first_name) VALUES ('"+id+"','"+firstName+"')";
        int resultSet=statement.executeUpdate(sql);

        System.out.println("Add done");

        statement.close();
        connection.close();
        System.out.println("Goodbye!");
    }
}
