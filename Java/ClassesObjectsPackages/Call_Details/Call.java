package Java.ClassesObjectsPackages.Call_Details;

public class Call {
    private int CallerId;
    private long CalledNumber;
    private float duration;
    public int getCallerId() {
        return CallerId;
    }
    public void setCallerId(int callerId) {
        CallerId = callerId;
    }
    public long getCalledNumber() {
        return CalledNumber;
    }
    public void setCalledNumber(long calledNumber) {
        CalledNumber = calledNumber;
    }
    public float getDuration() {
        return duration;
    }
    public void setDuration(float duration) {
        this.duration = duration;
    }

    public void parseData(String data)
    {
        this.CallerId = Integer.parseInt(data.substring(0, 3));
        this.CalledNumber = Long.parseLong(data.substring(3, 13));
        this.duration = Float.parseFloat(data.substring(15));
    }

    
}
