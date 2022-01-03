package ThisKeyWordDemo;
// When the instantaneous variable and local variables name are same then we use this key words



public class ThisKeywordType1 {
    int id;

 public void setValues(int id){
     this.id=id;
     System.out.println(id);
 }
 public void display(){
     System.out.println(id);
 }

    public static void main(String[] args) {
        ThisKeywordType1 obj=new ThisKeywordType1();
        obj.setValues(20);
        obj.display();
    }


}
