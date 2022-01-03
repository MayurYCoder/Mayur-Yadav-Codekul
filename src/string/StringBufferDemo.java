package string;

public class StringBufferDemo {
    public static void main(String[] args) {
        String str1=new String("Pune");
        str1.concat("city");
        System.out.println(str1);


        StringBuffer str2=new StringBuffer("pune is second IT hub in india");      //it is synchronized method.
        str2.append(" city");
        System.out.println(str2.subSequence(0,12));
        System.out.println(str2.substring(5));
        System.out.println(str2);
        System.out.println(str2.reverse());


        StringBuilder str3=new StringBuilder("Pune");
        str3.append("-city");
        System.out.println(str3);
    }
}
