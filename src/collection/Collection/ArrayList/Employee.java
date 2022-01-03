package collection.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Employee {
    int id;
    String Name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        Name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee obj=new Employee(10,"Mayur",75000);
        Employee obj1=new Employee(20,"Aashok",45220);
        Employee obj2=new Employee(30,"pritam",55000);
        Employee obj3=new Employee(40,"keyur",60000);

        List<Employee>list=new LinkedList<Employee>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);



        System.out.println(list);
        list.forEach(s->{
            System.out.println(s);
        });




    }


}
