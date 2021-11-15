package controlflow.forloop;

public class ReverseString {
    public static void main(String[] args) {


    String name="MAYUR";
    int length=name.length();
    String result="";

    for(int i=length-1; i>=0 ;i--){
        result=result+name.charAt(i);

    }
        System.out.println(result);


    }

}
