package assignments;

public class Vehicle {
    String colour="Green";
    int wheelCount=4;
    int gears=8;

    Vehicle(){
        System.out.println(colour);
    }

    Vehicle(String colour,int gears,int wheelCount) {
        System.out.println(colour);
        System.out.println(gears);
        System.out.println(wheelCount);
    }

    public static void main(String[] args) {
        Vehicle obj=new Vehicle();
        Vehicle obj1=new Vehicle("black",7,4);

    }
}
