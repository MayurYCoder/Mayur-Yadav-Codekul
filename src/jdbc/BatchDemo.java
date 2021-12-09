package jdbc;

import java.sql.*;

public class BatchDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//resistering driver.

            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch","root","Mayur@1234");



            String insert="insert into employee(id,name,address)values(?,?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(insert);
            for (int i=0;i<=10;i++) {
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, "name"+i);
                preparedStatement.setString(3, "address"+i);
                preparedStatement.addBatch();
            }

            int[] i=preparedStatement.executeBatch();

            System.out.println("row inserted==>"+i.length);


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
