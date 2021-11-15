package assignments;

import java.util.Scanner;

public class TriangleAss31 {
    public static void main(String[] args) {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no");
        n= obj.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i+j<=n+1){
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
