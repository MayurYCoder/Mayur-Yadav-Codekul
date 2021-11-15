package polymorphism.methodOverloading;

public class GameDiffArg {
    void show(){
        System.out.println("Dynamo is best emulator player");
    }
    void show(int a){
        System.out.println("Mortal is the best mobile player");
    }

    public static void main(String[] args) {
        GameDiffArg obj=new GameDiffArg();
        obj.show(10);
    }
}
