package encapsulation;

public class Speedtest {
    public static void main(String[] args) {
        Bike obj= new Bike();
        obj.setName("hybusa");
        obj.SetSpeed(10);
        System.out.println(obj.getName()+" "+ obj.getSpeed());
    }
}
