package controlflow.forloop.patterns;

public class Triangle3 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i+j>=n+1){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }





       /* for(int i=1;i<=4;i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        */
    }
}
