package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch","root","Mayur@1234");
            Statement statement=connection.createStatement();
//            String insert="insert into Employee(id,name,address)values(2,'Danny','Delhi')";
            String update="update employee set name='dhanno'where name='name'";
//            String delete="delete from employee where id=1";

            int i=statement.executeUpdate(update);

            System.out.println("Rows inserted==>"+i);


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
