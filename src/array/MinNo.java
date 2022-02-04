package array;

import java.util.ArrayList;
import java.util.List;

public class MinNo {
    public static void main(String[] args) {
        List<Integer>arraylist=new ArrayList<>();
        arraylist.add(10);
        arraylist.add(30);
        arraylist.add(50);
        arraylist.add(20);

        System.out.println(arraylist);

        int max=arraylist.get(0);
        System.out.println(max);
        for(int i=1;i<arraylist.size();i++){
            if(max<(arraylist.get(i))){
                max=arraylist.get(i);
            }
        }
        System.out.println("Maximum"+max);

        int min=arraylist.get(0);
        for(int j=1;j<arraylist.size();j++){
            if(min>(arraylist.get(j))){
                min=arraylist.get(j);
            }
        }
        System.out.println("Minimum"+min);
    }
}
