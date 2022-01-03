package collection.Collection.Practice;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreemapDm {
    public static void main(String[] args) {
        Map<Integer,String >map=new TreeMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(4,"D");
        map.put(3,"C");
        System.out.println(map);

        Set<Integer>keys=map.keySet();
        for (Integer key:keys){
            System.out.println(key+"-"+map.get(key));
        }
        SortedMap<Integer,String > map1=new TreeMap<>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(4,"D");
        map1.put(3,"C");
        System.out.println(map1);

        System.out.println(map1.headMap(3));
    }
}
