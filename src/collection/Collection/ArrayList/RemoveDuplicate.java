package collection.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<String >arrayList=new ArrayList<String >(Arrays.asList("A","B","C","D","E"));
        ArrayList<String >arrayList1=new ArrayList<String >(Arrays.asList("A","C","B","D","F"));
        //arrayList.retainAll(arrayList1);

        arrayList1.removeAll(arrayList);
        System.out.println(arrayList1);

        arrayList.addAll(arrayList1);
        Collections.sort(arrayList);
        System.out.println(arrayList);



        ArrayList<Integer>arr=new ArrayList<Integer>(Arrays.asList(1,4,2,3));
        ArrayList<Integer>arr1=new ArrayList<Integer>(Arrays.asList(1,2,3,4));

        Collections.sort(arr);
        System.out.println(arr.equals(arr1));

    }
}
