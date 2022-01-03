package string;

public class ReverseString {
    public static void main(String[] args) {
       /* String str1="WELCOME";
        StringBuilder str2=new StringBuilder(str1);
        System.out.println(str2.reverse());
        */



        String str="WELCOME TO THE COLLECTION";
        String rev="";

        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        System.out.println(rev);
    }

}
