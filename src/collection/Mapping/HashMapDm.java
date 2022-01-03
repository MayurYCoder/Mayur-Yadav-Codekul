package collection.Mapping;

import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDm {
    public static void main(String[] args) {
        HashMap<String ,String >hm=new HashMap<>();
        hm.put("INDIA","DELHI");
        hm.put("RUSSIA","MOSCOW");
        hm.put("FRANCE","PARIS");
        hm.put("GERMENY","BERLIN");
        hm.put("GERMENY","BERLIN");
        System.out.println(hm);
        System.out.println(hm.put("GERMENY","TOWER"));

        for (Map.Entry<String,String>p:hm.entrySet()){
            System.out.println("key-> "+p.getKey()+"  value->"+p.getValue());
        }



    /*  Iterator<String >it=hm.keySet().iterator();
        while (it.hasNext()){
            String key=it.next();
            System.out.println(hm.get(key));
        }
        hm.forEach((k,v)->{
            System.out.println("Key->"+k+"  value->"+v);
        });

     */
        Map<Integer,Integer>map=new HashMap<>();
        map.put(2,4);
        map.put(4,16);
        map.put(3,9);
        map.put(6,36);
        map.put(5,25);
        map.put(1,25);

        System.out.println(map);

        for (Map.Entry<Integer,Integer>m:map.entrySet()){
            System.out.println("key==>"+m.getKey()+" value==>"+m.getValue());
        }




    }
}
