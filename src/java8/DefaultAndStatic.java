package java8;

// if you want to add any concrete method in the interfcae then add that method with the default keyword.
// static method in the interface can access through interface name. method name ie Myinterface6.display().


public class DefaultAndStatic implements Myinterface6 {
    public static void main(String[] args) {
        DefaultAndStatic obj=new DefaultAndStatic();
        System.out.println(obj.add(4,5));
        System.out.println(Myinterface6.display());
    }

    @Override
    public String msg() {
        return msg();
    }
}
interface Myinterface6{
    String msg();

   default int add (int a, int b){
        return a+b;
   }
   static  String display(){
       return "In a Interface";
   }

}
