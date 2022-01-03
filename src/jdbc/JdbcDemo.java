package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String[] args) {
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch","root","Mayur@1234");

           Statement statement= connection.createStatement();
           String insert="insert into Employee(id,name,address)values(1,'mayur','pune')";
           int i=statement.executeUpdate(insert);
            System.out.println("Rows inserted==>"+i);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
