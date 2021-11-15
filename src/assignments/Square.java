package assignments;

public class Square {
    public static int calculateArea(int length){
        int area;
        area=length*length;
        return area;
    }

    public static void main(String[] args) {
        int i=calculateArea(10);
        System.out.println(i);
    }
}
