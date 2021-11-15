package encapsulation.laptops;

public class Laptop {
    private int price;
    private String name;
    private int ram;
    public void setPrice(int price){
        if(price>50000) {
            this.price = price;
            System.out.println("Go for HP");
        }else {
            System.out.println("go for lenovo");
        }
    }
    public int getPrice(){
        return price;
    }
    public void setName(String name){
            this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setRam(int ram){
        if(ram>=8) {
            this.ram = ram;
            System.out.println("See graphic card");
        }else{
            System.out.println("go for integrated");
        }
    }
    public int getRam(){
        return ram;
    }
}
