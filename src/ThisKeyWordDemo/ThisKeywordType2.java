package ThisKeyWordDemo;
//This keyword can be used to invoke current class method



public class ThisKeywordType2 {
    public void display(){
       System.out.println("in a display method");
    }
    public void show(){
       this.display();
    }

   public static void main(String[] args) {
      ThisKeywordType2 obj=new ThisKeywordType2();
      obj.show();
   }
}
