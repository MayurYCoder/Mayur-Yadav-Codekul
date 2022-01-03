package Inheritance;

public  class Multiple implements Int1,Int2{

    public static void main(String[] args) {
        Multiple obj=new Multiple();
        System.out.println( obj.add(1,5));

    }

    @Override
    public void display() {

    }

    @Override
    public int add(int a, int b) {
        return Int1.super.add(a, b);
    }
}
interface Int1{
    void display();

    default int add(int a,int b){
        return a+b;
    }
}interface Int2{
    void display();

    default int add(int a,int b){
        return a+b;
    }
}

