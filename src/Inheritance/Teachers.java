package Inheritance;

public class Teachers {
    protected int id;
    String name;
    String address;
}
     class MathsTeacher extends Teachers{
        public static void main(String[] args) {
            MathsTeacher mathsTeacher = new MathsTeacher();
            mathsTeacher.id=1;
            mathsTeacher.name="Sachin";
            mathsTeacher.address="Nagpur";
            System.out.println(" id " + mathsTeacher.id + " Name " + mathsTeacher.name + " address " + mathsTeacher.address);
        }

}
class chemistryTeacher extends Teachers{
    public static void main(String[] args) {
        chemistryTeacher chemistryTeacher = new chemistryTeacher();
        chemistryTeacher.id=20;
        chemistryTeacher.name="sagar";
        chemistryTeacher.address="pune";
        System.out.println(" id "+ chemistryTeacher.id +" name "+ chemistryTeacher.name + " address "+ chemistryTeacher.address);
    }
}
