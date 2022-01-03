package collection.Mapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable1 implements Comparable<Comparable1>{
    int id;
    String name;

    Comparable1(int id,String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        Comparable1 obj1=new Comparable1(2,"sonu");
        Comparable1 obj2=new Comparable1(3,"ak");
        Comparable1 obj3=new Comparable1(1,"chinu");

        List<Comparable1>list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Collections.sort(list);
        list.forEach(s->{
            System.out.println("Id==> "+s.id+" Name==> "+s.name);
        });
    }
/*
    @Override
    public int compareTo(Comparable1 o) {
        return this.name.compareTo(o.name);
    }

 */

    @Override
    public int compareTo(Comparable1 o) {
        if (this.id==o.id){
            return 0;
        }else if (this.id>o.id){
            return 100;
        }else{
            return -1;
        }
    }



}
