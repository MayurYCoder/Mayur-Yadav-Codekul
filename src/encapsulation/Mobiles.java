package encapsulation;

public class Mobiles {
    private int Price;
    private String name;

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Iphone{
    public static void main(String[] args) {
        Mobiles obj=new Mobiles();
        obj.setPrice(20000);
        obj.setName("nokia");
        System.out.println("price is=>"+obj.getPrice()+"Company is =>"+obj.getName());
    }
}
