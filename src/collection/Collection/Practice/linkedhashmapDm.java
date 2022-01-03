package collection.Collection.Practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class linkedhashmapDm {
    public static void main(String[] args) {
        Map<Integer,String>map=new LinkedHashMap<>();
        map.put(1,"Mayur");
        map.put(2,"Vabby");
        map.put(3,"rabby");
        System.out.println(map);

      Set<Integer>keys=map.keySet();
      for (Integer key:keys){
          System.out.println(key+" "+map.get(key));
      }

    }
}
