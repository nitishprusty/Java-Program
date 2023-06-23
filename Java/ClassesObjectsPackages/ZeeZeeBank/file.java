package Java.ClassesObjectsPackages.ZeeZeeBank;

import java.util.Scanner;

public class file {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Account Number");
        long accNo = sc.nextLong();
        System.out.println("Enter Your Account Balance");
        double accBalance = sc.nextDouble();
        
        Bank obj = new Bank(accNo, accBalance);
        System.out.println("Enter your choice \n 1.For withdrawl \n2. For Deposit");
        int choice  = sc.nextInt();
        if(choice == 1){
            System.out.println("Enter Widthdrawl amount");
            double amount = sc.nextDouble();
            obj.withdraw(amount);
            System.out.println(obj.getAccountNumber() + " remaining balance after withddrawl is " +obj.getAccountBalance());
        }
        if(choice  == 2){
            System.out.println("Enter Deposit Amount");
            double amount  = sc.nextDouble();
            obj.deposit(amount);
            System.out.println(obj.getAccountNumber() + " remainig balace after deposit is " + obj.getAccountBalance());
        }
        sc.close();
     } 
}
