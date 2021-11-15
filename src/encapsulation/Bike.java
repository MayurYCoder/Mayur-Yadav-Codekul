package encapsulation;

public class Bike {
    private String name;
    private int speed;

    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public void SetSpeed(int speed) {
        if (speed > 60) {
            this.speed= speed;
            System.out.println("Sport bike type");
        } else {
            System.out.println("Bike is not sport type");
        }
    }
    public int getSpeed(){
        return speed;
    }

}
