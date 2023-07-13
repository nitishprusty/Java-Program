package Java.Control_Structures_iteration.TokenAutomation;

public class token {

    private static int tokenNumber;
    public String getServicetype() {
        return servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype;
    }

    private String servicetype;

    public int getCounterNumber() {
        return counterNumber;
    }

    public int getTokenNumber() {
        return tokenNumber;
    }

    public void setCounterNumber(int counterNumber) {
        this.counterNumber = counterNumber;
    }

    private int counterNumber;

    public token(String servicetype) {
        this.servicetype = servicetype;
        tokenNumber++;
    }

    public void Counter() {
        int counter = 0;
        if(this.servicetype.equals("Deposit")) {
            counter = 4;
        }else if(this.servicetype.equals("withdraw")) {
            counter = 2;
        }else if(this.servicetype.equals("Check deposit")) {
            counter = 3;
        }else{
            counter = 1;
        }
        setCounterNumber(counter);
    }
}
