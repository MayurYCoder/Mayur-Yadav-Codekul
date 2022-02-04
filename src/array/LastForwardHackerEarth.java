package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastForwardHackerEarth {
    public static void main(String[] args) {
//        List<Integer>arr= new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//        System.out.println(arr);
//
//        arr.add(0,7);
//        arr.set(0,arr.lastIndexOf(arr));
//        System.out.println(arr);

        int N=25;
        double sq=Math.sqrt(N);

        if (sq * sq == N) {

            System.out.println("YES");
        }else{
            System.out.println("NO");

        }

    }
}
