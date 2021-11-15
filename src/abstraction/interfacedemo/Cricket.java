package abstraction.interfacedemo;

public class Cricket implements Sports {
    public static void main(String[] args) {
        Cricket obj= new Cricket();
        obj.play1();
    }

    @Override
    public void play() {

        System.out.println("playing cricket");
    }

    @Override
    public void play1() {
        System.out.println("playing football");
    }
}
