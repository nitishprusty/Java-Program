package Java.Strings;

import java.util.Scanner;

public class LateToBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Number of employee");
        int TotEmp = sc.nextInt();
        int LateCount = 0;
        String [] arr = new String[TotEmp];
        for(int i = 0;i<TotEmp;i++) {
            System.out.println("Enter the Entry timing of employee " + i+1);
            arr[i] = sc.next();
            if(arr[i].charAt(0) < '9') {
                continue;
            }else if(arr[i].charAt(0) > '9' ){     //0.2  0.05  0.3 
                LateCount++;
            }else if(arr[i].charAt(2) > '3'){
                LateCount++;
            }else if(arr[i].charAt(2) == 3 && arr[i].charAt(3) > '0'){
                LateCount++;
            }
        }
        if(LateCount == TotEmp){
            System.out.println("All Employees are late to work");
        }else{
            System.out.println(LateCount + "Employees are late to work");
        }
        sc.close();
    }
}
