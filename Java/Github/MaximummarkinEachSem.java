package Java.Github;

import java.util.Scanner;

/*
 * This program will print maximum mark in each sem
 */

public class MaximummarkinEachSem { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total No of sem");
        int n = sc.nextInt();

        int [] a = new int[n];
        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter total Subject in " + (i + 1) + " sem : ");
            a[i] = sc.nextInt();
        }
        int flag = 0;
        int [] marks = new int[n];
        for(int i = 0;i<n;i++){
            int highestmark = 0;
            int [] b = new int[a[i]];
            for(int j = 0;j<a[i];j++){
                System.out.println("Enter the marks for sub " + (j + 1) + ":");
                b[j] = sc.nextInt();

                if(b[j] < 0 && b[j] > 100){
                    flag++;
                    break;
                }
                if(b[j] > highestmark){
                    highestmark = b[j];
                }
            }
            if(flag == 1){
                break;
            }
            marks[i] = highestmark;
        }
        if(flag  == 0){
            for(int i = 0;i<n;i++){
                System.out.println("The highest mark in " + (i + 1) + " sem is " + marks[i]);
            }
        }
        sc.close();
    }
}
