package collection.Collection.LinkedList;



import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args) {
        LinkedList<String >L1=new LinkedList<String >();
        L1.add("JAVA");
        L1.add("JAVASCRIPT");
        L1.add("CSS");
        L1.add("C++");
        L1.add("PYTHON");
        System.out.println(L1);


        //add
        L1.addFirst("Spring");
        L1.addLast("Spring boot");
        System.out.println(L1);

        //get set
        System.out.println(L1.get(2));
        System.out.println(L1.set(3,"HTML"));
        System.out.println(L1);

    }
}
