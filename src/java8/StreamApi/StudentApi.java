package java8.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentApi {
    int id;
    String name;
    int marks;

    public StudentApi(int id, String name,int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {
        StudentApi obj=new StudentApi(1,"Saggi",34);
        StudentApi obj1=new StudentApi(1,"maggi",54);
        StudentApi obj2=new StudentApi(1,"changgi",34);


        List<StudentApi>list=new ArrayList<>();
        list.add(obj);
        list.add(obj1);
        list.add(obj2);

        Stream<Object>list1=list.stream()
                .filter(f->f.marks==34)
                .map(m->m.marks+1);
        list1.forEach(System.out::println);
    }
}
