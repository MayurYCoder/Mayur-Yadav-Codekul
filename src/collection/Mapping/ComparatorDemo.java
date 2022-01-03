package collection.Mapping;

import collection.Collection.ArrayList.Employee;

//comparator is used when you have to compare the two element
//firstly compare with respect to id then according to name;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComparatorDemo {
    int id;
    String Name;
    int salary;

    public ComparatorDemo(int id, String name, int salary) {
        this.id = id;
        Name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        ComparatorDemo obj = new ComparatorDemo(10, "Mayur", 75000);
        ComparatorDemo obj1 = new ComparatorDemo(20, "Aashok", 45220);
        ComparatorDemo obj2 = new ComparatorDemo(30, "pritam", 55000);
        ComparatorDemo obj3 = new ComparatorDemo(40, "keyur", 60000);


        List<ComparatorDemo> list=new LinkedList<ComparatorDemo>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Comparator<ComparatorDemo> comparator = ( comparatorDemo, t1) ->{
            if (comparatorDemo.id == t1.id) {
                return 0;
            } else if (comparatorDemo.id > t1.id) {
                return 1;
            } else {
                return -1;
            }
        };

        Comparator<ComparatorDemo> comparator1 = ( comparatorDemo, t1) ->{
            return comparatorDemo.Name.compareTo(t1.Name);
        };

        Collections.sort(list,comparator.thenComparing(comparator1));

        list.forEach(s->{
            System.out.println("Id==> "+s.id+" Name==>"+s.Name+" Salary==> "+s.salary);
        });

    }
}
