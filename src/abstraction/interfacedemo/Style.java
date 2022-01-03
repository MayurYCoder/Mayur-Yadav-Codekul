package abstraction.interfacedemo;

public interface Style {
    public void hairstyle();
}
class Looks implements Style{

    @Override
    public void hairstyle() {
        System.out.println("hairstyle helps to look good");
    }

    public static void main(String[] args) {
        Looks obj=new Looks();
        obj.hairstyle();
    }
}
