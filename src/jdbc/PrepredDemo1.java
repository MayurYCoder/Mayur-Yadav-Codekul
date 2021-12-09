package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepredDemo1 {
    public static void main(String[] args) {
        int id;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch","root","Mayur@1234");

            String delete="delete from employee where id>4";

            PreparedStatement preparedStatement=connection.prepareStatement(delete);
            int i=preparedStatement.executeUpdate();
            System.out.println("Rows ==>"+i);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
