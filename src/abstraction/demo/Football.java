package abstraction.demo;

public class Football extends AbsSport {
    @Override
    void chess() {
        System.out.println("Playing chess");

    }

    public static void main(String[] args) {
        Football m= new Football();
        m.chess();
    }
}
