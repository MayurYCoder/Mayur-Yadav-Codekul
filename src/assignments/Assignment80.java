package assignments;

public class Assignment80 {
    public static void main(String[] args) {
        String str="Mayur";
        String str1="MayuR";
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareToIgnoreCase(str1));
        System.out.println(str.lastIndexOf("r"));

    }
}
