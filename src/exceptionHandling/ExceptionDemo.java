package exceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        try{
            int c=a/b;

                String str=null;
                System.out.println(str.toLowerCase());
             /*   try{
                 }catch(NullPointerException e){
                System.out.println(e);
            }*/
        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
            try{
                int d=a/b;
                System.out.println(d);
            }catch(ArithmeticException arithmeticException){
                arithmeticException.printStackTrace();

            }

        }finally {
            System.out.println("in final");
        }
        System.out.println("hi");

    }
}
