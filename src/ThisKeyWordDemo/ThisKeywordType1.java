package ThisKeyWordDemo;
// When the instantaneous variable and local variables name are same then we use this key words



public class ThisKeywordType1 {
    int id;

    void setValues(int id){
       this.id=id;
    }
    void display(){
        System.out.println(id);
    }

    public static void main(String[] args) {
        ThisKeywordType1 M= new ThisKeywordType1();
        M.setValues(20);
        System.out.println("id==>"+ M.id);
       // M.display();
    }
}
