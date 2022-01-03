package collection.Collection.Practice;

import constructor.Student;

import java.util.*;

public class ComparableDm implements Comparable<ComparableDm> {
    int id;
    String name;
    String address;

    public ComparableDm(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }



    public static void main(String[] args) {
        ComparableDm obj = new ComparableDm(2, "Mayur", "Pune");
        ComparableDm obj1 = new ComparableDm(1, "Mayur", "Baramati");
        ComparableDm obj2 = new ComparableDm(5, "XYZ", "Baramati1");


        List<ComparableDm> list = new ArrayList<>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        Collections.sort(list);

        list.forEach(s->{
            System.out.println("id-"+s.id+" Name-"+s.name+" Address-"+s.address);
        });


    }

//    @Override
//    public int compareTo(ComparableDm o) {
//        return 0;
//    }


    @Override
    public int compareTo(ComparableDm o) {
        if (this.id>o.id){
            return +1;
        }else if (this.id<o.id){
            return -1;
        }else {
            return 0;
        }
    }
}
