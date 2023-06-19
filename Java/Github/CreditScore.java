package Java.Github;

import java.util.Scanner;

public class CreditScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Users");
        int n = sc.nextInt();
        if(n >=1 && n <= 1000){   //The user must be between 1 to 1000
            //create an array of size n
            int [] a = new int[n];
            int temp = 0;
            while(temp < n){
                System.out.println("Enter the credit point for the user " + (temp + 1) + " : ");
                a[temp] = sc.nextInt();

                if(a[temp] >=1 && a[temp]<=100){
                    temp++;
                }else{
                    break;
                }
            }
            System.out.println("Enter the no.of users to be served");
            int k = sc.nextInt();
            if(k >=1 && k<=n ){
                System.out.println("The served users credit points are");
                for(int i = 0;i<k;i++){
                    System.out.print(a[i] + " ");
                }
                System.out.println();
                System.out.println("The unserved users credit points are");
                for(int i = k;i<n;i++){
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }else if(k == n){
                System.out.println("0 users to be served");
            }else{
                System.out.println("Invalid no. users data");
            }
        }else{
            System.out.println("Invalid No. of Users");
        }
        sc.close();
        System.exit(0);
    }
}
