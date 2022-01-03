package collection.Collection.Practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComparatorDm {
    int id ;
    String name;
    String batch;

    public ComparatorDm(int id, String name, String batch) {
        this.id = id;
        this.name = name;
        this.batch = batch;
    }

    public static void main(String[] args) {
        ComparatorDm obj=new ComparatorDm(1,"MJ","Corona");
        ComparatorDm obj1=new ComparatorDm(2,"MK","Corona");
        ComparatorDm obj2=new ComparatorDm(1,"MA","Corona");

        List<ComparatorDm>list=new LinkedList<ComparatorDm>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);

        Comparator<ComparatorDm>comparator=((comparatorDm,t1)->{
            if (comparatorDm.id==t1.id){
                return 0;
            }else if (comparatorDm.id>t1.id){
                return 1;
            }else{
                return -1;
            }
        });

        Comparator<ComparatorDm>comparator1=((ComparatorDm,t1)->{
            return ComparatorDm.name.compareTo(t1.name);
        });
        Collections.sort(list,comparator.thenComparing(comparator1));
        list.forEach(s->{
            System.out.println("Id->"+s.id+" Name=>"+s.name+" Address->"+s.batch);
        });
    }
}
