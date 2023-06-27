package Java.Exception_Handling.FundTransfer;

public class Account {

    private long AccNo;
    private double balance;

    public Account(){

    }
    public Account(long accno,double bal){
        
        super();
        this.AccNo = accno;
        this.balance = bal;

    }
    public long getAccNo() {
        return AccNo;
    }
    public void setAccNo(long accNo) {
        AccNo = accNo;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void fundtransfer(String ifcscode , double amountTobeTransferred) throws InvalidIfscCode{
        if(ifcscode.length() == 11 && ifcscode.matches("[A-Z]{4}[0-9]{7}")){
            this.balance = this.balance - amountTobeTransferred;
            
        }else{
            throw new InvalidIfscCode("Invalid IFSCCODE");
        }
    }
}
