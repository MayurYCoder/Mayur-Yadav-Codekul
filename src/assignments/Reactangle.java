package assignments;

public class Reactangle {
    int length;
    int width;

    Reactangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    void rectangleArea(){
        int area=length*width;
        System.out.println("Area is==>"+area);
    }
    void rectanglePerimeter(){
        int perimeter=2*length+2*width;
        System.out.println("Perimeter is"+perimeter);
    }

    public static void main(String[] args) {
        Reactangle obj=new Reactangle(10,20);
        obj.rectangleArea();
        obj.rectanglePerimeter();
    }
}
