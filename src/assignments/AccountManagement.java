package assignments;

import java.util.Scanner;

public class AccountManagement {
    void insertData(){
        long no;
        String Name;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the account no");
        no=obj.nextLong();
        System.out.println("Enter the name of Account holder");
        Name=obj.next();
    }
    void displayData(){
        double Balance=5000000;
        System.out.println("Your balance is "+Balance);
    }
    void depositAmount(){
        int Amount;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the  amount to deposit");
        Amount= obj.nextInt();
        double Balance=5000000;
        System.out.println("Total Balance is "+(Balance+Amount));
    }
    void withdrawnAmount(){
        double balance=5000000;
        int creadit;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the amount to withdraw ");
        creadit=obj.nextInt();
        if (creadit>balance){
            System.out.println("You don't have sufficient balance");
        }else{
            System.out.println("Remaining balance is "+(balance-creadit));
        }
    }
    void accountBalance(){
        double Balance=5000000;
        System.out.println("Account balance is "+Balance);
    }

    public static void main(String[] args) {
        AccountManagement obj=new AccountManagement();
        obj.insertData();
        System.out.println("For balance check press 1 "+'\n'+"For Amount deposition press 2 "+'\n'+"For withdrawn amount press 3 "+'\n'+"For account balance press 4 ");
        int i;
        Scanner obj1 =new Scanner(System.in);
        System.out.println("press the no");
        i=obj1.nextInt();
        switch (i){
            case 1:
                obj.displayData();
                break;
            case 2:
                obj.depositAmount();
                break;
            case 3:
                obj.withdrawnAmount();
                break;
            case 4:
                obj.accountBalance();
                break;
            default:
                System.out.println("invalid key");
        }

    }
}
