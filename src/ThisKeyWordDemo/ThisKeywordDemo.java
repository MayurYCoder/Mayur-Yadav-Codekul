package ThisKeyWordDemo;

public class ThisKeywordDemo {
     int id;
     String name;
     String address;

    public void setValues(int id, String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    public void show(){
        System.out.println(" In this function");
    }
    public void display(){
        this.show();
    }

    public static void main(String[] args) {
        ThisKeywordDemo obj= new ThisKeywordDemo();
        //obj.setValues(1,"Prakash","Pune");
        //System.out.println("id=>" + obj.id + "name=>" + obj.name + "address=>"+ obj.address);
        obj.show();
        obj.display();

    }
}
