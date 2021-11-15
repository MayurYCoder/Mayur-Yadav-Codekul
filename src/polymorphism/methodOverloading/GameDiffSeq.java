package polymorphism.methodOverloading;

public class GameDiffSeq {
    void show(int a,String s){
        System.out.println("Ddynamo is best COD player ");
    }
    void show(String s,int a){
        System.out.println("Mortal is the best BGMI player");
    }

    public static void main(String[] args) {
        GameDiffSeq obj=new GameDiffSeq();
        obj.show("m",2);
    }
}
