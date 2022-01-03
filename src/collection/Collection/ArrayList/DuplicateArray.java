package collection.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class DuplicateArray {
    public static void main(String[] args) {
        ArrayList<Integer> Arr=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,8,7,6,6,8));
        System.out.println(Arr);

        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>(Arr);
        System.out.println(linkedHashSet);

        ArrayList<Integer>removed=new ArrayList<Integer>(linkedHashSet);
        Collections.sort(removed);

        System.out.println(removed);
    }
}
