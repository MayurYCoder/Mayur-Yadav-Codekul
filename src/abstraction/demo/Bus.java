package abstraction.demo;

class Bus extends Test2 {
    int getNoOfwheels(){
        return 6;
    }

    @Override
    int getNoOfWheels() {
        return 0;
    }
}
class Auto extends Test2{
    int getNoOfWheels(){
        return 3;
    }
}
class Test{
    public static void main(String[] args) {
        Bus b= new Bus();
        System.out.println( b.getNoOfwheels());
        Auto a= new Auto();
        System.out.println(a.getNoOfWheels());
    }
}