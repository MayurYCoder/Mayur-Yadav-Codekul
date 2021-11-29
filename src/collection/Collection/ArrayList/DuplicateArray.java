package collection.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicateArray {
    public static void main(String[] args) {
        ArrayList<Integer> Arr=new ArrayList<Integer>(Arrays.asList(1,2,3,2,3,4,5,8,7,9,9));
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>(Arr);
        ArrayList<Integer>removed=new ArrayList<Integer>(linkedHashSet);
        System.out.println(removed);
    }
}
