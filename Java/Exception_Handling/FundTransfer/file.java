package Java.Exception_Handling.FundTransfer;

import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Account Number");
        long accNumber = sc.nextLong();
        System.out.println("Enter your Account Balance");
        double accBalance = sc.nextDouble();
        Account acc = new Account(accNumber, accBalance);
        try{
            System.out.println("Enter ifsc code");
            String ifsc = sc.next();
            System.out.println("Enter the amount to be transferred");
            double amt = sc.nextDouble();
            acc.fundtransfer(ifsc, amt);
            System.out.println("Rs " + amt + " is successfully transferred from " + acc.getAccNo() +". Remaining balance is " + acc.getBalance());
        }catch(InvalidIfscCode e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Thank you for using our applicaton");
        }
        sc.close();

    }
}
