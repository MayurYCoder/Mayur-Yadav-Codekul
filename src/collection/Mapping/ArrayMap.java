package collection.Mapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayMap {
    public static void main(String[] args) {
        Map<Integer,String > map1=new HashMap<>();
        map1.put(1,"noida");
        map1.put(2,"chandigad");
        map1.put(3,"mumbai");

        Map<Integer,String > map2=new HashMap<>();
        map2.put(1,"noida");
        map2.put(2,"chandigad");
        map2.put(3,"mumbai");

        Map<Integer,String  > map3=new HashMap<>();
        map3.put(1,"mumbai");
        map3.put(2,"Delhi");
        map3.put(3,"Pune");

        List<Map<Integer,String >>arr1=new ArrayList<>();
        arr1.add(map1);
        arr1.add(map3);
        arr1.add(map2);
/*
        arr1.forEach(s->{
            s.forEach((k,v)->{
                System.out.println("Key->"+k+"  value->"+v);
            });
        });
 */
        for (int i=0;i<=arr1.size()-1;i++){
            for (Map.Entry<Integer,String >m:arr1.get(i).entrySet()){
                System.out.println(" Key ==>"+m.getKey()+" value ==>"+m.getValue());
            }
        }


    }
}
