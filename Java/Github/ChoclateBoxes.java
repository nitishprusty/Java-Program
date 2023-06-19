package Java.Github;

import java.util.Scanner;

public class ChoclateBoxes {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Boxes");
        int n = sc.nextInt();
        System.out.println();
        if(n >= 1 && n <= 10){

            int start = 0;
            //create an array of choc of size n
            int [] choc = new int[n];

            int temp = n;
            for(int i = 0;i<temp;i++){
                System.out.println("Enter the No of choclates in box " + (i+1) + ":");
                choc[i] = sc.nextInt();
                System.out.println();

                sc.close();

                if(i == 0){
                    if(choc[i] % 2 != 0){
                        System.out.println("First Box should contain positive even Nummber of choclates");
                        flag++;
                        break;
                    }
                }else{
                    if(choc[i] % 2 != 0){
                        start++;
                    }
                }
            }
            if(flag != 1){
                System.out.println("No of choclates in each  box");
                for(int i = start;i<n;i++){
                    System.out.print(choc[i] + " ");
                }
                System.out.println();
            }

        }else{
            System.out.println("Inavlid Input");
        }

    }
}
