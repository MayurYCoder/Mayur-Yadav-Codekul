package java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayListAddition {
    public static void main(String[] args) {
        int result=0;
        List<Integer>list= Arrays.asList(1,2,3,4);
        AtomicInteger sum=new AtomicInteger(0);
        for (int i=0;i<=list.size()-1;i++){
            result=result+list.get(i);
        }
        System.out.println(result);

        list.forEach(s->{
            sum.set(sum.get()+s);
        });
        System.out.println(sum);
    }
}
