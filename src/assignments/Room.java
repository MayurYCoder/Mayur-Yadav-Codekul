package assignments;

public class Room {
    int length;
    int height;
    int width;
     Room(int length,int height,int width){
         this.length=length;
         this.width=width;
         this.height=height;

     }
     void whiteWashingArea(){
         float Area=length*width*height;
         System.out.println("Total area to be washed is==>"+Area+"sq foot");
     }
     void whiteWashingCost(){
         float Cost=(length*width*height)/80;
         System.out.println("Total cost of washing is==>"+Cost);
     }
     void flooringCost(){
         float geometric=(length*width)/200;
         float cement=(height*width)/100;
         System.out.println("Flooring cost for geometric flooring is==>"+geometric);
         System.out.println("Flooring cost for cement flooring is==>"+cement);
     }

    public static void main(String[] args) {
        Room obj=new Room(100,200,150);
        obj.whiteWashingArea();
        obj.whiteWashingCost();
        obj.flooringCost();
    }
}
