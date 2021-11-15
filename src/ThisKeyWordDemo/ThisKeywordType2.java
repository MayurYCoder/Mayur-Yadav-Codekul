package ThisKeyWordDemo;
//This keyword can be used to invoke current class method



public class ThisKeywordType2 {
    void display(){
        System.out.println("hello");
    }
    void show(){
       display();
    }

    public static void main(String[] args) {
        ThisKeywordType2 obj= new ThisKeywordType2();
        obj.show();
    }
}
