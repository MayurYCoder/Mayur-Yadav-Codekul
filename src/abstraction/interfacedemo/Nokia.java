package abstraction.interfacedemo;

class Nokia implements Mobile{
    public static void main(String[] args) {
        Nokia xl= new Nokia();
        xl.m1();
        xl.m2();
    }
    public void m1() {
        System.out.println("nokia is best");
    }
    public void m2(){
        System.out.println("samsung is best");
    }
}
