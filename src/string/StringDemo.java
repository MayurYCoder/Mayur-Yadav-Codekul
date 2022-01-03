package string;

public class StringDemo {
    public static void main(String[] args) {
        String str=new String("Pune");
        //String str1="Pune";
        String str2="Pune";

        System.out.println(str2==str);                  //  == check the object refrence.

        System.out.println(str2.equals(str));           // .equal check the content of string.

    /*    String str =new String("Pune");//2
        String str1 ="Pune";//0
        String str2="pune";//0
        String str3=new String("Pune");//1


        String str1="Amul";
        String str2="Milk";
        String str3="Amul milk is is best seller";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1+str2);         // it will goes right to left
        System.out.println(str1.concat(str2));
        System.out.println(String.join(",",str1,str2));
        System.out.println(str3.subSequence(2,10));
        System.out.println(str3.substring(5));
        System.out.println(str3.replace("m","c"));
        System.out.println(str3.replaceFirst("m","u"));
        System.out.println(str3.replaceAll("is(.)","was"));
        char[] c=str3.toCharArray();
        System.out.println(c);


      */

    }
}
