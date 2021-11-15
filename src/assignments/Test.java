package assignments;

public class Test {
    int RollNo;
    int ContactNo;
    String  Name;
    int TotalMarks;

    public Test(int RollNo,int ContactNo,String Name,int TotalMarks){
        this.RollNo=RollNo;
        this.ContactNo=ContactNo;
        this.Name=Name;
        this.TotalMarks=TotalMarks;
    }

    void display(){
        System.out.println( " Roll no is==> "+RollNo+'\n'+" Contact no is ==> "+ContactNo+'\n'+" Name is ==> "+Name+'\n'+" Total marks is ==> "+TotalMarks);
    }
}
