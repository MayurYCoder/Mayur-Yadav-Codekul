package assignments;

public class AdditionDemo {
    public int a=4;
    public int b=2;
    public int result=0;
    public void addition(){
        int result = this.result;
        result=a+b;
        System.out.println("result is "+result);
    }
    public void subtraction(){
        int result = this.result;
        result=a-b;
        System.out.println("result is "+result);
    }
    public void multiplication(){
        int result = this.result;
        result=a*b;
        System.out.println("result is "+result);
    }
    public void division(){
        int result = this.result;
        result=a/b;
        System.out.println("result is "+result);
    }

}
class Addition{
    public static void main(String[] args) {
        AdditionDemo obj=new AdditionDemo();
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
    }
}
