package collection.Mapping;

import java.util.HashMap;
import java.util.Map;

public class mapDemo {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"Pune");
        map.put(2,"Nagpur");
        map.put(3,"Pune");

        System.out.println(map);

        //by using lambda function
        map.forEach((k,v)->{
            System.out.println(" Key ==>"+k+" Value ==>"+v);
        });

        //by using enhance for loop
        for (Map.Entry<Integer,String >m:map.entrySet()){
            System.out.println(" Key ==>"+m.getKey()+" value ==>"+m.getValue());
        }
    }
}
