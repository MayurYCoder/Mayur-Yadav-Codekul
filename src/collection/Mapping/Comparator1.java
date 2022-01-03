package collection.Mapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1 {

    int id;
    String name;

    Comparator1(int id,String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        Comparator1 obj1=new Comparator1(1,"sonu");
        Comparator1 obj2=new Comparator1(3,"ak");
        Comparator1 obj3=new Comparator1(2,"somu");

        List<Comparator1> list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);


        Comparator<Comparator1>comparator=((comparator1,t1)->{
            if (comparator1.id==t1.id){
                return 0;
            }else if (comparator1.id>t1.id){
                return 1;
            }else {
                return -1;
            }
        });
        Comparator<Comparator1>comparator1=((comparable1,t1)->{
           return comparable1.name.compareTo(t1.name);
        });

        Collections.sort(list,comparator.thenComparing(comparator1));
        list.forEach(s->{
            System.out.println("Id==> "+s.id+" Name==> "+s.name);
        });
    }


}
