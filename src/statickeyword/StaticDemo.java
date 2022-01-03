package statickeyword;

public class StaticDemo {
    int id;
    String Model;
    static String company="Yamaha";

    StaticDemo(int id,String Model){
        this.id=id;
        this.Model=Model;
    }
    public void show(){
        System.out.println("Bike No=>"+id+" Model name=>"+Model+" Company=>"+company);
    }

    public static void main(String[] args) {
        StaticDemo obj=new StaticDemo(9508,"FZ");
        obj.show();
        StaticDemo obj1=new StaticDemo(2905,"MT15");
        obj1.show();
    }
}
