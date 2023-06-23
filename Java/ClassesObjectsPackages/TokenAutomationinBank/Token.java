package Java.ClassesObjectsPackages.TokenAutomationinBank;

public class Token {
    
    public static int tokencount = 0;
    
    private int tokenNumber;
    private int counterNumber;
    private String service;

    Token(String service){

        this.service = service;
        this.tokenNumber = ++tokencount;
        if(service.equals("Deposit")){
            this.counterNumber = 4;
        }else if(service.equals("Withdraw")){
            this.counterNumber = 3;
        }else if(service.equals("others")){
            this.counterNumber = 1;
        }else if(service.equals("cheque deposit")){
            this.counterNumber = 2;
        }
    }

    public int getTokenNumber() {
        return tokenNumber;
    }

    public void setTokenNumber(int tokenNumber) {  
        this.tokenNumber = tokenNumber;
    }

    public int getCounterNumber() {  
        return counterNumber;
    }

    public void setCounterNumber(int counterNumber) { 
        this.counterNumber = counterNumber;
    }

    public String getService() {  
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

}
