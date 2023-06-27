package Java.Exception_Handling;

import java.util.Scanner;

public class DisplayArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index elements you want");
        int index = sc.nextInt();
        sc.close();
        try{
            System.out.println("The element is " + arr[index]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }finally{
            System.out.println("The program executed successfully");
        }
    }
}
