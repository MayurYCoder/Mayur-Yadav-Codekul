package collection.Mapping;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(100, "delhi");
        treeMap.put(300, "mumbai");
        treeMap.put(500, "pune");
        treeMap.put(200, "bangalore");
        treeMap.put(400, "mangalore");
/*      System.out.println(treeMap);
        System.out.println(treeMap.higherKey(2));
        System.out.println(treeMap.ceilingKey(4));
        System.out.println(treeMap.firstEntry());           //it gives the first key after sorting.
        System.out.println(treeMap.lastEntry());            //it gives last key after sorting.
        System.out.println(treeMap.floorEntry(1));          //it gives the key's value.
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.lowerEntry(5));          //it returns before's keys value of passing key.
        System.out.println(treeMap.higherEntry(2));         //it returns higher key of your passing key.
        System.out.println(treeMap.containsKey(200));
        System.out.println(treeMap.lastEntry());

        System.out.println(treeMap.subMap(100,200));
*/      System.out.println(treeMap.ceilingEntry(201));    //it returns the same value of key or greater value of next key
        System.out.println( treeMap.tailMap(300,true));
//        treeMap.forEach((k, v) -> {
//            System.out.println("Key-> " + k + " Value-> " + v);
//        });
    }
}
