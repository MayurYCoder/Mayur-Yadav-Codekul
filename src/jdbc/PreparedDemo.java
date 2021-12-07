package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//resistering driver.

            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch","root","Mayur@1234");

            Scanner sc=new Scanner(System.in);
            int id;
            String name;
            String address;

            System.out.println("Enter Id");
            id=sc.nextInt();
            System.out.println("Enter name");
            name=sc.next();
            System.out.println("Enter address");
            address=sc.next();

            String insert="insert into employee(id,name,address)values(?,?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(insert);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,address);

            int i=preparedStatement.executeUpdate();

            System.out.println("roe inserted==>"+i);


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
