package assignments;

public class CalculatorMethod {
    int a;
    int b;

    public double addition(int a,int b){
       int result=a+b;
        return result;
    }
    public double subtraction(int a,int b){
        //int result=a-b;
        if (a>b){
            int result=a-b;
            return result;
        }else{
            int result=b-a;
            return result;
        }
    }
    public double multiplication(int a,int b){
        int result=a*b;
        return result;
    }
    public  double division(int a,int b){
        if (a>b){
            int result=a/b;
            return result;
        }else {
            int result=b/a;
            return result;
        }
    }

}
class Another extends CalculatorMethod{
    public static void main(String[] args) {
        CalculatorMethod obj=new CalculatorMethod();
        obj.division(10,20);
        obj.multiplication(10,20);
        obj.addition(10,20);
        obj.subtraction(10,20);
    }
}
