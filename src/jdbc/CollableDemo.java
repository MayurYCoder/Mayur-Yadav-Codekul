package jdbc;

import java.sql.*;

public class CollableDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//resistering driver.

            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch","root","Mayur@1234");

            CallableStatement callableStatement=connection.prepareCall("call getData()");

            ResultSet rs=callableStatement.executeQuery();

            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
