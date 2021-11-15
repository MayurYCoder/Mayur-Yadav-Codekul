package assignments;

public class TriangleAss46 {
    public static void main(String[] args) {
        int n=5;
        int result=1;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (i>=j){
                    System.out.print(" "+result++);
                }
            }
            System.out.println(" ");
        }
    }
}
