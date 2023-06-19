package Java.Github;

public class TowerofHanoi {

    public static void main(String[] args) {

        int n = 3; //Total Number of disks
        Move(n,"A", "C", "B");

    }
    static void Move(int n , String source,String helper,String Destination){
        if(n == 1){
            System.out.println("Disk " + n + " move from " + source +  " to " + Destination);
            return;
        }
            Move(n - 1, source, Destination, helper);
            System.out.println("Disk " + n + " move from " + source +  " to " + Destination);
            Move(n - 1, helper, source, Destination);
        
    }
    
}
