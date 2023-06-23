package Java.ClassesObjectsPackages.BankAccount;

import java.util.Scanner;

public class Accountmain {
    public static void main(String[] args) {
         Account obj = getAccountDetails();
         int withdrawAmount = getWithdrawableAmount();
         obj.withdraw(withdrawAmount);
         
    }
    //method for getting accountdetails
    static Account getAccountDetails(){
           try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Account Id");
               int Accountid = sc.nextInt();
               System.out.println("Enter the Account Type");
               String AccountType = sc.next();
               int Balance;
               do{
                   System.out.println("Enter Account Balance");
                   Balance = sc.nextInt();
                   if(Balance <= 0){
                       System.out.println("Balance cannot be in negative Number");
                   }
               }while(Balance <= 0);

            //    sc.close();

               return new Account(Accountid, AccountType, Balance);
        }
       }  
    //method for getting the withdrawable amount
    static int getWithdrawableAmount() {
    try (Scanner sc = new Scanner(System.in)) {
        int w;
        do {
            System.out.println("Enter withdrawable Amount");
            w = sc.nextInt();

            if (w <= 0) {
                System.out.println("Cannot withdraw amount in negative Number");
            }
        } while (w <= 0);

        return w;
    }
}


}
