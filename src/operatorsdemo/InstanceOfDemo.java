package operatorsdemo;
interface MyInterface{

}

public class InstanceOfDemo implements MyInterface {
    public void show(){
        System.out.println("in show");
    }

    public static void main(String[] args) {
        InstanceOfDemo obj= new InstanceOfDemo();
        if(obj instanceof MyInterface) {
            System.out.println(obj instanceof MyInterface );
            obj.show();
        }else{
            System.out.println("No call");
        }
    }
}


