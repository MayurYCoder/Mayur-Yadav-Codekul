package array;

 class Vararg {
    public static void m1(int...x){
        System.out.println("the no of argument"+ x. length);
    }

     public static void main(String[] args) {
         m1();
         m1(10);
         m1(10,20);
         m1(10,20,30);
     }
}
