package collection.Collection.Set;
//

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {
    int id;
    String name;
    String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Employee obj = new Employee(1, "Mayur", "Pune");
        Employee obj1 = new Employee(1, "Mayur", "Pune");
        Employee obj2 = new Employee(1, "kayur", "Pune");

        Set<Employee> set = new HashSet<Employee>();
        set.add(obj);
        set.add(obj1);
        set.add(obj2);

        set.forEach(s -> {
                    System.out.println(" Id " + s.id + " Name " + s.name + " address " + s.address);
                }
        );
    }
    // if the duplicates are allowed in this output then generate the hashcode (), and equals methods this will correct the output
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(address, employee.address);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }
}




