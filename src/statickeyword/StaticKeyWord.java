package statickeyword;

/* static - is used for memory management.
 *
 *
 */
public class StaticKeyWord {
    int empId;
    String empName;
    static String companyName="ABC";

   StaticKeyWord(int empId, String empName){
       this.empId=empId;
       this.empName=empName;
    }
    void show(){
        System.out.println(" empid==> " + empId + " empName ==> " + empName +"  company "+ companyName);

    }

    public static void main(String[] args) {

        StaticKeyWord obj= new StaticKeyWord(1,"sagar");
        obj.show();
        StaticKeyWord obj2=new StaticKeyWord(2,"dani");
        obj2.show();
    }
}
