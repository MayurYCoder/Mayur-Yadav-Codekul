package collection.Mapping;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparableDemo implements Comparable<ComparableDemo>{
    int id;
    String Name;
    int salary;

    public ComparableDemo(int id, String name, int salary) {
        this.id = id;
        Name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        ComparableDemo obj = new ComparableDemo(10, "Mayur", 75000);
        ComparableDemo obj1 = new ComparableDemo(40, "Aashok", 45220);
        ComparableDemo obj2 = new ComparableDemo(30, "pritam", 55000);
        ComparableDemo obj3 = new ComparableDemo(20, "keyur", 60000);

        List<ComparableDemo> list = new LinkedList<ComparableDemo>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Collections.sort(list);
        list.forEach(s->{
            System.out.println("ID==>"+s.id+" Name==>"+ s.Name+" Salary==>"+s.salary);
        });

    }
    //sorting by ID
 /*   @Override
    public int compareTo(ComparableDemo o) {
        if (this.id==o.id){
            return 0;
        }else if (this.id>o.id){
            return 12;
        }else {
            return -1;
        }
    }*/


      @Override//for sorting by string alphabets.
    public int compareTo(ComparableDemo o) {
        return this.Name.compareTo(o.Name);
    }


}
