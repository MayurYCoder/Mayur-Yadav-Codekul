package java8;

import java.util.Locale;
import java.util.Optional;

public class OptionalDemo  {
    public static void main(String[] args) throws Exception {
        Employee obj=new Employee(1,"mayur",null);
        obj.getEmail();

        if (obj.getEmail()!=null){
            System.out.println(obj.getEmail().toLowerCase(Locale.ROOT));
        }else{
            System.out.println("Email is null");
        }

        Optional<Employee>optional=Optional.empty();
/*
       returns exception when optional is null
        Employee obj1=new Employee(2,"Danny",null);
        Optional<String>optional1=Optional.of(obj1.getEmail());
        System.out.println(optional1);

//returns optional.empty when optional is null

        Optional<String>optional2=Optional.ofNullable(obj.getEmail());
        System.out.println(optional2);

        Optional<String>optional3=Optional.ofNullable(obj.getEmail());
        System.out.println(optional3.orElse("optional is null"));



        Optional<String>optional4=Optional.ofNullable(obj.getEmail());
        System.out.println(optional4.orElseGet(()->{
            return  "optional is null";
        }));

        Optional<String>optional5=Optional.ofNullable(obj.getEmail());
        System.out.println(optional5.orElseThrow(()->{
            return new Exception("optional is null")  ;
        }));
 */
        Optional<String>optional6=Optional.ofNullable(obj.getEmail());
        System.out.println(optional6.orElseThrow());




    }
}
class Employee{
    int id;
    String name;
    String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
