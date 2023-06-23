package Java.ClassesObjectsPackages.ZeeZeeBank;

public class Bank {
    
    public long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }
    private long AccountNumber;

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        AccountBalance = accountBalance;
    }
    private double AccountBalance;

    public Bank(long AccountNumber,double AccountBalance){
        super();
        this.AccountNumber = AccountNumber;
        this.AccountBalance = AccountBalance;
    }

    public void withdraw(double amount){
         if((this.AccountBalance - amount) > 0){
            this.AccountBalance = this.AccountBalance - amount;
         }
    }
    public void deposit(double amount){
         this.AccountBalance += amount;
    }
}
