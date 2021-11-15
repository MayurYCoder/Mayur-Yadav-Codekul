package constructor;

public class Student {
    String name;
    int rollno;
    Student(String name, int rollno){
        this.name=name;
        this.rollno=rollno;
    }

    public static void main(String[] args) {
        Student s1= new Student("mayur",1);
        Student s2= new Student("daya",2);
    }
}
