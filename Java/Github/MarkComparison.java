package Java.Github;

import java.util.Scanner;

public class MarkComparison {
    public static void main(String[] args) {
        try ( Scanner sc = new Scanner(System.in);){
        System.out.println("Enter the size of the first array");
        int size1 = sc.nextInt();
        int flag = 0;
        int [] arr1 = new int[size1];
        for(int i = 0;i<size1;i++){
            arr1[i] = sc.nextInt();
            if(arr1[i] < 0){
                System.out.println("Negative marks not allowed");
                System.exit(0);
            }
        }
        System.out.println("Enter the size of second array");
        int size2 = sc.nextInt();
        int [] arr2 = new int[size2];
        if(size1 != size2){
            System.out.println("Invalid size");
            System.exit(0);
        }
        for(int i = 0;i<size2;i++){
            arr2[i] = sc.nextInt();
            if(arr2[i]  < 0){
                System.out.println("Negative marks not allowed");
                System.exit(0);
            }
        }

        for(int i = 0;i<size1;i++){
            for(int j = 0;i<size2;j++){
                if(arr1[i] == arr2[j]){
                    flag = 1;
                    System.out.println("{" + i + "," + j + "}");
                }
            }
        }

        if(flag == 0){
            System.out.println("No Matching score");
        }
    }

    }
}
