package assignments;

public class Student {
    int RollNo;
    String name;
    long contact;
    int TotalMarks;
    void display(int RollNo,String name,long contact,int TotalMarks){
        this.RollNo=RollNo;
        this.name=name;
        this.contact=contact;
        this.TotalMarks=TotalMarks;
        System.out.println("Roll no is==>"+RollNo+"name is==>"+name+"Contact no is ==>"+contact+"total marks is==>"+TotalMarks);
    }

}
class StudentDemo{
    public static void main(String[] args) {
        Student obj=new Student();
        obj.display(1,"mayur",7507154374l,98);

    }
}
