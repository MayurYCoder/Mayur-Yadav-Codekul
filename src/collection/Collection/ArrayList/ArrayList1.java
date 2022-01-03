package collection.Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Object> ar=new ArrayList<Object>();
        ar.add("a");
        ar.add(1);

        System.out.println(ar.size());
        ar.add(100);
        System.out.println(ar);
    }
}
