package collection;

import java.util.Vector;

public class Vector2d {
    public static void main(String[] args) {
        Vector<Integer>vector=new Vector<>();
        vector.add(10);
        vector.add(106);
        vector.add(150);
        vector.add(50);

        System.out.println(vector);

        Vector osvector=new Vector();
        osvector.add(vector);
        System.out.println(osvector);
//        for (int i=0;i<vector.size();i++){
//            int str=(int)((vector).get(0)).intValue(i);
//            System.out.println(str);
//        }
    }
}
