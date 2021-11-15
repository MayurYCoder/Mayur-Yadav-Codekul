package controlflow.forloop.patterns;


public class Star {
    public static void main(String[] args) {
// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        int n=5;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i<=j) {
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}

