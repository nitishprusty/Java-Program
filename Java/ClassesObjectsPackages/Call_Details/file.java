package Java.ClassesObjectsPackages.Call_Details;

import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the call Details in ???|??????????|? format");
        String data = sc.next();
        sc.close();
        Call obj = new Call();
        obj.parseData(data);
        System.out.println("The caller id is " + obj.getCallerId());
        System.out.println("The Called Number is " + obj.getCalledNumber());
        System.out.println("The Duration is " + obj.getDuration());
    }
}
