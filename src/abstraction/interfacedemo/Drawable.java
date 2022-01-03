package abstraction.interfacedemo;

public interface Drawable {
    void draw();
    default  void msg(){
        System.out.println("In a default method");
    }
    static void main(){
        System.out.println("In a static method");
    }
}
class Circle implements Drawable{
   public void draw(){
       System.out.println("Circle is drawn");
    }
}
class rectangle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Rectangle is drawn");
    }

    public static void main(String[] args) {
        Drawable obj=new rectangle();
        obj.draw();
        obj.msg();
        Drawable.main();
    }
}