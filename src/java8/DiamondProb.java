package java8;


interface Myinterface7 {
    String msg();


    default int add(int a, int b) {
        return a + b;
    }
}

interface Myinterface8 {

    String msg();


    default int add(int a, int b) {
        return a + b;
    }
}

// if you want multiple inheritance through the interface then implement the interfaces to class and override the methods.
public class DiamondProb implements Myinterface7, Myinterface8 {
    public static void main(String[] args) {
        DiamondProb obj = new DiamondProb();
        System.out.println(obj.add(3, 3));

    }

    @Override
    public String msg() {
        return null;
    }

    @Override
    public int add(int a, int b) {
        return Myinterface8.super.add(a, b);
    }
}
