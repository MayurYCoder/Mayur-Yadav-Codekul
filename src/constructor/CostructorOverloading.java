package constructor;

public class CostructorOverloading {
    CostructorOverloading(){
        this(10);
        System.out.println("no arg constructor");
    }
    CostructorOverloading(int i){
        this(10.0);
        System.out.println("int arg ");
    }
    CostructorOverloading(double d){
        System.out.println("double arg");
    }

    public static void main(String[] args) {
        CostructorOverloading T1= new CostructorOverloading();
      //  CostructorOverloading T2= new CostructorOverloading(10);
        //CostructorOverloading T3= new CostructorOverloading(10.2);

    }
}
