package encapsulation.laptops;

public class Bestlaptops {
    public static void main(String[] args) {
        Laptop HP= new Laptop();
        HP.setPrice(60000);
        HP.setName("gaming");
        HP.setRam(12);
        System.out.println(HP.getPrice()+" " + HP.getName()+" " + HP.getRam());
    }
}
