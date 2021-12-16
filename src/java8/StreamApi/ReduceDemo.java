package java8.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 4, 9,25);

        Integer sum = 0;
        for (int i=0;i<list.size();i++){
            sum=sum+list.get(i);
        }
        System.out.println(sum);

        Optional<Integer>optional=list.stream().reduce((t1,t2)->t1+t2);
        System.out.println(optional.get());
    }

}
