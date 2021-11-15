package assignments;

import java.util.Scanner;

public class Assignment38 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int start;
        System.out.println("Enter the starting no");
        start=obj.nextInt();
        int end;
        System.out.println("Enter the end no");
        end= obj.nextInt();
        for (int i=start;i<=end;i++){
            if (i%2==0){
                System.out.println("Even no are==>"+i);
            }else{
                System.out.println("odd no are==>"+i);
            }
        }
    }
}
