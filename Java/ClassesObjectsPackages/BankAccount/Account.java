package Java.ClassesObjectsPackages.BankAccount;

public class Account {
    private int AccountId;
    private String AccountType;
    private int AccountBalance;

    public Account(int accid,String AccName,int accBalance){
        super();
        this.AccountId = accid;
        this.AccountType = AccName;
        this.AccountBalance = accBalance;
    }

    public void setAccountid(int accid){
        this.AccountId = accid;
    }
    public int getAccountid(){
        return AccountId;
    }
    public void setAccountType(String acctype){
        this.AccountType = acctype;
    }
    public String accountType(){
        return AccountType;
    }

    public void setAccountBalance(int accBal){
        this.AccountBalance = accBal;
    }
    public int getAccountBalance(){
        return AccountBalance;
    }

    public Boolean withdraw(int amount)
    {
        Boolean flag = true;
        if(amount > getAccountBalance()){
            System.out.println("Cannot be withdrawn because you have insufficient Balance");
            flag = false;
        }else{
            System.out.println(amount + " is debited from your account");
            System.out.println("Remaining Balance is " + (getAccountBalance() - amount));
            flag = true;
        }
        return flag;
    }
}
