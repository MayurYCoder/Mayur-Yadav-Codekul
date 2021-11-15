package assignments;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        int basic_salary;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the basic salary");
        basic_salary=obj.nextInt();

        if(basic_salary>=1000&&basic_salary<10000){
            double GrossSalary=basic_salary+(basic_salary*0.8)+(basic_salary*0.2);
            System.out.println("Gross Salary is ==>"+GrossSalary);

        }else if(basic_salary>=10000&&basic_salary<=20000){
            double GrossSalary=basic_salary+(basic_salary*0.9)+(basic_salary*0.25);
            System.out.println("Gross Salary is ==>"+GrossSalary);
        }else{
            double GrossSalary=basic_salary+(basic_salary*0.95)+(basic_salary*0.3);
            System.out.println("Gross Salary is ==>"+GrossSalary);
        }
    }
}
