package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabatch", "root", "Mayur@1234");

          /*   Statement myStement = myConnection.createStatement();
             String update="update employee set name='JANU' where id=2 ";
            int i=myStement.executeUpdate(update);
            System.out.println("Rows inserted "+i);
            String insert="insert into employee(id,name,address)values(1,'Akki','Dubai')";

            int i=myStement.executeUpdate(insert);
            System.out.println("Rows inserted==>"+i);
           */
            int id;
            String name;
            String address;

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter id");
            id=sc.nextInt();
            System.out.println("Enter name");
            name=sc.next();
            System.out.println("Enter address");
            address=sc.next();

            String insert="insert into employee(id,name,address)values(?,?,?)";

            PreparedStatement preparedStatement=myConnection.prepareStatement(insert);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,address);

            int i=preparedStatement.executeUpdate();
            System.out.println("rows update==>"+i);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
