package collection.Mapping;

import java.util.ArrayList;
import java.util.List;

public class ArrayIterate {
    public static void main(String[] args) {
        List<Integer>Arr=new ArrayList<>();
        Arr.add(1);
        Arr.add(2);
        Arr.add(3);
        iterate(Arr);


        List<Integer>Arr1=new ArrayList<>();
        Arr1.add(1);
        Arr1.add(2);
        Arr1.add(3);
        iterate(Arr1);

    }
    public static void iterate(List<?>Arr){
        Arr.forEach(s->{
            System.out.println(s);
        });
    }
}
